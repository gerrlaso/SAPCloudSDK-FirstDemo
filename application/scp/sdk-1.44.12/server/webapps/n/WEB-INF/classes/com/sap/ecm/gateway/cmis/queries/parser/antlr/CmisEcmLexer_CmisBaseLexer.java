// $ANTLR 3.5.2 CmisBaseLexer.g 2019-02-13 18:10:49

/*
 * THIS FILE IS AUTO-GENERATED, DO NOT EDIT.
 */
package com.sap.ecm.gateway.cmis.queries.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * CMISQL lexer.
 */
@SuppressWarnings("all")
public class CmisEcmLexer_CmisBaseLexer extends Lexer {
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


	// delegates
	// delegators
	public CmisEcmLexer gCmisEcmLexer;
	public CmisEcmLexer gParent;
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CmisEcmLexer_CmisBaseLexer() {} 
	public CmisEcmLexer_CmisBaseLexer(CharStream input, CmisEcmLexer gCmisEcmLexer) {
		this(input, new RecognizerSharedState(), gCmisEcmLexer);
	}
	public CmisEcmLexer_CmisBaseLexer(CharStream input, RecognizerSharedState state, CmisEcmLexer gCmisEcmLexer) {
		super(input,state);
		this.gCmisEcmLexer = gCmisEcmLexer;
		gParent = gCmisEcmLexer;
	}
	@Override public String getGrammarFileName() { return "CmisBaseLexer.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:68:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
			// CmisBaseLexer.g:68:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
	// $ANTLR end "SELECT"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:69:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
			// CmisBaseLexer.g:69:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "FROM"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:70:4: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
			// CmisBaseLexer.g:70:6: ( 'A' | 'a' ) ( 'S' | 's' )
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
	// $ANTLR end "AS"

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:71:6: ( ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
			// CmisBaseLexer.g:71:8: ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' )
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOIN"

	// $ANTLR start "INNER"
	public final void mINNER() throws RecognitionException {
		try {
			int _type = INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:72:7: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
			// CmisBaseLexer.g:72:9: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' )
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "INNER"

	// $ANTLR start "OUTER"
	public final void mOUTER() throws RecognitionException {
		try {
			int _type = OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:73:7: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
			// CmisBaseLexer.g:73:9: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
			{
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
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "OUTER"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:74:6: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' ) )
			// CmisBaseLexer.g:74:8: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' )
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
	// $ANTLR end "LEFT"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:75:7: ( ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'H' | 'h' ) ( 'T' | 't' ) )
			// CmisBaseLexer.g:75:9: ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'H' | 'h' ) ( 'T' | 't' )
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
	// $ANTLR end "RIGHT"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:76:4: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
			// CmisBaseLexer.g:76:6: ( 'O' | 'o' ) ( 'N' | 'n' )
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:77:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
			// CmisBaseLexer.g:77:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
	// $ANTLR end "WHERE"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:78:7: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
			// CmisBaseLexer.g:78:9: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "ORDER"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:79:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
			// CmisBaseLexer.g:79:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
	// $ANTLR end "BY"

	// $ANTLR start "ASC"
	public final void mASC() throws RecognitionException {
		try {
			int _type = ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:80:5: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
			// CmisBaseLexer.g:80:7: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
	// $ANTLR end "ASC"

	// $ANTLR start "DESC"
	public final void mDESC() throws RecognitionException {
		try {
			int _type = DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:81:6: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
			// CmisBaseLexer.g:81:8: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
	// $ANTLR end "DESC"

	// $ANTLR start "IS"
	public final void mIS() throws RecognitionException {
		try {
			int _type = IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:85:4: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
			// CmisBaseLexer.g:85:6: ( 'I' | 'i' ) ( 'S' | 's' )
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
	// $ANTLR end "IS"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:86:6: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
			// CmisBaseLexer.g:86:8: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
	// $ANTLR end "NULL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:87:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
			// CmisBaseLexer.g:87:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:88:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
			// CmisBaseLexer.g:88:6: ( 'O' | 'o' ) ( 'R' | 'r' )
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:89:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
			// CmisBaseLexer.g:89:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
	// $ANTLR end "NOT"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:90:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
			// CmisBaseLexer.g:90:6: ( 'I' | 'i' ) ( 'N' | 'n' )
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:91:6: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' ) )
			// CmisBaseLexer.g:91:8: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' )
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
	// $ANTLR end "LIKE"

	// $ANTLR start "ANY"
	public final void mANY() throws RecognitionException {
		try {
			int _type = ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:92:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
			// CmisBaseLexer.g:92:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
	// $ANTLR end "ANY"

	// $ANTLR start "CONTAINS"
	public final void mCONTAINS() throws RecognitionException {
		try {
			int _type = CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:93:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
			// CmisBaseLexer.g:93:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' )
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
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
	// $ANTLR end "CONTAINS"

	// $ANTLR start "SCORE"
	public final void mSCORE() throws RecognitionException {
		try {
			int _type = SCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:94:7: ( ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
			// CmisBaseLexer.g:94:9: ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' )
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
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
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
	// $ANTLR end "SCORE"

	// $ANTLR start "IN_FOLDER"
	public final void mIN_FOLDER() throws RecognitionException {
		try {
			int _type = IN_FOLDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:95:11: ( ( 'I' | 'i' ) ( 'N' | 'n' ) '_' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
			// CmisBaseLexer.g:95:13: ( 'I' | 'i' ) ( 'N' | 'n' ) '_' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
			match('_'); 
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "IN_FOLDER"

	// $ANTLR start "IN_TREE"
	public final void mIN_TREE() throws RecognitionException {
		try {
			int _type = IN_TREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:96:9: ( ( 'I' | 'i' ) ( 'N' | 'n' ) '_' ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'E' | 'e' ) )
			// CmisBaseLexer.g:96:11: ( 'I' | 'i' ) ( 'N' | 'n' ) '_' ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'E' | 'e' )
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
			match('_'); 
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
	// $ANTLR end "IN_TREE"

	// $ANTLR start "TIMESTAMP"
	public final void mTIMESTAMP() throws RecognitionException {
		try {
			int _type = TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:97:11: ( 'TIMESTAMP' | 'timestamp' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='T') ) {
				alt1=1;
			}
			else if ( (LA1_0=='t') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// CmisBaseLexer.g:97:13: 'TIMESTAMP'
					{
					match("TIMESTAMP"); 

					}
					break;
				case 2 :
					// CmisBaseLexer.g:97:25: 'timestamp'
					{
					match("timestamp"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMESTAMP"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:99:6: ( '*' )
			// CmisBaseLexer.g:99:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:100:6: ( '(' )
			// CmisBaseLexer.g:100:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:101:6: ( ')' )
			// CmisBaseLexer.g:101:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:102:7: ( ',' )
			// CmisBaseLexer.g:102:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:103:5: ( '.' )
			// CmisBaseLexer.g:103:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:104:4: ( '=' )
			// CmisBaseLexer.g:104:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:105:5: ( '<>' )
			// CmisBaseLexer.g:105:7: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:106:4: ( '<' )
			// CmisBaseLexer.g:106:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:107:4: ( '>' )
			// CmisBaseLexer.g:107:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:108:6: ( '<=' )
			// CmisBaseLexer.g:108:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:109:6: ( '>=' )
			// CmisBaseLexer.g:109:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "BOOL_LIT"
	public final void mBOOL_LIT() throws RecognitionException {
		try {
			int _type = BOOL_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:113:10: ( 'TRUE' | 'true' | 'FALSE' | 'false' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case 'T':
				{
				alt2=1;
				}
				break;
			case 't':
				{
				alt2=2;
				}
				break;
			case 'F':
				{
				alt2=3;
				}
				break;
			case 'f':
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
					// CmisBaseLexer.g:113:12: 'TRUE'
					{
					match("TRUE"); 

					}
					break;
				case 2 :
					// CmisBaseLexer.g:113:21: 'true'
					{
					match("true"); 

					}
					break;
				case 3 :
					// CmisBaseLexer.g:113:30: 'FALSE'
					{
					match("FALSE"); 

					}
					break;
				case 4 :
					// CmisBaseLexer.g:113:40: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL_LIT"

	// $ANTLR start "Sign"
	public final void mSign() throws RecognitionException {
		try {
			// CmisBaseLexer.g:115:15: ( ( '+' | '-' )? )
			// CmisBaseLexer.g:115:17: ( '+' | '-' )?
			{
			// CmisBaseLexer.g:115:17: ( '+' | '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='+'||LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// CmisBaseLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sign"

	// $ANTLR start "Digits"
	public final void mDigits() throws RecognitionException {
		try {
			// CmisBaseLexer.g:116:17: ( ( '0' .. '9' )+ )
			// CmisBaseLexer.g:116:19: ( '0' .. '9' )+
			{
			// CmisBaseLexer.g:116:19: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// CmisBaseLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digits"

	// $ANTLR start "ExactNumLit"
	public final void mExactNumLit() throws RecognitionException {
		try {
			// CmisBaseLexer.g:117:22: ( Digits DOT Digits | Digits DOT | DOT Digits | Digits )
			int alt5=4;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// CmisBaseLexer.g:117:24: Digits DOT Digits
					{
					mDigits(); 

					mDOT(); 

					mDigits(); 

					}
					break;
				case 2 :
					// CmisBaseLexer.g:117:44: Digits DOT
					{
					mDigits(); 

					mDOT(); 

					}
					break;
				case 3 :
					// CmisBaseLexer.g:117:57: DOT Digits
					{
					mDOT(); 

					mDigits(); 

					}
					break;
				case 4 :
					// CmisBaseLexer.g:117:70: Digits
					{
					mDigits(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ExactNumLit"

	// $ANTLR start "ApproxNumLit"
	public final void mApproxNumLit() throws RecognitionException {
		try {
			// CmisBaseLexer.g:118:23: ( ExactNumLit ( 'e' | 'E' ) Sign Digits )
			// CmisBaseLexer.g:118:25: ExactNumLit ( 'e' | 'E' ) Sign Digits
			{
			mExactNumLit(); 

			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mSign(); 

			mDigits(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ApproxNumLit"

	// $ANTLR start "NUM_LIT"
	public final void mNUM_LIT() throws RecognitionException {
		try {
			int _type = NUM_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:119:9: ( Sign ( ExactNumLit | ApproxNumLit ) )
			// CmisBaseLexer.g:119:11: Sign ( ExactNumLit | ApproxNumLit )
			{
			mSign(); 

			// CmisBaseLexer.g:119:16: ( ExactNumLit | ApproxNumLit )
			int alt6=2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// CmisBaseLexer.g:119:17: ExactNumLit
					{
					mExactNumLit(); 

					}
					break;
				case 2 :
					// CmisBaseLexer.g:119:31: ApproxNumLit
					{
					mApproxNumLit(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_LIT"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			// CmisBaseLexer.g:120:15: ( '\\'' )
			// CmisBaseLexer.g:120:17: '\\''
			{
			match('\''); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "BACKSL"
	public final void mBACKSL() throws RecognitionException {
		try {
			// CmisBaseLexer.g:122:16: ( '\\\\' )
			// CmisBaseLexer.g:122:18: '\\\\'
			{
			match('\\'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKSL"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// CmisBaseLexer.g:123:20: ( '_' )
			// CmisBaseLexer.g:123:22: '_'
			{
			match('_'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			// CmisBaseLexer.g:124:17: ( '%' )
			// CmisBaseLexer.g:124:19: '%'
			{
			match('%'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			// CmisBaseLexer.g:130:2: ( BACKSL ( QUOTE | BACKSL | PERCENT | UNDERSCORE ) | QUOTE QUOTE )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\\') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\'') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// CmisBaseLexer.g:130:4: BACKSL ( QUOTE | BACKSL | PERCENT | UNDERSCORE )
					{
					mBACKSL(); 

					if ( input.LA(1)=='%'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='_' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// CmisBaseLexer.g:131:4: QUOTE QUOTE
					{
					mQUOTE(); 

					mQUOTE(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	// $ANTLR start "STRING_LIT"
	public final void mSTRING_LIT() throws RecognitionException {
		try {
			int _type = STRING_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:135:5: ( QUOTE ( ESC |~ ( BACKSL | QUOTE ) )* QUOTE )
			// CmisBaseLexer.g:135:8: QUOTE ( ESC |~ ( BACKSL | QUOTE ) )* QUOTE
			{
			mQUOTE(); 

			// CmisBaseLexer.g:135:14: ( ESC |~ ( BACKSL | QUOTE ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\'') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='\'') ) {
						alt8=1;
					}

				}
				else if ( (LA8_0=='\\') ) {
					alt8=1;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// CmisBaseLexer.g:135:16: ESC
					{
					mESC(); 

					}
					break;
				case 2 :
					// CmisBaseLexer.g:135:22: ~ ( BACKSL | QUOTE )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			mQUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:138:4: ( ( ' ' | '\\t' | ( '\\r' )? '\\n' )+ )
			// CmisBaseLexer.g:138:6: ( ' ' | '\\t' | ( '\\r' )? '\\n' )+
			{
			// CmisBaseLexer.g:138:6: ( ' ' | '\\t' | ( '\\r' )? '\\n' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=4;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt10=1;
					}
					break;
				case '\t':
					{
					alt10=2;
					}
					break;
				case '\n':
				case '\r':
					{
					alt10=3;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// CmisBaseLexer.g:138:8: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// CmisBaseLexer.g:138:14: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// CmisBaseLexer.g:138:21: ( '\\r' )? '\\n'
					{
					// CmisBaseLexer.g:138:21: ( '\\r' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='\r') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// CmisBaseLexer.g:138:21: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "TIME_LIT"
	public final void mTIME_LIT() throws RecognitionException {
		try {
			int _type = TIME_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:140:10: ( TIMESTAMP WS STRING_LIT )
			// CmisBaseLexer.g:140:12: TIMESTAMP WS STRING_LIT
			{
			mTIMESTAMP(); 

			mWS(); 

			mSTRING_LIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME_LIT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CmisBaseLexer.g:142:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ':' )* )
			// CmisBaseLexer.g:143:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ':' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// CmisBaseLexer.g:144:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ':' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= ':')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||LA11_0=='_'||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// CmisBaseLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// CmisBaseLexer.g:1:8: ( SELECT | FROM | AS | JOIN | INNER | OUTER | LEFT | RIGHT | ON | WHERE | ORDER | BY | ASC | DESC | IS | NULL | AND | OR | NOT | IN | LIKE | ANY | CONTAINS | SCORE | IN_FOLDER | IN_TREE | TIMESTAMP | STAR | LPAR | RPAR | COMMA | DOT | EQ | NEQ | LT | GT | LTEQ | GTEQ | BOOL_LIT | NUM_LIT | STRING_LIT | WS | TIME_LIT | ID )
		int alt12=44;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// CmisBaseLexer.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// CmisBaseLexer.g:1:17: FROM
				{
				mFROM(); 

				}
				break;
			case 3 :
				// CmisBaseLexer.g:1:22: AS
				{
				mAS(); 

				}
				break;
			case 4 :
				// CmisBaseLexer.g:1:25: JOIN
				{
				mJOIN(); 

				}
				break;
			case 5 :
				// CmisBaseLexer.g:1:30: INNER
				{
				mINNER(); 

				}
				break;
			case 6 :
				// CmisBaseLexer.g:1:36: OUTER
				{
				mOUTER(); 

				}
				break;
			case 7 :
				// CmisBaseLexer.g:1:42: LEFT
				{
				mLEFT(); 

				}
				break;
			case 8 :
				// CmisBaseLexer.g:1:47: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 9 :
				// CmisBaseLexer.g:1:53: ON
				{
				mON(); 

				}
				break;
			case 10 :
				// CmisBaseLexer.g:1:56: WHERE
				{
				mWHERE(); 

				}
				break;
			case 11 :
				// CmisBaseLexer.g:1:62: ORDER
				{
				mORDER(); 

				}
				break;
			case 12 :
				// CmisBaseLexer.g:1:68: BY
				{
				mBY(); 

				}
				break;
			case 13 :
				// CmisBaseLexer.g:1:71: ASC
				{
				mASC(); 

				}
				break;
			case 14 :
				// CmisBaseLexer.g:1:75: DESC
				{
				mDESC(); 

				}
				break;
			case 15 :
				// CmisBaseLexer.g:1:80: IS
				{
				mIS(); 

				}
				break;
			case 16 :
				// CmisBaseLexer.g:1:83: NULL
				{
				mNULL(); 

				}
				break;
			case 17 :
				// CmisBaseLexer.g:1:88: AND
				{
				mAND(); 

				}
				break;
			case 18 :
				// CmisBaseLexer.g:1:92: OR
				{
				mOR(); 

				}
				break;
			case 19 :
				// CmisBaseLexer.g:1:95: NOT
				{
				mNOT(); 

				}
				break;
			case 20 :
				// CmisBaseLexer.g:1:99: IN
				{
				mIN(); 

				}
				break;
			case 21 :
				// CmisBaseLexer.g:1:102: LIKE
				{
				mLIKE(); 

				}
				break;
			case 22 :
				// CmisBaseLexer.g:1:107: ANY
				{
				mANY(); 

				}
				break;
			case 23 :
				// CmisBaseLexer.g:1:111: CONTAINS
				{
				mCONTAINS(); 

				}
				break;
			case 24 :
				// CmisBaseLexer.g:1:120: SCORE
				{
				mSCORE(); 

				}
				break;
			case 25 :
				// CmisBaseLexer.g:1:126: IN_FOLDER
				{
				mIN_FOLDER(); 

				}
				break;
			case 26 :
				// CmisBaseLexer.g:1:136: IN_TREE
				{
				mIN_TREE(); 

				}
				break;
			case 27 :
				// CmisBaseLexer.g:1:144: TIMESTAMP
				{
				mTIMESTAMP(); 

				}
				break;
			case 28 :
				// CmisBaseLexer.g:1:154: STAR
				{
				mSTAR(); 

				}
				break;
			case 29 :
				// CmisBaseLexer.g:1:159: LPAR
				{
				mLPAR(); 

				}
				break;
			case 30 :
				// CmisBaseLexer.g:1:164: RPAR
				{
				mRPAR(); 

				}
				break;
			case 31 :
				// CmisBaseLexer.g:1:169: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 32 :
				// CmisBaseLexer.g:1:175: DOT
				{
				mDOT(); 

				}
				break;
			case 33 :
				// CmisBaseLexer.g:1:179: EQ
				{
				mEQ(); 

				}
				break;
			case 34 :
				// CmisBaseLexer.g:1:182: NEQ
				{
				mNEQ(); 

				}
				break;
			case 35 :
				// CmisBaseLexer.g:1:186: LT
				{
				mLT(); 

				}
				break;
			case 36 :
				// CmisBaseLexer.g:1:189: GT
				{
				mGT(); 

				}
				break;
			case 37 :
				// CmisBaseLexer.g:1:192: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 38 :
				// CmisBaseLexer.g:1:197: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 39 :
				// CmisBaseLexer.g:1:202: BOOL_LIT
				{
				mBOOL_LIT(); 

				}
				break;
			case 40 :
				// CmisBaseLexer.g:1:211: NUM_LIT
				{
				mNUM_LIT(); 

				}
				break;
			case 41 :
				// CmisBaseLexer.g:1:219: STRING_LIT
				{
				mSTRING_LIT(); 

				}
				break;
			case 42 :
				// CmisBaseLexer.g:1:230: WS
				{
				mWS(); 

				}
				break;
			case 43 :
				// CmisBaseLexer.g:1:233: TIME_LIT
				{
				mTIME_LIT(); 

				}
				break;
			case 44 :
				// CmisBaseLexer.g:1:242: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA5_eotS =
		"\1\uffff\1\3\2\uffff\1\5\2\uffff";
	static final String DFA5_eofS =
		"\7\uffff";
	static final String DFA5_minS =
		"\2\56\2\uffff\1\60\2\uffff";
	static final String DFA5_maxS =
		"\2\71\2\uffff\1\71\2\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\3\1\4\1\uffff\1\2\1\1";
	static final String DFA5_specialS =
		"\7\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1",
			"",
			"",
			"\12\6",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "117:10: fragment ExactNumLit : ( Digits DOT Digits | Digits DOT | DOT Digits | Digits );";
		}
	}

	static final String DFA6_eotS =
		"\1\uffff\1\3\2\uffff\1\3\1\uffff\2\3";
	static final String DFA6_eofS =
		"\10\uffff";
	static final String DFA6_minS =
		"\2\56\1\60\1\uffff\1\60\1\uffff\2\60";
	static final String DFA6_maxS =
		"\1\71\1\145\1\71\1\uffff\1\145\1\uffff\2\145";
	static final String DFA6_acceptS =
		"\3\uffff\1\1\1\uffff\1\2\2\uffff";
	static final String DFA6_specialS =
		"\10\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1\13\uffff\1\5\37\uffff\1\5",
			"\12\6",
			"",
			"\12\7\13\uffff\1\5\37\uffff\1\5",
			"",
			"\12\6\13\uffff\1\5\37\uffff\1\5",
			"\12\7\13\uffff\1\5\37\uffff\1\5"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "119:16: ( ExactNumLit | ApproxNumLit )";
		}
	}

	static final String DFA12_eotS =
		"\1\uffff\17\34\4\uffff\1\66\1\uffff\1\71\1\73\1\34\4\uffff\4\34\1\102"+
		"\2\34\1\110\1\111\1\34\1\113\1\115\4\34\1\122\10\34\6\uffff\5\34\1\140"+
		"\1\uffff\1\141\1\142\3\34\2\uffff\1\34\1\uffff\1\34\1\uffff\4\34\1\uffff"+
		"\2\34\1\157\10\34\1\170\1\34\3\uffff\1\172\5\34\1\u0080\1\u0081\2\34\1"+
		"\u0084\1\u0085\1\uffff\2\34\1\u0088\1\34\1\u0088\2\34\1\u008c\1\uffff"+
		"\1\u0088\1\uffff\1\u008d\2\34\1\u0090\1\u0091\2\uffff\1\u0092\1\u0093"+
		"\2\uffff\2\34\1\uffff\1\34\1\u0088\1\u0097\2\uffff\2\34\4\uffff\3\34\1"+
		"\uffff\1\34\1\u009e\4\34\1\uffff\1\u00a3\2\34\1\u00a6\1\uffff\2\u00a7"+
		"\3\uffff";
	static final String DFA12_eofS =
		"\u00a9\uffff";
	static final String DFA12_minS =
		"\1\11\1\103\1\101\1\116\1\117\2\116\1\105\1\111\1\110\1\131\1\105\2\117"+
		"\1\111\1\151\4\uffff\1\60\1\uffff\2\75\1\122\4\uffff\1\114\2\117\1\114"+
		"\1\60\1\104\1\111\2\60\1\124\2\60\1\106\1\113\1\107\1\105\1\60\1\123\1"+
		"\114\1\124\1\116\1\115\1\125\1\155\1\165\6\uffff\1\154\1\105\1\122\1\115"+
		"\1\123\1\60\1\uffff\2\60\1\116\1\105\1\106\2\uffff\1\105\1\uffff\1\105"+
		"\1\uffff\1\124\1\105\1\110\1\122\1\uffff\1\103\1\114\1\60\1\124\2\105"+
		"\2\145\1\163\1\103\1\105\1\60\1\105\3\uffff\1\60\1\122\1\117\3\122\2\60"+
		"\1\124\1\105\2\60\1\uffff\1\101\1\123\1\60\1\163\1\60\1\145\1\124\1\60"+
		"\1\uffff\1\60\1\uffff\1\60\1\114\1\105\2\60\2\uffff\2\60\2\uffff\1\111"+
		"\1\124\1\uffff\1\164\2\60\2\uffff\1\104\1\105\4\uffff\1\116\1\101\1\141"+
		"\1\uffff\1\105\1\60\1\123\1\115\1\155\1\122\1\uffff\1\60\1\120\1\160\1"+
		"\60\1\uffff\2\11\3\uffff";
	static final String DFA12_maxS =
		"\1\172\1\145\1\162\1\163\1\157\1\163\1\165\2\151\1\150\1\171\1\145\1\165"+
		"\1\157\1\122\1\162\4\uffff\1\71\1\uffff\1\76\1\75\1\162\4\uffff\1\154"+
		"\2\157\1\114\1\172\1\171\1\151\2\172\1\164\2\172\1\146\1\153\1\147\1\145"+
		"\1\172\1\163\1\154\1\164\1\156\1\115\1\125\1\155\1\165\6\uffff\1\154\1"+
		"\145\1\162\1\155\1\123\1\172\1\uffff\2\172\1\156\1\145\1\164\2\uffff\1"+
		"\145\1\uffff\1\145\1\uffff\1\164\1\145\1\150\1\162\1\uffff\1\143\1\154"+
		"\1\172\1\164\2\105\2\145\1\163\1\143\1\145\1\172\1\105\3\uffff\1\172\1"+
		"\162\1\157\3\162\2\172\1\164\1\145\2\172\1\uffff\1\141\1\123\1\172\1\163"+
		"\1\172\1\145\1\164\1\172\1\uffff\1\172\1\uffff\1\172\1\154\1\145\2\172"+
		"\2\uffff\2\172\2\uffff\1\151\1\124\1\uffff\1\164\2\172\2\uffff\1\144\1"+
		"\145\4\uffff\1\156\1\101\1\141\1\uffff\1\145\1\172\1\163\1\115\1\155\1"+
		"\162\1\uffff\1\172\1\120\1\160\1\172\1\uffff\2\172\3\uffff";
	static final String DFA12_acceptS =
		"\20\uffff\1\34\1\35\1\36\1\37\1\uffff\1\41\3\uffff\1\50\1\51\1\52\1\54"+
		"\31\uffff\1\40\1\42\1\45\1\43\1\46\1\44\6\uffff\1\3\5\uffff\1\24\1\17"+
		"\1\uffff\1\11\1\uffff\1\22\4\uffff\1\14\15\uffff\1\15\1\21\1\26\14\uffff"+
		"\1\23\10\uffff\1\2\1\uffff\1\4\5\uffff\1\7\1\25\2\uffff\1\16\1\20\2\uffff"+
		"\1\47\3\uffff\1\30\1\5\2\uffff\1\6\1\13\1\10\1\12\3\uffff\1\1\6\uffff"+
		"\1\32\4\uffff\1\27\2\uffff\1\31\1\33\1\53";
	static final String DFA12_specialS =
		"\u00a9\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\33\2\uffff\1\33\22\uffff\1\33\6\uffff\1\32\1\21\1\22\1\20\1\31\1\23"+
			"\1\31\1\24\1\uffff\12\31\2\uffff\1\26\1\25\1\27\2\uffff\1\3\1\12\1\15"+
			"\1\13\1\34\1\2\2\34\1\5\1\4\1\34\1\7\1\34\1\14\1\6\2\34\1\10\1\1\1\16"+
			"\2\34\1\11\3\34\4\uffff\1\34\1\uffff\1\3\1\12\1\15\1\13\1\34\1\30\2\34"+
			"\1\5\1\4\1\34\1\7\1\34\1\14\1\6\2\34\1\10\1\1\1\17\2\34\1\11\3\34",
			"\1\36\1\uffff\1\35\35\uffff\1\36\1\uffff\1\35",
			"\1\40\20\uffff\1\37\37\uffff\1\37",
			"\1\42\4\uffff\1\41\32\uffff\1\42\4\uffff\1\41",
			"\1\43\37\uffff\1\43",
			"\1\44\4\uffff\1\45\32\uffff\1\44\4\uffff\1\45",
			"\1\47\3\uffff\1\50\2\uffff\1\46\30\uffff\1\47\3\uffff\1\50\2\uffff\1"+
			"\46",
			"\1\51\3\uffff\1\52\33\uffff\1\51\3\uffff\1\52",
			"\1\53\37\uffff\1\53",
			"\1\54\37\uffff\1\54",
			"\1\55\37\uffff\1\55",
			"\1\56\37\uffff\1\56",
			"\1\60\5\uffff\1\57\31\uffff\1\60\5\uffff\1\57",
			"\1\61\37\uffff\1\61",
			"\1\62\10\uffff\1\63",
			"\1\64\10\uffff\1\65",
			"",
			"",
			"",
			"",
			"\12\31",
			"",
			"\1\70\1\67",
			"\1\72",
			"\1\37\16\uffff\1\74\20\uffff\1\37",
			"",
			"",
			"",
			"",
			"\1\75\37\uffff\1\75",
			"\1\76\37\uffff\1\76",
			"\1\77\37\uffff\1\77",
			"\1\100",
			"\13\34\6\uffff\2\34\1\101\27\34\4\uffff\1\34\1\uffff\2\34\1\101\27\34",
			"\1\103\24\uffff\1\104\12\uffff\1\103\24\uffff\1\104",
			"\1\105\37\uffff\1\105",
			"\13\34\6\uffff\15\34\1\106\14\34\4\uffff\1\107\1\uffff\15\34\1\106\14"+
			"\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\112\37\uffff\1\112",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\3\34\1\114\26\34\4\uffff\1\34\1\uffff\3\34\1\114\26\34",
			"\1\116\37\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\120\37\uffff\1\120",
			"\1\121\37\uffff\1\121",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\123\37\uffff\1\123",
			"\1\124\37\uffff\1\124",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\133",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\136\37\uffff\1\136",
			"\1\137",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"\1\145\15\uffff\1\146\21\uffff\1\145\15\uffff\1\146",
			"",
			"",
			"\1\147\37\uffff\1\147",
			"",
			"\1\150\37\uffff\1\150",
			"",
			"\1\151\37\uffff\1\151",
			"\1\152\37\uffff\1\152",
			"\1\153\37\uffff\1\153",
			"\1\154\37\uffff\1\154",
			"",
			"\1\155\37\uffff\1\155",
			"\1\156\37\uffff\1\156",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\160\37\uffff\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166\37\uffff\1\166",
			"\1\167\37\uffff\1\167",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\171",
			"",
			"",
			"",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\173\37\uffff\1\173",
			"\1\174\37\uffff\1\174",
			"\1\175\37\uffff\1\175",
			"\1\176\37\uffff\1\176",
			"\1\177\37\uffff\1\177",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u0082\37\uffff\1\u0082",
			"\1\u0083\37\uffff\1\u0083",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\u0086\37\uffff\1\u0086",
			"\1\u0087",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u0089",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u008a",
			"\1\u008b\37\uffff\1\u008b",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u008e\37\uffff\1\u008e",
			"\1\u008f\37\uffff\1\u008f",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			"\1\u0094\37\uffff\1\u0094",
			"\1\u0095",
			"",
			"\1\u0096",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			"\1\u0098\37\uffff\1\u0098",
			"\1\u0099\37\uffff\1\u0099",
			"",
			"",
			"",
			"",
			"\1\u009a\37\uffff\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"",
			"\1\u009d\37\uffff\1\u009d",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u009f\37\uffff\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2\37\uffff\1\u00a2",
			"",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\u00a4",
			"\1\u00a5",
			"\13\34\6\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\2\u00a8\2\uffff\1\u00a8\22\uffff\1\u00a8\17\uffff\13\34\6\uffff\32"+
			"\34\4\uffff\1\34\1\uffff\32\34",
			"\2\u00a8\2\uffff\1\u00a8\22\uffff\1\u00a8\17\uffff\13\34\6\uffff\32"+
			"\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | FROM | AS | JOIN | INNER | OUTER | LEFT | RIGHT | ON | WHERE | ORDER | BY | ASC | DESC | IS | NULL | AND | OR | NOT | IN | LIKE | ANY | CONTAINS | SCORE | IN_FOLDER | IN_TREE | TIMESTAMP | STAR | LPAR | RPAR | COMMA | DOT | EQ | NEQ | LT | GT | LTEQ | GTEQ | BOOL_LIT | NUM_LIT | STRING_LIT | WS | TIME_LIT | ID );";
		}
	}

}
