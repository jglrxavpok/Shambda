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
		T__17=18, UnsignedInteger=19, UnsignedLong=20, LongNumber=21, DoubleNumber=22, 
		FloatingPointNumber=23, Boolean=24, Integer=25, FLOAT_TERMINATOR=26, LONG_TERMINATOR=27, 
		DOUBLE_SEMI_COLON=28, SEMI_COLON=29, PERIOD=30, PLUS=31, MINUS=32, MULTIPLY=33, 
		DIVISION=34, COLON=35, LEFT_PAREN=36, RIGHT_PAREN=37, SMALL_ARROW=38, 
		ASSIGN_SIGN=39, EQUAL_SIGN=40, WHITESPACE=41, Identifier=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "UnsignedInteger", "UnsignedLong", "LongNumber", "DoubleNumber", 
		"FloatingPointNumber", "Boolean", "Integer", "FLOAT_TERMINATOR", "LONG_TERMINATOR", 
		"DOUBLE_SEMI_COLON", "SEMI_COLON", "DecimalNumeral", "Digits", "Digit", 
		"NonZeroDigit", "DigitOrUnderscore", "PERIOD", "PLUS", "MINUS", "MULTIPLY", 
		"DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", 
		"EQUAL_SIGN", "WHITESPACE", "Identifier", "JavaLetter", "JavaLetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#import'", "'constant'", "'uniform'", "'!'", "'let'", "'$'", "'UniformConstant'", 
		"'Input'", "'Uniform'", "'Output'", "'Workgroup'", "'CrossWorkgroup'", 
		"'Private'", "'Function'", "'Generic'", "'PushConstant'", "'AtomicCounter'", 
		"'Image'", null, null, null, null, null, null, null, "'f'", "'L'", "';;'", 
		"';'", "'.'", "'+'", "'-'", "'*'", "'/'", "':'", "'('", "')'", "'->'", 
		"':='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "UnsignedInteger", "UnsignedLong", 
		"LongNumber", "DoubleNumber", "FloatingPointNumber", "Boolean", "Integer", 
		"FLOAT_TERMINATOR", "LONG_TERMINATOR", "DOUBLE_SEMI_COLON", "SEMI_COLON", 
		"PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "WHITESPACE", 
		"Identifier"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u0114\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0121\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\5\37\u0131\n\37\3\37\6\37\u0134\n\37\r\37\16\37\u0135"+
		"\3\37\5\37\u0139\n\37\5\37\u013b\n\37\3 \3 \7 \u013f\n \f \16 \u0142\13"+
		" \3 \5 \u0145\n \3!\3!\5!\u0149\n!\3\"\3\"\3#\3#\5#\u014f\n#\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\6"+
		"/\u016a\n/\r/\16/\u016b\3/\3/\3\60\3\60\7\60\u0172\n\60\f\60\16\60\u0175"+
		"\13\60\3\61\3\61\3\61\3\61\5\61\u017b\n\61\3\62\3\62\3\62\3\62\5\62\u0181"+
		"\n\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37=\2?\2A\2C\2E\2G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a\2c\2\3\2\t"+
		"\3\2\63;\5\2\13\f\17\17\"\"\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\u018b\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2G\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3e\3\2\2\2\5m"+
		"\3\2\2\2\7v\3\2\2\2\t~\3\2\2\2\13\u0080\3\2\2\2\r\u0084\3\2\2\2\17\u0086"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u009c\3\2\2\2\25\u00a4\3\2\2\2\27\u00ab\3"+
		"\2\2\2\31\u00b5\3\2\2\2\33\u00c4\3\2\2\2\35\u00cc\3\2\2\2\37\u00d5\3\2"+
		"\2\2!\u00dd\3\2\2\2#\u00ea\3\2\2\2%\u00f8\3\2\2\2\'\u00fe\3\2\2\2)\u0101"+
		"\3\2\2\2+\u0104\3\2\2\2-\u0107\3\2\2\2/\u010f\3\2\2\2\61\u0120\3\2\2\2"+
		"\63\u0122\3\2\2\2\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012b"+
		"\3\2\2\2=\u013a\3\2\2\2?\u013c\3\2\2\2A\u0148\3\2\2\2C\u014a\3\2\2\2E"+
		"\u014e\3\2\2\2G\u0150\3\2\2\2I\u0152\3\2\2\2K\u0154\3\2\2\2M\u0156\3\2"+
		"\2\2O\u0158\3\2\2\2Q\u015a\3\2\2\2S\u015c\3\2\2\2U\u015e\3\2\2\2W\u0160"+
		"\3\2\2\2Y\u0163\3\2\2\2[\u0166\3\2\2\2]\u0169\3\2\2\2_\u016f\3\2\2\2a"+
		"\u017a\3\2\2\2c\u0180\3\2\2\2ef\7%\2\2fg\7k\2\2gh\7o\2\2hi\7r\2\2ij\7"+
		"q\2\2jk\7t\2\2kl\7v\2\2l\4\3\2\2\2mn\7e\2\2no\7q\2\2op\7p\2\2pq\7u\2\2"+
		"qr\7v\2\2rs\7c\2\2st\7p\2\2tu\7v\2\2u\6\3\2\2\2vw\7w\2\2wx\7p\2\2xy\7"+
		"k\2\2yz\7h\2\2z{\7q\2\2{|\7t\2\2|}\7o\2\2}\b\3\2\2\2~\177\7#\2\2\177\n"+
		"\3\2\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083"+
		"\f\3\2\2\2\u0084\u0085\7&\2\2\u0085\16\3\2\2\2\u0086\u0087\7W\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\u008b\7q\2\2"+
		"\u008b\u008c\7t\2\2\u008c\u008d\7o\2\2\u008d\u008e\7E\2\2\u008e\u008f"+
		"\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\20\3\2\2\2\u0096"+
		"\u0097\7K\2\2\u0097\u0098\7p\2\2\u0098\u0099\7r\2\2\u0099\u009a\7w\2\2"+
		"\u009a\u009b\7v\2\2\u009b\22\3\2\2\2\u009c\u009d\7W\2\2\u009d\u009e\7"+
		"p\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7o\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6"+
		"\7w\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7Y\2\2\u00ac\u00ad\7q\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7t\2\2"+
		"\u00b1\u00b2\7q\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7r\2\2\u00b4\30\3\2"+
		"\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7Y\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7m\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7t\2\2"+
		"\u00c0\u00c1\7q\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7r\2\2\u00c3\32\3\2"+
		"\2\2\u00c4\u00c5\7R\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7x\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\34\3\2\2\2\u00cc\u00cd\7H\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7e\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7q\2\2"+
		"\u00d3\u00d4\7p\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7I\2\2\u00d6\u00d7\7"+
		"g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7t\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7e\2\2\u00dc \3\2\2\2\u00dd\u00de\7R\2\2\u00de\u00df"+
		"\7w\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7E\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\"\3\2"+
		"\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee"+
		"\7o\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7E\2\2\u00f1"+
		"\u00f2\7q\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7$\3\2\2\2\u00f8\u00f9\7K\2"+
		"\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\5\63\32\2\u0100"+
		"(\3\2\2\2\u0101\u0102\7w\2\2\u0102\u0103\5+\26\2\u0103*\3\2\2\2\u0104"+
		"\u0105\5? \2\u0105\u0106\5\67\34\2\u0106,\3\2\2\2\u0107\u010b\5? \2\u0108"+
		"\u0109\5G$\2\u0109\u010a\5? \2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7f\2\2\u010e.\3\2"+
		"\2\2\u010f\u0113\5? \2\u0110\u0111\5G$\2\u0111\u0112\5? \2\u0112\u0114"+
		"\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\5\65\33\2\u0116\60\3\2\2\2\u0117\u0118\7v\2\2\u0118\u0119\7t\2"+
		"\2\u0119\u011a\7w\2\2\u011a\u0121\7g\2\2\u011b\u011c\7h\2\2\u011c\u011d"+
		"\7c\2\2\u011d\u011e\7n\2\2\u011e\u011f\7u\2\2\u011f\u0121\7g\2\2\u0120"+
		"\u0117\3\2\2\2\u0120\u011b\3\2\2\2\u0121\62\3\2\2\2\u0122\u0123\5? \2"+
		"\u0123\64\3\2\2\2\u0124\u0125\7h\2\2\u0125\66\3\2\2\2\u0126\u0127\7N\2"+
		"\2\u01278\3\2\2\2\u0128\u0129\7=\2\2\u0129\u012a\7=\2\2\u012a:\3\2\2\2"+
		"\u012b\u012c\7=\2\2\u012c<\3\2\2\2\u012d\u013b\7\62\2\2\u012e\u0138\5"+
		"C\"\2\u012f\u0131\5? \2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0139\3\2\2\2\u0132\u0134\7a\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\5? \2\u0138\u0130\3\2\2\2\u0138\u0133\3\2\2\2\u0139\u013b\3\2\2"+
		"\2\u013a\u012d\3\2\2\2\u013a\u012e\3\2\2\2\u013b>\3\2\2\2\u013c\u0144"+
		"\5A!\2\u013d\u013f\5E#\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0145\5A!\2\u0144\u0140\3\2\2\2\u0144\u0145\3\2\2\2\u0145@"+
		"\3\2\2\2\u0146\u0149\7\62\2\2\u0147\u0149\5C\"\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149B\3\2\2\2\u014a\u014b\t\2\2\2\u014bD\3\2\2\2\u014c"+
		"\u014f\5A!\2\u014d\u014f\7a\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2"+
		"\2\u014fF\3\2\2\2\u0150\u0151\7\60\2\2\u0151H\3\2\2\2\u0152\u0153\7-\2"+
		"\2\u0153J\3\2\2\2\u0154\u0155\7/\2\2\u0155L\3\2\2\2\u0156\u0157\7,\2\2"+
		"\u0157N\3\2\2\2\u0158\u0159\7\61\2\2\u0159P\3\2\2\2\u015a\u015b\7<\2\2"+
		"\u015bR\3\2\2\2\u015c\u015d\7*\2\2\u015dT\3\2\2\2\u015e\u015f\7+\2\2\u015f"+
		"V\3\2\2\2\u0160\u0161\7/\2\2\u0161\u0162\7@\2\2\u0162X\3\2\2\2\u0163\u0164"+
		"\7<\2\2\u0164\u0165\7?\2\2\u0165Z\3\2\2\2\u0166\u0167\7?\2\2\u0167\\\3"+
		"\2\2\2\u0168\u016a\t\3\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b/"+
		"\2\2\u016e^\3\2\2\2\u016f\u0173\5a\61\2\u0170\u0172\5c\62\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"`\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017b\t\4\2\2\u0177\u017b\n\5\2\2"+
		"\u0178\u0179\t\6\2\2\u0179\u017b\t\7\2\2\u017a\u0176\3\2\2\2\u017a\u0177"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017bb\3\2\2\2\u017c\u0181\t\b\2\2\u017d"+
		"\u0181\n\5\2\2\u017e\u017f\t\6\2\2\u017f\u0181\t\7\2\2\u0180\u017c\3\2"+
		"\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0181d\3\2\2\2\22\2\u010b"+
		"\u0113\u0120\u0130\u0135\u0138\u013a\u0140\u0144\u0148\u014e\u016b\u0173"+
		"\u017a\u0180\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}