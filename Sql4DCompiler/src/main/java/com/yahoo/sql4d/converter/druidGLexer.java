// $ANTLR 3.5.2 Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2016-07-06 18:38:10

	package com.yahoo.sql4d.converter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class druidGLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int AND=4;
	public static final int ARITH_OPER=5;
	public static final int AS=6;
	public static final int ASC=7;
	public static final int AUTO_ISO=8;
	public static final int BETWEEN=9;
	public static final int BREAK=10;
	public static final int BY=11;
	public static final int COMPARE_OPER=12;
	public static final int CONTAINS=13;
	public static final int COUNT=14;
	public static final int DATE=15;
	public static final int DATE_HOUR=16;
	public static final int DATE_HOUR_MIN=17;
	public static final int DATE_HOUR_MIN_SEC=18;
	public static final int DATE_HOUR_MIN_SEC_SUB=19;
	public static final int DATE_HOUR_MIN_SEC_SUB_TZ=20;
	public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ=21;
	public static final int DATE_YEAR_MONTH_ONLY=22;
	public static final int DATE_YEAR_ONLY=23;
	public static final int DELETE=24;
	public static final int DELIMITER=25;
	public static final int DESC=26;
	public static final int DOUBLE_MAX=27;
	public static final int DOUBLE_MIN=28;
	public static final int DOUBLE_SUM=29;
	public static final int DROP=30;
	public static final int DURATION=31;
	public static final int EQUALS=32;
	public static final int ESC_SEQ=33;
	public static final int FIELD_ACCESS=34;
	public static final int FLOAT=35;
	public static final int FROM=36;
	public static final int GROUP=37;
	public static final int HAVING=38;
	public static final int HEX_DIGIT=39;
	public static final int HINT=40;
	public static final int HYPER_UNIQUE=41;
	public static final int ID=42;
	public static final int IN=43;
	public static final int INCLUDE=44;
	public static final int INSERT=45;
	public static final int INSERT_HADOOP=46;
	public static final int INSERT_REALTIME=47;
	public static final int INTO=48;
	public static final int ISO=49;
	public static final int JAVASCRIPT=50;
	public static final int JOIN=51;
	public static final int KAFKA=52;
	public static final int LCURLY=53;
	public static final int LEFT_JOIN=54;
	public static final int LIKE=55;
	public static final int LIMIT=56;
	public static final int LONG=57;
	public static final int LONG_MAX=58;
	public static final int LONG_MIN=59;
	public static final int LONG_SUM=60;
	public static final int LPARAN=61;
	public static final int LSQUARE=62;
	public static final int MAX_WINDOW=63;
	public static final int NEWLINE=64;
	public static final int NOT=65;
	public static final int NUM=66;
	public static final int OCTAL_ESC=67;
	public static final int ON=68;
	public static final int OPT_AMPERSAND=69;
	public static final int OPT_SEMI_COLON=70;
	public static final int OR=71;
	public static final int ORDER=72;
	public static final int PARTITION=73;
	public static final int PERIOD=74;
	public static final int RCURLY=75;
	public static final int RIGHT_JOIN=76;
	public static final int ROLLUP=77;
	public static final int RPARAN=78;
	public static final int RSQUARE=79;
	public static final int SELECT=80;
	public static final int SINGLE_QUOTE_STRING=81;
	public static final int SORT=82;
	public static final int STRING=83;
	public static final int TABLE=84;
	public static final int THEN=85;
	public static final int UNICODE_ESC=86;
	public static final int UNIQUE=87;
	public static final int VALUES=88;
	public static final int WHERE=89;
	public static final int WHICH=90;
	public static final int WS=91;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public druidGLexer() {} 
	public druidGLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public druidGLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g"; }

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:6:7: ( '(*)' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:6:9: '(*)'
			{
			match("(*)"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:7:7: ( '*' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:7:9: '*'
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
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:8:7: ( ',' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:8:9: ','
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
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:9:7: ( 'interval' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:9:9: 'interval'
			{
			match("interval"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "LPARAN"
	public final void mLPARAN() throws RecognitionException {
		try {
			int _type = LPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:591:8: ( '(' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:591:11: '('
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
	// $ANTLR end "LPARAN"

	// $ANTLR start "RPARAN"
	public final void mRPARAN() throws RecognitionException {
		try {
			int _type = RPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:8: ( ')' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:11: ')'
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
	// $ANTLR end "RPARAN"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:8: ( '{' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:8: ( '}' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:595:9: ( '[' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:595:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:9: ( ']' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:11: ( ( 'INSERT' | 'insert' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:12: ( 'INSERT' | 'insert' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:12: ( 'INSERT' | 'insert' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='I') ) {
				alt1=1;
			}
			else if ( (LA1_0=='i') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:13: 'INSERT'
					{
					match("INSERT"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:22: 'insert'
					{
					match("insert"); 

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
	// $ANTLR end "INSERT"

	// $ANTLR start "INSERT_HADOOP"
	public final void mINSERT_HADOOP() throws RecognitionException {
		try {
			int _type = INSERT_HADOOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:15: ( ( 'INSERT_HADOOP' | 'insert_hadoop' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:16: ( 'INSERT_HADOOP' | 'insert_hadoop' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:16: ( 'INSERT_HADOOP' | 'insert_hadoop' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='I') ) {
				alt2=1;
			}
			else if ( (LA2_0=='i') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:17: 'INSERT_HADOOP'
					{
					match("INSERT_HADOOP"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:33: 'insert_hadoop'
					{
					match("insert_hadoop"); 

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
	// $ANTLR end "INSERT_HADOOP"

	// $ANTLR start "INSERT_REALTIME"
	public final void mINSERT_REALTIME() throws RecognitionException {
		try {
			int _type = INSERT_REALTIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:17: ( ( 'INSERT_REALTIME' | 'insert_realtime' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:18: ( 'INSERT_REALTIME' | 'insert_realtime' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:18: ( 'INSERT_REALTIME' | 'insert_realtime' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='I') ) {
				alt3=1;
			}
			else if ( (LA3_0=='i') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:19: 'INSERT_REALTIME'
					{
					match("INSERT_REALTIME"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:37: 'insert_realtime'
					{
					match("insert_realtime"); 

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
	// $ANTLR end "INSERT_REALTIME"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:15: ( ( 'INTO' | 'into' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:16: ( 'INTO' | 'into' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:16: ( 'INTO' | 'into' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='I') ) {
				alt4=1;
			}
			else if ( (LA4_0=='i') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:17: 'INTO'
					{
					match("INTO"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:24: 'into'
					{
					match("into"); 

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
	// $ANTLR end "INTO"

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:17: ( ( 'VALUES' | 'values' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:18: ( 'VALUES' | 'values' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:18: ( 'VALUES' | 'values' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='V') ) {
				alt5=1;
			}
			else if ( (LA5_0=='v') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:19: 'VALUES'
					{
					match("VALUES"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:28: 'values'
					{
					match("values"); 

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
	// $ANTLR end "VALUES"

	// $ANTLR start "MAX_WINDOW"
	public final void mMAX_WINDOW() throws RecognitionException {
		try {
			int _type = MAX_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:17: ( ( 'MAX_WINDOW' | 'max_window' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:18: ( 'MAX_WINDOW' | 'max_window' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:18: ( 'MAX_WINDOW' | 'max_window' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='M') ) {
				alt6=1;
			}
			else if ( (LA6_0=='m') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:19: 'MAX_WINDOW'
					{
					match("MAX_WINDOW"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:32: 'max_window'
					{
					match("max_window"); 

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
	// $ANTLR end "MAX_WINDOW"

	// $ANTLR start "DELIMITER"
	public final void mDELIMITER() throws RecognitionException {
		try {
			int _type = DELIMITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:17: ( ( 'DELIMITER' | 'delimiter' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:18: ( 'DELIMITER' | 'delimiter' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:18: ( 'DELIMITER' | 'delimiter' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='D') ) {
				alt7=1;
			}
			else if ( (LA7_0=='d') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:19: 'DELIMITER'
					{
					match("DELIMITER"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:31: 'delimiter'
					{
					match("delimiter"); 

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
	// $ANTLR end "DELIMITER"

	// $ANTLR start "PARTITION"
	public final void mPARTITION() throws RecognitionException {
		try {
			int _type = PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:17: ( ( 'PARTITION' | 'partition' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:18: ( 'PARTITION' | 'partition' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:18: ( 'PARTITION' | 'partition' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='P') ) {
				alt8=1;
			}
			else if ( (LA8_0=='p') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:19: 'PARTITION'
					{
					match("PARTITION"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:31: 'partition'
					{
					match("partition"); 

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
	// $ANTLR end "PARTITION"

	// $ANTLR start "ROLLUP"
	public final void mROLLUP() throws RecognitionException {
		try {
			int _type = ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:17: ( ( 'ROLLUP' | 'rollup' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:18: ( 'ROLLUP' | 'rollup' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:18: ( 'ROLLUP' | 'rollup' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='R') ) {
				alt9=1;
			}
			else if ( (LA9_0=='r') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:19: 'ROLLUP'
					{
					match("ROLLUP"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:31: 'rollup'
					{
					match("rollup"); 

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
	// $ANTLR end "ROLLUP"

	// $ANTLR start "DROP"
	public final void mDROP() throws RecognitionException {
		try {
			int _type = DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:17: ( ( 'DROP' | 'drop' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:18: ( 'DROP' | 'drop' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:18: ( 'DROP' | 'drop' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='D') ) {
				alt10=1;
			}
			else if ( (LA10_0=='d') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:19: 'DROP'
					{
					match("DROP"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:26: 'drop'
					{
					match("drop"); 

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
	// $ANTLR end "DROP"

	// $ANTLR start "TABLE"
	public final void mTABLE() throws RecognitionException {
		try {
			int _type = TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:613:17: ( ( 'TABLE' | 'table' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:613:18: ( 'TABLE' | 'table' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:613:18: ( 'TABLE' | 'table' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='T') ) {
				alt11=1;
			}
			else if ( (LA11_0=='t') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:613:19: 'TABLE'
					{
					match("TABLE"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:613:27: 'table'
					{
					match("table"); 

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
	// $ANTLR end "TABLE"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:17: ( ( 'DELETE' | 'delete' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:18: ( 'DELETE' | 'delete' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:18: ( 'DELETE' | 'delete' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='D') ) {
				alt12=1;
			}
			else if ( (LA12_0=='d') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:19: 'DELETE'
					{
					match("DELETE"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:28: 'delete'
					{
					match("delete"); 

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
	// $ANTLR end "DELETE"

	// $ANTLR start "KAFKA"
	public final void mKAFKA() throws RecognitionException {
		try {
			int _type = KAFKA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:17: ( ( 'KAFKA' | 'kafka' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:18: ( 'KAFKA' | 'kafka' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:18: ( 'KAFKA' | 'kafka' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='K') ) {
				alt13=1;
			}
			else if ( (LA13_0=='k') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:19: 'KAFKA'
					{
					match("KAFKA"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:27: 'kafka'
					{
					match("kafka"); 

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
	// $ANTLR end "KAFKA"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:9: ( ( 'STRING' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:10: ( 'STRING' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:10: ( 'STRING' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:11: 'STRING'
			{
			match("STRING"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ISO"
	public final void mISO() throws RecognitionException {
		try {
			int _type = ISO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:620:6: ( ( 'ISO' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:620:7: ( 'ISO' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:620:7: ( 'ISO' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:620:8: 'ISO'
			{
			match("ISO"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISO"

	// $ANTLR start "AUTO_ISO"
	public final void mAUTO_ISO() throws RecognitionException {
		try {
			int _type = AUTO_ISO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:10: ( ( 'AUTO_ISO' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:11: ( 'AUTO_ISO' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:11: ( 'AUTO_ISO' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:12: 'AUTO_ISO'
			{
			match("AUTO_ISO"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTO_ISO"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:9: ( ( 'SELECT' | 'select' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:11: ( 'SELECT' | 'select' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:11: ( 'SELECT' | 'select' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='S') ) {
				alt14=1;
			}
			else if ( (LA14_0=='s') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:12: 'SELECT'
					{
					match("SELECT"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:21: 'select'
					{
					match("select"); 

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
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:626:8: ( ( 'COUNT' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:626:10: ( 'COUNT' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:626:10: ( 'COUNT' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:626:11: 'COUNT'
			{
			match("COUNT"); 

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

	// $ANTLR start "LONG_SUM"
	public final void mLONG_SUM() throws RecognitionException {
		try {
			int _type = LONG_SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:10: ( ( 'LONG_SUM' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:12: ( 'LONG_SUM' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:12: ( 'LONG_SUM' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:13: 'LONG_SUM'
			{
			match("LONG_SUM"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_SUM"

	// $ANTLR start "DOUBLE_SUM"
	public final void mDOUBLE_SUM() throws RecognitionException {
		try {
			int _type = DOUBLE_SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:628:12: ( ( 'DOUBLE_SUM' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:628:14: ( 'DOUBLE_SUM' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:628:14: ( 'DOUBLE_SUM' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:628:15: 'DOUBLE_SUM'
			{
			match("DOUBLE_SUM"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_SUM"

	// $ANTLR start "UNIQUE"
	public final void mUNIQUE() throws RecognitionException {
		try {
			int _type = UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:629:9: ( ( 'UNIQUE' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:629:11: ( 'UNIQUE' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:629:11: ( 'UNIQUE' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:629:12: 'UNIQUE'
			{
			match("UNIQUE"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIQUE"

	// $ANTLR start "HYPER_UNIQUE"
	public final void mHYPER_UNIQUE() throws RecognitionException {
		try {
			int _type = HYPER_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:15: ( ( 'HYPER_UNIQUE' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:17: ( 'HYPER_UNIQUE' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:17: ( 'HYPER_UNIQUE' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:18: 'HYPER_UNIQUE'
			{
			match("HYPER_UNIQUE"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HYPER_UNIQUE"

	// $ANTLR start "DOUBLE_MIN"
	public final void mDOUBLE_MIN() throws RecognitionException {
		try {
			int _type = DOUBLE_MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:631:13: ( ( 'DOUBLE_MIN' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:631:15: ( 'DOUBLE_MIN' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:631:15: ( 'DOUBLE_MIN' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:631:16: 'DOUBLE_MIN'
			{
			match("DOUBLE_MIN"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_MIN"

	// $ANTLR start "DOUBLE_MAX"
	public final void mDOUBLE_MAX() throws RecognitionException {
		try {
			int _type = DOUBLE_MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:632:12: ( ( 'DOUBLE_MAX' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:632:14: ( 'DOUBLE_MAX' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:632:14: ( 'DOUBLE_MAX' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:632:15: 'DOUBLE_MAX'
			{
			match("DOUBLE_MAX"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_MAX"

	// $ANTLR start "LONG_MIN"
	public final void mLONG_MIN() throws RecognitionException {
		try {
			int _type = LONG_MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:633:11: ( ( 'LONG_MIN' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:633:13: ( 'LONG_MIN' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:633:13: ( 'LONG_MIN' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:633:14: 'LONG_MIN'
			{
			match("LONG_MIN"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_MIN"

	// $ANTLR start "LONG_MAX"
	public final void mLONG_MAX() throws RecognitionException {
		try {
			int _type = LONG_MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:634:10: ( ( 'LONG_MAX' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:634:12: ( 'LONG_MAX' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:634:12: ( 'LONG_MAX' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:634:13: 'LONG_MAX'
			{
			match("LONG_MAX"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_MAX"

	// $ANTLR start "DURATION"
	public final void mDURATION() throws RecognitionException {
		try {
			int _type = DURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:636:9: ( ( 'DURATION' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:636:11: ( 'DURATION' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:636:11: ( 'DURATION' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:636:12: 'DURATION'
			{
			match("DURATION"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DURATION"

	// $ANTLR start "PERIOD"
	public final void mPERIOD() throws RecognitionException {
		try {
			int _type = PERIOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:637:8: ( ( 'PERIOD' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:637:10: ( 'PERIOD' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:637:10: ( 'PERIOD' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:637:11: 'PERIOD'
			{
			match("PERIOD"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERIOD"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:638:9: ( ( 'INCLUDE' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:638:11: ( 'INCLUDE' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:638:11: ( 'INCLUDE' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:638:12: 'INCLUDE'
			{
			match("INCLUDE"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "WHICH"
	public final void mWHICH() throws RecognitionException {
		try {
			int _type = WHICH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:640:7: ( ( 'WHICH' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:640:9: ( 'WHICH' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:640:9: ( 'WHICH' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:640:10: 'WHICH'
			{
			match("WHICH"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHICH"

	// $ANTLR start "CONTAINS"
	public final void mCONTAINS() throws RecognitionException {
		try {
			int _type = CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:9: ( ( 'CONTAINS' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:11: ( 'CONTAINS' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:11: ( 'CONTAINS' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:12: 'CONTAINS'
			{
			match("CONTAINS"); 

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

	// $ANTLR start "SORT"
	public final void mSORT() throws RecognitionException {
		try {
			int _type = SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:642:6: ( ( 'SORT' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:642:8: ( 'SORT' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:642:8: ( 'SORT' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:642:9: 'SORT'
			{
			match("SORT"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SORT"

	// $ANTLR start "HINT"
	public final void mHINT() throws RecognitionException {
		try {
			int _type = HINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:644:6: ( ( 'HINT' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:644:8: ( 'HINT' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:644:8: ( 'HINT' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:644:9: 'HINT'
			{
			match("HINT"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HINT"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:5: ( ( 'AS' | 'as' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:7: ( 'AS' | 'as' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:7: ( 'AS' | 'as' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='A') ) {
				alt15=1;
			}
			else if ( (LA15_0=='a') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:8: 'AS'
					{
					match("AS"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:13: 'as'
					{
					match("as"); 

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
	// $ANTLR end "AS"

	// $ANTLR start "FIELD_ACCESS"
	public final void mFIELD_ACCESS() throws RecognitionException {
		try {
			int _type = FIELD_ACCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:647:14: ( ( 'FIELD_ACCESS' | 'field_access' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:647:16: ( 'FIELD_ACCESS' | 'field_access' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:647:16: ( 'FIELD_ACCESS' | 'field_access' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='F') ) {
				alt16=1;
			}
			else if ( (LA16_0=='f') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:647:17: 'FIELD_ACCESS'
					{
					match("FIELD_ACCESS"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:647:32: 'field_access'
					{
					match("field_access"); 

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
	// $ANTLR end "FIELD_ACCESS"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:648:7: ( ( 'FROM' | 'from' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:648:9: ( 'FROM' | 'from' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:648:9: ( 'FROM' | 'from' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='F') ) {
				alt17=1;
			}
			else if ( (LA17_0=='f') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:648:10: 'FROM'
					{
					match("FROM"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:648:17: 'from'
					{
					match("from"); 

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
	// $ANTLR end "FROM"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:8: ( ( 'WHERE' | 'where' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:10: ( 'WHERE' | 'where' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:10: ( 'WHERE' | 'where' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='W') ) {
				alt18=1;
			}
			else if ( (LA18_0=='w') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:11: 'WHERE'
					{
					match("WHERE"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:19: 'where'
					{
					match("where"); 

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
	// $ANTLR end "WHERE"

	// $ANTLR start "BETWEEN"
	public final void mBETWEEN() throws RecognitionException {
		try {
			int _type = BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:650:9: ( ( 'BETWEEN' | 'between' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:650:11: ( 'BETWEEN' | 'between' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:650:11: ( 'BETWEEN' | 'between' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='B') ) {
				alt19=1;
			}
			else if ( (LA19_0=='b') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:650:12: 'BETWEEN'
					{
					match("BETWEEN"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:650:22: 'between'
					{
					match("between"); 

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
	// $ANTLR end "BETWEEN"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:651:6: ( ( 'AND' | 'and' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:651:8: ( 'AND' | 'and' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:651:8: ( 'AND' | 'and' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='A') ) {
				alt20=1;
			}
			else if ( (LA20_0=='a') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:651:9: 'AND'
					{
					match("AND"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:651:15: 'and'
					{
					match("and"); 

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
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:5: ( ( 'OR' | 'or' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:7: ( 'OR' | 'or' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:7: ( 'OR' | 'or' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='O') ) {
				alt21=1;
			}
			else if ( (LA21_0=='o') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:8: 'OR'
					{
					match("OR"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:13: 'or'
					{
					match("or"); 

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
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:653:6: ( ( 'NOT' | 'not' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:653:8: ( 'NOT' | 'not' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:653:8: ( 'NOT' | 'not' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='N') ) {
				alt22=1;
			}
			else if ( (LA22_0=='n') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:653:9: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:653:15: 'not'
					{
					match("not"); 

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
	// $ANTLR end "NOT"

	// $ANTLR start "GROUP"
	public final void mGROUP() throws RecognitionException {
		try {
			int _type = GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:654:7: ( ( 'GROUP' | 'group' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:654:9: ( 'GROUP' | 'group' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:654:9: ( 'GROUP' | 'group' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='G') ) {
				alt23=1;
			}
			else if ( (LA23_0=='g') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:654:10: 'GROUP'
					{
					match("GROUP"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:654:20: 'group'
					{
					match("group"); 

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
	// $ANTLR end "GROUP"

	// $ANTLR start "ASC"
	public final void mASC() throws RecognitionException {
		try {
			int _type = ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:5: ( ( 'ASC' | 'asc' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:7: ( 'ASC' | 'asc' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:7: ( 'ASC' | 'asc' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='A') ) {
				alt24=1;
			}
			else if ( (LA24_0=='a') ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:8: 'ASC'
					{
					match("ASC"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:16: 'asc'
					{
					match("asc"); 

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
	// $ANTLR end "ASC"

	// $ANTLR start "DESC"
	public final void mDESC() throws RecognitionException {
		try {
			int _type = DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:656:6: ( ( 'DESC' | 'desc' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:656:8: ( 'DESC' | 'desc' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:656:8: ( 'DESC' | 'desc' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='D') ) {
				alt25=1;
			}
			else if ( (LA25_0=='d') ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:656:9: 'DESC'
					{
					match("DESC"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:656:18: 'desc'
					{
					match("desc"); 

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
	// $ANTLR end "DESC"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:657:7: ( ( 'ORDER' | 'order' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:657:9: ( 'ORDER' | 'order' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:657:9: ( 'ORDER' | 'order' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='O') ) {
				alt26=1;
			}
			else if ( (LA26_0=='o') ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:657:10: 'ORDER'
					{
					match("ORDER"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:657:20: 'order'
					{
					match("order"); 

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
	// $ANTLR end "ORDER"

	// $ANTLR start "HAVING"
	public final void mHAVING() throws RecognitionException {
		try {
			int _type = HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:8: ( ( 'HAVING' | 'having' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:10: ( 'HAVING' | 'having' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:10: ( 'HAVING' | 'having' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='H') ) {
				alt27=1;
			}
			else if ( (LA27_0=='h') ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:11: 'HAVING'
					{
					match("HAVING"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:22: 'having'
					{
					match("having"); 

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
	// $ANTLR end "HAVING"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:659:7: ( ( 'BREAK' | 'break' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:659:9: ( 'BREAK' | 'break' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:659:9: ( 'BREAK' | 'break' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='B') ) {
				alt28=1;
			}
			else if ( (LA28_0=='b') ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:659:10: 'BREAK'
					{
					match("BREAK"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:659:20: 'break'
					{
					match("break"); 

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
	// $ANTLR end "BREAK"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:660:4: ( ( 'BY' | 'by' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:660:6: ( 'BY' | 'by' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:660:6: ( 'BY' | 'by' )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='B') ) {
				alt29=1;
			}
			else if ( (LA29_0=='b') ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:660:7: 'BY'
					{
					match("BY"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:660:14: 'by'
					{
					match("by"); 

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
	// $ANTLR end "BY"

	// $ANTLR start "LIMIT"
	public final void mLIMIT() throws RecognitionException {
		try {
			int _type = LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:662:7: ( ( 'LIMIT' | 'limit' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:662:9: ( 'LIMIT' | 'limit' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:662:9: ( 'LIMIT' | 'limit' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='L') ) {
				alt30=1;
			}
			else if ( (LA30_0=='l') ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:662:10: 'LIMIT'
					{
					match("LIMIT"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:662:20: 'limit'
					{
					match("limit"); 

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
	// $ANTLR end "LIMIT"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:663:6: ( ( 'LIKE' | 'like' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:663:8: ( 'LIKE' | 'like' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:663:8: ( 'LIKE' | 'like' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='L') ) {
				alt31=1;
			}
			else if ( (LA31_0=='l') ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:663:9: 'LIKE'
					{
					match("LIKE"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:663:18: 'like'
					{
					match("like"); 

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
	// $ANTLR end "LIKE"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:5: ( ( 'IN' | 'in' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:7: ( 'IN' | 'in' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:7: ( 'IN' | 'in' )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='I') ) {
				alt32=1;
			}
			else if ( (LA32_0=='i') ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:8: 'IN'
					{
					match("IN"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:15: 'in'
					{
					match("in"); 

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
	// $ANTLR end "IN"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:665:6: ( ( 'THEN' | 'then' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:665:8: ( 'THEN' | 'then' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:665:8: ( 'THEN' | 'then' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='T') ) {
				alt33=1;
			}
			else if ( (LA33_0=='t') ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:665:9: 'THEN'
					{
					match("THEN"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:665:18: 'then'
					{
					match("then"); 

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
	// $ANTLR end "THEN"

	// $ANTLR start "JAVASCRIPT"
	public final void mJAVASCRIPT() throws RecognitionException {
		try {
			int _type = JAVASCRIPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:668:2: ( ( 'JAVASCRIPT:' | 'javascript:' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:668:5: ( 'JAVASCRIPT:' | 'javascript:' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:668:5: ( 'JAVASCRIPT:' | 'javascript:' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='J') ) {
				alt34=1;
			}
			else if ( (LA34_0=='j') ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:668:6: 'JAVASCRIPT:'
					{
					match("JAVASCRIPT:"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:668:21: 'javascript:'
					{
					match("javascript:"); 

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
	// $ANTLR end "JAVASCRIPT"

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:7: ( ( 'JOIN' | 'join' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:9: ( 'JOIN' | 'join' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:9: ( 'JOIN' | 'join' )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='J') ) {
				alt35=1;
			}
			else if ( (LA35_0=='j') ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:10: 'JOIN'
					{
					match("JOIN"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:19: 'join'
					{
					match("join"); 

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
	// $ANTLR end "JOIN"

	// $ANTLR start "LEFT_JOIN"
	public final void mLEFT_JOIN() throws RecognitionException {
		try {
			int _type = LEFT_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:673:12: ( ( 'LEFT_JOIN' | 'left_join' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:673:14: ( 'LEFT_JOIN' | 'left_join' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:673:14: ( 'LEFT_JOIN' | 'left_join' )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0=='L') ) {
				alt36=1;
			}
			else if ( (LA36_0=='l') ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:673:15: 'LEFT_JOIN'
					{
					match("LEFT_JOIN"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:673:29: 'left_join'
					{
					match("left_join"); 

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
	// $ANTLR end "LEFT_JOIN"

	// $ANTLR start "RIGHT_JOIN"
	public final void mRIGHT_JOIN() throws RecognitionException {
		try {
			int _type = RIGHT_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:676:13: ( ( 'RIGHT_JOIN' | 'right_join' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:676:15: ( 'RIGHT_JOIN' | 'right_join' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:676:15: ( 'RIGHT_JOIN' | 'right_join' )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0=='R') ) {
				alt37=1;
			}
			else if ( (LA37_0=='r') ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:676:16: 'RIGHT_JOIN'
					{
					match("RIGHT_JOIN"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:676:31: 'right_join'
					{
					match("right_join"); 

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
	// $ANTLR end "RIGHT_JOIN"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:679:5: ( ( 'ON' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:679:7: ( 'ON' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:679:7: ( 'ON' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:679:8: 'ON'
			{
			match("ON"); 

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

	// $ANTLR start "OPT_SEMI_COLON"
	public final void mOPT_SEMI_COLON() throws RecognitionException {
		try {
			int _type = OPT_SEMI_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:684:2: ( ';' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:684:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPT_SEMI_COLON"

	// $ANTLR start "OPT_AMPERSAND"
	public final void mOPT_AMPERSAND() throws RecognitionException {
		try {
			int _type = OPT_AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:687:2: ( '&' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:687:4: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPT_AMPERSAND"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:2: ( ( ' ' | '\\t' | NEWLINE )+ )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:4: ( ' ' | '\\t' | NEWLINE )+
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:4: ( ' ' | '\\t' | NEWLINE )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=4;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt38=1;
					}
					break;
				case '\t':
					{
					alt38=2;
					}
					break;
				case '\n':
				case '\r':
					{
					alt38=3;
					}
					break;
				}
				switch (alt38) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:5: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:11: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:18: NEWLINE
					{
					mNEWLINE(); 

					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DATE_YEAR_ONLY"
	public final void mDATE_YEAR_ONLY() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:695:2: ( NUM NUM NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:695:4: NUM NUM NUM NUM
			{
			mNUM(); 

			mNUM(); 

			mNUM(); 

			mNUM(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_YEAR_ONLY"

	// $ANTLR start "DATE_YEAR_MONTH_ONLY"
	public final void mDATE_YEAR_MONTH_ONLY() throws RecognitionException {
		try {
			int _type = DATE_YEAR_MONTH_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:698:2: ( DATE_YEAR_ONLY '-' NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:698:4: DATE_YEAR_ONLY '-' NUM NUM
			{
			mDATE_YEAR_ONLY(); 

			match('-'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_YEAR_MONTH_ONLY"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:701:2: ( DATE_YEAR_MONTH_ONLY '-' NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:701:4: DATE_YEAR_MONTH_ONLY '-' NUM NUM
			{
			mDATE_YEAR_MONTH_ONLY(); 

			match('-'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "DATE_HOUR"
	public final void mDATE_HOUR() throws RecognitionException {
		try {
			int _type = DATE_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:704:2: ( DATE 'T' NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:704:4: DATE 'T' NUM NUM
			{
			mDATE(); 

			match('T'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR"

	// $ANTLR start "DATE_HOUR_MIN"
	public final void mDATE_HOUR_MIN() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:707:2: ( DATE_HOUR ':' NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:707:5: DATE_HOUR ':' NUM NUM
			{
			mDATE_HOUR(); 

			match(':'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN"

	// $ANTLR start "DATE_HOUR_MIN_SEC"
	public final void mDATE_HOUR_MIN_SEC() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:710:2: ( DATE_HOUR_MIN ':' NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:710:5: DATE_HOUR_MIN ':' NUM NUM
			{
			mDATE_HOUR_MIN(); 

			match(':'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC"

	// $ANTLR start "DATE_HOUR_MIN_SEC_SUB"
	public final void mDATE_HOUR_MIN_SEC_SUB() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC_SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:713:2: ( DATE_HOUR_MIN_SEC '.' NUM NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:713:5: DATE_HOUR_MIN_SEC '.' NUM NUM NUM
			{
			mDATE_HOUR_MIN_SEC(); 

			match('.'); 
			mNUM(); 

			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB"

	// $ANTLR start "DATE_HOUR_MIN_SEC_SUB_TZ"
	public final void mDATE_HOUR_MIN_SEC_SUB_TZ() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC_SUB_TZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:716:2: ( DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:716:5: DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM
			{
			mDATE_HOUR_MIN_SEC_SUB(); 

			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mNUM(); 

			mNUM(); 

			match(':'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB_TZ"

	// $ANTLR start "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"
	public final void mDATE_HOUR_MIN_SEC_SUB_UTC_TZ() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC_SUB_UTC_TZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:719:2: ( DATE_HOUR_MIN 'Z' | DATE_HOUR_MIN_SEC 'Z' | DATE_HOUR_MIN_SEC_SUB 'Z' )
			int alt39=3;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= '0' && LA39_0 <= '9')) ) {
				int LA39_1 = input.LA(2);
				if ( ((LA39_1 >= '0' && LA39_1 <= '9')) ) {
					int LA39_2 = input.LA(3);
					if ( ((LA39_2 >= '0' && LA39_2 <= '9')) ) {
						int LA39_3 = input.LA(4);
						if ( ((LA39_3 >= '0' && LA39_3 <= '9')) ) {
							int LA39_4 = input.LA(5);
							if ( (LA39_4=='-') ) {
								int LA39_5 = input.LA(6);
								if ( ((LA39_5 >= '0' && LA39_5 <= '9')) ) {
									int LA39_6 = input.LA(7);
									if ( ((LA39_6 >= '0' && LA39_6 <= '9')) ) {
										int LA39_7 = input.LA(8);
										if ( (LA39_7=='-') ) {
											int LA39_8 = input.LA(9);
											if ( ((LA39_8 >= '0' && LA39_8 <= '9')) ) {
												int LA39_9 = input.LA(10);
												if ( ((LA39_9 >= '0' && LA39_9 <= '9')) ) {
													int LA39_10 = input.LA(11);
													if ( (LA39_10=='T') ) {
														int LA39_11 = input.LA(12);
														if ( ((LA39_11 >= '0' && LA39_11 <= '9')) ) {
															int LA39_12 = input.LA(13);
															if ( ((LA39_12 >= '0' && LA39_12 <= '9')) ) {
																int LA39_13 = input.LA(14);
																if ( (LA39_13==':') ) {
																	int LA39_14 = input.LA(15);
																	if ( ((LA39_14 >= '0' && LA39_14 <= '9')) ) {
																		int LA39_15 = input.LA(16);
																		if ( ((LA39_15 >= '0' && LA39_15 <= '9')) ) {
																			int LA39_16 = input.LA(17);
																			if ( (LA39_16=='Z') ) {
																				alt39=1;
																			}
																			else if ( (LA39_16==':') ) {
																				int LA39_18 = input.LA(18);
																				if ( ((LA39_18 >= '0' && LA39_18 <= '9')) ) {
																					int LA39_19 = input.LA(19);
																					if ( ((LA39_19 >= '0' && LA39_19 <= '9')) ) {
																						int LA39_20 = input.LA(20);
																						if ( (LA39_20=='Z') ) {
																							alt39=2;
																						}
																						else if ( (LA39_20=='.') ) {
																							alt39=3;
																						}

																						else {
																							int nvaeMark = input.mark();
																							try {
																								for (int nvaeConsume = 0; nvaeConsume < 20 - 1; nvaeConsume++) {
																									input.consume();
																								}
																								NoViableAltException nvae =
																									new NoViableAltException("", 39, 20, input);
																								throw nvae;
																							} finally {
																								input.rewind(nvaeMark);
																							}
																						}

																					}

																					else {
																						int nvaeMark = input.mark();
																						try {
																							for (int nvaeConsume = 0; nvaeConsume < 19 - 1; nvaeConsume++) {
																								input.consume();
																							}
																							NoViableAltException nvae =
																								new NoViableAltException("", 39, 19, input);
																							throw nvae;
																						} finally {
																							input.rewind(nvaeMark);
																						}
																					}

																				}

																				else {
																					int nvaeMark = input.mark();
																					try {
																						for (int nvaeConsume = 0; nvaeConsume < 18 - 1; nvaeConsume++) {
																							input.consume();
																						}
																						NoViableAltException nvae =
																							new NoViableAltException("", 39, 18, input);
																						throw nvae;
																					} finally {
																						input.rewind(nvaeMark);
																					}
																				}

																			}

																			else {
																				int nvaeMark = input.mark();
																				try {
																					for (int nvaeConsume = 0; nvaeConsume < 17 - 1; nvaeConsume++) {
																						input.consume();
																					}
																					NoViableAltException nvae =
																						new NoViableAltException("", 39, 16, input);
																					throw nvae;
																				} finally {
																					input.rewind(nvaeMark);
																				}
																			}

																		}

																		else {
																			int nvaeMark = input.mark();
																			try {
																				for (int nvaeConsume = 0; nvaeConsume < 16 - 1; nvaeConsume++) {
																					input.consume();
																				}
																				NoViableAltException nvae =
																					new NoViableAltException("", 39, 15, input);
																				throw nvae;
																			} finally {
																				input.rewind(nvaeMark);
																			}
																		}

																	}

																	else {
																		int nvaeMark = input.mark();
																		try {
																			for (int nvaeConsume = 0; nvaeConsume < 15 - 1; nvaeConsume++) {
																				input.consume();
																			}
																			NoViableAltException nvae =
																				new NoViableAltException("", 39, 14, input);
																			throw nvae;
																		} finally {
																			input.rewind(nvaeMark);
																		}
																	}

																}

																else {
																	int nvaeMark = input.mark();
																	try {
																		for (int nvaeConsume = 0; nvaeConsume < 14 - 1; nvaeConsume++) {
																			input.consume();
																		}
																		NoViableAltException nvae =
																			new NoViableAltException("", 39, 13, input);
																		throw nvae;
																	} finally {
																		input.rewind(nvaeMark);
																	}
																}

															}

															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
																		input.consume();
																	}
																	NoViableAltException nvae =
																		new NoViableAltException("", 39, 12, input);
																	throw nvae;
																} finally {
																	input.rewind(nvaeMark);
																}
															}

														}

														else {
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 39, 11, input);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}

													}

													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 39, 10, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 39, 9, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 39, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 39, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 39, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 39, 5, input);
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
										new NoViableAltException("", 39, 4, input);
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
									new NoViableAltException("", 39, 3, input);
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
								new NoViableAltException("", 39, 2, input);
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
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:719:5: DATE_HOUR_MIN 'Z'
					{
					mDATE_HOUR_MIN(); 

					match('Z'); 
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:720:6: DATE_HOUR_MIN_SEC 'Z'
					{
					mDATE_HOUR_MIN_SEC(); 

					match('Z'); 
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:721:6: DATE_HOUR_MIN_SEC_SUB 'Z'
					{
					mDATE_HOUR_MIN_SEC_SUB(); 

					match('Z'); 
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
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"

	// $ANTLR start "ARITH_OPER"
	public final void mARITH_OPER() throws RecognitionException {
		try {
			int _type = ARITH_OPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:724:13: ( ( '*' | '+' | '/' | '-' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
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
	// $ANTLR end "ARITH_OPER"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:727:9: ( '=' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:727:11: '='
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
	// $ANTLR end "EQUALS"

	// $ANTLR start "COMPARE_OPER"
	public final void mCOMPARE_OPER() throws RecognitionException {
		try {
			int _type = COMPARE_OPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:729:15: ( ( '<' | '>' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( input.LA(1)=='<'||input.LA(1)=='>' ) {
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
	// $ANTLR end "COMPARE_OPER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:733:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:733:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:733:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= '0' && LA40_0 <= '9')||(LA40_0 >= 'A' && LA40_0 <= 'Z')||LA40_0=='_'||(LA40_0 >= 'a' && LA40_0 <= 'z')) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop40;
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

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:737:20: ( ( '\\r\\n' | '\\r' | '\\n' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:737:23: ( '\\r\\n' | '\\r' | '\\n' )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:737:23: ( '\\r\\n' | '\\r' | '\\n' )
			int alt41=3;
			int LA41_0 = input.LA(1);
			if ( (LA41_0=='\r') ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1=='\n') ) {
					alt41=1;
				}

				else {
					alt41=2;
				}

			}
			else if ( (LA41_0=='\n') ) {
				alt41=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:737:25: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:738:18: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:739:18: '\\n'
					{
					match('\n'); 
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "SINGLE_QUOTE_STRING"
	public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
		try {
			int _type = SINGLE_QUOTE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:745:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:745:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:745:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop42:
			while (true) {
				int alt42=3;
				int LA42_0 = input.LA(1);
				if ( (LA42_0=='\\') ) {
					alt42=1;
				}
				else if ( ((LA42_0 >= '\u0000' && LA42_0 <= '&')||(LA42_0 >= '(' && LA42_0 <= '[')||(LA42_0 >= ']' && LA42_0 <= '\uFFFF')) ) {
					alt42=2;
				}

				switch (alt42) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:745:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:745:24: ~ ( '\\\\' | '\\'' )
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
					break loop42;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_QUOTE_STRING"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:748:6: ( ( NUM )+ )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:748:8: ( NUM )+
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:748:8: ( NUM )+
			int cnt43=0;
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= '0' && LA43_0 <= '9')) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
					if ( cnt43 >= 1 ) break loop43;
					EarlyExitException eee = new EarlyExitException(43, input);
					throw eee;
				}
				cnt43++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:749:10: ( ( NUM )* '.' ( NUM )+ )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:749:15: ( NUM )* '.' ( NUM )+
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:749:15: ( NUM )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( ((LA44_0 >= '0' && LA44_0 <= '9')) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
					break loop44;
				}
			}

			match('.'); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:749:24: ( NUM )+
			int cnt45=0;
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( ((LA45_0 >= '0' && LA45_0 <= '9')) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
					if ( cnt45 >= 1 ) break loop45;
					EarlyExitException eee = new EarlyExitException(45, input);
					throw eee;
				}
				cnt45++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:751:14: ( ( '0' .. '9' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:753:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:756:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt46=1;
					}
					break;
				case 'u':
					{
					alt46=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt46=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:756:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:757:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:758:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:762:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt47=3;
			int LA47_0 = input.LA(1);
			if ( (LA47_0=='\\') ) {
				int LA47_1 = input.LA(2);
				if ( ((LA47_1 >= '0' && LA47_1 <= '3')) ) {
					int LA47_2 = input.LA(3);
					if ( ((LA47_2 >= '0' && LA47_2 <= '7')) ) {
						int LA47_4 = input.LA(4);
						if ( ((LA47_4 >= '0' && LA47_4 <= '7')) ) {
							alt47=1;
						}

						else {
							alt47=2;
						}

					}

					else {
						alt47=3;
					}

				}
				else if ( ((LA47_1 >= '4' && LA47_1 <= '7')) ) {
					int LA47_3 = input.LA(3);
					if ( ((LA47_3 >= '0' && LA47_3 <= '7')) ) {
						alt47=2;
					}

					else {
						alt47=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:762:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:763:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:764:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:768:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:768:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:8: ( T__92 | T__93 | T__94 | T__95 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | INSERT | INSERT_HADOOP | INSERT_REALTIME | INTO | VALUES | MAX_WINDOW | DELIMITER | PARTITION | ROLLUP | DROP | TABLE | DELETE | KAFKA | STRING | ISO | AUTO_ISO | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | DOUBLE_MIN | DOUBLE_MAX | LONG_MIN | LONG_MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | IN | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | OPT_AMPERSAND | WS | DATE_YEAR_MONTH_ONLY | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | SINGLE_QUOTE_STRING | LONG | FLOAT )
		int alt48=85;
		alt48 = dfa48.predict(input);
		switch (alt48) {
			case 1 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:10: T__92
				{
				mT__92(); 

				}
				break;
			case 2 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:16: T__93
				{
				mT__93(); 

				}
				break;
			case 3 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:22: T__94
				{
				mT__94(); 

				}
				break;
			case 4 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:28: T__95
				{
				mT__95(); 

				}
				break;
			case 5 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:34: LPARAN
				{
				mLPARAN(); 

				}
				break;
			case 6 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:41: RPARAN
				{
				mRPARAN(); 

				}
				break;
			case 7 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:48: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 8 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:55: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 9 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:62: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 10 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:70: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 11 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:78: INSERT
				{
				mINSERT(); 

				}
				break;
			case 12 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:85: INSERT_HADOOP
				{
				mINSERT_HADOOP(); 

				}
				break;
			case 13 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:99: INSERT_REALTIME
				{
				mINSERT_REALTIME(); 

				}
				break;
			case 14 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:115: INTO
				{
				mINTO(); 

				}
				break;
			case 15 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:120: VALUES
				{
				mVALUES(); 

				}
				break;
			case 16 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:127: MAX_WINDOW
				{
				mMAX_WINDOW(); 

				}
				break;
			case 17 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:138: DELIMITER
				{
				mDELIMITER(); 

				}
				break;
			case 18 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:148: PARTITION
				{
				mPARTITION(); 

				}
				break;
			case 19 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:158: ROLLUP
				{
				mROLLUP(); 

				}
				break;
			case 20 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:165: DROP
				{
				mDROP(); 

				}
				break;
			case 21 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:170: TABLE
				{
				mTABLE(); 

				}
				break;
			case 22 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:176: DELETE
				{
				mDELETE(); 

				}
				break;
			case 23 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:183: KAFKA
				{
				mKAFKA(); 

				}
				break;
			case 24 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:189: STRING
				{
				mSTRING(); 

				}
				break;
			case 25 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:196: ISO
				{
				mISO(); 

				}
				break;
			case 26 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:200: AUTO_ISO
				{
				mAUTO_ISO(); 

				}
				break;
			case 27 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:209: SELECT
				{
				mSELECT(); 

				}
				break;
			case 28 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:216: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 29 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:222: LONG_SUM
				{
				mLONG_SUM(); 

				}
				break;
			case 30 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:231: DOUBLE_SUM
				{
				mDOUBLE_SUM(); 

				}
				break;
			case 31 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:242: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 32 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:249: HYPER_UNIQUE
				{
				mHYPER_UNIQUE(); 

				}
				break;
			case 33 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:262: DOUBLE_MIN
				{
				mDOUBLE_MIN(); 

				}
				break;
			case 34 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:273: DOUBLE_MAX
				{
				mDOUBLE_MAX(); 

				}
				break;
			case 35 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:284: LONG_MIN
				{
				mLONG_MIN(); 

				}
				break;
			case 36 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:293: LONG_MAX
				{
				mLONG_MAX(); 

				}
				break;
			case 37 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:302: DURATION
				{
				mDURATION(); 

				}
				break;
			case 38 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:311: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 39 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:318: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 40 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:326: WHICH
				{
				mWHICH(); 

				}
				break;
			case 41 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:332: CONTAINS
				{
				mCONTAINS(); 

				}
				break;
			case 42 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:341: SORT
				{
				mSORT(); 

				}
				break;
			case 43 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:346: HINT
				{
				mHINT(); 

				}
				break;
			case 44 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:351: AS
				{
				mAS(); 

				}
				break;
			case 45 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:354: FIELD_ACCESS
				{
				mFIELD_ACCESS(); 

				}
				break;
			case 46 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:367: FROM
				{
				mFROM(); 

				}
				break;
			case 47 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:372: WHERE
				{
				mWHERE(); 

				}
				break;
			case 48 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:378: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 49 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:386: AND
				{
				mAND(); 

				}
				break;
			case 50 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:390: OR
				{
				mOR(); 

				}
				break;
			case 51 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:393: NOT
				{
				mNOT(); 

				}
				break;
			case 52 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:397: GROUP
				{
				mGROUP(); 

				}
				break;
			case 53 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:403: ASC
				{
				mASC(); 

				}
				break;
			case 54 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:407: DESC
				{
				mDESC(); 

				}
				break;
			case 55 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:412: ORDER
				{
				mORDER(); 

				}
				break;
			case 56 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:418: HAVING
				{
				mHAVING(); 

				}
				break;
			case 57 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:425: BREAK
				{
				mBREAK(); 

				}
				break;
			case 58 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:431: BY
				{
				mBY(); 

				}
				break;
			case 59 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:434: LIMIT
				{
				mLIMIT(); 

				}
				break;
			case 60 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:440: LIKE
				{
				mLIKE(); 

				}
				break;
			case 61 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:445: IN
				{
				mIN(); 

				}
				break;
			case 62 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:448: THEN
				{
				mTHEN(); 

				}
				break;
			case 63 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:453: JAVASCRIPT
				{
				mJAVASCRIPT(); 

				}
				break;
			case 64 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:464: JOIN
				{
				mJOIN(); 

				}
				break;
			case 65 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:469: LEFT_JOIN
				{
				mLEFT_JOIN(); 

				}
				break;
			case 66 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:479: RIGHT_JOIN
				{
				mRIGHT_JOIN(); 

				}
				break;
			case 67 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:490: ON
				{
				mON(); 

				}
				break;
			case 68 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:493: OPT_SEMI_COLON
				{
				mOPT_SEMI_COLON(); 

				}
				break;
			case 69 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:508: OPT_AMPERSAND
				{
				mOPT_AMPERSAND(); 

				}
				break;
			case 70 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:522: WS
				{
				mWS(); 

				}
				break;
			case 71 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:525: DATE_YEAR_MONTH_ONLY
				{
				mDATE_YEAR_MONTH_ONLY(); 

				}
				break;
			case 72 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:546: DATE
				{
				mDATE(); 

				}
				break;
			case 73 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:551: DATE_HOUR
				{
				mDATE_HOUR(); 

				}
				break;
			case 74 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:561: DATE_HOUR_MIN
				{
				mDATE_HOUR_MIN(); 

				}
				break;
			case 75 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:575: DATE_HOUR_MIN_SEC
				{
				mDATE_HOUR_MIN_SEC(); 

				}
				break;
			case 76 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:593: DATE_HOUR_MIN_SEC_SUB
				{
				mDATE_HOUR_MIN_SEC_SUB(); 

				}
				break;
			case 77 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:615: DATE_HOUR_MIN_SEC_SUB_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_TZ(); 

				}
				break;
			case 78 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:640: DATE_HOUR_MIN_SEC_SUB_UTC_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_UTC_TZ(); 

				}
				break;
			case 79 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:669: ARITH_OPER
				{
				mARITH_OPER(); 

				}
				break;
			case 80 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:680: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 81 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:687: COMPARE_OPER
				{
				mCOMPARE_OPER(); 

				}
				break;
			case 82 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:700: ID
				{
				mID(); 

				}
				break;
			case 83 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:703: SINGLE_QUOTE_STRING
				{
				mSINGLE_QUOTE_STRING(); 

				}
				break;
			case 84 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:723: LONG
				{
				mLONG(); 

				}
				break;
			case 85 :
				// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:728: FLOAT
				{
				mFLOAT(); 

				}
				break;

		}
	}


	protected DFA48 dfa48 = new DFA48(this);
	static final String DFA48_eotS =
		"\1\uffff\1\74\2\uffff\1\70\5\uffff\47\70\3\uffff\1\u0083\11\uffff\2\u0087"+
		"\34\70\1\u00aa\13\70\1\u00aa\10\70\1\u00c2\2\70\1\u00c2\1\u00c6\1\u00c7"+
		"\1\u00c6\13\70\1\uffff\1\u0083\2\70\1\uffff\3\70\1\u00dc\35\70\1\u00fc"+
		"\1\uffff\1\u00fd\15\70\1\u00fc\1\u00fd\7\70\1\uffff\3\70\2\uffff\1\70"+
		"\2\u0116\12\70\1\u0083\1\70\1\u0123\2\70\1\u0123\1\70\1\uffff\6\70\1\u012d"+
		"\1\u012e\4\70\1\u012d\1\u012e\10\70\1\u013b\1\70\1\u013b\4\70\1\u0141"+
		"\1\70\2\uffff\5\70\1\u0148\3\70\1\u014c\4\70\1\u0151\1\70\1\u0151\7\70"+
		"\1\uffff\4\70\1\u0148\2\70\1\u0160\1\70\1\u0160\1\u0083\1\70\1\uffff\11"+
		"\70\2\uffff\13\70\1\u0179\1\uffff\1\u0179\2\u017a\2\70\1\uffff\2\70\1"+
		"\u017f\2\70\1\u0183\1\uffff\3\70\1\uffff\1\70\1\u0188\1\u0189\1\70\1\uffff"+
		"\1\70\1\u0189\1\70\1\u018d\1\70\1\u018d\2\u018f\2\u0190\1\70\1\u0183\2"+
		"\70\1\uffff\1\70\1\uffff\1\u0083\1\70\2\u0198\1\70\2\u019b\3\70\1\u019f"+
		"\3\70\1\u019f\1\70\1\u01a4\1\70\1\u01a6\1\70\1\u01a6\1\70\2\uffff\1\u01a9"+
		"\1\u01aa\1\70\1\u01aa\1\uffff\3\70\1\uffff\1\70\1\u01b1\1\70\1\u01b3\2"+
		"\uffff\3\70\1\uffff\1\70\2\uffff\1\u01b3\3\70\1\uffff\2\70\1\uffff\1\70"+
		"\1\u01c1\1\uffff\3\70\1\uffff\4\70\1\uffff\1\70\1\uffff\2\70\2\uffff\6"+
		"\70\1\uffff\1\70\1\uffff\2\70\2\u01d6\3\70\1\u01da\1\u01dc\4\70\1\uffff"+
		"\5\70\1\u01e7\5\70\1\u01ed\1\u01ee\1\u01ef\1\u01f0\1\u01f1\4\70\1\uffff"+
		"\3\70\3\uffff\6\70\1\u0200\3\70\1\uffff\1\u0200\2\u0204\2\70\5\uffff\1"+
		"\u0207\3\70\1\u0207\2\70\1\uffff\4\70\2\u0212\1\uffff\1\u0213\1\u0214"+
		"\1\u0215\1\uffff\2\u0216\1\uffff\5\70\1\u021b\4\70\5\uffff\3\70\3\uffff"+
		"\4\70\1\u0229\2\u022a\1\uffff\1\u022c\1\70\1\u022c\1\70\2\uffff\1\u022f"+
		"\1\uffff\2\70\2\uffff\2\u0234\2\uffff\1\u0236\4\uffff\1\u023b\4\uffff"+
		"\1\u0240\2\uffff";
	static final String DFA48_eofS =
		"\u0242\uffff";
	static final String DFA48_minS =
		"\1\11\1\52\2\uffff\1\156\5\uffff\1\116\1\101\1\141\1\101\1\141\1\105\1"+
		"\145\1\101\1\141\1\111\1\151\1\101\1\141\1\101\1\141\1\105\1\116\1\145"+
		"\1\117\1\105\1\116\1\101\1\110\1\156\1\111\1\151\1\150\1\105\1\145\1\116"+
		"\1\162\1\117\1\157\1\122\1\162\1\141\1\145\1\101\1\141\3\uffff\1\56\11"+
		"\uffff\2\60\1\117\1\114\1\154\1\130\1\170\1\114\1\117\1\125\1\122\1\154"+
		"\1\157\2\122\1\162\1\114\1\107\1\154\1\147\1\102\1\105\1\142\1\145\1\106"+
		"\1\146\1\122\1\114\1\122\1\124\1\60\1\104\1\154\2\116\1\113\1\106\1\111"+
		"\1\120\1\116\1\126\1\105\1\60\1\144\1\105\1\117\1\145\1\157\1\145\1\124"+
		"\1\105\1\60\1\164\1\145\4\60\1\124\1\164\1\117\1\157\1\166\1\153\1\146"+
		"\1\126\1\111\1\166\1\151\1\uffff\1\56\2\145\1\uffff\1\105\1\117\1\114"+
		"\1\60\1\125\1\165\2\137\1\105\1\103\1\120\1\102\1\101\1\145\1\143\1\160"+
		"\1\124\1\111\1\164\1\114\1\110\1\154\1\150\1\114\1\116\1\154\1\156\1\113"+
		"\1\153\1\111\1\105\1\124\1\117\1\60\1\uffff\1\60\1\145\1\116\1\124\1\107"+
		"\1\111\1\105\1\124\1\121\1\105\1\124\1\111\1\103\1\122\2\60\1\114\1\115"+
		"\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2\uffff\1\145"+
		"\2\60\1\125\1\165\2\151\1\145\1\164\1\101\1\116\1\141\1\156\1\56\1\162"+
		"\1\60\1\162\1\122\1\60\1\125\1\uffff\1\105\1\145\1\127\1\167\1\115\1\124"+
		"\2\60\1\114\1\124\1\155\1\164\2\60\1\111\1\117\1\151\1\125\1\124\1\165"+
		"\1\164\1\105\1\60\1\145\1\60\1\101\1\141\1\116\1\103\1\60\1\137\2\uffff"+
		"\1\143\1\124\1\101\1\137\1\124\1\60\1\137\1\125\1\122\1\60\1\116\1\110"+
		"\1\105\1\104\1\60\1\144\1\60\1\145\1\105\1\113\1\145\1\153\1\122\1\162"+
		"\1\uffff\1\120\1\160\1\156\1\164\1\60\1\137\1\123\1\60\1\163\1\60\1\55"+
		"\1\166\1\uffff\1\164\1\124\1\104\1\123\1\163\1\111\1\151\1\111\1\105\2"+
		"\uffff\1\105\1\111\1\151\1\145\1\124\1\104\1\164\1\120\1\137\1\160\1\137"+
		"\1\60\1\uffff\3\60\1\107\1\124\1\uffff\1\111\1\164\1\60\1\111\1\115\1"+
		"\60\1\uffff\1\112\1\105\1\137\1\uffff\1\107\2\60\1\137\1\uffff\1\137\1"+
		"\60\1\105\1\60\1\145\5\60\1\147\1\60\1\152\1\103\1\uffff\1\143\1\60\1"+
		"\56\1\141\2\60\1\105\2\60\1\116\1\156\1\124\1\60\1\137\1\117\1\164\1\60"+
		"\1\111\1\60\1\151\1\60\1\112\1\60\1\152\2\uffff\2\60\1\123\1\60\1\uffff"+
		"\1\116\1\125\1\101\1\uffff\1\117\1\60\1\125\1\60\2\uffff\1\101\1\141\1"+
		"\116\1\uffff\1\156\2\uffff\1\60\1\157\1\122\1\162\1\60\1\154\1\150\1\uffff"+
		"\1\110\1\60\1\uffff\1\104\1\144\1\105\1\uffff\1\115\1\116\1\145\1\117"+
		"\1\uffff\1\157\1\uffff\1\117\1\157\2\uffff\1\117\1\123\1\115\1\116\1\130"+
		"\1\111\1\uffff\1\116\1\uffff\1\103\1\143\2\60\1\151\1\111\1\151\1\55\1"+
		"\60\1\141\1\145\1\101\1\105\1\uffff\1\117\1\157\1\122\1\125\1\101\1\60"+
		"\1\162\1\116\1\156\1\111\1\151\5\60\1\116\1\111\1\103\1\143\1\uffff\1"+
		"\156\1\120\1\160\1\uffff\1\60\1\uffff\1\144\1\141\1\104\1\101\1\127\1"+
		"\167\1\60\1\115\1\116\1\130\1\uffff\3\60\1\116\1\156\5\uffff\1\60\1\121"+
		"\1\105\1\145\1\60\1\124\1\164\1\60\1\157\1\154\1\117\1\114\2\60\1\uffff"+
		"\3\60\1\uffff\2\60\1\uffff\1\125\1\123\1\163\2\72\1\124\1\157\1\164\1"+
		"\117\1\124\5\uffff\1\105\1\123\1\163\2\uffff\1\60\1\160\1\151\1\120\1"+
		"\111\5\60\1\155\1\60\1\115\2\uffff\1\72\1\uffff\1\145\1\105\1\uffff\4"+
		"\60\1\uffff\1\72\1\uffff\1\60\1\uffff\1\60\1\56\1\uffff\3\60\1\53\2\uffff";
	static final String DFA48_maxS =
		"\1\175\1\52\2\uffff\1\156\5\uffff\1\123\1\101\1\141\1\101\1\141\1\125"+
		"\1\162\1\105\1\141\1\117\1\157\1\110\1\150\1\101\1\141\1\124\1\125\1\145"+
		"\2\117\1\116\1\131\1\110\1\163\1\122\1\162\1\150\1\131\1\171\1\122\1\162"+
		"\1\117\1\157\1\122\1\162\1\141\1\151\1\117\1\157\3\uffff\1\71\11\uffff"+
		"\2\172\1\117\1\114\1\154\1\130\1\170\1\123\1\117\1\125\1\122\1\163\1\157"+
		"\2\122\1\162\1\114\1\107\1\154\1\147\1\102\1\105\1\142\1\145\1\106\1\146"+
		"\1\122\1\114\1\122\1\124\1\172\1\104\1\154\1\125\1\116\1\115\1\106\1\111"+
		"\1\120\1\116\1\126\1\111\1\172\1\144\1\105\1\117\1\145\1\157\1\145\1\124"+
		"\1\105\1\172\1\164\1\145\4\172\1\124\1\164\1\117\1\157\1\166\1\155\1\146"+
		"\1\126\1\111\1\166\1\151\1\uffff\1\71\1\157\1\145\1\uffff\1\105\1\117"+
		"\1\114\1\172\1\125\1\165\2\137\1\111\1\103\1\120\1\102\1\101\1\151\1\143"+
		"\1\160\1\124\1\111\1\164\1\114\1\110\1\154\1\150\1\114\1\116\1\154\1\156"+
		"\1\113\1\153\1\111\1\105\1\124\1\117\1\172\1\uffff\1\172\1\145\1\116\1"+
		"\124\1\107\1\111\1\105\1\124\1\121\1\105\1\124\1\111\1\103\1\122\2\172"+
		"\1\114\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2"+
		"\uffff\1\145\2\172\1\125\1\165\2\151\1\145\1\164\1\101\1\116\1\141\1\156"+
		"\1\71\1\162\1\172\1\162\1\122\1\172\1\125\1\uffff\1\105\1\145\1\127\1"+
		"\167\1\115\1\124\2\172\1\114\1\124\1\155\1\164\2\172\1\111\1\117\1\151"+
		"\1\125\1\124\1\165\1\164\1\105\1\172\1\145\1\172\1\101\1\141\1\116\1\103"+
		"\1\172\1\137\2\uffff\1\143\1\124\1\101\1\137\1\124\1\172\1\137\1\125\1"+
		"\122\1\172\1\116\1\110\1\105\1\104\1\172\1\144\1\172\1\145\1\105\1\113"+
		"\1\145\1\153\1\122\1\162\1\uffff\1\120\1\160\1\156\1\164\1\172\1\137\1"+
		"\123\1\172\1\163\1\172\1\71\1\166\1\uffff\1\164\1\124\1\104\1\123\1\163"+
		"\1\111\1\151\1\111\1\105\2\uffff\1\105\1\111\1\151\1\145\1\124\1\104\1"+
		"\164\1\120\1\137\1\160\1\137\1\172\1\uffff\3\172\1\107\1\124\1\uffff\1"+
		"\111\1\164\1\172\1\111\1\123\1\172\1\uffff\1\112\1\105\1\137\1\uffff\1"+
		"\107\2\172\1\137\1\uffff\1\137\1\172\1\105\1\172\1\145\5\172\1\147\1\172"+
		"\1\152\1\103\1\uffff\1\143\2\71\1\141\2\172\1\105\2\172\1\116\1\156\1"+
		"\124\1\172\1\137\1\117\1\164\1\172\1\111\1\172\1\151\1\172\1\112\1\172"+
		"\1\152\2\uffff\2\172\1\123\1\172\1\uffff\1\116\1\125\1\111\1\uffff\1\117"+
		"\1\172\1\125\1\172\2\uffff\1\101\1\141\1\116\1\uffff\1\156\2\uffff\1\172"+
		"\1\157\1\122\1\162\1\71\1\154\1\162\1\uffff\1\122\1\172\1\uffff\1\104"+
		"\1\144\1\105\1\uffff\1\123\1\116\1\145\1\117\1\uffff\1\157\1\uffff\1\117"+
		"\1\157\2\uffff\1\117\1\123\1\115\1\116\1\130\1\111\1\uffff\1\116\1\uffff"+
		"\1\103\1\143\2\172\1\151\1\111\1\151\1\55\1\172\1\141\1\145\1\101\1\105"+
		"\1\uffff\1\117\1\157\1\122\1\125\1\111\1\172\1\162\1\116\1\156\1\111\1"+
		"\151\5\172\1\116\1\111\1\103\1\143\1\uffff\1\156\1\120\1\160\1\uffff\1"+
		"\71\1\uffff\1\144\1\141\1\104\1\101\1\127\1\167\1\172\1\115\1\116\1\130"+
		"\1\uffff\3\172\1\116\1\156\5\uffff\1\172\1\121\1\105\1\145\1\172\1\124"+
		"\1\164\1\71\1\157\1\154\1\117\1\114\2\172\1\uffff\3\172\1\uffff\2\172"+
		"\1\uffff\1\125\1\123\1\163\2\72\1\124\1\157\1\164\1\117\1\124\5\uffff"+
		"\1\105\1\123\1\163\2\uffff\1\71\1\160\1\151\1\120\1\111\3\172\1\71\1\172"+
		"\1\155\1\172\1\115\2\uffff\1\72\1\uffff\1\145\1\105\1\uffff\1\71\2\172"+
		"\1\71\1\uffff\1\132\1\uffff\1\71\1\uffff\1\71\1\132\1\uffff\3\71\1\132"+
		"\2\uffff";
	static final String DFA48_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\47\uffff\1\104\1\105\1"+
		"\106\1\uffff\1\117\1\120\1\121\1\122\1\123\1\125\1\1\1\5\1\2\105\uffff"+
		"\1\124\3\uffff\1\75\42\uffff\1\54\27\uffff\1\72\3\uffff\1\62\1\103\24"+
		"\uffff\1\31\37\uffff\1\65\1\61\30\uffff\1\63\14\uffff\1\16\11\uffff\1"+
		"\66\1\24\14\uffff\1\76\5\uffff\1\52\6\uffff\1\74\3\uffff\1\53\4\uffff"+
		"\1\56\16\uffff\1\100\30\uffff\1\25\1\27\4\uffff\1\34\3\uffff\1\73\4\uffff"+
		"\1\50\1\57\3\uffff\1\71\1\uffff\1\67\1\64\7\uffff\1\13\2\uffff\1\17\3"+
		"\uffff\1\26\4\uffff\1\46\1\uffff\1\23\2\uffff\1\30\1\33\6\uffff\1\37\1"+
		"\uffff\1\70\15\uffff\1\47\24\uffff\1\60\3\uffff\1\107\1\uffff\1\4\12\uffff"+
		"\1\45\5\uffff\1\32\1\51\1\35\1\43\1\44\16\uffff\1\21\3\uffff\1\22\2\uffff"+
		"\1\101\12\uffff\1\20\1\36\1\41\1\42\1\102\3\uffff\1\77\1\110\15\uffff"+
		"\1\40\1\55\1\uffff\1\14\2\uffff\1\111\4\uffff\1\15\1\uffff\1\112\1\uffff"+
		"\1\116\2\uffff\1\113\4\uffff\1\114\1\115";
	static final String DFA48_specialS =
		"\u0242\uffff}>";
	static final String[] DFA48_transitionS = {
			"\2\63\2\uffff\1\63\22\uffff\1\63\5\uffff\1\62\1\71\1\1\1\5\1\2\1\65\1"+
			"\3\1\65\1\72\1\65\12\64\1\uffff\1\61\1\67\1\66\1\67\2\uffff\1\32\1\45"+
			"\1\34\1\17\1\70\1\42\1\53\1\37\1\12\1\57\1\27\1\35\1\15\1\51\1\47\1\21"+
			"\1\70\1\23\1\31\1\25\1\36\1\13\1\40\3\70\1\10\1\uffff\1\11\1\uffff\1"+
			"\70\1\uffff\1\41\1\46\1\70\1\20\1\70\1\43\1\54\1\55\1\4\1\60\1\30\1\56"+
			"\1\16\1\52\1\50\1\22\1\70\1\24\1\33\1\26\1\70\1\14\1\44\3\70\1\6\1\uffff"+
			"\1\7",
			"\1\73",
			"",
			"",
			"\1\76",
			"",
			"",
			"",
			"",
			"",
			"\1\77\4\uffff\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105\11\uffff\1\107\2\uffff\1\106\2\uffff\1\110",
			"\1\111\14\uffff\1\112",
			"\1\113\3\uffff\1\114",
			"\1\115",
			"\1\117\5\uffff\1\116",
			"\1\121\5\uffff\1\120",
			"\1\122\6\uffff\1\123",
			"\1\124\6\uffff\1\125",
			"\1\126",
			"\1\127",
			"\1\131\11\uffff\1\132\4\uffff\1\130",
			"\1\135\4\uffff\1\134\1\uffff\1\133",
			"\1\136",
			"\1\137",
			"\1\142\3\uffff\1\141\5\uffff\1\140",
			"\1\143",
			"\1\146\7\uffff\1\145\17\uffff\1\144",
			"\1\147",
			"\1\151\4\uffff\1\150",
			"\1\152\10\uffff\1\153",
			"\1\154\10\uffff\1\155",
			"\1\156",
			"\1\157\14\uffff\1\160\6\uffff\1\161",
			"\1\162\14\uffff\1\163\6\uffff\1\164",
			"\1\166\3\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\176\3\uffff\1\175",
			"\1\177\15\uffff\1\u0080",
			"\1\u0081\15\uffff\1\u0082",
			"",
			"",
			"",
			"\1\72\1\uffff\12\u0084",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u0086\1\u0085\6\70",
			"\12\70\7\uffff\2\70\1\u008a\17\70\1\u0088\1\u0089\6\70\4\uffff\1\70"+
			"\1\uffff\32\70",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090\6\uffff\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\6\uffff\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\12\70\7\uffff\2\70\1\u00a9\27\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ae\6\uffff\1\u00ad",
			"\1\u00af",
			"\1\u00b1\1\uffff\1\u00b0",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b8\3\uffff\1\u00b7",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00b9\27\70",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00c3",
			"\1\u00c4",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\3\70\1\u00c5\26\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00c8\26\70",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00cf\1\uffff\1\u00ce",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"",
			"\1\72\1\uffff\12\u00d5",
			"\1\u00d6\11\uffff\1\u00d7",
			"\1\u00d8",
			"",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e2\3\uffff\1\u00e1",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e8\3\uffff\1\u00e7",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"",
			"",
			"\1\u0115",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\72\1\uffff\12\u0121",
			"\1\u0122",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0124",
			"\1\u0125",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0126",
			"",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u013c",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0142",
			"",
			"",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0152",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u015e",
			"\1\u015f",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0161",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0162\1\72\1\uffff\12\u0163",
			"\1\u0164",
			"",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"",
			"",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u017b",
			"\1\u017c",
			"",
			"\1\u017d",
			"\1\u017e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0180",
			"\1\u0182\5\uffff\1\u0181",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"",
			"\1\u0187",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u018a",
			"",
			"\1\u018b",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u018c",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u018e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0191",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0192",
			"\1\u0193",
			"",
			"\1\u0194",
			"\12\u0195",
			"\1\72\1\uffff\12\u0163",
			"\1\u0196",
			"\12\70\7\uffff\32\70\4\uffff\1\u0197\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\u0199\1\uffff\32\70",
			"\1\u019a",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a3",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a5",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a7",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a8",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01ab",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01af\7\uffff\1\u01ae",
			"",
			"\1\u01b0",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01b2",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"",
			"\1\u01b7",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\12\u01bb",
			"\1\u01bc",
			"\1\u01bd\11\uffff\1\u01be",
			"",
			"\1\u01bf\11\uffff\1\u01c0",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"",
			"\1\u01c6\5\uffff\1\u01c5",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"",
			"\1\u01ca",
			"",
			"\1\u01cb",
			"\1\u01cc",
			"",
			"",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"",
			"\1\u01d3",
			"",
			"\1\u01d4",
			"\1\u01d5",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01db",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\1\u01e0",
			"",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e6\7\uffff\1\u01e5",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"",
			"\12\u01f9",
			"",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0205",
			"\1\u0206",
			"",
			"",
			"",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u020b",
			"\1\u020c",
			"\12\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a",
			"\1\u021a",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"",
			"",
			"",
			"",
			"",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"",
			"",
			"\12\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\u022b",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u022d",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u022e",
			"",
			"",
			"\1\u0230",
			"",
			"\1\u0231",
			"\1\u0232",
			"",
			"\12\u0233",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\u0235",
			"",
			"\1\u0237\37\uffff\1\u0238",
			"",
			"\12\u0239",
			"",
			"\12\u023a",
			"\1\u023c\53\uffff\1\u0238",
			"",
			"\12\u023d",
			"\12\u023e",
			"\12\u023f",
			"\1\u0241\1\uffff\1\u0241\54\uffff\1\u0238",
			"",
			""
	};

	static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
	static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
	static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
	static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
	static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
	static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
	static final short[][] DFA48_transition;

	static {
		int numStates = DFA48_transitionS.length;
		DFA48_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
		}
	}

	protected class DFA48 extends DFA {

		public DFA48(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 48;
			this.eot = DFA48_eot;
			this.eof = DFA48_eof;
			this.min = DFA48_min;
			this.max = DFA48_max;
			this.accept = DFA48_accept;
			this.special = DFA48_special;
			this.transition = DFA48_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__92 | T__93 | T__94 | T__95 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | INSERT | INSERT_HADOOP | INSERT_REALTIME | INTO | VALUES | MAX_WINDOW | DELIMITER | PARTITION | ROLLUP | DROP | TABLE | DELETE | KAFKA | STRING | ISO | AUTO_ISO | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | DOUBLE_MIN | DOUBLE_MAX | LONG_MIN | LONG_MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | IN | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | OPT_AMPERSAND | WS | DATE_YEAR_MONTH_ONLY | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | SINGLE_QUOTE_STRING | LONG | FLOAT );";
		}
	}

}
