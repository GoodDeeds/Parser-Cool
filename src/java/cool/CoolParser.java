// Generated from CoolParser.g4 by ANTLR 4.5
package cool;

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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WS=43, THEEND=44, SINGLE_COMMENT=45, 
		COMMENT_CLOSE=46, CLOSED=47, COM_EOF=48, NEWLINE=49, ESC=50, ESC_NULL=51, 
		STR_EOF=52, ERR1=53, ERR2=54, ERR3=55, LQUOTE=56, NL=57, TAB=58, BACKSPAC=59, 
		LINEFEED=60, SLASHN=61, ESC_NL=62;
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
		null, null, "'*)'", null, null, null, null, null, null, null, null, null, 
		null, null, "'\\t'", "'\\b'", "'\\f'", "'\\n'", "'\\\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "WS", "THEEND", "SINGLE_COMMENT", "COMMENT_CLOSE", "CLOSED", "COM_EOF", 
		"NEWLINE", "ESC", "ESC_NULL", "STR_EOF", "ERR1", "ERR2", "ERR3", "LQUOTE", 
		"NL", "TAB", "BACKSPAC", "LINEFEED", "SLASHN", "ESC_NL"
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
		public AST.program value;
		public Class_listContext cl;
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ProgramContext)_localctx).cl = class_list();
			setState(13);
			match(EOF);

											((ProgramContext)_localctx).value =  null;
										
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClass_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				class_s();
				setState(17);
				match(SEMICOLON);
				}
				}
				setState(21); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClass_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_sContext class_s() throws RecognitionException {
		Class_sContext _localctx = new Class_sContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(CLASS);
			setState(24);
			match(TYPEID);
			setState(27);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(25);
				match(INHERITS);
				setState(26);
				match(TYPEID);
				}
			}

			setState(29);
			match(LBRACE);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(30);
				feature();
				setState(31);
				match(SEMICOLON);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(OBJECTID);
				setState(41);
				match(LPAREN);
				setState(50);
				_la = _input.LA(1);
				if (_la==OBJECTID) {
					{
					setState(42);
					formal();
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(43);
						match(COMMA);
						setState(44);
						formal();
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(52);
				match(RPAREN);
				setState(53);
				match(COLON);
				setState(54);
				match(TYPEID);
				setState(55);
				match(LBRACE);
				setState(56);
				expr(0);
				setState(57);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(OBJECTID);
				setState(60);
				match(COLON);
				setState(61);
				match(TYPEID);
				setState(64);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(62);
					match(ASSIGN);
					setState(63);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(OBJECTID);
			setState(69);
			match(COLON);
			setState(70);
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
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public TerminalNode TILDE() { return getToken(CoolParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
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
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<TerminalNode> DARROW() { return getTokens(CoolParser.DARROW); }
		public TerminalNode DARROW(int i) {
			return getToken(CoolParser.DARROW, i);
		}
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(73);
				match(OBJECTID);
				setState(74);
				match(ASSIGN);
				setState(75);
				expr(24);
				}
				break;
			case 2:
				{
				setState(76);
				match(LET);
				setState(77);
				match(OBJECTID);
				setState(78);
				match(COLON);
				setState(79);
				match(TYPEID);
				setState(82);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(80);
					match(ASSIGN);
					setState(81);
					expr(0);
					}
				}

				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					match(OBJECTID);
					setState(86);
					match(COLON);
					setState(87);
					match(TYPEID);
					setState(90);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(88);
						match(ASSIGN);
						setState(89);
						expr(0);
						}
					}

					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(IN);
				setState(98);
				expr(18);
				}
				break;
			case 3:
				{
				setState(99);
				match(ISVOID);
				setState(100);
				expr(15);
				}
				break;
			case 4:
				{
				setState(101);
				match(TILDE);
				setState(102);
				expr(10);
				}
				break;
			case 5:
				{
				setState(103);
				match(NOT);
				setState(104);
				expr(6);
				}
				break;
			case 6:
				{
				setState(105);
				match(OBJECTID);
				setState(106);
				match(LPAREN);
				setState(115);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << IF) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT))) != 0)) {
					{
					setState(107);
					expr(0);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(108);
						match(COMMA);
						setState(109);
						expr(0);
						}
						}
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(117);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(118);
				match(IF);
				setState(119);
				expr(0);
				setState(120);
				match(THEN);
				setState(121);
				expr(0);
				setState(122);
				match(ELSE);
				setState(123);
				expr(0);
				setState(124);
				match(FI);
				}
				break;
			case 8:
				{
				setState(126);
				match(WHILE);
				setState(127);
				expr(0);
				setState(128);
				match(LOOP);
				setState(129);
				expr(0);
				setState(130);
				match(POOL);
				}
				break;
			case 9:
				{
				setState(132);
				match(LBRACE);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					expr(0);
					setState(134);
					match(SEMICOLON);
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << IF) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT))) != 0) );
				setState(140);
				match(RBRACE);
				}
				break;
			case 10:
				{
				setState(142);
				match(CASE);
				setState(143);
				expr(0);
				setState(144);
				match(OF);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					match(OBJECTID);
					setState(146);
					match(COLON);
					setState(147);
					match(TYPEID);
					setState(148);
					match(DARROW);
					setState(149);
					expr(0);
					setState(150);
					match(SEMICOLON);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(156);
				match(ESAC);
				}
				break;
			case 11:
				{
				setState(158);
				match(NEW);
				setState(159);
				match(TYPEID);
				}
				break;
			case 12:
				{
				setState(160);
				match(LPAREN);
				setState(161);
				expr(0);
				setState(162);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(164);
				match(OBJECTID);
				}
				break;
			case 14:
				{
				setState(165);
				match(INT_CONST);
				}
				break;
			case 15:
				{
				setState(166);
				match(STR_CONST);
				}
				break;
			case 16:
				{
				setState(167);
				match(BOOL_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(171);
						match(PLUS);
						setState(172);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(174);
						match(MINUS);
						setState(175);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(177);
						match(STAR);
						setState(178);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(180);
						match(SLASH);
						setState(181);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(183);
						match(LT);
						setState(184);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(186);
						match(LE);
						setState(187);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(189);
						match(EQUALS);
						setState(190);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(194);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(192);
							match(ATSYM);
							setState(193);
							match(TYPEID);
							}
						}

						setState(196);
						match(DOT);
						setState(197);
						match(OBJECTID);
						setState(198);
						match(LPAREN);
						setState(207);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJECTID) | (1L << BOOL_CONST) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << LPAREN) | (1L << TILDE) | (1L << LBRACE) | (1L << IF) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT))) != 0)) {
							{
							setState(199);
							expr(0);
							setState(204);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(200);
								match(COMMA);
								setState(201);
								expr(0);
								}
								}
								setState(206);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(209);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(214);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3"+
		"\26\n\3\r\3\16\3\27\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\7\4$\n"+
		"\4\f\4\16\4\'\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63"+
		"\13\5\5\5\65\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C"+
		"\n\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7U\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\7\7_\n\7\f\7\16\7b\13\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13"+
		"\7\5\7v\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\6\7\u008b\n\7\r\7\16\7\u008c\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u009b\n\7\r\7\16\7\u009c\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ab\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00c5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cd\n\7\f\7\16\7\u00d0"+
		"\13\7\5\7\u00d2\n\7\3\7\7\7\u00d5\n\7\f\7\16\7\u00d8\13\7\3\7\2\3\f\b"+
		"\2\4\6\b\n\f\2\2\u00fb\2\16\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\bD\3\2\2"+
		"\2\nF\3\2\2\2\f\u00aa\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\21\b\2\1"+
		"\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\7\r\2\2\24\26\3\2\2\2\25\22\3\2\2"+
		"\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\32\7\34\2"+
		"\2\32\35\7\4\2\2\33\34\7!\2\2\34\36\7\4\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36\37\3\2\2\2\37%\7\26\2\2 !\5\b\5\2!\"\7\r\2\2\"$\3\2\2\2# \3\2\2"+
		"\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\27\2\2)\7\3"+
		"\2\2\2*+\7\5\2\2+\64\7\t\2\2,\61\5\n\6\2-.\7\16\2\2.\60\5\n\6\2/-\3\2"+
		"\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2"+
		"\2\64,\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\n\2\2\678\7\13\2\2"+
		"89\7\4\2\29:\7\26\2\2:;\5\f\7\2;<\7\27\2\2<E\3\2\2\2=>\7\5\2\2>?\7\13"+
		"\2\2?B\7\4\2\2@A\7\33\2\2AC\5\f\7\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D*\3"+
		"\2\2\2D=\3\2\2\2E\t\3\2\2\2FG\7\5\2\2GH\7\13\2\2HI\7\4\2\2I\13\3\2\2\2"+
		"JK\b\7\1\2KL\7\5\2\2LM\7\33\2\2M\u00ab\5\f\7\32NO\7\"\2\2OP\7\5\2\2PQ"+
		"\7\13\2\2QT\7\4\2\2RS\7\33\2\2SU\5\f\7\2TR\3\2\2\2TU\3\2\2\2U`\3\2\2\2"+
		"VW\7\16\2\2WX\7\5\2\2XY\7\13\2\2Y\\\7\4\2\2Z[\7\33\2\2[]\5\f\7\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]_\3\2\2\2^V\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac"+
		"\3\2\2\2b`\3\2\2\2cd\7 \2\2d\u00ab\5\f\7\24ef\7+\2\2f\u00ab\5\f\7\21g"+
		"h\7\23\2\2h\u00ab\5\f\7\fij\7,\2\2j\u00ab\5\f\7\bkl\7\5\2\2lu\7\t\2\2"+
		"mr\5\f\7\2no\7\16\2\2oq\5\f\7\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2um\3\2\2\2uv\3\2\2\2vw\3\2\2\2w\u00ab\7\n\2\2xy"+
		"\7\37\2\2yz\5\f\7\2z{\7%\2\2{|\5\f\7\2|}\7\35\2\2}~\5\f\7\2~\177\7\36"+
		"\2\2\177\u00ab\3\2\2\2\u0080\u0081\7&\2\2\u0081\u0082\5\f\7\2\u0082\u0083"+
		"\7#\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7$\2\2\u0085\u00ab\3\2\2\2\u0086"+
		"\u008a\7\26\2\2\u0087\u0088\5\f\7\2\u0088\u0089\7\r\2\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0087\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\27\2\2\u008f\u00ab\3"+
		"\2\2\2\u0090\u0091\7\'\2\2\u0091\u0092\5\f\7\2\u0092\u009a\7)\2\2\u0093"+
		"\u0094\7\5\2\2\u0094\u0095\7\13\2\2\u0095\u0096\7\4\2\2\u0096\u0097\7"+
		"\31\2\2\u0097\u0098\5\f\7\2\u0098\u0099\7\r\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0093\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7(\2\2\u009f\u00ab\3\2\2\2\u00a0"+
		"\u00a1\7*\2\2\u00a1\u00ab\7\4\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5\f"+
		"\7\2\u00a4\u00a5\7\n\2\2\u00a5\u00ab\3\2\2\2\u00a6\u00ab\7\5\2\2\u00a7"+
		"\u00ab\7\7\2\2\u00a8\u00ab\7\b\2\2\u00a9\u00ab\7\6\2\2\u00aaJ\3\2\2\2"+
		"\u00aaN\3\2\2\2\u00aae\3\2\2\2\u00aag\3\2\2\2\u00aai\3\2\2\2\u00aak\3"+
		"\2\2\2\u00aax\3\2\2\2\u00aa\u0080\3\2\2\2\u00aa\u0086\3\2\2\2\u00aa\u0090"+
		"\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00d6\3\2"+
		"\2\2\u00ac\u00ad\f\20\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00d5\5\f\7\21\u00af"+
		"\u00b0\f\17\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00d5\5\f\7\20\u00b2\u00b3"+
		"\f\16\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00d5\5\f\7\17\u00b5\u00b6\f\r\2"+
		"\2\u00b6\u00b7\7\22\2\2\u00b7\u00d5\5\f\7\16\u00b8\u00b9\f\13\2\2\u00b9"+
		"\u00ba\7\24\2\2\u00ba\u00d5\5\f\7\f\u00bb\u00bc\f\n\2\2\u00bc\u00bd\7"+
		"\32\2\2\u00bd\u00d5\5\f\7\13\u00be\u00bf\f\t\2\2\u00bf\u00c0\7\25\2\2"+
		"\u00c0\u00d5\5\f\7\n\u00c1\u00c4\f\31\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c5"+
		"\7\4\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\7\30\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00d1\7\t\2\2\u00c9\u00ce\5"+
		"\f\7\2\u00ca\u00cb\7\16\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\7\n\2\2\u00d4\u00ac\3\2\2\2\u00d4\u00af\3\2"+
		"\2\2\u00d4\u00b2\3\2\2\2\u00d4\u00b5\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4"+
		"\u00bb\3\2\2\2\u00d4\u00be\3\2\2\2\u00d4\u00c1\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\r\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\26\27\35%\61\64BDT\\`ru\u008c\u009c\u00aa\u00c4\u00ce\u00d1\u00d4"+
		"\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}