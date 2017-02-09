// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/jambda\Shambda.g4 by ANTLR 4.6
package org.jglr.shambda.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShambdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, FLOAT_TERMINATOR=19, LONG_TERMINATOR=20, DOUBLE_SEMI_COLON=21, 
		SEMI_COLON=22, DIGIT=23, PERIOD=24, PLUS=25, MINUS=26, MULTIPLY=27, DIVISION=28, 
		COLON=29, LEFT_PAREN=30, RIGHT_PAREN=31, SMALL_ARROW=32, ASSIGN_SIGN=33, 
		EQUAL_SIGN=34, LOWERCASE_LETTER=35, UPPERCASE_LETTER=36, STAR=37, WHITESPACE=38, 
		Identifier=39;
	public static final int
		RULE_file = 0, RULE_constantDeclaration = 1, RULE_uniformDeclaration = 2, 
		RULE_functionDeclaration = 3, RULE_functionBody = 4, RULE_integer = 5, 
		RULE_unsignedInteger = 6, RULE_unsignedLong = 7, RULE_longNumber = 8, 
		RULE_doubleNumber = 9, RULE_floatingPointNumber = 10, RULE_constantExpression = 11, 
		RULE_expression = 12, RULE_dereference = 13, RULE_statement = 14, RULE_variableAssignment = 15, 
		RULE_variableDeclaration = 16, RULE_functionCall = 17, RULE_type = 18, 
		RULE_storageClass = 19, RULE_parameter = 20;
	public static final String[] ruleNames = {
		"file", "constantDeclaration", "uniformDeclaration", "functionDeclaration", 
		"functionBody", "integer", "unsignedInteger", "unsignedLong", "longNumber", 
		"doubleNumber", "floatingPointNumber", "constantExpression", "expression", 
		"dereference", "statement", "variableAssignment", "variableDeclaration", 
		"functionCall", "type", "storageClass", "parameter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'constant'", "'uniform'", "'u'", "'d'", "'!'", "'let'", "'UniformConstant'", 
		"'Input'", "'Uniform'", "'Output'", "'Workgroup'", "'CrossWorkgroup'", 
		"'Private'", "'Function'", "'Generic'", "'PushConstant'", "'AtomicCounter'", 
		"'Image'", "'f'", "'L'", "';;'", "';'", null, "'.'", "'+'", "'-'", "'*'", 
		"'/'", "':'", "'('", "')'", "'->'", "':='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "FLOAT_TERMINATOR", "LONG_TERMINATOR", 
		"DOUBLE_SEMI_COLON", "SEMI_COLON", "DIGIT", "PERIOD", "PLUS", "MINUS", 
		"MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", "SMALL_ARROW", 
		"ASSIGN_SIGN", "EQUAL_SIGN", "LOWERCASE_LETTER", "UPPERCASE_LETTER", "STAR", 
		"WHITESPACE", "Identifier"
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
	public String getGrammarFileName() { return "Shambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShambdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<UniformDeclarationContext> uniformDeclaration() {
			return getRuleContexts(UniformDeclarationContext.class);
		}
		public UniformDeclarationContext uniformDeclaration(int i) {
			return getRuleContext(UniformDeclarationContext.class,i);
		}
		public List<ConstantDeclarationContext> constantDeclaration() {
			return getRuleContexts(ConstantDeclarationContext.class);
		}
		public ConstantDeclarationContext constantDeclaration(int i) {
			return getRuleContext(ConstantDeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Identifier))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(42);
					functionDeclaration();
					}
					break;
				case T__1:
					{
					setState(43);
					uniformDeclaration();
					}
					break;
				case T__0:
					{
					setState(44);
					constantDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode EQUAL_SIGN() { return getToken(ShambdaParser.EQUAL_SIGN, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_SEMI_COLON() { return getToken(ShambdaParser.DOUBLE_SEMI_COLON, 0); }
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			parameter();
			setState(52);
			match(EQUAL_SIGN);
			setState(53);
			constantExpression();
			setState(54);
			match(DOUBLE_SEMI_COLON);
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

	public static class UniformDeclarationContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode DOUBLE_SEMI_COLON() { return getToken(ShambdaParser.DOUBLE_SEMI_COLON, 0); }
		public UniformDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniformDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterUniformDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitUniformDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitUniformDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniformDeclarationContext uniformDeclaration() throws RecognitionException {
		UniformDeclarationContext _localctx = new UniformDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_uniformDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__1);
			setState(57);
			parameter();
			setState(58);
			match(DOUBLE_SEMI_COLON);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode EQUAL_SIGN() { return getToken(ShambdaParser.EQUAL_SIGN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			parameter();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(61);
				parameter();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EQUAL_SIGN);
			setState(68);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DOUBLE_SEMI_COLON() { return getToken(ShambdaParser.DOUBLE_SEMI_COLON, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(ShambdaParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ShambdaParser.SEMI_COLON, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			statement();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(71);
				match(SEMI_COLON);
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(DOUBLE_SEMI_COLON);
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ShambdaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ShambdaParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__2);
			setState(86);
			integer();
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

	public static class UnsignedLongContext extends ParserRuleContext {
		public LongNumberContext longNumber() {
			return getRuleContext(LongNumberContext.class,0);
		}
		public UnsignedLongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedLong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterUnsignedLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitUnsignedLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitUnsignedLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedLongContext unsignedLong() throws RecognitionException {
		UnsignedLongContext _localctx = new UnsignedLongContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsignedLong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(89);
			longNumber();
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

	public static class LongNumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode LONG_TERMINATOR() { return getToken(ShambdaParser.LONG_TERMINATOR, 0); }
		public LongNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterLongNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitLongNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitLongNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongNumberContext longNumber() throws RecognitionException {
		LongNumberContext _localctx = new LongNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_longNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			integer();
			setState(92);
			match(LONG_TERMINATOR);
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

	public static class DoubleNumberContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode PERIOD() { return getToken(ShambdaParser.PERIOD, 0); }
		public DoubleNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterDoubleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitDoubleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitDoubleNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleNumberContext doubleNumber() throws RecognitionException {
		DoubleNumberContext _localctx = new DoubleNumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doubleNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			integer();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(95);
				match(PERIOD);
				setState(96);
				integer();
				}
			}

			setState(99);
			match(T__3);
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

	public static class FloatingPointNumberContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode FLOAT_TERMINATOR() { return getToken(ShambdaParser.FLOAT_TERMINATOR, 0); }
		public TerminalNode PERIOD() { return getToken(ShambdaParser.PERIOD, 0); }
		public FloatingPointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterFloatingPointNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitFloatingPointNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitFloatingPointNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointNumberContext floatingPointNumber() throws RecognitionException {
		FloatingPointNumberContext _localctx = new FloatingPointNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatingPointNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			integer();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(102);
				match(PERIOD);
				setState(103);
				integer();
				}
			}

			setState(106);
			match(FLOAT_TERMINATOR);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatingPointNumberContext floatingPointNumber() {
			return getRuleContext(FloatingPointNumberContext.class,0);
		}
		public LongNumberContext longNumber() {
			return getRuleContext(LongNumberContext.class,0);
		}
		public DoubleNumberContext doubleNumber() {
			return getRuleContext(DoubleNumberContext.class,0);
		}
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedLongContext unsignedLong() {
			return getRuleContext(UnsignedLongContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantExpression);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				floatingPointNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				longNumber();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				doubleNumber();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				unsignedInteger();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				unsignedLong();
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DereferenceContext dereference() {
			return getRuleContext(DereferenceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ShambdaParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ShambdaParser.RIGHT_PAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				dereference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(LEFT_PAREN);
				setState(121);
				expression();
				setState(122);
				match(RIGHT_PAREN);
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

	public static class DereferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public DereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DereferenceContext dereference() throws RecognitionException {
		DereferenceContext _localctx = new DereferenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dereference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__4);
			setState(127);
			match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				variableAssignment();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode ASSIGN_SIGN() { return getToken(ShambdaParser.ASSIGN_SIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			parameter();
			setState(135);
			match(ASSIGN_SIGN);
			setState(136);
			expression();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__5);
			setState(139);
			variableAssignment();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Identifier);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					expression();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ShambdaParser.LEFT_PAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ShambdaParser.RIGHT_PAREN, 0); }
		public StorageClassContext storageClass() {
			return getRuleContext(StorageClassContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(149);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(150);
				match(Identifier);
				setState(151);
				match(LEFT_PAREN);
				setState(152);
				type(0);
				setState(153);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(157);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(158);
					match(MULTIPLY);
					setState(159);
					match(LEFT_PAREN);
					setState(160);
					storageClass();
					setState(161);
					match(RIGHT_PAREN);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class StorageClassContext extends ParserRuleContext {
		public StorageClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterStorageClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitStorageClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitStorageClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassContext storageClass() throws RecognitionException {
		StorageClassContext _localctx = new StorageClassContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_storageClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(ShambdaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Identifier);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(171);
				match(COLON);
				setState(172);
				type(0);
				}
			}

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6"+
		"\3\7\6\7T\n\7\r\7\16\7U\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13d\n\13\3\13\3\13\3\f\3\f\3\f\5\fk\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\ru\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\7\23\u0092\n\23\f\23\16\23\u0095\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u009e\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00a6\n\24\f\24\16\24\u00a9\13\24\3\25\3\25\3\26\3\26\3\26"+
		"\5\26\u00b0\n\26\3\26\2\3&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*\2\3\3\2\t\24\u00b3\2\61\3\2\2\2\4\64\3\2\2\2\6:\3\2\2\2\b>\3\2"+
		"\2\2\nH\3\2\2\2\fS\3\2\2\2\16W\3\2\2\2\20Z\3\2\2\2\22]\3\2\2\2\24`\3\2"+
		"\2\2\26g\3\2\2\2\30t\3\2\2\2\32~\3\2\2\2\34\u0080\3\2\2\2\36\u0086\3\2"+
		"\2\2 \u0088\3\2\2\2\"\u008c\3\2\2\2$\u008f\3\2\2\2&\u009d\3\2\2\2(\u00aa"+
		"\3\2\2\2*\u00ac\3\2\2\2,\60\5\b\5\2-\60\5\6\4\2.\60\5\4\3\2/,\3\2\2\2"+
		"/-\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2"+
		"\2\2\63\61\3\2\2\2\64\65\7\3\2\2\65\66\5*\26\2\66\67\7$\2\2\678\5\30\r"+
		"\289\7\27\2\29\5\3\2\2\2:;\7\4\2\2;<\5*\26\2<=\7\27\2\2=\7\3\2\2\2>B\5"+
		"*\26\2?A\5*\26\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3"+
		"\2\2\2EF\7$\2\2FG\5\n\6\2G\t\3\2\2\2HM\5\36\20\2IJ\7\30\2\2JL\5\36\20"+
		"\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\27"+
		"\2\2Q\13\3\2\2\2RT\7\31\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r"+
		"\3\2\2\2WX\7\5\2\2XY\5\f\7\2Y\17\3\2\2\2Z[\7\5\2\2[\\\5\22\n\2\\\21\3"+
		"\2\2\2]^\5\f\7\2^_\7\26\2\2_\23\3\2\2\2`c\5\f\7\2ab\7\32\2\2bd\5\f\7\2"+
		"ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\6\2\2f\25\3\2\2\2gj\5\f\7\2hi\7\32"+
		"\2\2ik\5\f\7\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\25\2\2m\27\3\2\2\2nu"+
		"\5\f\7\2ou\5\26\f\2pu\5\22\n\2qu\5\24\13\2ru\5\16\b\2su\5\20\t\2tn\3\2"+
		"\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\31\3\2\2\2v\177"+
		"\5$\23\2w\177\5\30\r\2x\177\5\34\17\2y\177\7)\2\2z{\7 \2\2{|\5\32\16\2"+
		"|}\7!\2\2}\177\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2"+
		"\2\177\33\3\2\2\2\u0080\u0081\7\7\2\2\u0081\u0082\7)\2\2\u0082\35\3\2"+
		"\2\2\u0083\u0087\5\32\16\2\u0084\u0087\5\"\22\2\u0085\u0087\5 \21\2\u0086"+
		"\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\37\3\2\2"+
		"\2\u0088\u0089\5*\26\2\u0089\u008a\7#\2\2\u008a\u008b\5\32\16\2\u008b"+
		"!\3\2\2\2\u008c\u008d\7\b\2\2\u008d\u008e\5 \21\2\u008e#\3\2\2\2\u008f"+
		"\u0093\7)\2\2\u0090\u0092\5\32\16\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094%\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\b\24\1\2\u0097\u009e\7)\2\2\u0098\u0099\7)\2\2\u0099"+
		"\u009a\7 \2\2\u009a\u009b\5&\24\2\u009b\u009c\7!\2\2\u009c\u009e\3\2\2"+
		"\2\u009d\u0096\3\2\2\2\u009d\u0098\3\2\2\2\u009e\u00a7\3\2\2\2\u009f\u00a0"+
		"\f\3\2\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\5(\25\2\u00a3"+
		"\u00a4\7!\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\'\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab)\3\2\2\2\u00ac\u00af\7)\2\2\u00ad\u00ae"+
		"\7\37\2\2\u00ae\u00b0\5&\24\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0+\3\2\2\2\20/\61BMUcjt~\u0086\u0093\u009d\u00a7\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}