// Generated from F:/Programming/Java/Languages/Shambda/src/main/java/antlr/jambda\Shambda.g4 by ANTLR 4.6
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, UnsignedInteger=17, 
		UnsignedLong=18, LongNumber=19, DoubleNumber=20, FloatingPointNumber=21, 
		Integer=22, FLOAT_TERMINATOR=23, LONG_TERMINATOR=24, DOUBLE_SEMI_COLON=25, 
		SEMI_COLON=26, PERIOD=27, PLUS=28, MINUS=29, MULTIPLY=30, DIVISION=31, 
		COLON=32, LEFT_PAREN=33, RIGHT_PAREN=34, SMALL_ARROW=35, ASSIGN_SIGN=36, 
		EQUAL_SIGN=37, LOWERCASE_LETTER=38, UPPERCASE_LETTER=39, STAR=40, WHITESPACE=41, 
		Identifier=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "UnsignedInteger", 
		"UnsignedLong", "LongNumber", "DoubleNumber", "FloatingPointNumber", "Integer", 
		"FLOAT_TERMINATOR", "LONG_TERMINATOR", "DOUBLE_SEMI_COLON", "SEMI_COLON", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "LOWERCASE_LETTER", 
		"UPPERCASE_LETTER", "STAR", "WHITESPACE", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'constant'", "'uniform'", "'!'", "'let'", "'UniformConstant'", 
		"'Input'", "'Uniform'", "'Output'", "'Workgroup'", "'CrossWorkgroup'", 
		"'Private'", "'Function'", "'Generic'", "'PushConstant'", "'AtomicCounter'", 
		"'Image'", null, null, null, null, null, null, "'f'", "'L'", "';;'", "';'", 
		"'.'", "'+'", "'-'", "'*'", "'/'", "':'", "'('", "')'", "'->'", "':='", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "UnsignedInteger", "UnsignedLong", "LongNumber", 
		"DoubleNumber", "FloatingPointNumber", "Integer", "FLOAT_TERMINATOR", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\5\26\u010a\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\5\34\u011c\n\34\3\34\6\34"+
		"\u011f\n\34\r\34\16\34\u0120\3\34\5\34\u0124\n\34\5\34\u0126\n\34\3\35"+
		"\3\35\7\35\u012a\n\35\f\35\16\35\u012d\13\35\3\35\5\35\u0130\n\35\3\36"+
		"\3\36\5\36\u0134\n\36\3\37\3\37\3 \3 \5 \u013a\n \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\6/\u015b\n/\r/\16/\u015c\3/\3/\3\60\3\60\7\60\u0163\n\60\f\60"+
		"\16\60\u0166\13\60\3\61\3\61\3\61\3\61\5\61\u016c\n\61\3\62\3\62\3\62"+
		"\3\62\5\62\u0172\n\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\29\2;\2=\2?\2A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]"+
		"+_,a\2c\2\3\2\n\3\2\63;\3\2,,\5\2\13\f\17\17\"\"\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\u017b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\3e\3\2\2\2\5n\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13|\3\2\2\2\r\u008c"+
		"\3\2\2\2\17\u0092\3\2\2\2\21\u009a\3\2\2\2\23\u00a1\3\2\2\2\25\u00ab\3"+
		"\2\2\2\27\u00ba\3\2\2\2\31\u00c2\3\2\2\2\33\u00cb\3\2\2\2\35\u00d3\3\2"+
		"\2\2\37\u00e0\3\2\2\2!\u00ee\3\2\2\2#\u00f4\3\2\2\2%\u00f7\3\2\2\2\'\u00fa"+
		"\3\2\2\2)\u00fd\3\2\2\2+\u0105\3\2\2\2-\u010d\3\2\2\2/\u010f\3\2\2\2\61"+
		"\u0111\3\2\2\2\63\u0113\3\2\2\2\65\u0116\3\2\2\2\67\u0125\3\2\2\29\u0127"+
		"\3\2\2\2;\u0133\3\2\2\2=\u0135\3\2\2\2?\u0139\3\2\2\2A\u013b\3\2\2\2C"+
		"\u013d\3\2\2\2E\u013f\3\2\2\2G\u0141\3\2\2\2I\u0143\3\2\2\2K\u0145\3\2"+
		"\2\2M\u0147\3\2\2\2O\u0149\3\2\2\2Q\u014b\3\2\2\2S\u014e\3\2\2\2U\u0151"+
		"\3\2\2\2W\u0153\3\2\2\2Y\u0155\3\2\2\2[\u0157\3\2\2\2]\u015a\3\2\2\2_"+
		"\u0160\3\2\2\2a\u016b\3\2\2\2c\u0171\3\2\2\2ef\7e\2\2fg\7q\2\2gh\7p\2"+
		"\2hi\7u\2\2ij\7v\2\2jk\7c\2\2kl\7p\2\2lm\7v\2\2m\4\3\2\2\2no\7w\2\2op"+
		"\7p\2\2pq\7k\2\2qr\7h\2\2rs\7q\2\2st\7t\2\2tu\7o\2\2u\6\3\2\2\2vw\7#\2"+
		"\2w\b\3\2\2\2xy\7n\2\2yz\7g\2\2z{\7v\2\2{\n\3\2\2\2|}\7W\2\2}~\7p\2\2"+
		"~\177\7k\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7o\2\2\u0083\u0084\7E\2\2\u0084\u0085\7q\2\2\u0085\u0086\7p\2\2"+
		"\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7v\2\2\u008b\f\3\2\2\2\u008c\u008d\7K\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7r\2\2\u008f\u0090\7w\2\2\u0090\u0091\7v\2\2\u0091"+
		"\16\3\2\2\2\u0092\u0093\7W\2\2\u0093\u0094\7p\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099\7o\2\2"+
		"\u0099\20\3\2\2\2\u009a\u009b\7Q\2\2\u009b\u009c\7w\2\2\u009c\u009d\7"+
		"v\2\2\u009d\u009e\7r\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7v\2\2\u00a0\22"+
		"\3\2\2\2\u00a1\u00a2\7Y\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7m\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\u00a9\7w\2\2\u00a9\u00aa\7r\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7"+
		"E\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7Y\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7m\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q\2\2"+
		"\u00b7\u00b8\7w\2\2\u00b8\u00b9\7r\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7"+
		"R\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7x\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\30\3\2\2\2\u00c2\u00c3"+
		"\7H\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7e\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7p\2\2"+
		"\u00ca\32\3\2\2\2\u00cb\u00cc\7I\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7"+
		"p\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7e\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7R\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7E\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7c\2\2"+
		"\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7"+
		"C\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7E\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7w\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed \3\2\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f0\7o\2"+
		"\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7i\2\2\u00f2\u00f3\7g\2\2\u00f3\"\3"+
		"\2\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\5-\27\2\u00f6$\3\2\2\2\u00f7\u00f8"+
		"\7w\2\2\u00f8\u00f9\5\'\24\2\u00f9&\3\2\2\2\u00fa\u00fb\59\35\2\u00fb"+
		"\u00fc\5\61\31\2\u00fc(\3\2\2\2\u00fd\u0101\59\35\2\u00fe\u00ff\5A!\2"+
		"\u00ff\u0100\59\35\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7f\2\2\u0104*\3\2\2\2\u0105\u0109"+
		"\59\35\2\u0106\u0107\5A!\2\u0107\u0108\59\35\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0106\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5/"+
		"\30\2\u010c,\3\2\2\2\u010d\u010e\59\35\2\u010e.\3\2\2\2\u010f\u0110\7"+
		"h\2\2\u0110\60\3\2\2\2\u0111\u0112\7N\2\2\u0112\62\3\2\2\2\u0113\u0114"+
		"\7=\2\2\u0114\u0115\7=\2\2\u0115\64\3\2\2\2\u0116\u0117\7=\2\2\u0117\66"+
		"\3\2\2\2\u0118\u0126\7\62\2\2\u0119\u0123\5=\37\2\u011a\u011c\59\35\2"+
		"\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0124\3\2\2\2\u011d\u011f"+
		"\7a\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\59\35\2\u0123\u011b\3\2"+
		"\2\2\u0123\u011e\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0118\3\2\2\2\u0125"+
		"\u0119\3\2\2\2\u01268\3\2\2\2\u0127\u012f\5;\36\2\u0128\u012a\5? \2\u0129"+
		"\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\5;\36\2\u012f"+
		"\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130:\3\2\2\2\u0131\u0134\7\62\2\2"+
		"\u0132\u0134\5=\37\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134<\3"+
		"\2\2\2\u0135\u0136\t\2\2\2\u0136>\3\2\2\2\u0137\u013a\5;\36\2\u0138\u013a"+
		"\7a\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a@\3\2\2\2\u013b\u013c"+
		"\7\60\2\2\u013cB\3\2\2\2\u013d\u013e\7-\2\2\u013eD\3\2\2\2\u013f\u0140"+
		"\7/\2\2\u0140F\3\2\2\2\u0141\u0142\7,\2\2\u0142H\3\2\2\2\u0143\u0144\7"+
		"\61\2\2\u0144J\3\2\2\2\u0145\u0146\7<\2\2\u0146L\3\2\2\2\u0147\u0148\7"+
		"*\2\2\u0148N\3\2\2\2\u0149\u014a\7+\2\2\u014aP\3\2\2\2\u014b\u014c\7/"+
		"\2\2\u014c\u014d\7@\2\2\u014dR\3\2\2\2\u014e\u014f\7<\2\2\u014f\u0150"+
		"\7?\2\2\u0150T\3\2\2\2\u0151\u0152\7?\2\2\u0152V\3\2\2\2\u0153\u0154\4"+
		"c|\2\u0154X\3\2\2\2\u0155\u0156\4C\\\2\u0156Z\3\2\2\2\u0157\u0158\t\3"+
		"\2\2\u0158\\\3\2\2\2\u0159\u015b\t\4\2\2\u015a\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\b/\2\2\u015f^\3\2\2\2\u0160\u0164\5a\61\2\u0161\u0163\5c\62\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165`\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016c\t\5\2\2\u0168\u016c"+
		"\n\6\2\2\u0169\u016a\t\7\2\2\u016a\u016c\t\b\2\2\u016b\u0167\3\2\2\2\u016b"+
		"\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016cb\3\2\2\2\u016d\u0172\t\t\2\2"+
		"\u016e\u0172\n\6\2\2\u016f\u0170\t\7\2\2\u0170\u0172\t\b\2\2\u0171\u016d"+
		"\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0172d\3\2\2\2\21\2\u0101"+
		"\u0109\u011b\u0120\u0123\u0125\u012b\u012f\u0133\u0139\u015c\u0164\u016b"+
		"\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}