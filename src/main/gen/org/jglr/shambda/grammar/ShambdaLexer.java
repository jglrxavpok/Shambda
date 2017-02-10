// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/shambda\Shambda.g4 by ANTLR 4.6
package org.jglr.shambda.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShambdaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		UnsignedInteger=18, UnsignedLong=19, LongNumber=20, DoubleNumber=21, FloatingPointNumber=22, 
		Integer=23, FLOAT_TERMINATOR=24, LONG_TERMINATOR=25, DOUBLE_SEMI_COLON=26, 
		SEMI_COLON=27, PERIOD=28, PLUS=29, MINUS=30, MULTIPLY=31, DIVISION=32, 
		COLON=33, LEFT_PAREN=34, RIGHT_PAREN=35, SMALL_ARROW=36, ASSIGN_SIGN=37, 
		EQUAL_SIGN=38, LOWERCASE_LETTER=39, UPPERCASE_LETTER=40, STAR=41, WHITESPACE=42, 
		Identifier=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"UnsignedInteger", "UnsignedLong", "LongNumber", "DoubleNumber", "FloatingPointNumber", 
		"Integer", "FLOAT_TERMINATOR", "LONG_TERMINATOR", "DOUBLE_SEMI_COLON", 
		"SEMI_COLON", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "LOWERCASE_LETTER", 
		"UPPERCASE_LETTER", "STAR", "WHITESPACE", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#import'", "'constant'", "'uniform'", "'!'", "'let'", "'UniformConstant'", 
		"'Input'", "'Uniform'", "'Output'", "'Workgroup'", "'CrossWorkgroup'", 
		"'Private'", "'Function'", "'Generic'", "'PushConstant'", "'AtomicCounter'", 
		"'Image'", null, null, null, null, null, null, "'f'", "'L'", "';;'", "';'", 
		"'.'", "'+'", "'-'", "'*'", "'/'", "':'", "'('", "')'", "'->'", "':='", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "UnsignedInteger", "UnsignedLong", 
		"LongNumber", "DoubleNumber", "FloatingPointNumber", "Integer", "FLOAT_TERMINATOR", 
		"LONG_TERMINATOR", "DOUBLE_SEMI_COLON", "SEMI_COLON", "PERIOD", "PLUS", 
		"MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", 
		"SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "LOWERCASE_LETTER", "UPPERCASE_LETTER", 
		"STAR", "WHITESPACE", "Identifier"
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


	public ShambdaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\5\26\u010c\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0114\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\5\35\u0126\n\35\3\35\6\35\u0129\n\35\r\35\16"+
		"\35\u012a\3\35\5\35\u012e\n\35\5\35\u0130\n\35\3\36\3\36\7\36\u0134\n"+
		"\36\f\36\16\36\u0137\13\36\3\36\5\36\u013a\n\36\3\37\3\37\5\37\u013e\n"+
		"\37\3 \3 \3!\3!\5!\u0144\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u0165\n"+
		"\60\r\60\16\60\u0166\3\60\3\60\3\61\3\61\7\61\u016d\n\61\f\61\16\61\u0170"+
		"\13\61\3\62\3\62\3\62\3\62\5\62\u0176\n\62\3\63\3\63\3\63\3\63\5\63\u017c"+
		"\n\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\2;\2=\2?\2A\2C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c\2e\2\3\2"+
		"\n\3\2\63;\3\2,,\5\2\13\f\17\17\"\"\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\u0185\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7x\3\2\2\2\t\u0080\3\2\2\2\13\u0082\3\2\2"+
		"\2\r\u0086\3\2\2\2\17\u0096\3\2\2\2\21\u009c\3\2\2\2\23\u00a4\3\2\2\2"+
		"\25\u00ab\3\2\2\2\27\u00b5\3\2\2\2\31\u00c4\3\2\2\2\33\u00cc\3\2\2\2\35"+
		"\u00d5\3\2\2\2\37\u00dd\3\2\2\2!\u00ea\3\2\2\2#\u00f8\3\2\2\2%\u00fe\3"+
		"\2\2\2\'\u0101\3\2\2\2)\u0104\3\2\2\2+\u0107\3\2\2\2-\u010f\3\2\2\2/\u0117"+
		"\3\2\2\2\61\u0119\3\2\2\2\63\u011b\3\2\2\2\65\u011d\3\2\2\2\67\u0120\3"+
		"\2\2\29\u012f\3\2\2\2;\u0131\3\2\2\2=\u013d\3\2\2\2?\u013f\3\2\2\2A\u0143"+
		"\3\2\2\2C\u0145\3\2\2\2E\u0147\3\2\2\2G\u0149\3\2\2\2I\u014b\3\2\2\2K"+
		"\u014d\3\2\2\2M\u014f\3\2\2\2O\u0151\3\2\2\2Q\u0153\3\2\2\2S\u0155\3\2"+
		"\2\2U\u0158\3\2\2\2W\u015b\3\2\2\2Y\u015d\3\2\2\2[\u015f\3\2\2\2]\u0161"+
		"\3\2\2\2_\u0164\3\2\2\2a\u016a\3\2\2\2c\u0175\3\2\2\2e\u017b\3\2\2\2g"+
		"h\7%\2\2hi\7k\2\2ij\7o\2\2jk\7r\2\2kl\7q\2\2lm\7t\2\2mn\7v\2\2n\4\3\2"+
		"\2\2op\7e\2\2pq\7q\2\2qr\7p\2\2rs\7u\2\2st\7v\2\2tu\7c\2\2uv\7p\2\2vw"+
		"\7v\2\2w\6\3\2\2\2xy\7w\2\2yz\7p\2\2z{\7k\2\2{|\7h\2\2|}\7q\2\2}~\7t\2"+
		"\2~\177\7o\2\2\177\b\3\2\2\2\u0080\u0081\7#\2\2\u0081\n\3\2\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\f\3\2\2\2\u0086"+
		"\u0087\7W\2\2\u0087\u0088\7p\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2"+
		"\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\u008d\7o\2\2\u008d\u008e"+
		"\7E\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2"+
		"\u0095\16\3\2\2\2\u0096\u0097\7K\2\2\u0097\u0098\7p\2\2\u0098\u0099\7"+
		"r\2\2\u0099\u009a\7w\2\2\u009a\u009b\7v\2\2\u009b\20\3\2\2\2\u009c\u009d"+
		"\7W\2\2\u009d\u009e\7p\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7o\2\2\u00a3\22\3\2\2\2\u00a4"+
		"\u00a5\7Q\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7r\2\2"+
		"\u00a8\u00a9\7w\2\2\u00a9\u00aa\7v\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7"+
		"Y\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7m\2\2\u00af\u00b0"+
		"\7i\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7r\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7Y\2\2"+
		"\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7m\2\2\u00be\u00bf"+
		"\7i\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7w\2\2\u00c2"+
		"\u00c3\7r\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7R\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7g\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7H\2\2\u00cd\u00ce\7"+
		"w\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7p\2\2\u00d4\34\3\2\2\2\u00d5\u00d6"+
		"\7I\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7e\2\2\u00dc\36\3\2\2\2\u00dd"+
		"\u00de\7R\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7j\2\2"+
		"\u00e1\u00e2\7E\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5"+
		"\7u\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7v\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7e\2\2"+
		"\u00f0\u00f1\7E\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\"\3\2\2\2\u00f8\u00f9\7K\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7i\2\2\u00fc\u00fd\7g\2\2\u00fd$\3\2\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0100\5/\30\2\u0100&\3\2\2\2\u0101\u0102\7w\2\2\u0102\u0103\5)\25\2\u0103"+
		"(\3\2\2\2\u0104\u0105\5;\36\2\u0105\u0106\5\63\32\2\u0106*\3\2\2\2\u0107"+
		"\u010b\5;\36\2\u0108\u0109\5C\"\2\u0109\u010a\5;\36\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\7f\2\2\u010e,\3\2\2\2\u010f\u0113\5;\36\2\u0110\u0111\5C\"\2\u0111"+
		"\u0112\5;\36\2\u0112\u0114\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5\61\31\2\u0116.\3\2\2\2\u0117\u0118"+
		"\5;\36\2\u0118\60\3\2\2\2\u0119\u011a\7h\2\2\u011a\62\3\2\2\2\u011b\u011c"+
		"\7N\2\2\u011c\64\3\2\2\2\u011d\u011e\7=\2\2\u011e\u011f\7=\2\2\u011f\66"+
		"\3\2\2\2\u0120\u0121\7=\2\2\u01218\3\2\2\2\u0122\u0130\7\62\2\2\u0123"+
		"\u012d\5? \2\u0124\u0126\5;\36\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2"+
		"\2\u0126\u012e\3\2\2\2\u0127\u0129\7a\2\2\u0128\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\5;\36\2\u012d\u0125\3\2\2\2\u012d\u0128\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u0122\3\2\2\2\u012f\u0123\3\2\2\2\u0130:\3\2\2\2\u0131\u0139"+
		"\5=\37\2\u0132\u0134\5A!\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u013a\5=\37\2\u0139\u0135\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"<\3\2\2\2\u013b\u013e\7\62\2\2\u013c\u013e\5? \2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e>\3\2\2\2\u013f\u0140\t\2\2\2\u0140@\3\2\2\2\u0141"+
		"\u0144\5=\37\2\u0142\u0144\7a\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2"+
		"\2\2\u0144B\3\2\2\2\u0145\u0146\7\60\2\2\u0146D\3\2\2\2\u0147\u0148\7"+
		"-\2\2\u0148F\3\2\2\2\u0149\u014a\7/\2\2\u014aH\3\2\2\2\u014b\u014c\7,"+
		"\2\2\u014cJ\3\2\2\2\u014d\u014e\7\61\2\2\u014eL\3\2\2\2\u014f\u0150\7"+
		"<\2\2\u0150N\3\2\2\2\u0151\u0152\7*\2\2\u0152P\3\2\2\2\u0153\u0154\7+"+
		"\2\2\u0154R\3\2\2\2\u0155\u0156\7/\2\2\u0156\u0157\7@\2\2\u0157T\3\2\2"+
		"\2\u0158\u0159\7<\2\2\u0159\u015a\7?\2\2\u015aV\3\2\2\2\u015b\u015c\7"+
		"?\2\2\u015cX\3\2\2\2\u015d\u015e\4c|\2\u015eZ\3\2\2\2\u015f\u0160\4C\\"+
		"\2\u0160\\\3\2\2\2\u0161\u0162\t\3\2\2\u0162^\3\2\2\2\u0163\u0165\t\4"+
		"\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\60\2\2\u0169`\3\2\2\2"+
		"\u016a\u016e\5c\62\2\u016b\u016d\5e\63\2\u016c\u016b\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016fb\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0176\t\5\2\2\u0172\u0176\n\6\2\2\u0173\u0174\t\7"+
		"\2\2\u0174\u0176\t\b\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176d\3\2\2\2\u0177\u017c\t\t\2\2\u0178\u017c\n\6\2\2"+
		"\u0179\u017a\t\7\2\2\u017a\u017c\t\b\2\2\u017b\u0177\3\2\2\2\u017b\u0178"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017cf\3\2\2\2\21\2\u010b\u0113\u0125\u012a"+
		"\u012d\u012f\u0135\u0139\u013d\u0143\u0166\u016e\u0175\u017b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}