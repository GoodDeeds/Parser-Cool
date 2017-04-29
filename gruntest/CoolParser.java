// Generated from CoolParser.g4 by ANTLR 4.5.3

	import cool.AST;
	import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, INT_ERROR=43, STRAY_COMMENT=44, 
		WHITESPACE=45, STR_START=46, COMMENT_START=47, SINGLE_LINE_COMMENT=48, 
		INCORRECT_CHARACTERS=49, STRING_END=50, NEWLINE=51, F_EOF_STR=52, STRING_BODY_WITH_NULL=53, 
		COMMENT_START_CM=54, COMMENT_END=55, EOF_F=56, ANYTHING=57;
	public static final int
		RULE_program = 0, RULE_class_list = 1, RULE_class_s = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_expr = 5;
	public static final String[] ruleNames = {
		"program", "class_list", "class_s", "feature", "formal", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "INT_ERROR", "STRAY_COMMENT", "WHITESPACE", "STR_START", "COMMENT_START", 
		"SINGLE_LINE_COMMENT", "INCORRECT_CHARACTERS", "STRING_END", "NEWLINE", 
		"F_EOF_STR", "STRING_BODY_WITH_NULL", "COMMENT_START_CM", "COMMENT_END", 
		"EOF_F", "ANYTHING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		String filename;
		public void setFilename(String f){
			filename = f;
		}

	/*
		DO NOT EDIT THE FILE ABOVE THIS LINE
		Add member functions, variables below.
	*/


	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			class_list();
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_listContext extends ParserRuleContext {
		public List<Class_sContext> class_s() {
			return getRuleContexts(Class_sContext.class);
		}
		public Class_sContext class_s(int i) {
			return getRuleContext(Class_sContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClass_list(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				class_s();
				setState(16);
				match(SEMICOLON);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_sContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(CoolParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolParser.TYPEID, i);
		}
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public Class_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClass_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClass_s(this);
		}
	}

	public final Class_sContext class_s() throws RecognitionException {
		Class_sContext _localctx = new Class_sContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(CLASS);
			setState(23);
			match(TYPEID);
			setState(26);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(24);
				match(INHERITS);
				setState(25);
				match(TYPEID);
				}
			}

			setState(28);
			match(LBRACE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(29);
				feature();
				setState(30);
				match(SEMICOLON);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(OBJECTID);
				setState(40);
				match(LPAREN);
				setState(49);
				_la = _input.LA(1);
				if (_la==OBJECTID) {
					{
					setState(41);
					formal();
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(42);
						match(COMMA);
						setState(43);
						formal();
						}
						}
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(51);
				match(RPAREN);
				setState(52);
				match(COLON);
				setState(53);
				match(TYPEID);
				setState(54);
				match(LBRACE);
				setState(55);
				expr(0);
				setState(56);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(OBJECTID);
				setState(59);
				match(COLON);
				setState(60);
				match(TYPEID);
				setState(63);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(61);
					match(ASSIGN);
					setState(62);
					expr(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OBJECTID);
			setState(68);
			match(COLON);
			setState(69);
			match(TYPEID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> OBJECTID() { return getTokens(CoolParser.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(CoolParser.OBJECTID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CoolParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CoolParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public List<TerminalNode> COLON() { return getTokens(CoolParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolParser.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(CoolParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolParser.TYPEID, i);
		}
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<TerminalNode> DARROW() { return getTokens(CoolParser.DARROW); }
		public TerminalNode DARROW(int i) {
			return getToken(CoolParser.DARROW, i);
		}
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public TerminalNode TILDE() { return getToken(CoolParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public TerminalNode INT_CONST() { return getToken(CoolParser.INT_CONST, 0); }
		public TerminalNode STR_CONST() { return getToken(CoolParser.STR_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(CoolParser.BOOL_CONST, 0); }
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(CoolParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CoolParser.SLASH, 0); }
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public TerminalNode EQUALS() { return getToken(CoolParser.EQUALS, 0); }
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public TerminalNode ATSYM() { return getToken(CoolParser.ATSYM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(72);
				match(OBJECTID);
				setState(73);
				match(ASSIGN);
				setState(74);
				expr(24);
				}
				break;
			case 2:
				{
				setState(75);
				match(OBJECTID);
				setState(76);
				match(LPAREN);
				setState(85);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << IF) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT))) != 0)) {
					{
					setState(77);
					expr(0);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(78);
						match(COMMA);
						setState(79);
						expr(0);
						}
						}
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(87);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(88);
				match(IF);
				setState(89);
				expr(0);
				setState(90);
				match(THEN);
				setState(91);
				expr(0);
				setState(92);
				match(ELSE);
				setState(93);
				expr(0);
				setState(94);
				match(FI);
				}
				break;
			case 4:
				{
				setState(96);
				match(WHILE);
				setState(97);
				expr(0);
				setState(98);
				match(LOOP);
				setState(99);
				expr(0);
				setState(100);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(102);
				match(LBRACE);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					expr(0);
					setState(104);
					match(SEMICOLON);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << IF) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT))) != 0) );
				setState(110);
				match(RBRACE);
				}
				break;
			case 6:
				{
				setState(112);
				match(LET);
				setState(113);
				match(OBJECTID);
				setState(114);
				match(COLON);
				setState(115);
				match(TYPEID);
				setState(118);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(116);
					match(ASSIGN);
					setState(117);
					expr(0);
					}
				}

				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					match(OBJECTID);
					setState(122);
					match(COLON);
					setState(123);
					match(TYPEID);
					setState(126);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(124);
						match(ASSIGN);
						setState(125);
						expr(0);
						}
					}

					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(IN);
				setState(134);
				expr(18);
				}
				break;
			case 7:
				{
				setState(135);
				match(CASE);
				setState(136);
				expr(0);
				setState(137);
				match(OF);
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(OBJECTID);
					setState(139);
					match(COLON);
					setState(140);
					match(TYPEID);
					setState(141);
					match(DARROW);
					setState(142);
					expr(0);
					setState(143);
					match(COMMA);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(149);
				match(ESAC);
				}
				break;
			case 8:
				{
				setState(151);
				match(NEW);
				setState(152);
				match(TYPEID);
				}
				break;
			case 9:
				{
				setState(153);
				match(ISVOID);
				setState(154);
				expr(15);
				}
				break;
			case 10:
				{
				setState(155);
				match(TILDE);
				setState(156);
				expr(10);
				}
				break;
			case 11:
				{
				setState(157);
				match(NOT);
				setState(158);
				expr(6);
				}
				break;
			case 12:
				{
				setState(159);
				match(LPAREN);
				setState(160);
				expr(0);
				setState(161);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(163);
				match(OBJECTID);
				}
				break;
			case 14:
				{
				setState(164);
				match(INT_CONST);
				}
				break;
			case 15:
				{
				setState(165);
				match(STR_CONST);
				}
				break;
			case 16:
				{
				setState(166);
				match(BOOL_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(170);
						match(PLUS);
						setState(171);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(173);
						match(MINUS);
						setState(174);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(176);
						match(STAR);
						setState(177);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(179);
						match(SLASH);
						setState(180);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(182);
						match(LT);
						setState(183);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(185);
						match(LE);
						setState(186);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						match(EQUALS);
						setState(189);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(193);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(191);
							match(ATSYM);
							setState(192);
							match(TYPEID);
							}
						}

						setState(195);
						match(DOT);
						setState(196);
						match(OBJECTID);
						setState(197);
						match(LPAREN);
						setState(206);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << IF) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT))) != 0)) {
							{
							setState(198);
							expr(0);
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(199);
								match(COMMA);
								setState(200);
								expr(0);
								}
								}
								setState(205);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(208);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\6\3\25"+
		"\n\3\r\3\16\3\26\3\4\3\4\3\4\3\4\5\4\35\n\4\3\4\3\4\3\4\3\4\7\4#\n\4\f"+
		"\4\16\4&\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\5"+
		"\5\64\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\5\5"+
		"D\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7\f\7"+
		"\16\7V\13\7\5\7X\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7m\n\7\r\7\16\7n\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7y\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\7\7\u0083\n\7"+
		"\f\7\16\7\u0086\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6"+
		"\7\u0094\n\7\r\7\16\7\u0095\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00c4\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cc\n\7\f\7\16\7\u00cf\13"+
		"\7\5\7\u00d1\n\7\3\7\7\7\u00d4\n\7\f\7\16\7\u00d7\13\7\3\7\2\3\f\b\2\4"+
		"\6\b\n\f\2\2\u00fa\2\16\3\2\2\2\4\24\3\2\2\2\6\30\3\2\2\2\bC\3\2\2\2\n"+
		"E\3\2\2\2\f\u00a9\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21"+
		"\22\5\6\4\2\22\23\7\r\2\2\23\25\3\2\2\2\24\21\3\2\2\2\25\26\3\2\2\2\26"+
		"\24\3\2\2\2\26\27\3\2\2\2\27\5\3\2\2\2\30\31\7\34\2\2\31\34\7\4\2\2\32"+
		"\33\7!\2\2\33\35\7\4\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36"+
		"$\7\26\2\2\37 \5\b\5\2 !\7\r\2\2!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\27\2\2(\7\3\2\2\2)*\7\5\2\2"+
		"*\63\7\t\2\2+\60\5\n\6\2,-\7\16\2\2-/\5\n\6\2.,\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63+\3\2\2\2\63\64"+
		"\3\2\2\2\64\65\3\2\2\2\65\66\7\n\2\2\66\67\7\13\2\2\678\7\4\2\289\7\26"+
		"\2\29:\5\f\7\2:;\7\27\2\2;D\3\2\2\2<=\7\5\2\2=>\7\13\2\2>A\7\4\2\2?@\7"+
		"\33\2\2@B\5\f\7\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C)\3\2\2\2C<\3\2\2\2D\t"+
		"\3\2\2\2EF\7\5\2\2FG\7\13\2\2GH\7\4\2\2H\13\3\2\2\2IJ\b\7\1\2JK\7\5\2"+
		"\2KL\7\33\2\2L\u00aa\5\f\7\32MN\7\5\2\2NW\7\t\2\2OT\5\f\7\2PQ\7\16\2\2"+
		"QS\5\f\7\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"WO\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y\u00aa\7\n\2\2Z[\7\37\2\2[\\\5\f\7\2\\"+
		"]\7%\2\2]^\5\f\7\2^_\7\35\2\2_`\5\f\7\2`a\7\36\2\2a\u00aa\3\2\2\2bc\7"+
		"&\2\2cd\5\f\7\2de\7#\2\2ef\5\f\7\2fg\7$\2\2g\u00aa\3\2\2\2hl\7\26\2\2"+
		"ij\5\f\7\2jk\7\r\2\2km\3\2\2\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"op\3\2\2\2pq\7\27\2\2q\u00aa\3\2\2\2rs\7\"\2\2st\7\5\2\2tu\7\13\2\2ux"+
		"\7\4\2\2vw\7\33\2\2wy\5\f\7\2xv\3\2\2\2xy\3\2\2\2y\u0084\3\2\2\2z{\7\16"+
		"\2\2{|\7\5\2\2|}\7\13\2\2}\u0080\7\4\2\2~\177\7\33\2\2\177\u0081\5\f\7"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082z\3\2\2"+
		"\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7 \2\2\u0088\u00aa\5\f\7\24\u0089"+
		"\u008a\7\'\2\2\u008a\u008b\5\f\7\2\u008b\u0093\7)\2\2\u008c\u008d\7\5"+
		"\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\4\2\2\u008f\u0090\7\31\2\2\u0090"+
		"\u0091\5\f\7\2\u0091\u0092\7\16\2\2\u0092\u0094\3\2\2\2\u0093\u008c\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7(\2\2\u0098\u00aa\3\2\2\2\u0099\u009a\7*\2"+
		"\2\u009a\u00aa\7\4\2\2\u009b\u009c\7+\2\2\u009c\u00aa\5\f\7\21\u009d\u009e"+
		"\7\23\2\2\u009e\u00aa\5\f\7\f\u009f\u00a0\7,\2\2\u00a0\u00aa\5\f\7\b\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\n\2\2\u00a4\u00aa\3\2"+
		"\2\2\u00a5\u00aa\7\5\2\2\u00a6\u00aa\7\7\2\2\u00a7\u00aa\7\b\2\2\u00a8"+
		"\u00aa\7\6\2\2\u00a9I\3\2\2\2\u00a9M\3\2\2\2\u00a9Z\3\2\2\2\u00a9b\3\2"+
		"\2\2\u00a9h\3\2\2\2\u00a9r\3\2\2\2\u00a9\u0089\3\2\2\2\u00a9\u0099\3\2"+
		"\2\2\u00a9\u009b\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00d5\3\2\2\2\u00ab\u00ac\f\20\2\2\u00ac"+
		"\u00ad\7\17\2\2\u00ad\u00d4\5\f\7\21\u00ae\u00af\f\17\2\2\u00af\u00b0"+
		"\7\20\2\2\u00b0\u00d4\5\f\7\20\u00b1\u00b2\f\16\2\2\u00b2\u00b3\7\21\2"+
		"\2\u00b3\u00d4\5\f\7\17\u00b4\u00b5\f\r\2\2\u00b5\u00b6\7\22\2\2\u00b6"+
		"\u00d4\5\f\7\16\u00b7\u00b8\f\13\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00d4"+
		"\5\f\7\f\u00ba\u00bb\f\n\2\2\u00bb\u00bc\7\32\2\2\u00bc\u00d4\5\f\7\13"+
		"\u00bd\u00be\f\t\2\2\u00be\u00bf\7\25\2\2\u00bf\u00d4\5\f\7\n\u00c0\u00c3"+
		"\f\31\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c4\7\4\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7"+
		"\7\5\2\2\u00c7\u00d0\7\t\2\2\u00c8\u00cd\5\f\7\2\u00c9\u00ca\7\16\2\2"+
		"\u00ca\u00cc\5\f\7\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\n"+
		"\2\2\u00d3\u00ab\3\2\2\2\u00d3\u00ae\3\2\2\2\u00d3\u00b1\3\2\2\2\u00d3"+
		"\u00b4\3\2\2\2\u00d3\u00b7\3\2\2\2\u00d3\u00ba\3\2\2\2\u00d3\u00bd\3\2"+
		"\2\2\u00d3\u00c0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\r\3\2\2\2\u00d7\u00d5\3\2\2\2\26\26\34$\60\63ACT"+
		"Wnx\u0080\u0084\u0095\u00a9\u00c3\u00cd\u00d0\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}