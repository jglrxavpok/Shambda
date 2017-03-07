// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/shambda\Shambda.g4 by ANTLR 4.6
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
		T__17=18, T__18=19, UnsignedInteger=20, UnsignedLong=21, LongNumber=22, 
		DoubleNumber=23, FloatingPointNumber=24, Boolean=25, UniformDeclaration=26, 
		Integer=27, BinaryOperatorSuffix=28, LCURLY=29, RCURLY=30, FLOAT_TERMINATOR=31, 
		LONG_TERMINATOR=32, DOUBLE_SEMI_COLON=33, SEMI_COLON=34, PERIOD=35, PLUS=36, 
		MINUS=37, MULTIPLY=38, DIVISION=39, COLON=40, LEFT_PAREN=41, RIGHT_PAREN=42, 
		SMALL_ARROW=43, ASSIGN_SIGN=44, EQUAL_SIGN=45, WHITESPACE=46, Identifier=47;
	public static final int
		RULE_file = 0, RULE_setImport = 1, RULE_typeDefinition = 2, RULE_memberDeclaration = 3, 
		RULE_functionBody = 4, RULE_constantExpression = 5, RULE_expression = 6, 
		RULE_statement = 7, RULE_variableAssignment = 8, RULE_variableDeclaration = 9, 
		RULE_functionCall = 10, RULE_type = 11, RULE_storageClass = 12, RULE_parameter = 13;
	public static final String[] ruleNames = {
		"file", "setImport", "typeDefinition", "memberDeclaration", "functionBody", 
		"constantExpression", "expression", "statement", "variableAssignment", 
		"variableDeclaration", "functionCall", "type", "storageClass", "parameter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'type'", "'!'", "'['", "']'", "'let'", "'$'", "'UniformConstant'", 
		"'Input'", "'Uniform'", "'Output'", "'Workgroup'", "'CrossWorkgroup'", 
		"'Private'", "'Function'", "'Generic'", "'PushConstant'", "'AtomicCounter'", 
		"'Image'", null, null, null, null, null, null, "'uniform'", null, null, 
		"'{'", "'}'", null, null, "';;'", "';'", "'.'", "'+'", "'-'", "'*'", "'/'", 
		"':'", "'('", "')'", "'->'", "':='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "UnsignedInteger", "UnsignedLong", 
		"LongNumber", "DoubleNumber", "FloatingPointNumber", "Boolean", "UniformDeclaration", 
		"Integer", "BinaryOperatorSuffix", "LCURLY", "RCURLY", "FLOAT_TERMINATOR", 
		"LONG_TERMINATOR", "DOUBLE_SEMI_COLON", "SEMI_COLON", "PERIOD", "PLUS", 
		"MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", 
		"SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "WHITESPACE", "Identifier"
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
		public TerminalNode EOF() { return getToken(ShambdaParser.EOF, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<SetImportContext> setImport() {
			return getRuleContexts(SetImportContext.class);
		}
		public SetImportContext setImport(int i) {
			return getRuleContext(SetImportContext.class,i);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Identifier))) != 0)) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(28);
					typeDefinition();
					}
					break;
				case T__0:
					{
					setState(29);
					setImport();
					}
					break;
				case Identifier:
					{
					setState(30);
					memberDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class SetImportContext extends ParserRuleContext {
		public TerminalNode DOUBLE_SEMI_COLON() { return getToken(ShambdaParser.DOUBLE_SEMI_COLON, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ShambdaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ShambdaParser.Identifier, i);
		}
		public List<TerminalNode> Integer() { return getTokens(ShambdaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(ShambdaParser.Integer, i);
		}
		public SetImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterSetImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitSetImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitSetImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetImportContext setImport() throws RecognitionException {
		SetImportContext _localctx = new SetImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(40);
				match(PERIOD);
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==Integer || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public TerminalNode LCURLY() { return getToken(ShambdaParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ShambdaParser.RCURLY, 0); }
		public TerminalNode DOUBLE_SEMI_COLON() { return getToken(ShambdaParser.DOUBLE_SEMI_COLON, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(ShambdaParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ShambdaParser.SEMI_COLON, i);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(50);
			match(Identifier);
			setState(51);
			match(LCURLY);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(52);
				parameter();
				setState(53);
				match(SEMI_COLON);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RCURLY);
			setState(61);
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TerminalNode EQUAL_SIGN() { return getToken(ShambdaParser.EQUAL_SIGN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_memberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				parameter();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(68);
			match(EQUAL_SIGN);
			setState(69);
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
			setState(71);
			statement();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(72);
				match(SEMI_COLON);
				setState(73);
				statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(ShambdaParser.Integer, 0); }
		public TerminalNode FloatingPointNumber() { return getToken(ShambdaParser.FloatingPointNumber, 0); }
		public TerminalNode LongNumber() { return getToken(ShambdaParser.LongNumber, 0); }
		public TerminalNode DoubleNumber() { return getToken(ShambdaParser.DoubleNumber, 0); }
		public TerminalNode UnsignedInteger() { return getToken(ShambdaParser.UnsignedInteger, 0); }
		public TerminalNode UnsignedLong() { return getToken(ShambdaParser.UnsignedLong, 0); }
		public TerminalNode Boolean() { return getToken(ShambdaParser.Boolean, 0); }
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
		enterRule(_localctx, 10, RULE_constantExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UnsignedInteger) | (1L << UnsignedLong) | (1L << LongNumber) | (1L << DoubleNumber) | (1L << FloatingPointNumber) | (1L << Boolean) | (1L << Integer))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DereferenceExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterDereferenceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitDereferenceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitDereferenceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionExprContext extends ExpressionContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public ConstantExpressionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterConstantExpressionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitConstantExpressionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitConstantExpressionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BinaryOperatorSuffix() { return getToken(ShambdaParser.BinaryOperatorSuffix, 0); }
		public MultExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BinaryOperatorSuffix() { return getToken(ShambdaParser.BinaryOperatorSuffix, 0); }
		public MinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BinaryOperatorSuffix() { return getToken(ShambdaParser.BinaryOperatorSuffix, 0); }
		public PlusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrappedExprContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(ShambdaParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ShambdaParser.RIGHT_PAREN, 0); }
		public WrappedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterWrappedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitWrappedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitWrappedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniformExprContext extends ExpressionContext {
		public TerminalNode UniformDeclaration() { return getToken(ShambdaParser.UniformDeclaration, 0); }
		public UniformExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterUniformExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitUniformExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitUniformExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BinaryOperatorSuffix() { return getToken(ShambdaParser.BinaryOperatorSuffix, 0); }
		public DivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementAccessExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ElementAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterElementAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitElementAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitElementAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccessExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public AccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new DereferenceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				match(T__2);
				setState(85);
				expression(13);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(MINUS);
				setState(87);
				expression(12);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new ConstantExpressionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				constantExpression();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(Identifier);
				}
				break;
			case 6:
				{
				_localctx = new WrappedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(LEFT_PAREN);
				setState(92);
				expression(0);
				setState(93);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new UniformExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(UniformDeclaration);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						match(MULTIPLY);
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BinaryOperatorSuffix) {
							{
							setState(100);
							match(BinaryOperatorSuffix);
							}
						}

						setState(103);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						match(DIVISION);
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BinaryOperatorSuffix) {
							{
							setState(106);
							match(BinaryOperatorSuffix);
							}
						}

						setState(109);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new MinusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						match(MINUS);
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BinaryOperatorSuffix) {
							{
							setState(112);
							match(BinaryOperatorSuffix);
							}
						}

						setState(115);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new PlusExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						match(PLUS);
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BinaryOperatorSuffix) {
							{
							setState(118);
							match(BinaryOperatorSuffix);
							}
						}

						setState(121);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ElementAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(123);
						match(T__3);
						setState(124);
						expression(0);
						setState(125);
						match(T__4);
						}
						break;
					case 6:
						{
						_localctx = new AccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						match(PERIOD);
						setState(129);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(134);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
		enterRule(_localctx, 16, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			parameter();
			setState(141);
			match(ASSIGN_SIGN);
			setState(142);
			expression(0);
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
		enterRule(_localctx, 18, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__5);
			setState(145);
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
		public TerminalNode LEFT_PAREN() { return getToken(ShambdaParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ShambdaParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 20, RULE_functionCall);
		int _la;
		try {
			int _alt;
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(Identifier);
				setState(148);
				match(LEFT_PAREN);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << UnsignedInteger) | (1L << UnsignedLong) | (1L << LongNumber) | (1L << DoubleNumber) | (1L << FloatingPointNumber) | (1L << Boolean) | (1L << UniformDeclaration) | (1L << Integer) | (1L << MINUS) | (1L << LEFT_PAREN) | (1L << Identifier))) != 0)) {
					{
					{
					setState(149);
					expression(0);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(Identifier);
				setState(157);
				match(T__6);
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						expression(0);
						}
						} 
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Integer() { return getToken(ShambdaParser.Integer, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(ShambdaParser.LEFT_PAREN, 0); }
		public StorageClassContext storageClass() {
			return getRuleContext(StorageClassContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ShambdaParser.RIGHT_PAREN, 0); }
		public PointerTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseTypeContext extends TypeContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public BaseTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompositeTypeContext extends TypeContext {
		public TerminalNode Identifier() { return getToken(ShambdaParser.Identifier, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ShambdaParser.LEFT_PAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ShambdaParser.RIGHT_PAREN, 0); }
		public CompositeTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).enterCompositeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShambdaListener ) ((ShambdaListener)listener).exitCompositeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShambdaVisitor ) return ((ShambdaVisitor<? extends T>)visitor).visitCompositeType(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new BaseTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new CompositeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(Identifier);
				setState(169);
				match(LEFT_PAREN);
				setState(170);
				type(0);
				setState(171);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PointerTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(MULTIPLY);
						setState(177);
						match(LEFT_PAREN);
						setState(178);
						storageClass();
						setState(179);
						match(RIGHT_PAREN);
						}
						break;
					case 2:
						{
						_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(181);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(182);
						match(T__3);
						setState(183);
						match(Integer);
						setState(184);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(189);
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
		enterRule(_localctx, 24, RULE_storageClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Identifier);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(193);
				match(COLON);
				setState(194);
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\3\5\6\5C\n\5"+
		"\r\5\16\5D\3\5\3\5\3\5\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\b"+
		"\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\3\b\3\b\3\b\5\bt\n\b\3"+
		"\b\3\b\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0085"+
		"\n\b\f\b\16\b\u0088\13\b\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\5\f\u00a7\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00b0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bc"+
		"\n\r\f\r\16\r\u00bf\13\r\3\16\3\16\3\17\3\17\3\17\5\17\u00c6\n\17\3\17"+
		"\2\4\16\30\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\4\2\35\35\61\61"+
		"\4\2\26\33\35\35\3\2\n\25\u00d9\2#\3\2\2\2\4(\3\2\2\2\6\63\3\2\2\2\bB"+
		"\3\2\2\2\nI\3\2\2\2\fS\3\2\2\2\16b\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3"+
		"\2\2\2\24\u0092\3\2\2\2\26\u00a6\3\2\2\2\30\u00af\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00c2\3\2\2\2\36\"\5\6\4\2\37\"\5\4\3\2 \"\5\b\5\2!\36\3\2\2\2"+
		"!\37\3\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2"+
		"\2\2&\'\7\2\2\3\'\3\3\2\2\2()\7\3\2\2).\t\2\2\2*+\7%\2\2+-\t\2\2\2,*\3"+
		"\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7"+
		"#\2\2\62\5\3\2\2\2\63\64\7\4\2\2\64\65\7\61\2\2\65;\7\37\2\2\66\67\5\34"+
		"\17\2\678\7$\2\28:\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		">\3\2\2\2=;\3\2\2\2>?\7 \2\2?@\7#\2\2@\7\3\2\2\2AC\5\34\17\2BA\3\2\2\2"+
		"CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7/\2\2GH\5\n\6\2H\t\3\2\2\2"+
		"IN\5\20\t\2JK\7$\2\2KM\5\20\t\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OQ\3\2\2\2PN\3\2\2\2QR\7#\2\2R\13\3\2\2\2ST\t\3\2\2T\r\3\2\2\2UV\b\b"+
		"\1\2VW\7\5\2\2Wc\5\16\b\17XY\7\'\2\2Yc\5\16\b\16Zc\5\26\f\2[c\5\f\7\2"+
		"\\c\7\61\2\2]^\7+\2\2^_\5\16\b\2_`\7,\2\2`c\3\2\2\2ac\7\34\2\2bU\3\2\2"+
		"\2bX\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2ba\3\2\2\2c\u0086"+
		"\3\2\2\2de\f\7\2\2eg\7(\2\2fh\7\36\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2i"+
		"\u0085\5\16\b\bjk\f\6\2\2km\7)\2\2ln\7\36\2\2ml\3\2\2\2mn\3\2\2\2no\3"+
		"\2\2\2o\u0085\5\16\b\7pq\f\5\2\2qs\7\'\2\2rt\7\36\2\2sr\3\2\2\2st\3\2"+
		"\2\2tu\3\2\2\2u\u0085\5\16\b\6vw\f\4\2\2wy\7&\2\2xz\7\36\2\2yx\3\2\2\2"+
		"yz\3\2\2\2z{\3\2\2\2{\u0085\5\16\b\5|}\f\n\2\2}~\7\6\2\2~\177\5\16\b\2"+
		"\177\u0080\7\7\2\2\u0080\u0085\3\2\2\2\u0081\u0082\f\t\2\2\u0082\u0083"+
		"\7%\2\2\u0083\u0085\7\61\2\2\u0084d\3\2\2\2\u0084j\3\2\2\2\u0084p\3\2"+
		"\2\2\u0084v\3\2\2\2\u0084|\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\17\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008d\5\16\b\2\u008a\u008d\5\24\13\2\u008b\u008d\5\22\n"+
		"\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\21"+
		"\3\2\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7.\2\2\u0090\u0091\5\16\b\2"+
		"\u0091\23\3\2\2\2\u0092\u0093\7\b\2\2\u0093\u0094\5\22\n\2\u0094\25\3"+
		"\2\2\2\u0095\u0096\7\61\2\2\u0096\u009a\7+\2\2\u0097\u0099\5\16\b\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a7\7,\2\2\u009e"+
		"\u009f\7\61\2\2\u009f\u00a3\7\t\2\2\u00a0\u00a2\5\16\b\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u0095\3\2\2\2\u00a6\u009e\3\2"+
		"\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\b\r\1\2\u00a9\u00b0\7\61\2\2\u00aa\u00ab"+
		"\7\61\2\2\u00ab\u00ac\7+\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\u00bd\3\2"+
		"\2\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b4\7+\2\2\u00b4\u00b5"+
		"\5\32\16\2\u00b5\u00b6\7,\2\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\f\3\2\2"+
		"\u00b8\u00b9\7\6\2\2\u00b9\u00ba\7\35\2\2\u00ba\u00bc\7\7\2\2\u00bb\u00b1"+
		"\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\t\4\2"+
		"\2\u00c1\33\3\2\2\2\u00c2\u00c5\7\61\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c6"+
		"\5\30\r\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2\2\27"+
		"!#.;DNbgmsy\u0084\u0086\u008c\u009a\u00a3\u00a6\u00af\u00bb\u00bd\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}