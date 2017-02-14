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
		T__17=18, T__18=19, T__19=20, T__20=21, UnsignedInteger=22, UnsignedLong=23, 
		LongNumber=24, DoubleNumber=25, FloatingPointNumber=26, Boolean=27, Integer=28, 
		LCURLY=29, RCURLY=30, FLOAT_TERMINATOR=31, LONG_TERMINATOR=32, DOUBLE_SEMI_COLON=33, 
		SEMI_COLON=34, PERIOD=35, PLUS=36, MINUS=37, MULTIPLY=38, DIVISION=39, 
		COLON=40, LEFT_PAREN=41, RIGHT_PAREN=42, SMALL_ARROW=43, ASSIGN_SIGN=44, 
		EQUAL_SIGN=45, WHITESPACE=46, Identifier=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "UnsignedInteger", "UnsignedLong", 
		"LongNumber", "DoubleNumber", "FloatingPointNumber", "Boolean", "Integer", 
		"LCURLY", "RCURLY", "FLOAT_TERMINATOR", "LONG_TERMINATOR", "DOUBLE_SEMI_COLON", 
		"SEMI_COLON", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "WHITESPACE", 
		"Identifier", "JavaLetter", "JavaLetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'struct'", "'constant'", "'uniform'", "'!'", "'['", 
		"']'", "'let'", "'$'", "'UniformConstant'", "'Input'", "'Uniform'", "'Output'", 
		"'Workgroup'", "'CrossWorkgroup'", "'Private'", "'Function'", "'Generic'", 
		"'PushConstant'", "'AtomicCounter'", "'Image'", null, null, null, null, 
		null, null, null, "'{'", "'}'", "'f'", "'L'", "';;'", "';'", "'.'", "'+'", 
		"'-'", "'*'", "'/'", "':'", "'('", "')'", "'->'", "':='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "UnsignedInteger", 
		"UnsignedLong", "LongNumber", "DoubleNumber", "FloatingPointNumber", "Boolean", 
		"Integer", "LCURLY", "RCURLY", "FLOAT_TERMINATOR", "LONG_TERMINATOR", 
		"DOUBLE_SEMI_COLON", "SEMI_COLON", "PERIOD", "PLUS", "MINUS", "MULTIPLY", 
		"DIVISION", "COLON", "LEFT_PAREN", "RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", 
		"EQUAL_SIGN", "WHITESPACE", "Identifier"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u019a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\5\32\u0120\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33"+
		"\u0128\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0135\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3$\5$\u0149\n$\3$\6$\u014c\n$\r$\16$\u014d\3$\5$\u0151\n$\5$\u0153"+
		"\n$\3%\3%\7%\u0157\n%\f%\16%\u015a\13%\3%\5%\u015d\n%\3&\3&\5&\u0161\n"+
		"&\3\'\3\'\3(\3(\5(\u0167\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\6\64\u0182\n\64"+
		"\r\64\16\64\u0183\3\64\3\64\3\65\3\65\7\65\u018a\n\65\f\65\16\65\u018d"+
		"\13\65\3\66\3\66\3\66\3\66\5\66\u0193\n\66\3\67\3\67\3\67\3\67\5\67\u0199"+
		"\n\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2O\2Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k"+
		"\2m\2\3\2\t\3\2\63;\5\2\13\f\17\17\"\"\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\u01a3\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3o\3\2\2\2\5"+
		"v\3\2\2\2\7}\3\2\2\2\t\u0086\3\2\2\2\13\u008e\3\2\2\2\r\u0090\3\2\2\2"+
		"\17\u0092\3\2\2\2\21\u0094\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2\2\27"+
		"\u00aa\3\2\2\2\31\u00b0\3\2\2\2\33\u00b8\3\2\2\2\35\u00bf\3\2\2\2\37\u00c9"+
		"\3\2\2\2!\u00d8\3\2\2\2#\u00e0\3\2\2\2%\u00e9\3\2\2\2\'\u00f1\3\2\2\2"+
		")\u00fe\3\2\2\2+\u010c\3\2\2\2-\u0112\3\2\2\2/\u0115\3\2\2\2\61\u0118"+
		"\3\2\2\2\63\u011b\3\2\2\2\65\u0123\3\2\2\2\67\u0134\3\2\2\29\u0136\3\2"+
		"\2\2;\u0138\3\2\2\2=\u013a\3\2\2\2?\u013c\3\2\2\2A\u013e\3\2\2\2C\u0140"+
		"\3\2\2\2E\u0143\3\2\2\2G\u0152\3\2\2\2I\u0154\3\2\2\2K\u0160\3\2\2\2M"+
		"\u0162\3\2\2\2O\u0166\3\2\2\2Q\u0168\3\2\2\2S\u016a\3\2\2\2U\u016c\3\2"+
		"\2\2W\u016e\3\2\2\2Y\u0170\3\2\2\2[\u0172\3\2\2\2]\u0174\3\2\2\2_\u0176"+
		"\3\2\2\2a\u0178\3\2\2\2c\u017b\3\2\2\2e\u017e\3\2\2\2g\u0181\3\2\2\2i"+
		"\u0187\3\2\2\2k\u0192\3\2\2\2m\u0198\3\2\2\2op\7k\2\2pq\7o\2\2qr\7r\2"+
		"\2rs\7q\2\2st\7t\2\2tu\7v\2\2u\4\3\2\2\2vw\7u\2\2wx\7v\2\2xy\7t\2\2yz"+
		"\7w\2\2z{\7e\2\2{|\7v\2\2|\6\3\2\2\2}~\7e\2\2~\177\7q\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7v\2\2\u0085\b\3\2\2\2\u0086\u0087\7w\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7o\2\2\u008d\n\3\2\2\2\u008e\u008f\7#\2\2\u008f"+
		"\f\3\2\2\2\u0090\u0091\7]\2\2\u0091\16\3\2\2\2\u0092\u0093\7_\2\2\u0093"+
		"\20\3\2\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097"+
		"\22\3\2\2\2\u0098\u0099\7&\2\2\u0099\24\3\2\2\2\u009a\u009b\7W\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e\u009f\7q\2\2"+
		"\u009f\u00a0\7t\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\26\3\2\2\2\u00aa"+
		"\u00ab\7K\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7w\2\2"+
		"\u00ae\u00af\7v\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7W\2\2\u00b1\u00b2\7"+
		"p\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7o\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00ba"+
		"\7w\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7Y\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7m\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7t\2\2"+
		"\u00c5\u00c6\7q\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7r\2\2\u00c8\36\3\2"+
		"\2\2\u00c9\u00ca\7E\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7Y\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\7m\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7t\2\2"+
		"\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7r\2\2\u00d7 \3\2\2"+
		"\2\u00d8\u00d9\7R\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7x\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df"+
		"\"\3\2\2\2\u00e0\u00e1\7H\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8$\3\2\2\2\u00e9\u00ea\7I\2\2\u00ea\u00eb\7g\2"+
		"\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7e\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7R\2\2\u00f2\u00f3"+
		"\7w\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7E\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2"+
		"\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7v\2\2\u00fd(\3\2\2"+
		"\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7q\2\2\u0101\u0102"+
		"\7o\2\2\u0102\u0103\7k\2\2\u0103\u0104\7e\2\2\u0104\u0105\7E\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7w\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2"+
		"\u0109\u010a\7g\2\2\u010a\u010b\7t\2\2\u010b*\3\2\2\2\u010c\u010d\7K\2"+
		"\2\u010d\u010e\7o\2\2\u010e\u010f\7c\2\2\u010f\u0110\7i\2\2\u0110\u0111"+
		"\7g\2\2\u0111,\3\2\2\2\u0112\u0113\7w\2\2\u0113\u0114\59\35\2\u0114.\3"+
		"\2\2\2\u0115\u0116\7w\2\2\u0116\u0117\5\61\31\2\u0117\60\3\2\2\2\u0118"+
		"\u0119\5I%\2\u0119\u011a\5A!\2\u011a\62\3\2\2\2\u011b\u011f\5I%\2\u011c"+
		"\u011d\5Q)\2\u011d\u011e\5I%\2\u011e\u0120\3\2\2\2\u011f\u011c\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7f\2\2\u0122\64\3"+
		"\2\2\2\u0123\u0127\5I%\2\u0124\u0125\5Q)\2\u0125\u0126\5I%\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\5? \2\u012a\66\3\2\2\2\u012b\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d"+
		"\u012e\7w\2\2\u012e\u0135\7g\2\2\u012f\u0130\7h\2\2\u0130\u0131\7c\2\2"+
		"\u0131\u0132\7n\2\2\u0132\u0133\7u\2\2\u0133\u0135\7g\2\2\u0134\u012b"+
		"\3\2\2\2\u0134\u012f\3\2\2\2\u01358\3\2\2\2\u0136\u0137\5I%\2\u0137:\3"+
		"\2\2\2\u0138\u0139\7}\2\2\u0139<\3\2\2\2\u013a\u013b\7\177\2\2\u013b>"+
		"\3\2\2\2\u013c\u013d\7h\2\2\u013d@\3\2\2\2\u013e\u013f\7N\2\2\u013fB\3"+
		"\2\2\2\u0140\u0141\7=\2\2\u0141\u0142\7=\2\2\u0142D\3\2\2\2\u0143\u0144"+
		"\7=\2\2\u0144F\3\2\2\2\u0145\u0153\7\62\2\2\u0146\u0150\5M\'\2\u0147\u0149"+
		"\5I%\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0151\3\2\2\2\u014a"+
		"\u014c\7a\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\5I%\2\u0150\u0148"+
		"\3\2\2\2\u0150\u014b\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0145\3\2\2\2\u0152"+
		"\u0146\3\2\2\2\u0153H\3\2\2\2\u0154\u015c\5K&\2\u0155\u0157\5O(\2\u0156"+
		"\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\5K&\2\u015c\u0158"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015dJ\3\2\2\2\u015e\u0161\7\62\2\2\u015f"+
		"\u0161\5M\'\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161L\3\2\2\2\u0162"+
		"\u0163\t\2\2\2\u0163N\3\2\2\2\u0164\u0167\5K&\2\u0165\u0167\7a\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167P\3\2\2\2\u0168\u0169\7\60\2\2"+
		"\u0169R\3\2\2\2\u016a\u016b\7-\2\2\u016bT\3\2\2\2\u016c\u016d\7/\2\2\u016d"+
		"V\3\2\2\2\u016e\u016f\7,\2\2\u016fX\3\2\2\2\u0170\u0171\7\61\2\2\u0171"+
		"Z\3\2\2\2\u0172\u0173\7<\2\2\u0173\\\3\2\2\2\u0174\u0175\7*\2\2\u0175"+
		"^\3\2\2\2\u0176\u0177\7+\2\2\u0177`\3\2\2\2\u0178\u0179\7/\2\2\u0179\u017a"+
		"\7@\2\2\u017ab\3\2\2\2\u017b\u017c\7<\2\2\u017c\u017d\7?\2\2\u017dd\3"+
		"\2\2\2\u017e\u017f\7?\2\2\u017ff\3\2\2\2\u0180\u0182\t\3\2\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\b\64\2\2\u0186h\3\2\2\2\u0187\u018b\5k\66\2"+
		"\u0188\u018a\5m\67\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018cj\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0193\t\4\2\2\u018f\u0193\n\5\2\2\u0190\u0191\t\6\2\2\u0191\u0193\t\7"+
		"\2\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"l\3\2\2\2\u0194\u0199\t\b\2\2\u0195\u0199\n\5\2\2\u0196\u0197\t\6\2\2"+
		"\u0197\u0199\t\7\2\2\u0198\u0194\3\2\2\2\u0198\u0195\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0199n\3\2\2\2\22\2\u011f\u0127\u0134\u0148\u014d\u0150\u0152"+
		"\u0158\u015c\u0160\u0166\u0183\u018b\u0192\u0198\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}