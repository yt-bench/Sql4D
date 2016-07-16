// $ANTLR 3.5.2 Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2016-07-16 19:18:13

	package com.yahoo.sql4d.converter;

	import org.antlr.runtime.*;
	import java.util.ArrayList;
	import java.util.Arrays;
	import com.yahoo.sql4d.*;
	import com.yahoo.sql4d.beans.*;
	import com.yahoo.sql4d.insert.*;
	import com.yahoo.sql4d.delete.*;
	import com.yahoo.sql4d.drop.*;
	import com.yahoo.sql4d.insert.nodes.*;
	import com.yahoo.sql4d.query.*;
	import com.yahoo.sql4d.query.nodes.*;
	import com.yahoo.sql4d.query.groupby.*;
	import com.yahoo.sql4d.query.timeseries.*;
	import com.yahoo.sql4d.query.select.*;
	import com.yahoo.sql4d.query.search.*;
	import com.yahoo.sql4d.query.topn.*;
	import com.yahoo.sql4d.query.timeboundary.*;
	import com.yahoo.sql4d.query.*;
	import static com.yahoo.sql4d.utils.Utils.*;
	import static com.yahoo.sql4d.utils.DruidUtils.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License. 
 * See accompanying LICENSE file.
 */
@SuppressWarnings("all")
public class druidGParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARITH_OPER", "AS", "ASC", 
		"AUTO_ISO", "BETWEEN", "BREAK", "BY", "COMPARE_OPER", "CONTAINS", "COUNT", 
		"DATE", "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB", 
		"DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ", "DATE_YEAR_MONTH_ONLY", 
		"DATE_YEAR_ONLY", "DELETE", "DELIMITER", "DESC", "DOUBLE_MAX", "DOUBLE_MIN", 
		"DOUBLE_SUM", "DROP", "DURATION", "EQUALS", "ESC_SEQ", "FIELD_ACCESS", 
		"FLOAT", "FROM", "GROUP", "HAVING", "HEX_DIGIT", "HINT", "HYPER_UNIQUE", 
		"ID", "IN", "INCLUDE", "INSERT", "INSERT_HADOOP", "INSERT_REALTIME", "INTO", 
		"ISO", "JAVASCRIPT", "JOIN", "KAFKA", "LCURLY", "LEFT_JOIN", "LIKE", "LIMIT", 
		"LONG", "LONG_MAX", "LONG_MIN", "LONG_SUM", "LPARAN", "LSQUARE", "MAX_WINDOW", 
		"NEWLINE", "NOT", "NUM", "OCTAL_ESC", "ON", "OPT_AMPERSAND", "OPT_SEMI_COLON", 
		"OR", "ORDER", "PARTITION", "PERIOD", "RCURLY", "RIGHT_JOIN", "ROLLUP", 
		"RPARAN", "RSQUARE", "SELECT", "SINGLE_QUOTE_STRING", "SORT", "STRING", 
		"TABLE", "THEN", "UNICODE_ESC", "UNIQUE", "VALUES", "WHERE", "WHICH", 
		"WS", "'(*)'", "'*'", "','", "'interval'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public druidGParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public druidGParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return druidGParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g"; }



	// $ANTLR start "program"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:43:1: program returns [Program program] : ( (s1= grandQuery ) | (s2= grandInsert ) | (s3= grandDelete ) | (s4= grandDrop ) );
	public final Program program() throws RecognitionException {
		Program program = null;


		QueryProgram s1 =null;
		InsertProgram s2 =null;
		DeleteProgram s3 =null;
		DropProgram s4 =null;

		 program = null; 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:45:2: ( (s1= grandQuery ) | (s2= grandInsert ) | (s3= grandDelete ) | (s4= grandDrop ) )
			int alt1=4;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt1=1;
				}
				break;
			case INSERT:
			case INSERT_HADOOP:
			case INSERT_REALTIME:
				{
				alt1=2;
				}
				break;
			case DELETE:
				{
				alt1=3;
				}
				break;
			case DROP:
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
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:45:4: (s1= grandQuery )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:45:4: (s1= grandQuery )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:45:5: s1= grandQuery
					{
					pushFollow(FOLLOW_grandQuery_in_program49);
					s1=grandQuery();
					state._fsp--;

					}

					 program = s1; 
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:46:4: (s2= grandInsert )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:46:4: (s2= grandInsert )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:46:5: s2= grandInsert
					{
					pushFollow(FOLLOW_grandInsert_in_program61);
					s2=grandInsert();
					state._fsp--;

					}

					 program = s2; 
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:47:4: (s3= grandDelete )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:47:4: (s3= grandDelete )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:47:5: s3= grandDelete
					{
					pushFollow(FOLLOW_grandDelete_in_program73);
					s3=grandDelete();
					state._fsp--;

					}

					 program = s3; 
					}
					break;
				case 4 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:4: (s4= grandDrop )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:4: (s4= grandDrop )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:5: s4= grandDrop
					{
					pushFollow(FOLLOW_grandDrop_in_program85);
					s4=grandDrop();
					state._fsp--;

					}

					 program = s4; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "program"



	// $ANTLR start "grandDelete"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:1: grandDelete returns [DeleteProgram program] : (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
	public final DeleteProgram grandDelete() throws RecognitionException {
		DeleteProgram program = null;


		DeleteMeta s1 =null;

		 program = null; 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:2: ( (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:4: (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:4: (s1= deleteStmnt )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:5: s1= deleteStmnt
			{
			pushFollow(FOLLOW_deleteStmnt_in_grandDelete113);
			s1=deleteStmnt();
			state._fsp--;

			}

			 program = new DeleteProgram();program.addStmnt(s1); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:4: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandDelete122); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			int alt5=2;
			switch ( input.LA(1) ) {
			case OPT_SEMI_COLON:
				{
				alt5=1;
				}
				break;
			case EOF:
				{
				alt5=1;
				}
				break;
			case OPT_AMPERSAND:
				{
				alt5=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:9: ( OPT_SEMI_COLON )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:9: ( OPT_SEMI_COLON )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==OPT_SEMI_COLON) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:9: OPT_SEMI_COLON
							{
							match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandDelete126); 
							}
							break;

					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:27: ( OPT_AMPERSAND )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:27: ( OPT_AMPERSAND )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OPT_AMPERSAND) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:28: OPT_AMPERSAND
							{
							match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandDelete132); 
							program.waitForCompletion = false;
							}
							break;

					}

					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandDelete"



	// $ANTLR start "grandDrop"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:1: grandDrop returns [DropProgram program] : (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
	public final DropProgram grandDrop() throws RecognitionException {
		DropProgram program = null;


		DropMeta s1 =null;

		 program = null; 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:59:2: ( (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:59:4: (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:59:4: (s1= dropStmnt )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:59:5: s1= dropStmnt
			{
			pushFollow(FOLLOW_dropStmnt_in_grandDrop164);
			s1=dropStmnt();
			state._fsp--;

			}

			 program = new DropProgram();program.addStmnt(s1); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:4: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandDrop173); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			int alt9=2;
			switch ( input.LA(1) ) {
			case OPT_SEMI_COLON:
				{
				alt9=1;
				}
				break;
			case EOF:
				{
				alt9=1;
				}
				break;
			case OPT_AMPERSAND:
				{
				alt9=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:9: ( OPT_SEMI_COLON )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:9: ( OPT_SEMI_COLON )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==OPT_SEMI_COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:9: OPT_SEMI_COLON
							{
							match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandDrop177); 
							}
							break;

					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:27: ( OPT_AMPERSAND )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:27: ( OPT_AMPERSAND )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==OPT_AMPERSAND) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:28: OPT_AMPERSAND
							{
							match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandDrop183); 
							program.waitForCompletion = false;
							}
							break;

					}

					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandDrop"



	// $ANTLR start "grandInsert"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:63:1: grandInsert returns [InsertProgram program] : ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) );
	public final InsertProgram grandInsert() throws RecognitionException {
		InsertProgram program = null;


		BasicInsertMeta s1 =null;
		BatchInsertMeta s2 =null;
		RTInsertMeta s3 =null;

		 program = null; 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:2: ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case INSERT:
				{
				alt14=1;
				}
				break;
			case INSERT_HADOOP:
				{
				alt14=2;
				}
				break;
			case INSERT_REALTIME:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:4: (s1= insertStmnt )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:4: (s1= insertStmnt )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:5: s1= insertStmnt
					{
					pushFollow(FOLLOW_insertStmnt_in_grandInsert214);
					s1=insertStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertInstance();program.addStmnt(s1); 
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:4: (s2= insertHStmnt )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:4: (s2= insertHStmnt )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:5: s2= insertHStmnt
					{
					pushFollow(FOLLOW_insertHStmnt_in_grandInsert226);
					s2=insertHStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertHadoopInstance();program.addStmnt(s2); 
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:4: (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:4: (s3= insertRTStmnt )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:5: s3= insertRTStmnt
					{
					pushFollow(FOLLOW_insertRTStmnt_in_grandInsert238);
					s3=insertRTStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertRTInstance();program.addStmnt(s3); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:4: ( WS )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==WS) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:4: WS
							{
							match(input,WS,FOLLOW_WS_in_grandInsert247); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
					int alt13=2;
					switch ( input.LA(1) ) {
					case OPT_SEMI_COLON:
						{
						alt13=1;
						}
						break;
					case EOF:
						{
						alt13=1;
						}
						break;
					case OPT_AMPERSAND:
						{
						alt13=2;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:9: ( OPT_SEMI_COLON )?
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:9: ( OPT_SEMI_COLON )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==OPT_SEMI_COLON) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:9: OPT_SEMI_COLON
									{
									match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandInsert251); 
									}
									break;

							}

							}
							break;
						case 2 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:27: ( OPT_AMPERSAND )?
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:27: ( OPT_AMPERSAND )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==OPT_AMPERSAND) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:28: OPT_AMPERSAND
									{
									match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandInsert257); 
									program.waitForCompletion = false;
									}
									break;

							}

							}
							break;

					}


					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandInsert"



	// $ANTLR start "deleteStmnt"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:1: deleteStmnt returns [DeleteMeta dMeta] : DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause ;
	public final DeleteMeta deleteStmnt() throws RecognitionException {
		DeleteMeta dMeta = null;


		Token id=null;
		List<Interval> i =null;

		 dMeta = new DeleteMeta();      
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:2: ( DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:3: DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause
			{
			match(input,DELETE,FOLLOW_DELETE_in_deleteStmnt283); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt285); 
			match(input,FROM,FOLLOW_FROM_in_deleteStmnt287); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt289); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:21: (id= ID WS )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:22: id= ID WS
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_deleteStmnt294); 
			dMeta.dataSource = (id!=null?id.getText():null); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt298); 
			}

			match(input,WHERE,FOLLOW_WHERE_in_deleteStmnt303); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt305); 
			pushFollow(FOLLOW_intervalClause_in_deleteStmnt309);
			i=intervalClause();
			state._fsp--;

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     dMeta.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dMeta;
	}
	// $ANTLR end "deleteStmnt"



	// $ANTLR start "dropStmnt"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:82:1: dropStmnt returns [DropMeta dMeta] : DROP WS TABLE WS (id= ID ) ;
	public final DropMeta dropStmnt() throws RecognitionException {
		DropMeta dMeta = null;


		Token id=null;

		 dMeta = new DropMeta();      
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:2: ( DROP WS TABLE WS (id= ID ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:3: DROP WS TABLE WS (id= ID )
			{
			match(input,DROP,FOLLOW_DROP_in_dropStmnt337); 
			match(input,WS,FOLLOW_WS_in_dropStmnt339); 
			match(input,TABLE,FOLLOW_TABLE_in_dropStmnt341); 
			match(input,WS,FOLLOW_WS_in_dropStmnt343); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:20: (id= ID )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:21: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_dropStmnt348); 
			dMeta.dataSource = (id!=null?id.getText():null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dMeta;
	}
	// $ANTLR end "dropStmnt"



	// $ANTLR start "insertStmnt"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:1: insertStmnt returns [BasicInsertMeta iMeta] : ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ;
	public final BasicInsertMeta insertStmnt() throws RecognitionException {
		BasicInsertMeta iMeta = null;


		Token id=null;
		Token paths=null;
		Token gran=null;
		Token delim=null;
		Token listDelim=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new BasicInsertMeta();      
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:2: ( ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:4: INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT,FOLLOW_INSERT_in_insertStmnt375); 
			match(input,WS,FOLLOW_WS_in_insertStmnt377); 
			match(input,INTO,FOLLOW_INTO_in_insertStmnt379); 
			match(input,WS,FOLLOW_WS_in_insertStmnt381); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:22: (id= ID )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:23: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertStmnt386); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:62: ( WS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:62: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt391); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt394); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:73: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:73: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt396); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertStmnt399);
			selectItems(iMeta);
			state._fsp--;

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:96: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					int LA19_1 = input.LA(2);
					if ( (LA19_1==94) ) {
						alt19=1;
					}

				}
				else if ( (LA19_0==94) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:97: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:97: ( WS )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==WS) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:97: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt403); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_insertStmnt406); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:105: ( WS )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==WS) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:105: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt408); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertStmnt411);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:130: ( WS )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==WS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:130: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt416); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt419); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:141: ( WS )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==WS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:141: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt421); 
					}
					break;

			}

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:90:3: ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==VALUES) ) {
				alt29=1;
			}
			else if ( (LA29_0==FROM) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:6: VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )?
					{
					match(input,VALUES,FOLLOW_VALUES_in_insertStmnt434); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:13: ( WS )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==WS) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:13: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt436); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt439); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:24: ( WS )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:24: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt441); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:28: (a= anyValue )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:29: a= anyValue
					{
					pushFollow(FOLLOW_anyValue_in_insertStmnt447);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:65: ( ( WS )? ',' ( WS )? a= anyValue )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==WS) ) {
							int LA26_1 = input.LA(2);
							if ( (LA26_1==94) ) {
								alt26=1;
							}

						}
						else if ( (LA26_0==94) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:66: ( WS )? ',' ( WS )? a= anyValue
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:66: ( WS )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==WS) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:66: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt454); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_insertStmnt457); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:74: ( WS )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==WS) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:74: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt459); 
									}
									break;

							}

							pushFollow(FOLLOW_anyValue_in_insertStmnt464);
							a=anyValue();
							state._fsp--;

							iMeta.values.add(a);
							}
							break;

						default :
							break loop26;
						}
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:114: ( WS )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==WS) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:114: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt470); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt473); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:125: ( WS )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==WS) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:125: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt475); 
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:6: FROM WS (paths= SINGLE_QUOTE_STRING ) WS
					{
					match(input,FROM,FOLLOW_FROM_in_insertStmnt492); 
					match(input,WS,FOLLOW_WS_in_insertStmnt494); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:14: (paths= SINGLE_QUOTE_STRING )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:15: paths= SINGLE_QUOTE_STRING
					{
					paths=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt499); 
					iMeta.dataPath = unquote((paths!=null?paths.getText():null));
					}

					match(input,WS,FOLLOW_WS_in_insertStmnt504); 
					}

					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:95:3: ( WHERE WS i= intervalClause )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:95:4: WHERE WS i= intervalClause
			{
			match(input,WHERE,FOLLOW_WHERE_in_insertStmnt514); 
			match(input,WS,FOLLOW_WS_in_insertStmnt516); 
			pushFollow(FOLLOW_intervalClause_in_insertStmnt520);
			i=intervalClause();
			state._fsp--;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==WS) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==BREAK) ) {
					alt30=1;
				}
			}
			switch (alt30) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt527); 
					match(input,BREAK,FOLLOW_BREAK_in_insertStmnt529); 
					match(input,WS,FOLLOW_WS_in_insertStmnt531); 
					match(input,BY,FOLLOW_BY_in_insertStmnt533); 
					match(input,WS,FOLLOW_WS_in_insertStmnt535); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt539); 
					 iMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:2: ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==WS) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:3: WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt553); 
					match(input,DELIMITER,FOLLOW_DELIMITER_in_insertStmnt555); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:16: ( WS )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==WS) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:16: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt557); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt560); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:27: ( WS )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==WS) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:27: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt562); 
							}
							break;

					}

					delim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt567); 
					iMeta.delimiter=unicode(unquote((delim!=null?delim.getText():null)));
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:105: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==WS) ) {
						int LA35_1 = input.LA(2);
						if ( (LA35_1==94) ) {
							alt35=1;
						}
					}
					else if ( (LA35_0==94) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:106: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:106: ( WS )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==WS) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:106: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt571); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_insertStmnt574); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:114: ( WS )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==WS) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:114: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt576); 
									}
									break;

							}

							listDelim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt581); 
							iMeta.listDelimiter=unicode(unquote((listDelim!=null?listDelim.getText():null)));
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:207: ( WS )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:207: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt587); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt590); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:218: ( WS )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:102:218: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt592); 
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return iMeta;
	}
	// $ANTLR end "insertStmnt"



	// $ANTLR start "insertHStmnt"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:105:1: insertHStmnt returns [BatchInsertMeta bMeta] : ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? ;
	public final BatchInsertMeta insertHStmnt() throws RecognitionException {
		BatchInsertMeta bMeta = null;


		Token id=null;
		Token paths=null;
		Token gran=null;
		Token delim=null;
		Token listDelim=null;
		Token type=null;
		Token size=null;
		Token boundary=null;
		List<Interval> i =null;

		 bMeta = new BatchInsertMeta();      
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:2: ( ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:4: INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT_HADOOP,FOLLOW_INSERT_HADOOP_in_insertHStmnt616); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt618); 
			match(input,INTO,FOLLOW_INTO_in_insertHStmnt620); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt622); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:29: (id= ID )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:30: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertHStmnt627); 
			bMeta.dataSource = (id!=null?id.getText():null); 
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:69: ( WS )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==WS) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:69: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt632); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt635); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:80: ( WS )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==WS) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:80: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt637); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertHStmnt640);
			selectItems(bMeta);
			state._fsp--;

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:103: ( ( WS )? ',' ( WS )? selectItems[bMeta] )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					int LA43_1 = input.LA(2);
					if ( (LA43_1==94) ) {
						alt43=1;
					}

				}
				else if ( (LA43_0==94) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:104: ( WS )? ',' ( WS )? selectItems[bMeta]
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:104: ( WS )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==WS) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:104: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt644); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_insertHStmnt647); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:112: ( WS )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==WS) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:112: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt649); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertHStmnt652);
					selectItems(bMeta);
					state._fsp--;

					}
					break;

				default :
					break loop43;
				}
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:137: ( WS )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==WS) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:137: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt657); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt660); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:148: ( WS )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==WS) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:148: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt662); 
					}
					break;

			}

			}

			match(input,FROM,FOLLOW_FROM_in_insertHStmnt669); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt671); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:108:11: (paths= SINGLE_QUOTE_STRING )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:108:12: paths= SINGLE_QUOTE_STRING
			{
			paths=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt676); 
			bMeta.inputSpec.setPath(unquote((paths!=null?paths.getText():null)));bMeta.inferFormat(unquote((paths!=null?paths.getText():null)));
			}

			match(input,WS,FOLLOW_WS_in_insertHStmnt681); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:3: ( WHERE WS i= intervalClause )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:4: WHERE WS i= intervalClause
			{
			match(input,WHERE,FOLLOW_WHERE_in_insertHStmnt686); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt688); 
			pushFollow(FOLLOW_intervalClause_in_insertHStmnt692);
			i=intervalClause();
			state._fsp--;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==WS) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==BREAK) ) {
					alt46=1;
				}
			}
			switch (alt46) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt699); 
					match(input,BREAK,FOLLOW_BREAK_in_insertHStmnt701); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt703); 
					match(input,BY,FOLLOW_BY_in_insertHStmnt705); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt707); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt711); 
					 bMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     bMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:3: ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==WS) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==DELIMITER) ) {
					alt54=1;
				}
			}
			switch (alt54) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:4: WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt726); 
					match(input,DELIMITER,FOLLOW_DELIMITER_in_insertHStmnt728); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:17: ( WS )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==WS) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:17: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt730); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt733); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:28: ( WS )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==WS) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:28: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt735); 
							}
							break;

					}

					delim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt740); 
					bMeta.delimiter=unicode(unquote((delim!=null?delim.getText():null)));
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:106: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==WS) ) {
						int LA51_1 = input.LA(2);
						if ( (LA51_1==94) ) {
							alt51=1;
						}
					}
					else if ( (LA51_0==94) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:107: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:107: ( WS )?
							int alt49=2;
							int LA49_0 = input.LA(1);
							if ( (LA49_0==WS) ) {
								alt49=1;
							}
							switch (alt49) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:107: WS
									{
									match(input,WS,FOLLOW_WS_in_insertHStmnt744); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_insertHStmnt747); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:115: ( WS )?
							int alt50=2;
							int LA50_0 = input.LA(1);
							if ( (LA50_0==WS) ) {
								alt50=1;
							}
							switch (alt50) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:115: WS
									{
									match(input,WS,FOLLOW_WS_in_insertHStmnt749); 
									}
									break;

							}

							listDelim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt754); 
							bMeta.listDelimiter=unicode(unquote((listDelim!=null?listDelim.getText():null)));
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:208: ( WS )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WS) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:208: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt760); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt763); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:219: ( WS )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==WS) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==EOF||LA53_1==WS) ) {
							alt53=1;
						}
					}
					switch (alt53) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:219: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt765); 
							}
							break;

					}

					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:3: ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WS) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==PARTITION) ) {
					alt61=1;
				}
			}
			switch (alt61) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:4: WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt774); 
					match(input,PARTITION,FOLLOW_PARTITION_in_insertHStmnt776); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:17: ( WS )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==WS) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:17: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt778); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt781); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:28: ( WS )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==WS) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:28: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt783); 
							}
							break;

					}

					type=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt788); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:57: ( WS )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==WS) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:57: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt790); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_insertHStmnt793); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:65: ( WS )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==WS) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:65: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt795); 
							}
							break;

					}

					size=(Token)match(input,LONG,FOLLOW_LONG_in_insertHStmnt800); 
					bMeta.partitionsSpec.type=unquote((type!=null?type.getText():null));bMeta.partitionsSpec.targetPartitionSize=Long.valueOf((size!=null?size.getText():null)); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:195: ( WS )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==WS) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:195: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt804); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt807); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:206: ( WS )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==WS) ) {
						int LA60_1 = input.LA(2);
						if ( (LA60_1==EOF||LA60_1==WS) ) {
							alt60=1;
						}
					}
					switch (alt60) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:206: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt809); 
							}
							break;

					}

					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:3: ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==WS) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:4: WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt817); 
					match(input,ROLLUP,FOLLOW_ROLLUP_in_insertHStmnt819); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:14: ( WS )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==WS) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:14: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt821); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt824); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:25: ( WS )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==WS) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:25: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt826); 
							}
							break;

					}

					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt831); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:54: ( WS )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==WS) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:54: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt833); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_insertHStmnt836); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:62: ( WS )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==WS) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:62: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt838); 
							}
							break;

					}

					boundary=(Token)match(input,LONG,FOLLOW_LONG_in_insertHStmnt843); 
					bMeta.rollupSpec.rollupGranularity=unquote((gran!=null?gran.getText():null));bMeta.rollupSpec.rowFlushBoundary=Long.valueOf((boundary!=null?boundary.getText():null)); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:202: ( WS )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==WS) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:202: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt847); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt850); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:213: ( WS )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==WS) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:213: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt852); 
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return bMeta;
	}
	// $ANTLR end "insertHStmnt"



	// $ANTLR start "insertRTStmnt"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:1: insertRTStmnt returns [RTInsertMeta iMeta] : ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ;
	public final RTInsertMeta insertRTStmnt() throws RecognitionException {
		RTInsertMeta iMeta = null;


		Token id=null;
		Token gran=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new RTInsertMeta();      
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:2: ( ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:4: INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT_REALTIME,FOLLOW_INSERT_REALTIME_in_insertRTStmnt875); 
			match(input,WS,FOLLOW_WS_in_insertRTStmnt877); 
			match(input,INTO,FOLLOW_INTO_in_insertRTStmnt879); 
			match(input,WS,FOLLOW_WS_in_insertRTStmnt881); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:31: (id= ID )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:32: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertRTStmnt886); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:71: ( WS )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==WS) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:71: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt891); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertRTStmnt894); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:82: ( WS )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==WS) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:82: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt896); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertRTStmnt899);
			selectItems(iMeta);
			state._fsp--;

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:105: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==WS) ) {
					int LA73_1 = input.LA(2);
					if ( (LA73_1==94) ) {
						alt73=1;
					}

				}
				else if ( (LA73_0==94) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:106: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:106: ( WS )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==WS) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:106: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt903); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_insertRTStmnt906); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:114: ( WS )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==WS) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:114: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt908); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertRTStmnt911);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop73;
				}
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:139: ( WS )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==WS) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:139: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt916); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertRTStmnt919); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:150: ( WS )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==WS) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:123:150: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt921); 
					}
					break;

			}

			}

			match(input,VALUES,FOLLOW_VALUES_in_insertRTStmnt927); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:10: ( WS )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==WS) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:10: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt929); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertRTStmnt932); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:21: ( WS )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==WS) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:21: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt934); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:25: (a= anyValue )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:26: a= anyValue
			{
			pushFollow(FOLLOW_anyValue_in_insertRTStmnt940);
			a=anyValue();
			state._fsp--;

			iMeta.values.add(a);
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:62: ( ( WS )? ',' ( WS )? a= anyValue )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==WS) ) {
					int LA80_1 = input.LA(2);
					if ( (LA80_1==94) ) {
						alt80=1;
					}

				}
				else if ( (LA80_0==94) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:63: ( WS )? ',' ( WS )? a= anyValue
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:63: ( WS )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==WS) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:63: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt947); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_insertRTStmnt950); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:71: ( WS )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==WS) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:71: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt952); 
							}
							break;

					}

					pushFollow(FOLLOW_anyValue_in_insertRTStmnt957);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}
					break;

				default :
					break loop80;
				}
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:111: ( WS )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==WS) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:111: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt963); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertRTStmnt966); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:122: ( WS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==WS) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:122: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt968); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:3: ( WHERE WS i= intervalClause )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==WHERE) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:4: WHERE WS i= intervalClause
					{
					match(input,WHERE,FOLLOW_WHERE_in_insertRTStmnt974); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt976); 
					pushFollow(FOLLOW_intervalClause_in_insertRTStmnt980);
					i=intervalClause();
					state._fsp--;

					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==WS) ) {
				int LA84_1 = input.LA(2);
				if ( (LA84_1==BREAK) ) {
					alt84=1;
				}
			}
			switch (alt84) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt988); 
					match(input,BREAK,FOLLOW_BREAK_in_insertRTStmnt990); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt992); 
					match(input,BY,FOLLOW_BY_in_insertRTStmnt994); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt996); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt1000); 
					 iMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return iMeta;
	}
	// $ANTLR end "insertRTStmnt"



	// $ANTLR start "grandQuery"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:134:1: grandQuery returns [QueryProgram program] : (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? ;
	public final QueryProgram grandQuery() throws RecognitionException {
		QueryProgram program = null;


		Token j=null;
		Token a=null;
		QueryMeta s1 =null;
		QueryMeta s2 =null;

		 program = null; 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:136:2: ( (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:136:4: (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )?
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:136:4: (s1= queryStmnt )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:136:5: s1= queryStmnt
			{
			pushFollow(FOLLOW_queryStmnt_in_grandQuery1034);
			s1=queryStmnt();
			state._fsp--;

			}

			 program = new QueryProgram();program.addStmnt(s1); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==WS) ) {
				int LA95_1 = input.LA(2);
				if ( (LA95_1==JOIN||LA95_1==LEFT_JOIN||LA95_1==RIGHT_JOIN) ) {
					alt95=1;
				}
			}
			switch (alt95) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN
					{
					match(input,WS,FOLLOW_WS_in_grandQuery1044); 
					j=input.LT(1);
					if ( input.LA(1)==JOIN||input.LA(1)==LEFT_JOIN||input.LA(1)==RIGHT_JOIN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					program.addJoinType((j!=null?j.getText():null).toUpperCase());
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:5: ( WS )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==WS) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1069); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery1072); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:16: ( WS )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==WS) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1074); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:20: (s2= queryStmnt )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:21: s2= queryStmnt
					{
					pushFollow(FOLLOW_queryStmnt_in_grandQuery1080);
					s2=queryStmnt();
					state._fsp--;

					}

					program.addStmnt(s2);
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:60: ( WS )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==WS) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:60: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1085); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery1088); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:71: ( WS )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==WS) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:71: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1090); 
							}
							break;

					}

					match(input,ON,FOLLOW_ON_in_grandQuery1093); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:5: ( WS )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==WS) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1100); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery1103); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:16: ( WS )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==WS) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1105); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:20: (a= ID )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:21: a= ID
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery1111); 
					 program.addJoinHook((a!=null?a.getText():null)); 
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:60: ( ( WS )? ',' ( WS )? a= ID )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==WS) ) {
							int LA93_1 = input.LA(2);
							if ( (LA93_1==94) ) {
								alt93=1;
							}

						}
						else if ( (LA93_0==94) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:61: ( WS )? ',' ( WS )? a= ID
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:61: ( WS )?
							int alt91=2;
							int LA91_0 = input.LA(1);
							if ( (LA91_0==WS) ) {
								alt91=1;
							}
							switch (alt91) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:61: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery1116); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_grandQuery1119); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:69: ( WS )?
							int alt92=2;
							int LA92_0 = input.LA(1);
							if ( (LA92_0==WS) ) {
								alt92=1;
							}
							switch (alt92) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:69: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery1121); 
									}
									break;

							}

							a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery1126); 
							 program.addJoinHook((a!=null?a.getText():null)); 
							}
							break;

						default :
							break loop93;
						}
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:114: ( WS )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==WS) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:114: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1132); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery1135); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:4: ( WS )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==WS) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandQuery1154); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:8: ( OPT_SEMI_COLON )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==OPT_SEMI_COLON) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:8: OPT_SEMI_COLON
					{
					match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandQuery1157); 
					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "grandQuery"



	// $ANTLR start "queryStmnt"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:1: queryStmnt returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) ) ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
	public final QueryMeta queryStmnt() throws RecognitionException {
		QueryMeta qMeta = null;


		Token id=null;
		Token dir=null;
		Token l=null;
		Token s1=null;
		Token s2=null;
		Token s=null;
		QueryMeta fromQuery =null;
		Pair<Granularity, List<Pair<Integer, Integer>>> gran =null;
		Having h =null;
		PostAggItem p =null;
		PostAggItem t =null;

		 qMeta = GroupByQueryMeta.promote(new QueryMeta());
			((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
			qMeta.intervals = new ArrayList<>();
		      
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:150:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) ) ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:150:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) ) ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_queryStmnt1180); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
			int alt101=3;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==WS) ) {
				int LA101_1 = input.LA(2);
				if ( (LA101_1==93) ) {
					alt101=2;
				}
				else if ( (LA101_1==COUNT||(LA101_1 >= DOUBLE_MAX && LA101_1 <= DOUBLE_SUM)||(LA101_1 >= HYPER_UNIQUE && LA101_1 <= ID)||LA101_1==JAVASCRIPT||(LA101_1 >= LONG_MAX && LA101_1 <= LONG_SUM)||LA101_1==UNIQUE) ) {
					alt101=1;
				}
			}
			switch (alt101) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:152:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:152:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1208); 
					pushFollow(FOLLOW_selectItems_in_queryStmnt1210);
					selectItems(qMeta);
					state._fsp--;

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==WS) ) {
							int LA100_1 = input.LA(2);
							if ( (LA100_1==94) ) {
								alt100=1;
							}

						}
						else if ( (LA100_0==94) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:32: ( WS )? ',' ( WS )? selectItems[qMeta]
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:32: ( WS )?
							int alt98=2;
							int LA98_0 = input.LA(1);
							if ( (LA98_0==WS) ) {
								alt98=1;
							}
							switch (alt98) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:32: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1214); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_queryStmnt1217); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:40: ( WS )?
							int alt99=2;
							int LA99_0 = input.LA(1);
							if ( (LA99_0==WS) ) {
								alt99=1;
							}
							switch (alt99) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:40: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1219); 
									}
									break;

							}

							pushFollow(FOLLOW_selectItems_in_queryStmnt1222);
							selectItems(qMeta);
							state._fsp--;

							}
							break;

						default :
							break loop100;
						}
					}

					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:156:8: ( WS '*' )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:156:8: ( WS '*' )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:156:9: WS '*'
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1253); 
					match(input,93,FOLLOW_93_in_queryStmnt1255); 
					}

					}
					break;

			}

			match(input,WS,FOLLOW_WS_in_queryStmnt1270); 
			match(input,FROM,FOLLOW_FROM_in_queryStmnt1272); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:4: ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==WS) ) {
				int LA102_1 = input.LA(2);
				if ( (LA102_1==ID) ) {
					alt102=1;
				}
				else if ( (LA102_1==LPARAN) ) {
					alt102=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:160:13: ( WS id= ID )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:160:13: ( WS id= ID )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:160:14: WS id= ID
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1293); 
					id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1297); 
					 qMeta.dataSource = (id!=null?id.getText():null); 
					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:11: ( WS LPARAN (fromQuery= queryStmnt ) RPARAN )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:11: ( WS LPARAN (fromQuery= queryStmnt ) RPARAN )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:12: WS LPARAN (fromQuery= queryStmnt ) RPARAN
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1334); 
					match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1336); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:22: (fromQuery= queryStmnt )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:23: fromQuery= queryStmnt
					{
					pushFollow(FOLLOW_queryStmnt_in_queryStmnt1341);
					fromQuery=queryStmnt();
					state._fsp--;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1344); 
					qMeta.queryDataSource = fromQuery;
					}

					}
					break;

			}


			             if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
				  		     qMeta = SelectQueryMeta.promote(qMeta);
				  	     }
				     
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:168:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==WS) ) {
				int LA130_1 = input.LA(2);
				if ( (LA130_1==WHERE) ) {
					alt130=1;
				}
			}
			switch (alt130) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:169:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1363); 
					match(input,WHERE,FOLLOW_WHERE_in_queryStmnt1365); 
					match(input,WS,FOLLOW_WS_in_queryStmnt1367); 
					pushFollow(FOLLOW_whereClause_in_queryStmnt1369);
					whereClause(qMeta);
					state._fsp--;

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:4: ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )? )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:5: ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:5: ( WS BREAK WS BY WS gran= granularityClause )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==WS) ) {
						int LA103_1 = input.LA(2);
						if ( (LA103_1==BREAK) ) {
							alt103=1;
						}
					}
					switch (alt103) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:6: WS BREAK WS BY WS gran= granularityClause
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1387); 
							match(input,BREAK,FOLLOW_BREAK_in_queryStmnt1389); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1391); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1393); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1395); 
							pushFollow(FOLLOW_granularityClause_in_queryStmnt1399);
							gran=granularityClause();
							state._fsp--;


									      qMeta.granularity = gran.a;
									      if (gran.b != null) {
									        qMeta.microIntervals.addAll(gran.b);
									      }
									    
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==WS) ) {
						int LA108_1 = input.LA(2);
						if ( (LA108_1==GROUP) ) {
							alt108=1;
						}
					}
					switch (alt108) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1416); 
							match(input,GROUP,FOLLOW_GROUP_in_queryStmnt1418); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1420); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1422); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1424); 

									       qMeta = GroupByQueryMeta.promote(qMeta);
									       if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
									          System.err.println("No dimensions !! ");
									       }
									      
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:185:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:185:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1450); 

									              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
									                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
									              }   
									           
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:14: ( ( WS )? ',' ( WS )? id= ID )*
							loop106:
							while (true) {
								int alt106=2;
								int LA106_0 = input.LA(1);
								if ( (LA106_0==WS) ) {
									int LA106_1 = input.LA(2);
									if ( (LA106_1==94) ) {
										alt106=1;
									}

								}
								else if ( (LA106_0==94) ) {
									alt106=1;
								}

								switch (alt106) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:15: ( WS )? ',' ( WS )? id= ID
									{
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:15: ( WS )?
									int alt104=2;
									int LA104_0 = input.LA(1);
									if ( (LA104_0==WS) ) {
										alt104=1;
									}
									switch (alt104) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:15: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1482); 
											}
											break;

									}

									match(input,94,FOLLOW_94_in_queryStmnt1485); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:23: ( WS )?
									int alt105=2;
									int LA105_0 = input.LA(1);
									if ( (LA105_0==WS) ) {
										alt105=1;
									}
									switch (alt105) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:23: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1487); 
											}
											break;

									}

									id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1492); 

												              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
												                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
												              }   
											           	
									}
									break;

								default :
									break loop106;
								}
							}

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:199:10: ( WS HAVING WS h= havingClause )?
							int alt107=2;
							int LA107_0 = input.LA(1);
							if ( (LA107_0==WS) ) {
								int LA107_1 = input.LA(2);
								if ( (LA107_1==HAVING) ) {
									alt107=1;
								}
							}
							switch (alt107) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:199:11: WS HAVING WS h= havingClause
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1549); 
									match(input,HAVING,FOLLOW_HAVING_in_queryStmnt1551); 
									match(input,WS,FOLLOW_WS_in_queryStmnt1553); 
									pushFollow(FOLLOW_havingClause_in_queryStmnt1557);
									h=havingClause();
									state._fsp--;

									((GroupByQueryMeta)qMeta).having = h;
									}
									break;

							}

							}
							break;

					}

					qMeta = QueryUtils.checkAndPromoteToTimeSeries(qMeta);
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
					int alt110=2;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==WS) ) {
						int LA110_1 = input.LA(2);
						if ( (LA110_1==ORDER) ) {
							alt110=1;
						}
					}
					switch (alt110) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1601); 
							match(input,ORDER,FOLLOW_ORDER_in_queryStmnt1603); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1605); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1607); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1609); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:24: (id= ID )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:25: id= ID
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1614); 
							}

								
										if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1 || ((GroupByQueryMeta)qMeta).having != null) {
										   ((GroupByQueryMeta)qMeta).limitSpec = new LimitSpec();
										   
									  	} else {// If fetchDimensions = 1 then TopN is more optimal.
									           qMeta = TopNQueryMeta.promote(qMeta);
								        	   ((TopNQueryMeta)qMeta).metric = (id!=null?id.getText():null);
									      	}
									      
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:9: ( WS dir= ( ASC | DESC ) )?
							int alt109=2;
							int LA109_0 = input.LA(1);
							if ( (LA109_0==WS) ) {
								int LA109_1 = input.LA(2);
								if ( (LA109_1==ASC||LA109_1==DESC) ) {
									alt109=1;
								}
							}
							switch (alt109) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:10: WS dir= ( ASC | DESC )
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1647); 
									dir=input.LT(1);
									if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									 
											        //qMeta should be GroupByQueryMeta when sql has ASC or DESC
											        qMeta = GroupByQueryMeta.promote(qMeta);
											        ((GroupByQueryMeta)qMeta).limitSpec = new LimitSpec();

											        if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
												    if (dir != null && (dir!=null?dir.getText():null) != null) {
												        ((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), (dir!=null?dir.getText():null));
												    } else {
												    	((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), "ASC");
												    }
											      	}
											      
									}
									break;

							}


										    // At this point if the qMeta is not TopN and is still GroupBy then do the following(default is ascending sort).
										    if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
										       if (!((GroupByQueryMeta)qMeta).limitSpec.columns.containsKey((id!=null?id.getText():null))) {
										       	   ((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), "ASC");
										       }
										       
										    }

										
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:239:5: ( WS LIMIT WS (l= LONG ) )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==WS) ) {
						int LA111_1 = input.LA(2);
						if ( (LA111_1==LIMIT) ) {
							alt111=1;
						}
					}
					switch (alt111) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:6: WS LIMIT WS (l= LONG )
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1701); 
							match(input,LIMIT,FOLLOW_LIMIT_in_queryStmnt1703); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1705); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:18: (l= LONG )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:19: l= LONG
							{
							l=(Token)match(input,LONG,FOLLOW_LONG_in_queryStmnt1710); 
							}

								
									  	if (qMeta instanceof SelectQueryMeta) {
										    ((SelectQueryMeta)qMeta).pagingSpec.threshold = Integer.valueOf((l!=null?l.getText():null));	      	
									      	} else if (qMeta instanceof TopNQueryMeta) {
									      	    ((TopNQueryMeta)qMeta).threshold = Integer.valueOf((l!=null?l.getText():null));
									      	} else if (qMeta instanceof GroupByQueryMeta) {
									      	    if (((GroupByQueryMeta)qMeta).limitSpec != null) {
									      	        ((GroupByQueryMeta)qMeta).limitSpec.limit = Long.valueOf((l!=null?l.getText():null));
									      	    }
									      	}
									      
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:7: ( WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )* )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==WS) ) {
						int LA115_1 = input.LA(2);
						if ( (LA115_1==THEN) ) {
							alt115=1;
						}
					}
					switch (alt115) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:8: WS THEN WS p= postAggItem ( ( WS )? AND ( WS )? t= postAggItem )*
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1748); 
							match(input,THEN,FOLLOW_THEN_in_queryStmnt1750); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1752); 
							pushFollow(FOLLOW_postAggItem_in_queryStmnt1756);
							p=postAggItem();
							state._fsp--;

							QueryUtils.addPostAggregation(qMeta, p);
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:76: ( ( WS )? AND ( WS )? t= postAggItem )*
							loop114:
							while (true) {
								int alt114=2;
								int LA114_0 = input.LA(1);
								if ( (LA114_0==WS) ) {
									int LA114_1 = input.LA(2);
									if ( (LA114_1==AND) ) {
										alt114=1;
									}

								}
								else if ( (LA114_0==AND) ) {
									alt114=1;
								}

								switch (alt114) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:77: ( WS )? AND ( WS )? t= postAggItem
									{
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:77: ( WS )?
									int alt112=2;
									int LA112_0 = input.LA(1);
									if ( (LA112_0==WS) ) {
										alt112=1;
									}
									switch (alt112) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:77: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1761); 
											}
											break;

									}

									match(input,AND,FOLLOW_AND_in_queryStmnt1764); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:85: ( WS )?
									int alt113=2;
									int LA113_0 = input.LA(1);
									if ( (LA113_0==WS) ) {
										alt113=1;
									}
									switch (alt113) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:85: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1766); 
											}
											break;

									}

									pushFollow(FOLLOW_postAggItem_in_queryStmnt1771);
									t=postAggItem();
									state._fsp--;

									QueryUtils.addPostAggregation(qMeta, t);
									}
									break;

								default :
									break loop114;
								}
							}

							}
							break;

					}

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==WS) ) {
						int LA125_1 = input.LA(2);
						if ( (LA125_1==WHICH) ) {
							alt125=1;
						}
					}
					switch (alt125) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1789); 
							match(input,WHICH,FOLLOW_WHICH_in_queryStmnt1791); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1793); 
							match(input,CONTAINS,FOLLOW_CONTAINS_in_queryStmnt1795); 
							qMeta = SearchQueryMeta.promote(qMeta);
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:68: ( WS )?
							int alt116=2;
							int LA116_0 = input.LA(1);
							if ( (LA116_0==WS) ) {
								alt116=1;
							}
							switch (alt116) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:68: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1799); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1802); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:79: ( WS )?
							int alt117=2;
							int LA117_0 = input.LA(1);
							if ( (LA117_0==WS) ) {
								alt117=1;
							}
							switch (alt117) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:79: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1804); 
									}
									break;

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							{
							s1=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1810); 
							((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue((s1!=null?s1.getText():null));
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							loop120:
							while (true) {
								int alt120=2;
								int LA120_0 = input.LA(1);
								if ( (LA120_0==WS) ) {
									int LA120_1 = input.LA(2);
									if ( (LA120_1==94) ) {
										alt120=1;
									}

								}
								else if ( (LA120_0==94) ) {
									alt120=1;
								}

								switch (alt120) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
									{
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:209: ( WS )?
									int alt118=2;
									int LA118_0 = input.LA(1);
									if ( (LA118_0==WS) ) {
										alt118=1;
									}
									switch (alt118) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:209: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1814); 
											}
											break;

									}

									match(input,94,FOLLOW_94_in_queryStmnt1817); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:217: ( WS )?
									int alt119=2;
									int LA119_0 = input.LA(1);
									if ( (LA119_0==WS) ) {
										alt119=1;
									}
									switch (alt119) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:217: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1819); 
											}
											break;

									}

									s2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1824); 
									((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue((s2!=null?s2.getText():null));
									}
									break;

								default :
									break loop120;
								}
							}

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:337: ( WS )?
							int alt121=2;
							int LA121_0 = input.LA(1);
							if ( (LA121_0==WS) ) {
								alt121=1;
							}
							switch (alt121) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:337: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1831); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1834); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1840); 
							match(input,SORT,FOLLOW_SORT_in_queryStmnt1842); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:13: ( WS )?
							int alt122=2;
							int LA122_0 = input.LA(1);
							if ( (LA122_0==WS) ) {
								alt122=1;
							}
							switch (alt122) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1844); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1847); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:24: ( WS )?
							int alt123=2;
							int LA123_0 = input.LA(1);
							if ( (LA123_0==WS) ) {
								alt123=1;
							}
							switch (alt123) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1849); 
									}
									break;

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:28: (s= SINGLE_QUOTE_STRING )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:29: s= SINGLE_QUOTE_STRING
							{
							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1855); 
							}

							((SearchQueryMeta)qMeta).setSort((s!=null?s.getText():null));
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:97: ( WS )?
							int alt124=2;
							int LA124_0 = input.LA(1);
							if ( (LA124_0==WS) ) {
								alt124=1;
							}
							switch (alt124) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:97: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1860); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1863); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==WS) ) {
						int LA129_1 = input.LA(2);
						if ( (LA129_1==HINT) ) {
							alt129=1;
						}
					}
					switch (alt129) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1875); 
							match(input,HINT,FOLLOW_HINT_in_queryStmnt1877); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:13: ( WS )?
							int alt126=2;
							int LA126_0 = input.LA(1);
							if ( (LA126_0==WS) ) {
								alt126=1;
							}
							switch (alt126) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1879); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1882); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:24: ( WS )?
							int alt127=2;
							int LA127_0 = input.LA(1);
							if ( (LA127_0==WS) ) {
								alt127=1;
							}
							switch (alt127) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1884); 
									}
									break;

							}

							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1889); 
							qMeta = HintProcessor.process(qMeta, (s!=null?s.getText():null));
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:99: ( WS )?
							int alt128=2;
							int LA128_0 = input.LA(1);
							if ( (LA128_0==WS) ) {
								alt128=1;
							}
							switch (alt128) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:99: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1893); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1896); 
							}
							break;

					}

					}
					break;

			}


				  	if (qMeta.intervals == null || qMeta.intervals.isEmpty()) {
				  		qMeta = TimeBoundaryQueryMeta.promote(qMeta);
				  	}
				  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return qMeta;
	}
	// $ANTLR end "queryStmnt"



	// $ANTLR start "anyValue"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:269:1: anyValue returns [Object obj] : (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) );
	public final Object anyValue() throws RecognitionException {
		Object obj = null;


		Token a=null;
		Token b=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:270:2: (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) )
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==SINGLE_QUOTE_STRING) ) {
				alt131=1;
			}
			else if ( (LA131_0==FLOAT||LA131_0==LONG) ) {
				alt131=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:270:3: a= SINGLE_QUOTE_STRING
					{
					a=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1930); 
					obj = unquote((a!=null?a.getText():null));
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:270:53: b= ( LONG | FLOAT )
					{
					b=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					obj = (b!=null?b.getText():null);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "anyValue"



	// $ANTLR start "selectItems"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:1: selectItems[BaseStatementMeta meta] : (ai= aggItem |sd= simpleDim );
	public final void selectItems(BaseStatementMeta meta) throws RecognitionException {
		AggItem ai =null;
		Pair<String, String> sd =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:274:2: (ai= aggItem |sd= simpleDim )
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==COUNT||(LA132_0 >= DOUBLE_MAX && LA132_0 <= DOUBLE_SUM)||LA132_0==HYPER_UNIQUE||LA132_0==JAVASCRIPT||(LA132_0 >= LONG_MAX && LA132_0 <= LONG_SUM)||LA132_0==UNIQUE) ) {
				alt132=1;
			}
			else if ( (LA132_0==ID) ) {
				alt132=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:274:5: ai= aggItem
					{
					pushFollow(FOLLOW_aggItem_in_selectItems1961);
					ai=aggItem();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						        ((BaseAggQueryMeta)meta).aggregations.add(ai);
						      } else if (meta instanceof InsertMeta) {
					 	        ((InsertMeta)meta).aggregations.add(ai);
					   	        if (ai.isDirectMetric()) {//Unique, hyperUnique, Count etc are not part of the data
						      	  ((InsertMeta)meta).addColumnInOrder(ai.getCanonicalName());
						        }
						      }
						      
						   
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:5: sd= simpleDim
					{
					pushFollow(FOLLOW_simpleDim_in_selectItems1971);
					sd=simpleDim();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						         ((PlainDimQueryMeta)meta).fetchDimensions.put(sd.a, sd.b);
						      } else if (meta instanceof InsertMeta) {
					 	         ((InsertMeta)meta).fetchDimensions.put(sd.a, sd.b);
					 	         ((InsertMeta)meta).addColumnInOrder((sd.b != null)? sd.b : sd.a);
						      }
						   
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "selectItems"



	// $ANTLR start "simpleDim"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:1: simpleDim returns [Pair<String, String> dims] : (a= ID ( WS AS WS b= ID )? ) ;
	public final Pair<String, String> simpleDim() throws RecognitionException {
		Pair<String, String> dims = null;


		Token a=null;
		Token b=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:2: ( (a= ID ( WS AS WS b= ID )? ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:4: (a= ID ( WS AS WS b= ID )? )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:4: (a= ID ( WS AS WS b= ID )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:5: a= ID ( WS AS WS b= ID )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1992); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:10: ( WS AS WS b= ID )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==WS) ) {
				int LA133_1 = input.LA(2);
				if ( (LA133_1==AS) ) {
					alt133=1;
				}
			}
			switch (alt133) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:11: WS AS WS b= ID
					{
					match(input,WS,FOLLOW_WS_in_simpleDim1995); 
					match(input,AS,FOLLOW_AS_in_simpleDim1997); 
					match(input,WS,FOLLOW_WS_in_simpleDim1999); 
					b=(Token)match(input,ID,FOLLOW_ID_in_simpleDim2003); 
					}
					break;

			}


				     dims = (b != null)? new Pair<String, String>((a!=null?a.getText():null), (b!=null?b.getText():null)): new Pair<String, String>((a!=null?a.getText():null), null);
				   
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dims;
	}
	// $ANTLR end "simpleDim"



	// $ANTLR start "whereClause"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:303:1: whereClause[QueryMeta qMeta] : intls= intervalClause ( WS AND WS f= grandFilter )? ;
	public final void whereClause(QueryMeta qMeta) throws RecognitionException {
		List<Interval> intls =null;
		Filter f =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:304:2: (intls= intervalClause ( WS AND WS f= grandFilter )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:304:3: intls= intervalClause ( WS AND WS f= grandFilter )?
			{
			pushFollow(FOLLOW_intervalClause_in_whereClause2026);
			intls=intervalClause();
			state._fsp--;

			qMeta.intervals.addAll(intls);
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:304:57: ( WS AND WS f= grandFilter )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==WS) ) {
				int LA134_1 = input.LA(2);
				if ( (LA134_1==AND) ) {
					alt134=1;
				}
			}
			switch (alt134) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:304:58: WS AND WS f= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_whereClause2031); 
					match(input,AND,FOLLOW_AND_in_whereClause2033); 
					match(input,WS,FOLLOW_WS_in_whereClause2035); 
					pushFollow(FOLLOW_grandFilter_in_whereClause2039);
					f=grandFilter();
					state._fsp--;

					qMeta.filter = f;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "intervalClause"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:308:1: intervalClause returns [List<Interval> intervals] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
	public final List<Interval> intervalClause() throws RecognitionException {
		List<Interval> intervals = null;


		Token st2=null;
		Token et2=null;
		ParserRuleReturnScope st =null;
		ParserRuleReturnScope et =null;
		Pair<String, String> p1 =null;
		Pair<String, String> p2 =null;

		 intervals = new ArrayList<>();
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			{
			match(input,95,FOLLOW_95_in_intervalClause2065); 
			match(input,WS,FOLLOW_WS_in_intervalClause2067); 
			match(input,BETWEEN,FOLLOW_BETWEEN_in_intervalClause2069); 
			match(input,WS,FOLLOW_WS_in_intervalClause2071); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:311:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( ((LA142_0 >= DATE && LA142_0 <= DATE_YEAR_ONLY)||LA142_0==SINGLE_QUOTE_STRING) ) {
				alt142=1;
			}
			else if ( (LA142_0==LPARAN) ) {
				alt142=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 142, 0, input);
				throw nvae;
			}

			switch (alt142) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( ((LA135_0 >= DATE && LA135_0 <= DATE_YEAR_ONLY)) ) {
						alt135=1;
					}
					else if ( (LA135_0==SINGLE_QUOTE_STRING) ) {
						alt135=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 135, 0, input);
						throw nvae;
					}

					switch (alt135) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:8: st= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause2091);
							st=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:22: st2= SINGLE_QUOTE_STRING
							{
							st2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2098); 
							}
							break;

					}

					match(input,WS,FOLLOW_WS_in_intervalClause2102); 
					match(input,AND,FOLLOW_AND_in_intervalClause2104); 
					match(input,WS,FOLLOW_WS_in_intervalClause2106); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
					int alt136=2;
					int LA136_0 = input.LA(1);
					if ( ((LA136_0 >= DATE && LA136_0 <= DATE_YEAR_ONLY)) ) {
						alt136=1;
					}
					else if ( (LA136_0==SINGLE_QUOTE_STRING) ) {
						alt136=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 136, 0, input);
						throw nvae;
					}

					switch (alt136) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:59: et= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause2111);
							et=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:73: et2= SINGLE_QUOTE_STRING
							{
							et2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2118); 
							}
							break;

					}

					}

					  if (st2 != null) {
								if (et2 != null) {
									intervals.add(new Interval((st2!=null?st2.getText():null), (et2!=null?et2.getText():null)));
								} else {
									intervals.add(new Interval((st2!=null?st2.getText():null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   } else {
								if (et2 != null) {
									intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et2!=null?et2.getText():null)));
								} else {
									intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   }
							
					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:330:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:330:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:330:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_intervalClause2144); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:330:12: ( WS )?
					int alt137=2;
					int LA137_0 = input.LA(1);
					if ( (LA137_0==WS) ) {
						alt137=1;
					}
					switch (alt137) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:330:12: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause2146); 
							}
							break;

					}

					pushFollow(FOLLOW_pairString_in_intervalClause2151);
					p1=pairString();
					state._fsp--;

					intervals.add(new Interval(p1.a, p1.b));
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:7: ( ( WS )? ',' ( WS )? p2= pairString )*
					loop140:
					while (true) {
						int alt140=2;
						int LA140_0 = input.LA(1);
						if ( (LA140_0==WS) ) {
							int LA140_1 = input.LA(2);
							if ( (LA140_1==94) ) {
								alt140=1;
							}

						}
						else if ( (LA140_0==94) ) {
							alt140=1;
						}

						switch (alt140) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:8: ( WS )? ',' ( WS )? p2= pairString
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:8: ( WS )?
							int alt138=2;
							int LA138_0 = input.LA(1);
							if ( (LA138_0==WS) ) {
								alt138=1;
							}
							switch (alt138) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:8: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause2163); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_intervalClause2166); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:16: ( WS )?
							int alt139=2;
							int LA139_0 = input.LA(1);
							if ( (LA139_0==WS) ) {
								alt139=1;
							}
							switch (alt139) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:16: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause2168); 
									}
									break;

							}

							pushFollow(FOLLOW_pairString_in_intervalClause2173);
							p2=pairString();
							state._fsp--;

							intervals.add(new Interval(p2.a, p2.b));
							}
							break;

						default :
							break loop140;
						}
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:79: ( WS )?
					int alt141=2;
					int LA141_0 = input.LA(1);
					if ( (LA141_0==WS) ) {
						alt141=1;
					}
					switch (alt141) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:79: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause2179); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_intervalClause2182); 
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return intervals;
	}
	// $ANTLR end "intervalClause"



	// $ANTLR start "getEquals"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
	public final EqualsToHolder getEquals() throws RecognitionException {
		EqualsToHolder holder = null;


		Token a=null;
		Token b=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_getEquals2205); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:10: ( WS )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==WS) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:10: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals2207); 
					}
					break;

			}

			match(input,EQUALS,FOLLOW_EQUALS_in_getEquals2210); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:21: ( WS )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==WS) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:21: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals2212); 
					}
					break;

			}

			b=input.LT(1);
			if ( input.LA(1)==FLOAT||input.LA(1)==LONG||input.LA(1)==SINGLE_QUOTE_STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			holder = new EqualsToHolder((a!=null?a.getText():null), (b!=null?b.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return holder;
	}
	// $ANTLR end "getEquals"



	// $ANTLR start "granularityClause"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:342:1: granularityClause returns [Pair<Granularity, List<Pair<Integer, Integer>>> clause] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) );
	public final Pair<Granularity, List<Pair<Integer, Integer>>> granularityClause() throws RecognitionException {
		Pair<Granularity, List<Pair<Integer, Integer>>> clause = null;


		Token s=null;
		Token dur=null;
		Token orig=null;
		Token per=null;
		Token tz=null;
		List<Pair<Integer, Integer>> inc =null;

		Granularity granularity = new Granularity("all");clause = new Pair<>(granularity, null);
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) )
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==SINGLE_QUOTE_STRING) ) {
				alt167=1;
			}
			else if ( (LA167_0==DURATION||LA167_0==PERIOD) ) {
				alt167=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}

			switch (alt167) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:3: ( (s= SINGLE_QUOTE_STRING ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:3: ( (s= SINGLE_QUOTE_STRING ) )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:4: (s= SINGLE_QUOTE_STRING )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:4: (s= SINGLE_QUOTE_STRING )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:5: s= SINGLE_QUOTE_STRING
					{
					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2257); 
					}

					granularity = new Granularity((s!=null?s.getText():null));clause = new Pair<>(granularity, null);
					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					int alt166=2;
					int LA166_0 = input.LA(1);
					if ( (LA166_0==DURATION) ) {
						alt166=1;
					}
					else if ( (LA166_0==PERIOD) ) {
						alt166=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 166, 0, input);
						throw nvae;
					}

					switch (alt166) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,DURATION,FOLLOW_DURATION_in_granularityClause2281); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:16: ( WS )?
							int alt145=2;
							int LA145_0 = input.LA(1);
							if ( (LA145_0==WS) ) {
								alt145=1;
							}
							switch (alt145) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:16: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2283); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause2286); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:27: ( WS )?
							int alt146=2;
							int LA146_0 = input.LA(1);
							if ( (LA146_0==WS) ) {
								alt146=1;
							}
							switch (alt146) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:27: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2288); 
									}
									break;

							}

							dur=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2293); 
							granularity.setDuration((dur!=null?dur.getText():null));
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:93: ( WS )?
							int alt147=2;
							int LA147_0 = input.LA(1);
							if ( (LA147_0==WS) ) {
								alt147=1;
							}
							switch (alt147) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:93: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2297); 
									}
									break;

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:97: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt149=2;
							int LA149_0 = input.LA(1);
							if ( (LA149_0==94) ) {
								int LA149_1 = input.LA(2);
								if ( (LA149_1==WS) ) {
									int LA149_4 = input.LA(3);
									if ( (LA149_4==SINGLE_QUOTE_STRING) ) {
										alt149=1;
									}
								}
								else if ( (LA149_1==SINGLE_QUOTE_STRING) ) {
									alt149=1;
								}
							}
							switch (alt149) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:98: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,94,FOLLOW_94_in_granularityClause2301); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:102: ( WS )?
									int alt148=2;
									int LA148_0 = input.LA(1);
									if ( (LA148_0==WS) ) {
										alt148=1;
									}
									switch (alt148) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:102: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2303); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2308); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:211: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt153=2;
							int LA153_0 = input.LA(1);
							if ( (LA153_0==WS||LA153_0==94) ) {
								alt153=1;
							}
							switch (alt153) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:212: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:212: ( WS )?
									int alt150=2;
									int LA150_0 = input.LA(1);
									if ( (LA150_0==WS) ) {
										alt150=1;
									}
									switch (alt150) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:212: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2316); 
											}
											break;

									}

									match(input,94,FOLLOW_94_in_granularityClause2319); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:220: ( WS )?
									int alt151=2;
									int LA151_0 = input.LA(1);
									if ( (LA151_0==WS) ) {
										int LA151_1 = input.LA(2);
										if ( (LA151_1==WS) ) {
											alt151=1;
										}
									}
									switch (alt151) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:220: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2321); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause2326);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:288: ( WS )?
									int alt152=2;
									int LA152_0 = input.LA(1);
									if ( (LA152_0==WS) ) {
										alt152=1;
									}
									switch (alt152) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:288: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2330); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause2335); 
							}

							}
							break;
						case 2 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,PERIOD,FOLLOW_PERIOD_in_granularityClause2354); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:14: ( WS )?
							int alt154=2;
							int LA154_0 = input.LA(1);
							if ( (LA154_0==WS) ) {
								alt154=1;
							}
							switch (alt154) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:14: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2356); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause2359); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:25: ( WS )?
							int alt155=2;
							int LA155_0 = input.LA(1);
							if ( (LA155_0==WS) ) {
								alt155=1;
							}
							switch (alt155) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:25: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2361); 
									}
									break;

							}

							per=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2366); 
							granularity.setPeriod((per!=null?per.getText():null));
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:89: ( WS )?
							int alt156=2;
							int LA156_0 = input.LA(1);
							if ( (LA156_0==WS) ) {
								alt156=1;
							}
							switch (alt156) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:89: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2370); 
									}
									break;

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:93: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
							int alt158=2;
							int LA158_0 = input.LA(1);
							if ( (LA158_0==94) ) {
								int LA158_1 = input.LA(2);
								if ( (LA158_1==WS) ) {
									int LA158_4 = input.LA(3);
									if ( (LA158_4==SINGLE_QUOTE_STRING) ) {
										alt158=1;
									}
								}
								else if ( (LA158_1==SINGLE_QUOTE_STRING) ) {
									alt158=1;
								}
							}
							switch (alt158) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:94: ',' ( WS )? tz= SINGLE_QUOTE_STRING
									{
									match(input,94,FOLLOW_94_in_granularityClause2374); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:98: ( WS )?
									int alt157=2;
									int LA157_0 = input.LA(1);
									if ( (LA157_0==WS) ) {
										alt157=1;
									}
									switch (alt157) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:98: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2376); 
											}
											break;

									}

									tz=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2381); 
									granularity.setTimeZone((tz!=null?tz.getText():null));
									}
									break;

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:164: ( WS )?
							int alt159=2;
							int LA159_0 = input.LA(1);
							if ( (LA159_0==WS) ) {
								alt159=1;
							}
							switch (alt159) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:164: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2387); 
									}
									break;

							}

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:168: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt161=2;
							int LA161_0 = input.LA(1);
							if ( (LA161_0==94) ) {
								int LA161_1 = input.LA(2);
								if ( (LA161_1==WS) ) {
									int LA161_4 = input.LA(3);
									if ( (LA161_4==SINGLE_QUOTE_STRING) ) {
										alt161=1;
									}
								}
								else if ( (LA161_1==SINGLE_QUOTE_STRING) ) {
									alt161=1;
								}
							}
							switch (alt161) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:169: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,94,FOLLOW_94_in_granularityClause2391); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:173: ( WS )?
									int alt160=2;
									int LA160_0 = input.LA(1);
									if ( (LA160_0==WS) ) {
										alt160=1;
									}
									switch (alt160) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:173: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2393); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2398); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:283: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt165=2;
							int LA165_0 = input.LA(1);
							if ( (LA165_0==WS||LA165_0==94) ) {
								alt165=1;
							}
							switch (alt165) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:284: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:284: ( WS )?
									int alt162=2;
									int LA162_0 = input.LA(1);
									if ( (LA162_0==WS) ) {
										alt162=1;
									}
									switch (alt162) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:284: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2407); 
											}
											break;

									}

									match(input,94,FOLLOW_94_in_granularityClause2410); 
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:292: ( WS )?
									int alt163=2;
									int LA163_0 = input.LA(1);
									if ( (LA163_0==WS) ) {
										int LA163_1 = input.LA(2);
										if ( (LA163_1==WS) ) {
											alt163=1;
										}
									}
									switch (alt163) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:292: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2412); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause2417);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:360: ( WS )?
									int alt164=2;
									int LA164_0 = input.LA(1);
									if ( (LA164_0==WS) ) {
										alt164=1;
									}
									switch (alt164) {
										case 1 :
											// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:360: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2421); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause2426); 
							}

							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "granularityClause"



	// $ANTLR start "granularityInclude"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:1: granularityInclude returns [List<Pair<Integer, Integer>> microIntervals] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
	public final List<Pair<Integer, Integer>> granularityInclude() throws RecognitionException {
		List<Pair<Integer, Integer>> microIntervals = null;


		Pair<Integer, Integer> p1 =null;
		Pair<Integer, Integer> p2 =null;

		microIntervals = new ArrayList<>();
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:355:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
			{
			match(input,WS,FOLLOW_WS_in_granularityInclude2454); 
			match(input,INCLUDE,FOLLOW_INCLUDE_in_granularityInclude2456); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:15: ( WS )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==WS) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:15: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2458); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_granularityInclude2461); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:26: ( WS )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==WS) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:26: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2463); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:30: (p1= pairNums ( ',' p2= pairNums )* )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:31: p1= pairNums ( ',' p2= pairNums )*
			{
			pushFollow(FOLLOW_pairNums_in_granularityInclude2469);
			p1=pairNums();
			state._fsp--;

			microIntervals.add(p1);
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:69: ( ',' p2= pairNums )*
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==94) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:70: ',' p2= pairNums
					{
					match(input,94,FOLLOW_94_in_granularityInclude2474); 
					pushFollow(FOLLOW_pairNums_in_granularityInclude2478);
					p2=pairNums();
					state._fsp--;

					microIntervals.add(p2);
					}
					break;

				default :
					break loop170;
				}
			}

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:115: ( WS )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==WS) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:115: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2485); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_granularityInclude2488); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return microIntervals;
	}
	// $ANTLR end "granularityInclude"



	// $ANTLR start "pairNums"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:1: pairNums returns [Pair<Integer, Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
	public final Pair<Integer, Integer> pairNums() throws RecognitionException {
		Pair<Integer, Integer> pair = null;


		Token i=null;
		Token j=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairNums2507); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:13: ( WS )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==WS) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2509); 
					}
					break;

			}

			i=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums2514); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:25: ( WS )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==WS) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:25: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2517); 
					}
					break;

			}

			match(input,94,FOLLOW_94_in_pairNums2520); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:33: ( WS )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==WS) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:33: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2522); 
					}
					break;

			}

			j=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums2527); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:44: ( WS )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==WS) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:44: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2529); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairNums2532); 
			}

			 pair = new Pair<>(Integer.parseInt((i!=null?i.getText():null)), Integer.parseInt((j!=null?j.getText():null)));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pair;
	}
	// $ANTLR end "pairNums"



	// $ANTLR start "pairString"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:363:1: pairString returns [Pair<String, String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
	public final Pair<String, String> pairString() throws RecognitionException {
		Pair<String, String> pair = null;


		Token i=null;
		Token j=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairString2552); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:13: ( WS )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==WS) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2554); 
					}
					break;

			}

			i=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString2559); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:40: ( WS )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==WS) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:40: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2562); 
					}
					break;

			}

			match(input,94,FOLLOW_94_in_pairString2565); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:48: ( WS )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==WS) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:48: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2567); 
					}
					break;

			}

			j=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString2572); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:74: ( WS )?
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==WS) ) {
				alt179=1;
			}
			switch (alt179) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:74: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2574); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairString2577); 
			}

			 pair = new Pair<>(((i!=null?i.getText():null)).replaceAll("'", ""), ((j!=null?j.getText():null)).replaceAll("'", ""));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pair;
	}
	// $ANTLR end "pairString"



	// $ANTLR start "havingClause"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:1: havingClause returns [Having having] : h= complexHaving ;
	public final Having havingClause() throws RecognitionException {
		Having having = null;


		Having h =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:2: (h= complexHaving )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:4: h= complexHaving
			{
			pushFollow(FOLLOW_complexHaving_in_havingClause2602);
			h=complexHaving();
			state._fsp--;

			having = h;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "havingClause"



	// $ANTLR start "simpleHaving"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:375:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
	public final Having simpleHaving() throws RecognitionException {
		Having having = null;


		Token a=null;
		Token t=null;
		Token v=null;
		Token n=null;
		EqualsToHolder e =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
			int alt184=3;
			int LA184_0 = input.LA(1);
			if ( (LA184_0==ID) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA184_3 = input.LA(3);
					if ( (LA184_3==COMPARE_OPER) ) {
						alt184=1;
					}
					else if ( (LA184_3==EQUALS) ) {
						alt184=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 184, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMPARE_OPER:
					{
					alt184=1;
					}
					break;
				case EQUALS:
					{
					alt184=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 184, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA184_0==NOT) ) {
				alt184=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 184, 0, input);
				throw nvae;
			}

			switch (alt184) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving2623); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:10: ( WS )?
					int alt180=2;
					int LA180_0 = input.LA(1);
					if ( (LA180_0==WS) ) {
						alt180=1;
					}
					switch (alt180) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:10: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2625); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving2630); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:29: ( WS )?
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==WS) ) {
						alt181=1;
					}
					switch (alt181) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:29: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2632); 
							}
							break;

					}

					v=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					having = new Having((t!=null?t.getText():null), (a!=null?a.getText():null), (v!=null?v.getText():null));
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:377:4: (e= getEquals )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:377:4: (e= getEquals )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:377:5: e= getEquals
					{
					pushFollow(FOLLOW_getEquals_in_simpleHaving2654);
					e=getEquals();
					state._fsp--;

					}

					having = new Having("=", e.name, e.value);
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_simpleHaving2665); 
					match(input,WS,FOLLOW_WS_in_simpleHaving2667); 
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving2671); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:19: ( WS )?
					int alt182=2;
					int LA182_0 = input.LA(1);
					if ( (LA182_0==WS) ) {
						alt182=1;
					}
					switch (alt182) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:19: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2673); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving2678); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:38: ( WS )?
					int alt183=2;
					int LA183_0 = input.LA(1);
					if ( (LA183_0==WS) ) {
						alt183=1;
					}
					switch (alt183) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2680); 
							}
							break;

					}

					v=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					having = new Having((n!=null?n.getText():null).toLowerCase()); having.havingSpecs = Arrays.asList(new Having((t!=null?t.getText():null), (a!=null?a.getText():null), (v!=null?v.getText():null)));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "simpleHaving"



	// $ANTLR start "complexHaving"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:1: complexHaving returns [Having having] : ( (s= simpleHaving ) ( WS o= ( AND | OR ) WS b= complexHaving )? | LPARAN ( WS )? a= complexHaving ( WS o= ( AND | OR ) WS b= complexHaving )* ( WS )? RPARAN );
	public final Having complexHaving() throws RecognitionException {
		Having having = null;


		Token o=null;
		Having s =null;
		Having b =null;
		Having a =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:3: ( (s= simpleHaving ) ( WS o= ( AND | OR ) WS b= complexHaving )? | LPARAN ( WS )? a= complexHaving ( WS o= ( AND | OR ) WS b= complexHaving )* ( WS )? RPARAN )
			int alt189=2;
			int LA189_0 = input.LA(1);
			if ( (LA189_0==ID||LA189_0==NOT) ) {
				alt189=1;
			}
			else if ( (LA189_0==LPARAN) ) {
				alt189=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 189, 0, input);
				throw nvae;
			}

			switch (alt189) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:5: (s= simpleHaving ) ( WS o= ( AND | OR ) WS b= complexHaving )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:5: (s= simpleHaving )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:6: s= simpleHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving2714);
					s=simpleHaving();
					state._fsp--;

					}

					having = s;
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:36: ( WS o= ( AND | OR ) WS b= complexHaving )?
					int alt185=2;
					int LA185_0 = input.LA(1);
					if ( (LA185_0==WS) ) {
						int LA185_1 = input.LA(2);
						if ( (LA185_1==AND||LA185_1==OR) ) {
							int LA185_5 = input.LA(3);
							if ( (LA185_5==WS) ) {
								switch ( input.LA(4) ) {
									case ID:
										{
										switch ( input.LA(5) ) {
											case WS:
												{
												int LA185_19 = input.LA(6);
												if ( (LA185_19==COMPARE_OPER) ) {
													alt185=1;
												}
												else if ( (LA185_19==EQUALS) ) {
													alt185=1;
												}
												}
												break;
											case COMPARE_OPER:
												{
												int LA185_20 = input.LA(6);
												if ( (LA185_20==WS) ) {
													alt185=1;
												}
												else if ( (LA185_20==FLOAT||LA185_20==LONG) ) {
													alt185=1;
												}
												}
												break;
											case EQUALS:
												{
												int LA185_21 = input.LA(6);
												if ( (LA185_21==WS) ) {
													alt185=1;
												}
												else if ( (LA185_21==FLOAT||LA185_21==LONG||LA185_21==SINGLE_QUOTE_STRING) ) {
													alt185=1;
												}
												}
												break;
										}
										}
										break;
									case NOT:
										{
										int LA185_17 = input.LA(5);
										if ( (LA185_17==WS) ) {
											int LA185_22 = input.LA(6);
											if ( (LA185_22==ID) ) {
												alt185=1;
											}
										}
										}
										break;
									case LPARAN:
										{
										switch ( input.LA(5) ) {
											case WS:
												{
												switch ( input.LA(6) ) {
													case ID:
														{
														alt185=1;
														}
														break;
													case NOT:
														{
														alt185=1;
														}
														break;
													case LPARAN:
														{
														alt185=1;
														}
														break;
												}
												}
												break;
											case ID:
												{
												switch ( input.LA(6) ) {
													case WS:
														{
														alt185=1;
														}
														break;
													case COMPARE_OPER:
														{
														alt185=1;
														}
														break;
													case EQUALS:
														{
														alt185=1;
														}
														break;
												}
												}
												break;
											case NOT:
												{
												int LA185_25 = input.LA(6);
												if ( (LA185_25==WS) ) {
													alt185=1;
												}
												}
												break;
											case LPARAN:
												{
												switch ( input.LA(6) ) {
													case WS:
														{
														alt185=1;
														}
														break;
													case ID:
														{
														alt185=1;
														}
														break;
													case NOT:
														{
														alt185=1;
														}
														break;
													case LPARAN:
														{
														alt185=1;
														}
														break;
												}
												}
												break;
										}
										}
										break;
								}
							}
						}
					}
					switch (alt185) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:37: WS o= ( AND | OR ) WS b= complexHaving
							{
							match(input,WS,FOLLOW_WS_in_complexHaving2720); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_complexHaving2730); 
							pushFollow(FOLLOW_complexHaving_in_complexHaving2734);
							b=complexHaving();
							state._fsp--;

							Having tmpHaving = having;
							       having = new Having((o!=null?o.getText():null).toLowerCase());
							       having.addHaving(tmpHaving);
							       having.addHaving(b);
							    
							}
							break;

					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:4: LPARAN ( WS )? a= complexHaving ( WS o= ( AND | OR ) WS b= complexHaving )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_complexHaving2759); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:11: ( WS )?
					int alt186=2;
					int LA186_0 = input.LA(1);
					if ( (LA186_0==WS) ) {
						alt186=1;
					}
					switch (alt186) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:11: WS
							{
							match(input,WS,FOLLOW_WS_in_complexHaving2761); 
							}
							break;

					}

					pushFollow(FOLLOW_complexHaving_in_complexHaving2766);
					a=complexHaving();
					state._fsp--;

					having = a;
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:46: ( WS o= ( AND | OR ) WS b= complexHaving )*
					loop187:
					while (true) {
						int alt187=2;
						int LA187_0 = input.LA(1);
						if ( (LA187_0==WS) ) {
							int LA187_1 = input.LA(2);
							if ( (LA187_1==AND||LA187_1==OR) ) {
								alt187=1;
							}

						}

						switch (alt187) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:47: WS o= ( AND | OR ) WS b= complexHaving
							{
							match(input,WS,FOLLOW_WS_in_complexHaving2772); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_complexHaving2782); 
							pushFollow(FOLLOW_complexHaving_in_complexHaving2786);
							b=complexHaving();
							state._fsp--;

							Having tmpHaving = having;
							       having = new Having((o!=null?o.getText():null).toLowerCase());
							       having.addHaving(tmpHaving);
							       having.addHaving(b);
							    
							}
							break;

						default :
							break loop187;
						}
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:9: ( WS )?
					int alt188=2;
					int LA188_0 = input.LA(1);
					if ( (LA188_0==WS) ) {
						alt188=1;
					}
					switch (alt188) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:9: WS
							{
							match(input,WS,FOLLOW_WS_in_complexHaving2808); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_complexHaving2811); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "complexHaving"



	// $ANTLR start "grandFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:399:1: grandFilter returns [Filter filter] : a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ;
	public final Filter grandFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:2: (a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:3: a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )*
			{
			pushFollow(FOLLOW_semiGrandFilter_in_grandFilter2831);
			a=semiGrandFilter();
			state._fsp--;

			filter = a;
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:35: ( WS o= ( AND | OR ) WS b= semiGrandFilter )*
			loop190:
			while (true) {
				int alt190=2;
				int LA190_0 = input.LA(1);
				if ( (LA190_0==WS) ) {
					int LA190_1 = input.LA(2);
					if ( (LA190_1==AND||LA190_1==OR) ) {
						alt190=1;
					}

				}

				switch (alt190) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:36: WS o= ( AND | OR ) WS b= semiGrandFilter
					{
					match(input,WS,FOLLOW_WS_in_grandFilter2836); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_grandFilter2846); 
					pushFollow(FOLLOW_semiGrandFilter_in_grandFilter2850);
					b=semiGrandFilter();
					state._fsp--;


						         Filter tmpFilter = filter;
						         filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 filter.fields.add(tmpFilter);
							 if (b != null) {
							    filter.fields.add(b);
							 }
							
					}
					break;

				default :
					break loop190;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "grandFilter"



	// $ANTLR start "semiGrandFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:1: semiGrandFilter returns [Filter filter] : (a= simpleLogicalFilter | LPARAN ( WS )? a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ( WS )? RPARAN );
	public final Filter semiGrandFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:2: (a= simpleLogicalFilter | LPARAN ( WS )? a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ( WS )? RPARAN )
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==ID||LA194_0==NOT) ) {
				alt194=1;
			}
			else if ( (LA194_0==LPARAN) ) {
				alt194=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 194, 0, input);
				throw nvae;
			}

			switch (alt194) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:2: a= simpleLogicalFilter
					{
					pushFollow(FOLLOW_simpleLogicalFilter_in_semiGrandFilter2881);
					a=simpleLogicalFilter();
					state._fsp--;

					filter = a;
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:3: LPARAN ( WS )? a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_semiGrandFilter2888); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:10: ( WS )?
					int alt191=2;
					int LA191_0 = input.LA(1);
					if ( (LA191_0==WS) ) {
						alt191=1;
					}
					switch (alt191) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:10: WS
							{
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2890); 
							}
							break;

					}

					pushFollow(FOLLOW_semiGrandFilter_in_semiGrandFilter2895);
					a=semiGrandFilter();
					state._fsp--;

					filter = a;
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:47: ( WS o= ( AND | OR ) WS b= semiGrandFilter )*
					loop192:
					while (true) {
						int alt192=2;
						int LA192_0 = input.LA(1);
						if ( (LA192_0==WS) ) {
							int LA192_1 = input.LA(2);
							if ( (LA192_1==AND||LA192_1==OR) ) {
								alt192=1;
							}

						}

						switch (alt192) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:48: WS o= ( AND | OR ) WS b= semiGrandFilter
							{
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2901); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2911); 
							pushFollow(FOLLOW_semiGrandFilter_in_semiGrandFilter2915);
							b=semiGrandFilter();
							state._fsp--;

							Filter tmpFilter = filter;
								         filter = new Filter((o!=null?o.getText():null).toLowerCase());
									 filter.fields = new ArrayList<>();
									 filter.fields.add(tmpFilter);
									 if (b != null) {
									    filter.fields.add(b);
									 }
									
							}
							break;

						default :
							break loop192;
						}
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:7: ( WS )?
					int alt193=2;
					int LA193_0 = input.LA(1);
					if ( (LA193_0==WS) ) {
						alt193=1;
					}
					switch (alt193) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:7: WS
							{
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2931); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_semiGrandFilter2934); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "semiGrandFilter"



	// $ANTLR start "simpleLogicalFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:1: simpleLogicalFilter returns [Filter filter] : ( (a= simpleFilter ) | ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) );
	public final Filter simpleLogicalFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:427:2: ( (a= simpleFilter ) | ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) )
			int alt196=2;
			alt196 = dfa196.predict(input);
			switch (alt196) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:2: (a= simpleFilter )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:2: (a= simpleFilter )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:3: a= simpleFilter
					{
					pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2953);
					a=simpleFilter();
					state._fsp--;

					}

					filter = a;
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					int alt195=2;
					int LA195_0 = input.LA(1);
					if ( (LA195_0==ID) ) {
						alt195=1;
					}
					else if ( (LA195_0==NOT) ) {
						alt195=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 195, 0, input);
						throw nvae;
					}

					switch (alt195) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
							{
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2965);
							a=simpleFilter();
							state._fsp--;

							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2967); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2977); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2981);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:55: (o= NOT WS b= simpleFilter )
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:55: (o= NOT WS b= simpleFilter )
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:56: o= NOT WS b= simpleFilter
							{
							o=(Token)match(input,NOT,FOLLOW_NOT_in_simpleLogicalFilter2989); 
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2991); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2995);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;

					}

					filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 if (a != null) {
							    filter.fields.add(a);
							 }
							 if (b != null) {		 
					   	 	    filter.fields.add(b);
							 }
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "simpleLogicalFilter"



	// $ANTLR start "simpleFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:1: simpleFilter returns [Filter filter] : (a= selectorFilter |a= regexFilter |a= inFilter ) ;
	public final Filter simpleFilter() throws RecognitionException {
		Filter filter = null;


		Filter a =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:2: ( (a= selectorFilter |a= regexFilter |a= inFilter ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:4: (a= selectorFilter |a= regexFilter |a= inFilter )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:4: (a= selectorFilter |a= regexFilter |a= inFilter )
			int alt197=3;
			int LA197_0 = input.LA(1);
			if ( (LA197_0==ID) ) {
				int LA197_1 = input.LA(2);
				if ( (LA197_1==WS) ) {
					switch ( input.LA(3) ) {
					case LIKE:
						{
						alt197=2;
						}
						break;
					case IN:
						{
						alt197=3;
						}
						break;
					case EQUALS:
						{
						alt197=1;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 197, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA197_1==EQUALS) ) {
					alt197=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 197, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 197, 0, input);
				throw nvae;
			}

			switch (alt197) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:5: a= selectorFilter
					{
					pushFollow(FOLLOW_selectorFilter_in_simpleFilter3022);
					a=selectorFilter();
					state._fsp--;

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:24: a= regexFilter
					{
					pushFollow(FOLLOW_regexFilter_in_simpleFilter3028);
					a=regexFilter();
					state._fsp--;

					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:40: a= inFilter
					{
					pushFollow(FOLLOW_inFilter_in_simpleFilter3034);
					a=inFilter();
					state._fsp--;

					}
					break;

			}

			filter = a;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "simpleFilter"



	// $ANTLR start "selectorFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:446:1: selectorFilter returns [Filter filter] : e= getEquals ;
	public final Filter selectorFilter() throws RecognitionException {
		Filter filter = null;


		EqualsToHolder e =null;

		filter = new Filter("selector");
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:2: (e= getEquals )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:4: e= getEquals
			{
			pushFollow(FOLLOW_getEquals_in_selectorFilter3059);
			e=getEquals();
			state._fsp--;

			filter.dimension = e.name;
					 filter.value = unquote(e.value);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "selectorFilter"



	// $ANTLR start "regexFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:454:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
	public final Filter regexFilter() throws RecognitionException {
		Filter filter = null;


		Token a=null;
		Token b=null;

		filter = new Filter("regex");
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_regexFilter3088); 
			match(input,WS,FOLLOW_WS_in_regexFilter3090); 
			match(input,LIKE,FOLLOW_LIKE_in_regexFilter3092); 
			match(input,WS,FOLLOW_WS_in_regexFilter3094); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:24: ( SINGLE_QUOTE_STRING )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:25: SINGLE_QUOTE_STRING
			{
			b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter3100); 
			}

			}

			filter.dimension = (a!=null?a.getText():null);
					 filter.pattern = unquote((b!=null?b.getText():null));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "regexFilter"



	// $ANTLR start "inFilter"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:1: inFilter returns [Filter filter] : (a= ID WS IN WS LPARAN ( WS )? b= ( SINGLE_QUOTE_STRING ) ( ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING ) )* ( WS )? RPARAN ) ;
	public final Filter inFilter() throws RecognitionException {
		Filter filter = null;


		Token a=null;
		Token b=null;

		filter = new Filter("in");filter.values = new ArrayList<>();
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:2: ( (a= ID WS IN WS LPARAN ( WS )? b= ( SINGLE_QUOTE_STRING ) ( ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING ) )* ( WS )? RPARAN ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:4: (a= ID WS IN WS LPARAN ( WS )? b= ( SINGLE_QUOTE_STRING ) ( ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING ) )* ( WS )? RPARAN )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:4: (a= ID WS IN WS LPARAN ( WS )? b= ( SINGLE_QUOTE_STRING ) ( ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING ) )* ( WS )? RPARAN )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:5: a= ID WS IN WS LPARAN ( WS )? b= ( SINGLE_QUOTE_STRING ) ( ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING ) )* ( WS )? RPARAN
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_inFilter3130); 
			match(input,WS,FOLLOW_WS_in_inFilter3132); 
			match(input,IN,FOLLOW_IN_in_inFilter3134); 
			match(input,WS,FOLLOW_WS_in_inFilter3136); 
			match(input,LPARAN,FOLLOW_LPARAN_in_inFilter3138); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:26: ( WS )?
			int alt198=2;
			int LA198_0 = input.LA(1);
			if ( (LA198_0==WS) ) {
				alt198=1;
			}
			switch (alt198) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:26: WS
					{
					match(input,WS,FOLLOW_WS_in_inFilter3140); 
					}
					break;

			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:32: ( SINGLE_QUOTE_STRING )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:33: SINGLE_QUOTE_STRING
			{
			b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_inFilter3146); 
			}


							filter.values.add(unquote((b!=null?b.getText():null)));
						
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:4: ( ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING ) )*
			loop201:
			while (true) {
				int alt201=2;
				int LA201_0 = input.LA(1);
				if ( (LA201_0==WS) ) {
					int LA201_1 = input.LA(2);
					if ( (LA201_1==94) ) {
						alt201=1;
					}

				}
				else if ( (LA201_0==94) ) {
					alt201=1;
				}

				switch (alt201) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:5: ( WS )? ',' ( WS )? b= ( SINGLE_QUOTE_STRING )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:5: ( WS )?
					int alt199=2;
					int LA199_0 = input.LA(1);
					if ( (LA199_0==WS) ) {
						alt199=1;
					}
					switch (alt199) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:5: WS
							{
							match(input,WS,FOLLOW_WS_in_inFilter3158); 
							}
							break;

					}

					match(input,94,FOLLOW_94_in_inFilter3161); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:13: ( WS )?
					int alt200=2;
					int LA200_0 = input.LA(1);
					if ( (LA200_0==WS) ) {
						alt200=1;
					}
					switch (alt200) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:13: WS
							{
							match(input,WS,FOLLOW_WS_in_inFilter3163); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:19: ( SINGLE_QUOTE_STRING )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:20: SINGLE_QUOTE_STRING
					{
					b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_inFilter3169); 
					}


										filter.values.add(unquote((b!=null?b.getText():null)));
									
					}
					break;

				default :
					break loop201;
				}
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:4: ( WS )?
			int alt202=2;
			int LA202_0 = input.LA(1);
			if ( (LA202_0==WS) ) {
				alt202=1;
			}
			switch (alt202) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:4: WS
					{
					match(input,WS,FOLLOW_WS_in_inFilter3187); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_inFilter3190); 
			}


						filter.dimension = (a!=null?a.getText():null);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "inFilter"



	// $ANTLR start "aggItem"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:1: aggItem returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
	public final AggItem aggItem() throws RecognitionException {
		AggItem aggItem = null;


		Token x=null;

		  aggItem = new AggItem(); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:484:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:484:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
			{
			pushFollow(FOLLOW_aggCallSite_in_aggItem3219);
			aggCallSite(aggItem);
			state._fsp--;

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:484:25: ( WS AS WS x= ID )?
			int alt203=2;
			int LA203_0 = input.LA(1);
			if ( (LA203_0==WS) ) {
				int LA203_1 = input.LA(2);
				if ( (LA203_1==AS) ) {
					alt203=1;
				}
			}
			switch (alt203) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:484:26: WS AS WS x= ID
					{
					match(input,WS,FOLLOW_WS_in_aggItem3223); 
					match(input,AS,FOLLOW_AS_in_aggItem3225); 
					match(input,WS,FOLLOW_WS_in_aggItem3227); 
					x=(Token)match(input,ID,FOLLOW_ID_in_aggItem3231); 
					aggItem.setAsName((x!=null?x.getText():null));
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return aggItem;
	}
	// $ANTLR end "aggItem"



	// $ANTLR start "aggCallSite"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:486:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) );
	public final void aggCallSite(AggItem aggItem) throws RecognitionException {
		Token x=null;
		Token y=null;
		String p =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) )
			int alt210=2;
			int LA210_0 = input.LA(1);
			if ( ((LA210_0 >= DOUBLE_MAX && LA210_0 <= DOUBLE_SUM)||LA210_0==HYPER_UNIQUE||LA210_0==JAVASCRIPT||(LA210_0 >= LONG_MAX && LA210_0 <= LONG_SUM)||LA210_0==UNIQUE) ) {
				alt210=1;
			}
			else if ( (LA210_0==COUNT) ) {
				alt210=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 210, 0, input);
				throw nvae;
			}

			switch (alt210) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					{
					pushFollow(FOLLOW_aggFunc_in_aggCallSite3250);
					p=aggFunc();
					state._fsp--;

					aggItem.setAggType(p);
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:40: ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:40: ( WS )?
					int alt204=2;
					int LA204_0 = input.LA(1);
					if ( (LA204_0==WS) ) {
						alt204=1;
					}
					switch (alt204) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:40: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3255); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_aggCallSite3258); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:51: ( WS )?
					int alt205=2;
					int LA205_0 = input.LA(1);
					if ( (LA205_0==WS) ) {
						alt205=1;
					}
					switch (alt205) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:51: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3260); 
							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:55: (x= ID )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:57: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite3267); 
					aggItem.setFieldName((x!=null?x.getText():null));
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:96: ( ( WS )? ',' ( WS )? y= ID )*
					loop208:
					while (true) {
						int alt208=2;
						int LA208_0 = input.LA(1);
						if ( (LA208_0==WS) ) {
							int LA208_1 = input.LA(2);
							if ( (LA208_1==94) ) {
								alt208=1;
							}

						}
						else if ( (LA208_0==94) ) {
							alt208=1;
						}

						switch (alt208) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:97: ( WS )? ',' ( WS )? y= ID
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:97: ( WS )?
							int alt206=2;
							int LA206_0 = input.LA(1);
							if ( (LA206_0==WS) ) {
								alt206=1;
							}
							switch (alt206) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:97: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite3273); 
									}
									break;

							}

							match(input,94,FOLLOW_94_in_aggCallSite3276); 
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:105: ( WS )?
							int alt207=2;
							int LA207_0 = input.LA(1);
							if ( (LA207_0==WS) ) {
								alt207=1;
							}
							switch (alt207) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:105: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite3278); 
									}
									break;

							}

							y=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite3283); 

								    if (aggItem.fieldNames == null || aggItem.fieldNames.isEmpty()) {
								       aggItem.fieldNames = new ArrayList<>();
								       aggItem.fieldNames.add(aggItem.fieldName);
								       aggItem.fieldName = null;
								    }
								    aggItem.fieldNames.add((y!=null?y.getText():null));
								
							}
							break;

						default :
							break loop208;
						}
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:494:6: ( WS )?
					int alt209=2;
					int LA209_0 = input.LA(1);
					if ( (LA209_0==WS) ) {
						alt209=1;
					}
					switch (alt209) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:494:6: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3289); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_aggCallSite3292); 
					}

					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:4: COUNT ( '(*)' )
					{
					match(input,COUNT,FOLLOW_COUNT_in_aggCallSite3299); 
					aggItem.setAggType("count");
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:41: ( '(*)' )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:42: '(*)'
					{
					match(input,92,FOLLOW_92_in_aggCallSite3304); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "aggCallSite"



	// $ANTLR start "aggFunc"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:498:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | DOUBLE_MIN | DOUBLE_MAX | LONG_MIN | LONG_MAX | JAVASCRIPT );
	public final String aggFunc() throws RecognitionException {
		String name = null;


		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:499:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | DOUBLE_MIN | DOUBLE_MAX | LONG_MIN | LONG_MAX | JAVASCRIPT )
			int alt211=9;
			switch ( input.LA(1) ) {
			case LONG_SUM:
				{
				alt211=1;
				}
				break;
			case DOUBLE_SUM:
				{
				alt211=2;
				}
				break;
			case UNIQUE:
				{
				alt211=3;
				}
				break;
			case HYPER_UNIQUE:
				{
				alt211=4;
				}
				break;
			case DOUBLE_MIN:
				{
				alt211=5;
				}
				break;
			case DOUBLE_MAX:
				{
				alt211=6;
				}
				break;
			case LONG_MIN:
				{
				alt211=7;
				}
				break;
			case LONG_MAX:
				{
				alt211=8;
				}
				break;
			case JAVASCRIPT:
				{
				alt211=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 211, 0, input);
				throw nvae;
			}
			switch (alt211) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:499:4: LONG_SUM
					{
					match(input,LONG_SUM,FOLLOW_LONG_SUM_in_aggFunc3322); 
					name = "longSum";
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:4: DOUBLE_SUM
					{
					match(input,DOUBLE_SUM,FOLLOW_DOUBLE_SUM_in_aggFunc3329); 
					name = "doubleSum";
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:501:4: UNIQUE
					{
					match(input,UNIQUE,FOLLOW_UNIQUE_in_aggFunc3336); 
					name = "unique";
					}
					break;
				case 4 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:502:4: HYPER_UNIQUE
					{
					match(input,HYPER_UNIQUE,FOLLOW_HYPER_UNIQUE_in_aggFunc3343); 
					name = "hyperUnique";
					}
					break;
				case 5 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:503:4: DOUBLE_MIN
					{
					match(input,DOUBLE_MIN,FOLLOW_DOUBLE_MIN_in_aggFunc3350); 
					name = "doubleMin";
					}
					break;
				case 6 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:4: DOUBLE_MAX
					{
					match(input,DOUBLE_MAX,FOLLOW_DOUBLE_MAX_in_aggFunc3357); 
					name = "doubleMax";
					}
					break;
				case 7 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:505:4: LONG_MIN
					{
					match(input,LONG_MIN,FOLLOW_LONG_MIN_in_aggFunc3364); 
					name = "longMin";
					}
					break;
				case 8 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:506:4: LONG_MAX
					{
					match(input,LONG_MAX,FOLLOW_LONG_MAX_in_aggFunc3371); 
					name = "longMax";
					}
					break;
				case 9 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:4: JAVASCRIPT
					{
					match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_aggFunc3378); 
					name = "javascript";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "aggFunc"



	// $ANTLR start "postAggItem"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:513:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
	public final PostAggItem postAggItem() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
			int alt221=2;
			int LA221_0 = input.LA(1);
			if ( (LA221_0==FLOAT||LA221_0==ID||LA221_0==JAVASCRIPT||LA221_0==LONG||LA221_0==UNIQUE) ) {
				alt221=1;
			}
			else if ( (LA221_0==LPARAN) ) {
				alt221=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 221, 0, input);
				throw nvae;
			}

			switch (alt221) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					pushFollow(FOLLOW_simpleArith_in_postAggItem3406);
					a=simpleArith();
					state._fsp--;

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt214=2;
					int LA214_0 = input.LA(1);
					if ( (LA214_0==WS) ) {
						int LA214_1 = input.LA(2);
						if ( (LA214_1==ARITH_OPER) ) {
							alt214=1;
						}
					}
					else if ( (LA214_0==ARITH_OPER) ) {
						alt214=1;
					}
					switch (alt214) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:21: ( WS )?
							int alt212=2;
							int LA212_0 = input.LA(1);
							if ( (LA212_0==WS) ) {
								alt212=1;
							}
							switch (alt212) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:21: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3410); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem3413);
							postAggArithOper(postAggItem);
							state._fsp--;

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:55: ( WS )?
							int alt213=2;
							int LA213_0 = input.LA(1);
							if ( (LA213_0==WS) ) {
								alt213=1;
							}
							switch (alt213) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:55: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3416); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem3421);
							b=postAggItem();
							state._fsp--;

							}
							break;

					}

					}

					 if (b == null) {
						       postAggItem = a;
					             } else {
					             	postAggItem.fields = Arrays.asList(a, b);
					             }
					           
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_postAggItem3439); 
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:13: ( WS )?
					int alt215=2;
					int LA215_0 = input.LA(1);
					if ( (LA215_0==WS) ) {
						alt215=1;
					}
					switch (alt215) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:13: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem3441); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggItem_in_postAggItem3446);
					a=postAggItem();
					state._fsp--;

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:31: ( WS )?
					int alt216=2;
					int LA216_0 = input.LA(1);
					if ( (LA216_0==WS) ) {
						alt216=1;
					}
					switch (alt216) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:31: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem3448); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_postAggItem3451); 
					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:43: ( postAggLabel[postAggItem] )?
					int alt217=2;
					int LA217_0 = input.LA(1);
					if ( (LA217_0==AS) ) {
						alt217=1;
					}
					switch (alt217) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:44: postAggLabel[postAggItem]
							{
							pushFollow(FOLLOW_postAggLabel_in_postAggItem3455);
							postAggLabel(postAggItem);
							state._fsp--;

							}
							break;

					}

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt220=2;
					int LA220_0 = input.LA(1);
					if ( (LA220_0==WS) ) {
						int LA220_1 = input.LA(2);
						if ( (LA220_1==ARITH_OPER) ) {
							alt220=1;
						}
					}
					else if ( (LA220_0==ARITH_OPER) ) {
						alt220=1;
					}
					switch (alt220) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:73: ( WS )?
							int alt218=2;
							int LA218_0 = input.LA(1);
							if ( (LA218_0==WS) ) {
								alt218=1;
							}
							switch (alt218) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:73: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3461); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem3464);
							postAggArithOper(postAggItem);
							state._fsp--;

							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:107: ( WS )?
							int alt219=2;
							int LA219_0 = input.LA(1);
							if ( (LA219_0==WS) ) {
								alt219=1;
							}
							switch (alt219) {
								case 1 :
									// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:107: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3467); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem3472);
							b=postAggItem();
							state._fsp--;

							}
							break;

					}

					}

					 if (b == null) {
						       postAggItem = a;
					             } else {
					             	postAggItem.fields = Arrays.asList(a, b);
					             }
					           
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "postAggItem"



	// $ANTLR start "simpleArith"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:533:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
	public final PostAggItem simpleArith() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:4: (a= simplePostAggAccess )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:5: a= simplePostAggAccess
			{
			pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3508);
			a=simplePostAggAccess();
			state._fsp--;

			postAggItem=a;
			}

			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			int alt224=2;
			alt224 = dfa224.predict(input);
			switch (alt224) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
					{
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:46: ( WS )?
					int alt222=2;
					int LA222_0 = input.LA(1);
					if ( (LA222_0==WS) ) {
						alt222=1;
					}
					switch (alt222) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:46: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith3514); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggArithOper_in_simpleArith3517);
					postAggArithOper(postAggItem);
					state._fsp--;

					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:80: ( WS )?
					int alt223=2;
					int LA223_0 = input.LA(1);
					if ( (LA223_0==WS) ) {
						alt223=1;
					}
					switch (alt223) {
						case 1 :
							// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:80: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith3520); 
							}
							break;

					}

					pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3525);
					b=simplePostAggAccess();
					state._fsp--;


						    postAggItem = new PostAggItem("arithmetic"); 
						    if (postAggItem.fields == null) {
						       postAggItem.fields = new ArrayList<>();
						    }
					            postAggItem.fields.add(a);
						    postAggItem.fields.add(b);
						   
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "simpleArith"



	// $ANTLR start "simplePostAggAccess"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:547:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
	public final PostAggItem simplePostAggAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem c =null;
		PostAggItem f =null;
		PostAggItem h =null;
		PostAggItem js =null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
			int alt225=4;
			switch ( input.LA(1) ) {
			case FLOAT:
			case LONG:
				{
				alt225=1;
				}
				break;
			case ID:
				{
				alt225=2;
				}
				break;
			case UNIQUE:
				{
				alt225=3;
				}
				break;
			case JAVASCRIPT:
				{
				alt225=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 225, 0, input);
				throw nvae;
			}
			switch (alt225) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:4: c= constantAccess
					{
					pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess3554);
					c=constantAccess();
					state._fsp--;

					postAggItem = c;
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:4: f= fieldAccess
					{
					pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess3571);
					f=fieldAccess();
					state._fsp--;

					postAggItem = f;
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:550:4: h= hyperUniqueCardinality
					{
					pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3584);
					h=hyperUniqueCardinality();
					state._fsp--;

					postAggItem = h;
					}
					break;
				case 4 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:551:4: js= postAggJavascriptDef
					{
					pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3593);
					js=postAggJavascriptDef();
					state._fsp--;

					postAggItem = js;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "simplePostAggAccess"



	// $ANTLR start "constantAccess"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem constantAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("constant"); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:5: (a= FLOAT |a= LONG )
			int alt226=2;
			int LA226_0 = input.LA(1);
			if ( (LA226_0==FLOAT) ) {
				alt226=1;
			}
			else if ( (LA226_0==LONG) ) {
				alt226=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 226, 0, input);
				throw nvae;
			}

			switch (alt226) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:6: a= FLOAT
					{
					a=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constantAccess3623); 
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:16: a= LONG
					{
					a=(Token)match(input,LONG,FOLLOW_LONG_in_constantAccess3629); 
					}
					break;

			}

			postAggItem.constantValue = Double.valueOf((a!=null?a.getText():null));
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:560:5: ( WS postAggLabel[postAggItem] )?
			int alt227=2;
			int LA227_0 = input.LA(1);
			if ( (LA227_0==WS) ) {
				int LA227_1 = input.LA(2);
				if ( (LA227_1==AS) ) {
					alt227=1;
				}
			}
			switch (alt227) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:560:6: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_constantAccess3642); 
					pushFollow(FOLLOW_postAggLabel_in_constantAccess3644);
					postAggLabel(postAggItem);
					state._fsp--;

					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "constantAccess"



	// $ANTLR start "fieldAccess"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem fieldAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("fieldAccess"); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:5: a= ID ( WS postAggLabel[postAggItem] )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_fieldAccess3672); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:10: ( WS postAggLabel[postAggItem] )?
			int alt228=2;
			int LA228_0 = input.LA(1);
			if ( (LA228_0==WS) ) {
				int LA228_1 = input.LA(2);
				if ( (LA228_1==AS) ) {
					alt228=1;
				}
			}
			switch (alt228) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:11: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_fieldAccess3675); 
					pushFollow(FOLLOW_postAggLabel_in_fieldAccess3677);
					postAggLabel(postAggItem);
					state._fsp--;

					}
					break;

			}

			}

			postAggItem.fieldName = (a!=null?a.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "fieldAccess"



	// $ANTLR start "hyperUniqueCardinality"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
	public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("hyperUniqueCardinality"); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
			{
			match(input,UNIQUE,FOLLOW_UNIQUE_in_hyperUniqueCardinality3706); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:12: ( WS )?
			int alt229=2;
			int LA229_0 = input.LA(1);
			if ( (LA229_0==WS) ) {
				alt229=1;
			}
			switch (alt229) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:12: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3708); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_hyperUniqueCardinality3711); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:23: ( WS )?
			int alt230=2;
			int LA230_0 = input.LA(1);
			if ( (LA230_0==WS) ) {
				alt230=1;
			}
			switch (alt230) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:23: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3713); 
					}
					break;

			}

			a=(Token)match(input,ID,FOLLOW_ID_in_hyperUniqueCardinality3718); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:32: ( WS )?
			int alt231=2;
			int LA231_0 = input.LA(1);
			if ( (LA231_0==WS) ) {
				alt231=1;
			}
			switch (alt231) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:32: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3720); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_hyperUniqueCardinality3723); 
			postAggItem.fieldName = (a!=null?a.getText():null);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "hyperUniqueCardinality"



	// $ANTLR start "postAggJavascriptDef"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:575:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
	public final PostAggItem postAggJavascriptDef() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token str=null;

		  postAggItem = new PostAggItem("javascript"); 
		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:577:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:577:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
			{
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3749); 
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:577:15: ( WS )?
			int alt232=2;
			int LA232_0 = input.LA(1);
			if ( (LA232_0==WS) ) {
				alt232=1;
			}
			switch (alt232) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:577:15: WS
					{
					match(input,WS,FOLLOW_WS_in_postAggJavascriptDef3751); 
					}
					break;

			}

			str=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3756); 
			postAggItem.parseToJs((str!=null?str.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "postAggJavascriptDef"



	// $ANTLR start "postAggLabel"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:580:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
	public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
		Token id=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:2: ( ( AS WS id= ID ) )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:4: ( AS WS id= ID )
			{
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:4: ( AS WS id= ID )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:5: AS WS id= ID
			{
			match(input,AS,FOLLOW_AS_in_postAggLabel3772); 
			match(input,WS,FOLLOW_WS_in_postAggLabel3774); 
			id=(Token)match(input,ID,FOLLOW_ID_in_postAggLabel3778); 
			}

			postAggItem.name = (id!=null?id.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postAggLabel"



	// $ANTLR start "postAggArithOper"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:584:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
	public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
		Token arith=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:585:2: (arith= ARITH_OPER )
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:585:3: arith= ARITH_OPER
			{
			arith=(Token)match(input,ARITH_OPER,FOLLOW_ARITH_OPER_in_postAggArithOper3794); 
			postAggItem.fn = (arith!=null?arith.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postAggArithOper"


	public static class isoTime_return extends ParserRuleReturnScope {
		public String date;
	};


	// $ANTLR start "isoTime"
	// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:590:1: isoTime returns [String date] : (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
	public final druidGParser.isoTime_return isoTime() throws RecognitionException {
		druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
		retval.start = input.LT(1);

		Token d=null;

		try {
			// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:591:2: (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
			int alt233=9;
			switch ( input.LA(1) ) {
			case DATE_YEAR_ONLY:
				{
				alt233=1;
				}
				break;
			case DATE_YEAR_MONTH_ONLY:
				{
				alt233=2;
				}
				break;
			case DATE:
				{
				alt233=3;
				}
				break;
			case DATE_HOUR:
				{
				alt233=4;
				}
				break;
			case DATE_HOUR_MIN:
				{
				alt233=5;
				}
				break;
			case DATE_HOUR_MIN_SEC:
				{
				alt233=6;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB:
				{
				alt233=7;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_TZ:
				{
				alt233=8;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_UTC_TZ:
				{
				alt233=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 233, 0, input);
				throw nvae;
			}
			switch (alt233) {
				case 1 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:591:3: d= DATE_YEAR_ONLY
					{
					d=(Token)match(input,DATE_YEAR_ONLY,FOLLOW_DATE_YEAR_ONLY_in_isoTime3813); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 2 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:3: d= DATE_YEAR_MONTH_ONLY
					{
					d=(Token)match(input,DATE_YEAR_MONTH_ONLY,FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3821); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 3 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:3: d= DATE
					{
					d=(Token)match(input,DATE,FOLLOW_DATE_in_isoTime3829); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 4 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:3: d= DATE_HOUR
					{
					d=(Token)match(input,DATE_HOUR,FOLLOW_DATE_HOUR_in_isoTime3837); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 5 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:595:3: d= DATE_HOUR_MIN
					{
					d=(Token)match(input,DATE_HOUR_MIN,FOLLOW_DATE_HOUR_MIN_in_isoTime3845); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 6 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:3: d= DATE_HOUR_MIN_SEC
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC,FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3853); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 7 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:597:3: d= DATE_HOUR_MIN_SEC_SUB
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB,FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3861); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 8 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:598:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3869); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 9 :
					// Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_UTC_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3877); 
					retval.date = (d!=null?d.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "isoTime"

	// Delegated rules


	protected DFA196 dfa196 = new DFA196(this);
	protected DFA224 dfa224 = new DFA224(this);
	static final String DFA196_eotS =
		"\115\uffff";
	static final String DFA196_eofS =
		"\11\uffff\1\20\3\uffff\3\20\3\uffff\1\20\1\uffff\2\20\3\uffff\1\20\62"+
		"\uffff";
	static final String DFA196_minS =
		"\1\52\1\40\1\uffff\1\40\1\43\2\133\2\43\1\106\1\121\1\75\1\43\2\106\1"+
		"\4\3\uffff\1\106\1\121\1\106\1\4\3\uffff\1\4\3\uffff\1\133\56\uffff";
	static final String DFA196_maxS =
		"\1\101\1\133\1\uffff\1\67\4\133\1\121\1\133\1\121\1\75\1\121\2\133\1\132"+
		"\3\uffff\3\133\1\132\3\uffff\1\132\3\uffff\1\133\56\uffff";
	static final String DFA196_acceptS =
		"\2\uffff\1\2\15\uffff\1\1\31\uffff\1\1\3\uffff\3\1\3\uffff\1\1\13\uffff"+
		"\1\1\13\uffff\1\1";
	static final String DFA196_specialS =
		"\115\uffff}>";
	static final String[] DFA196_transitionS = {
			"\1\1\26\uffff\1\2",
			"\1\4\72\uffff\1\3",
			"",
			"\1\7\12\uffff\1\6\13\uffff\1\5",
			"\1\11\25\uffff\1\11\27\uffff\1\11\11\uffff\1\10",
			"\1\12",
			"\1\13",
			"\1\15\25\uffff\1\15\27\uffff\1\15\11\uffff\1\14",
			"\1\16\25\uffff\1\16\27\uffff\1\16",
			"\1\20\7\uffff\1\20\14\uffff\1\17",
			"\1\23",
			"\1\24",
			"\1\25\25\uffff\1\25\27\uffff\1\25",
			"\1\20\7\uffff\1\20\14\uffff\1\26",
			"\1\20\7\uffff\1\20\14\uffff\1\32",
			"\1\36\5\uffff\1\20\32\uffff\1\20\2\uffff\1\20\12\uffff\1\20\2\uffff"+
			"\1\20\1\uffff\1\20\15\uffff\1\20\1\36\1\20\3\uffff\1\20\1\uffff\1\20"+
			"\6\uffff\1\20\4\uffff\1\20",
			"",
			"",
			"",
			"\1\20\7\uffff\1\20\14\uffff\1\52",
			"\1\57\11\uffff\1\56",
			"\1\20\7\uffff\1\20\14\uffff\1\60",
			"\1\64\5\uffff\1\20\32\uffff\1\20\2\uffff\1\20\12\uffff\1\20\2\uffff"+
			"\1\20\1\uffff\1\20\15\uffff\1\20\1\64\1\20\3\uffff\1\20\1\uffff\1\20"+
			"\6\uffff\1\20\4\uffff\1\20",
			"",
			"",
			"",
			"\1\100\5\uffff\1\20\32\uffff\1\20\2\uffff\1\20\12\uffff\1\20\2\uffff"+
			"\1\20\1\uffff\1\20\15\uffff\1\20\1\100\1\20\3\uffff\1\20\1\uffff\1\20"+
			"\6\uffff\1\20\4\uffff\1\20",
			"",
			"",
			"",
			"\1\114",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA196_eot = DFA.unpackEncodedString(DFA196_eotS);
	static final short[] DFA196_eof = DFA.unpackEncodedString(DFA196_eofS);
	static final char[] DFA196_min = DFA.unpackEncodedStringToUnsignedChars(DFA196_minS);
	static final char[] DFA196_max = DFA.unpackEncodedStringToUnsignedChars(DFA196_maxS);
	static final short[] DFA196_accept = DFA.unpackEncodedString(DFA196_acceptS);
	static final short[] DFA196_special = DFA.unpackEncodedString(DFA196_specialS);
	static final short[][] DFA196_transition;

	static {
		int numStates = DFA196_transitionS.length;
		DFA196_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA196_transition[i] = DFA.unpackEncodedString(DFA196_transitionS[i]);
		}
	}

	protected class DFA196 extends DFA {

		public DFA196(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 196;
			this.eot = DFA196_eot;
			this.eof = DFA196_eof;
			this.min = DFA196_min;
			this.max = DFA196_max;
			this.accept = DFA196_accept;
			this.special = DFA196_special;
			this.transition = DFA196_transition;
		}
		@Override
		public String getDescription() {
			return "426:1: simpleLogicalFilter returns [Filter filter] : ( (a= simpleFilter ) | ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) );";
		}
	}

	static final String DFA224_eotS =
		"\136\uffff";
	static final String DFA224_eofS =
		"\2\3\134\uffff";
	static final String DFA224_minS =
		"\2\4\1\43\7\uffff\1\43\4\uffff\1\43\3\uffff\1\75\1\121\1\uffff\1\43\3"+
		"\uffff\1\75\1\121\4\uffff\1\75\1\121\1\uffff\1\75\1\52\1\121\4\uffff\1"+
		"\75\1\121\1\uffff\1\75\1\52\1\121\1\uffff\1\75\1\52\1\121\1\uffff\2\52"+
		"\1\116\1\uffff\1\75\1\52\1\121\1\uffff\2\52\1\116\1\uffff\2\52\1\116\1"+
		"\uffff\1\52\3\116\25\uffff";
	static final String DFA224_maxS =
		"\1\133\1\132\1\133\7\uffff\1\133\4\uffff\1\127\3\uffff\2\133\1\uffff\1"+
		"\127\3\uffff\2\133\4\uffff\2\133\1\uffff\1\75\1\133\1\121\4\uffff\2\133"+
		"\1\uffff\1\75\1\133\1\121\1\uffff\1\75\1\133\1\121\1\uffff\1\133\1\52"+
		"\1\133\1\uffff\1\75\1\133\1\121\1\uffff\1\133\1\52\1\133\1\uffff\1\133"+
		"\1\52\1\133\1\uffff\1\52\2\133\1\116\25\uffff";
	static final String DFA224_acceptS =
		"\3\uffff\1\2\14\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"+
		"\25\1";
	static final String DFA224_specialS =
		"\136\uffff}>";
	static final String[] DFA224_transitionS = {
			"\1\3\1\2\100\uffff\1\3\7\uffff\1\3\14\uffff\1\1",
			"\1\3\1\12\42\uffff\1\3\12\uffff\1\3\2\uffff\1\3\17\uffff\1\3\5\uffff"+
			"\1\3\1\uffff\1\3\13\uffff\1\3",
			"\1\20\6\uffff\1\22\7\uffff\1\24\6\uffff\1\21\3\uffff\1\3\31\uffff\1"+
			"\23\3\uffff\1\17",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\27\6\uffff\1\31\7\uffff\1\33\6\uffff\1\30\3\uffff\1\3\31\uffff\1"+
			"\32\3\uffff\1\26",
			"",
			"",
			"",
			"",
			"\1\35\6\uffff\1\37\7\uffff\1\41\6\uffff\1\36\3\uffff\1\3\31\uffff\1"+
			"\40",
			"",
			"",
			"",
			"\1\44\35\uffff\1\43",
			"\1\46\11\uffff\1\45",
			"",
			"\1\47\6\uffff\1\51\7\uffff\1\53\6\uffff\1\50\3\uffff\1\3\31\uffff\1"+
			"\52",
			"",
			"",
			"",
			"\1\56\35\uffff\1\55",
			"\1\60\11\uffff\1\57",
			"",
			"",
			"",
			"",
			"\1\62\35\uffff\1\61",
			"\1\64\11\uffff\1\63",
			"",
			"\1\65",
			"\1\67\60\uffff\1\66",
			"\1\70",
			"",
			"",
			"",
			"",
			"\1\72\35\uffff\1\71",
			"\1\74\11\uffff\1\73",
			"",
			"\1\75",
			"\1\77\60\uffff\1\76",
			"\1\100",
			"",
			"\1\101",
			"\1\103\60\uffff\1\102",
			"\1\104",
			"",
			"\1\106\60\uffff\1\105",
			"\1\107",
			"\1\111\14\uffff\1\110",
			"",
			"\1\112",
			"\1\114\60\uffff\1\113",
			"\1\115",
			"",
			"\1\117\60\uffff\1\116",
			"\1\120",
			"\1\122\14\uffff\1\121",
			"",
			"\1\124\60\uffff\1\123",
			"\1\125",
			"\1\127\14\uffff\1\126",
			"",
			"\1\130",
			"\1\132\14\uffff\1\131",
			"\1\134\14\uffff\1\133",
			"\1\135",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA224_eot = DFA.unpackEncodedString(DFA224_eotS);
	static final short[] DFA224_eof = DFA.unpackEncodedString(DFA224_eofS);
	static final char[] DFA224_min = DFA.unpackEncodedStringToUnsignedChars(DFA224_minS);
	static final char[] DFA224_max = DFA.unpackEncodedStringToUnsignedChars(DFA224_maxS);
	static final short[] DFA224_accept = DFA.unpackEncodedString(DFA224_acceptS);
	static final short[] DFA224_special = DFA.unpackEncodedString(DFA224_specialS);
	static final short[][] DFA224_transition;

	static {
		int numStates = DFA224_transitionS.length;
		DFA224_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA224_transition[i] = DFA.unpackEncodedString(DFA224_transitionS[i]);
		}
	}

	protected class DFA224 extends DFA {

		public DFA224(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 224;
			this.eot = DFA224_eot;
			this.eof = DFA224_eof;
			this.min = DFA224_min;
			this.max = DFA224_max;
			this.accept = DFA224_accept;
			this.special = DFA224_special;
			this.transition = DFA224_transition;
		}
		@Override
		public String getDescription() {
			return "535:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
		}
	}

	public static final BitSet FOLLOW_grandQuery_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandInsert_in_program61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandDelete_in_program73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandDrop_in_program85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStmnt_in_grandDelete113 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000060L});
	public static final BitSet FOLLOW_WS_in_grandDelete122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDelete126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDelete132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropStmnt_in_grandDrop164 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000060L});
	public static final BitSet FOLLOW_WS_in_grandDrop173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDrop177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDrop183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStmnt_in_grandInsert214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertHStmnt_in_grandInsert226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertRTStmnt_in_grandInsert238 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000060L});
	public static final BitSet FOLLOW_WS_in_grandInsert247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandInsert251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandInsert257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_deleteStmnt283 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt285 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_FROM_in_deleteStmnt287 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt289 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_deleteStmnt294 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt298 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_WHERE_in_deleteStmnt303 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt305 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_intervalClause_in_deleteStmnt309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_dropStmnt337 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_dropStmnt339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_TABLE_in_dropStmnt341 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_dropStmnt343 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_dropStmnt348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insertStmnt375 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt377 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_INTO_in_insertStmnt379 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt381 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_insertStmnt386 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt391 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt394 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt396 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt399 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt403 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertStmnt406 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt408 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt411 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt419 = new BitSet(new long[]{0x0000001000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt421 = new BitSet(new long[]{0x0000001000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_VALUES_in_insertStmnt434 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt436 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt439 = new BitSet(new long[]{0x0200000800000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt441 = new BitSet(new long[]{0x0200000800000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt447 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt454 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertStmnt457 = new BitSet(new long[]{0x0200000800000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt459 = new BitSet(new long[]{0x0200000800000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt464 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt473 = new BitSet(new long[]{0x0000000000000000L,0x000000000A000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt475 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_FROM_in_insertStmnt492 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt499 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt504 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_WHERE_in_insertStmnt514 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt516 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertStmnt520 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt527 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertStmnt529 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt531 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertStmnt533 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt539 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt553 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_DELIMITER_in_insertStmnt555 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt557 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt560 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt567 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt571 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertStmnt574 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt581 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt590 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_HADOOP_in_insertHStmnt616 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt618 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_INTO_in_insertHStmnt620 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt622 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_insertHStmnt627 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt632 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt635 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt637 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_insertHStmnt640 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt644 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertHStmnt647 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt649 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_insertHStmnt652 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt660 = new BitSet(new long[]{0x0000001000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt662 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_FROM_in_insertHStmnt669 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt676 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt681 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_WHERE_in_insertHStmnt686 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt688 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertHStmnt692 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt699 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertHStmnt701 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt703 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertHStmnt705 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt711 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt726 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_DELIMITER_in_insertHStmnt728 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt730 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt733 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt740 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt744 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertHStmnt747 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt754 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt763 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt765 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARTITION_in_insertHStmnt776 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt778 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt781 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt788 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt790 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertHStmnt793 = new BitSet(new long[]{0x0200000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt795 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LONG_in_insertHStmnt800 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt807 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt809 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ROLLUP_in_insertHStmnt819 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt821 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt824 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt831 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt833 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertHStmnt836 = new BitSet(new long[]{0x0200000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt838 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LONG_in_insertHStmnt843 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt850 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_REALTIME_in_insertRTStmnt875 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt877 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_INTO_in_insertRTStmnt879 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt881 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_insertRTStmnt886 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt891 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt894 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt896 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_insertRTStmnt899 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt903 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertRTStmnt906 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt908 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_insertRTStmnt911 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt919 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt921 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_VALUES_in_insertRTStmnt927 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt929 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt932 = new BitSet(new long[]{0x0200000800000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt934 = new BitSet(new long[]{0x0200000800000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_anyValue_in_insertRTStmnt940 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt947 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_insertRTStmnt950 = new BitSet(new long[]{0x0200000800000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt952 = new BitSet(new long[]{0x0200000800000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_anyValue_in_insertRTStmnt957 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt966 = new BitSet(new long[]{0x0000000000000002L,0x000000000A000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt968 = new BitSet(new long[]{0x0000000000000002L,0x000000000A000000L});
	public static final BitSet FOLLOW_WHERE_in_insertRTStmnt974 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt976 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertRTStmnt980 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt988 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertRTStmnt990 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt992 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertRTStmnt994 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery1034 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000040L});
	public static final BitSet FOLLOW_WS_in_grandQuery1044 = new BitSet(new long[]{0x0048000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_grandQuery1048 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1069 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000008010000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000010L});
	public static final BitSet FOLLOW_WS_in_grandQuery1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_ON_in_grandQuery1093 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1100 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery1103 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1105 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_grandQuery1119 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1121 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery1135 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000040L});
	public static final BitSet FOLLOW_WS_in_grandQuery1154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandQuery1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_queryStmnt1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1208 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_queryStmnt1217 = new BitSet(new long[]{0x1C04060038004000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1219 = new BitSet(new long[]{0x1C04060038004000L,0x0000000000800000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_queryStmnt1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1270 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_FROM_in_queryStmnt1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1293 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1297 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1334 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_queryStmnt_in_queryStmnt1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1344 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_WHERE_in_queryStmnt1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_whereClause_in_queryStmnt1369 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1387 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_queryStmnt1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1391 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1395 = new BitSet(new long[]{0x0000000080000000L,0x0000000000020400L});
	public static final BitSet FOLLOW_granularityClause_in_queryStmnt1399 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1416 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_GROUP_in_queryStmnt1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1420 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1424 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1450 = new BitSet(new long[]{0x0000000000000002L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_queryStmnt1485 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1487 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1492 = new BitSet(new long[]{0x0000000000000002L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1549 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_HAVING_in_queryStmnt1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1553 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_havingClause_in_queryStmnt1557 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_ORDER_in_queryStmnt1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1605 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1609 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1614 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1647 = new BitSet(new long[]{0x0000000004000080L});
	public static final BitSet FOLLOW_set_in_queryStmnt1651 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1701 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LIMIT_in_queryStmnt1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1705 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LONG_in_queryStmnt1710 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_THEN_in_queryStmnt1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1752 = new BitSet(new long[]{0x2204040800000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_postAggItem_in_queryStmnt1756 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1761 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_queryStmnt1764 = new BitSet(new long[]{0x2204040800000000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1766 = new BitSet(new long[]{0x2204040800000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_postAggItem_in_queryStmnt1771 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_WHICH_in_queryStmnt1791 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1793 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CONTAINS_in_queryStmnt1795 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1799 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_queryStmnt1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_SORT_in_queryStmnt1842 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1844 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1863 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1875 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_HINT_in_queryStmnt1877 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1879 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_anyValue1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggItem_in_selectItems1961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDim_in_selectItems1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleDim1992 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1995 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_simpleDim1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1999 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_simpleDim2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intervalClause_in_whereClause2026 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_whereClause2031 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_whereClause2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_whereClause2035 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_grandFilter_in_whereClause2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_intervalClause2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2067 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BETWEEN_in_intervalClause2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2071 = new BitSet(new long[]{0x2000000000FF8000L,0x0000000000020000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2102 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_intervalClause2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2106 = new BitSet(new long[]{0x0000000000FF8000L,0x0000000000020000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause2111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_intervalClause2144 = new BitSet(new long[]{0x4000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2146 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_intervalClause2166 = new BitSet(new long[]{0x4000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2168 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_intervalClause2182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_getEquals2205 = new BitSet(new long[]{0x0000000100000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_getEquals2207 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_EQUALS_in_getEquals2210 = new BitSet(new long[]{0x0200000800000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_getEquals2212 = new BitSet(new long[]{0x0200000800000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_set_in_getEquals2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_granularityClause2281 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2283 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2297 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_94_in_granularityClause2301 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_granularityClause2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_granularityClause2354 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2356 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2366 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2370 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_94_in_granularityClause2374 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_94_in_granularityClause2391 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_granularityClause2410 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause2426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2454 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_INCLUDE_in_granularityInclude2456 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2458 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityInclude2461 = new BitSet(new long[]{0x4000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2463 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude2469 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_94_in_granularityInclude2474 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude2478 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_granularityInclude2488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairNums2507 = new BitSet(new long[]{0x0200000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_pairNums2509 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums2514 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_pairNums2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_pairNums2520 = new BitSet(new long[]{0x0200000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_pairNums2522 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000008008000L});
	public static final BitSet FOLLOW_WS_in_pairNums2529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RSQUARE_in_pairNums2532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairString2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_pairString2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_WS_in_pairString2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_pairString2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_pairString2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000008008000L});
	public static final BitSet FOLLOW_WS_in_pairString2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RSQUARE_in_pairString2577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_havingClause2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleHaving2623 = new BitSet(new long[]{0x0000000000001000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2625 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2630 = new BitSet(new long[]{0x0200000800000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2632 = new BitSet(new long[]{0x0200000800000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving2637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_simpleHaving2654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleHaving2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2667 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_simpleHaving2671 = new BitSet(new long[]{0x0000000000001000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2673 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2678 = new BitSet(new long[]{0x0200000800000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2680 = new BitSet(new long[]{0x0200000800000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving2685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving2714 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2720 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_complexHaving2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2730 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_complexHaving2759 = new BitSet(new long[]{0x2000040000000000L,0x0000000008000002L});
	public static final BitSet FOLLOW_WS_in_complexHaving2761 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2772 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_complexHaving2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2782 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_complexHaving2811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiGrandFilter_in_grandFilter2831 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2836 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_grandFilter2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2846 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_semiGrandFilter_in_grandFilter2850 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_semiGrandFilter2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_semiGrandFilter2888 = new BitSet(new long[]{0x2000040000000000L,0x0000000008000002L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2890 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_semiGrandFilter_in_semiGrandFilter2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2901 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_semiGrandFilter2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2911 = new BitSet(new long[]{0x2000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_semiGrandFilter_in_semiGrandFilter2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_semiGrandFilter2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2967 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_simpleLogicalFilter2971 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2977 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2991 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter3028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inFilter_in_simpleFilter3034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_selectorFilter3059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_regexFilter3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_regexFilter3090 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LIKE_in_regexFilter3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_regexFilter3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter3100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_inFilter3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_inFilter3132 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_IN_in_inFilter3134 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_inFilter3136 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_inFilter3138 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_inFilter3140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_inFilter3146 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_inFilter3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_inFilter3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_inFilter3163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_inFilter3169 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_inFilter3187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_inFilter3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggCallSite_in_aggItem3219 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_aggItem3223 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_aggItem3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_aggItem3227 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_aggItem3231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggFunc_in_aggCallSite3250 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3255 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_aggCallSite3258 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3260 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3273 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_aggCallSite3276 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3278 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite3283 = new BitSet(new long[]{0x0000000000000000L,0x0000000048004000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_aggCallSite3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggCallSite3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_aggCallSite3304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_SUM_in_aggFunc3322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc3329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_aggFunc3336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPER_UNIQUE_in_aggFunc3343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_MIN_in_aggFunc3350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_MAX_in_aggFunc3357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_MIN_in_aggFunc3364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_MAX_in_aggFunc3371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc3378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArith_in_postAggItem3406 = new BitSet(new long[]{0x0000000000000022L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3410 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3413 = new BitSet(new long[]{0x2204040800000000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3416 = new BitSet(new long[]{0x2204040800000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_postAggItem3439 = new BitSet(new long[]{0x2204040800000000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3441 = new BitSet(new long[]{0x2204040800000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3446 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_postAggItem3451 = new BitSet(new long[]{0x0000000000000062L,0x0000000008000000L});
	public static final BitSet FOLLOW_postAggLabel_in_postAggItem3455 = new BitSet(new long[]{0x0000000000000022L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3461 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3464 = new BitSet(new long[]{0x2204040800000000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3467 = new BitSet(new long[]{0x2204040800000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3508 = new BitSet(new long[]{0x0000000000000022L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_simpleArith3514 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_simpleArith3517 = new BitSet(new long[]{0x0204040800000000L,0x0000000008800000L});
	public static final BitSet FOLLOW_WS_in_simpleArith3520 = new BitSet(new long[]{0x0204040800000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess3554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess3571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constantAccess3623 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LONG_in_constantAccess3629 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_constantAccess3642 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_constantAccess3644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldAccess3672 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_fieldAccess3675 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_fieldAccess3677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality3706 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3708 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality3711 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3713 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality3718 = new BitSet(new long[]{0x0000000000000000L,0x0000000008004000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality3723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3749 = new BitSet(new long[]{0x0000000000000000L,0x0000000008020000L});
	public static final BitSet FOLLOW_WS_in_postAggJavascriptDef3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_postAggLabel3772 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_WS_in_postAggLabel3774 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_postAggLabel3778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper3794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_ONLY_in_isoTime3813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_isoTime3829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_in_isoTime3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime3845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3877 = new BitSet(new long[]{0x0000000000000002L});
}
