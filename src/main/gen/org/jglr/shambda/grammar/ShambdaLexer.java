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
		ASSIGN_SIGN=39, EQUAL_SIGN=40, LOWERCASE_LETTER=41, UPPERCASE_LETTER=42, 
		STAR=43, WHITESPACE=44, Identifier=45;
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
		"EQUAL_SIGN", "LOWERCASE_LETTER", "UPPERCASE_LETTER", "STAR", "WHITESPACE", 
		"Identifier", "JavaLetter", "JavaLetterOrDigit"
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
		"RIGHT_PAREN", "SMALL_ARROW", "ASSIGN_SIGN", "EQUAL_SIGN", "LOWERCASE_LETTER", 
		"UPPERCASE_LETTER", "STAR", "WHITESPACE", "Identifier"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0112\n\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u011a\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0127\n\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u0137\n\37\3\37\6\37"+
		"\u013a\n\37\r\37\16\37\u013b\3\37\5\37\u013f\n\37\5\37\u0141\n\37\3 \3"+
		" \7 \u0145\n \f \16 \u0148\13 \3 \5 \u014b\n \3!\3!\5!\u014f\n!\3\"\3"+
		"\"\3#\3#\5#\u0155\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\6\62\u0176\n"+
		"\62\r\62\16\62\u0177\3\62\3\62\3\63\3\63\7\63\u017e\n\63\f\63\16\63\u0181"+
		"\13\63\3\64\3\64\3\64\3\64\5\64\u0187\n\64\3\65\3\65\3\65\3\65\5\65\u018d"+
		"\n\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37=\2?\2A\2C\2E\2G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\2i\2"+
		"\3\2\n\3\2\63;\3\2,,\5\2\13\f\17\17\"\"\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\u0197\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3k\3\2\2\2\5s\3\2\2\2\7|\3\2\2\2\t"+
		"\u0084\3\2\2\2\13\u0086\3\2\2\2\r\u008a\3\2\2\2\17\u008c\3\2\2\2\21\u009c"+
		"\3\2\2\2\23\u00a2\3\2\2\2\25\u00aa\3\2\2\2\27\u00b1\3\2\2\2\31\u00bb\3"+
		"\2\2\2\33\u00ca\3\2\2\2\35\u00d2\3\2\2\2\37\u00db\3\2\2\2!\u00e3\3\2\2"+
		"\2#\u00f0\3\2\2\2%\u00fe\3\2\2\2\'\u0104\3\2\2\2)\u0107\3\2\2\2+\u010a"+
		"\3\2\2\2-\u010d\3\2\2\2/\u0115\3\2\2\2\61\u0126\3\2\2\2\63\u0128\3\2\2"+
		"\2\65\u012a\3\2\2\2\67\u012c\3\2\2\29\u012e\3\2\2\2;\u0131\3\2\2\2=\u0140"+
		"\3\2\2\2?\u0142\3\2\2\2A\u014e\3\2\2\2C\u0150\3\2\2\2E\u0154\3\2\2\2G"+
		"\u0156\3\2\2\2I\u0158\3\2\2\2K\u015a\3\2\2\2M\u015c\3\2\2\2O\u015e\3\2"+
		"\2\2Q\u0160\3\2\2\2S\u0162\3\2\2\2U\u0164\3\2\2\2W\u0166\3\2\2\2Y\u0169"+
		"\3\2\2\2[\u016c\3\2\2\2]\u016e\3\2\2\2_\u0170\3\2\2\2a\u0172\3\2\2\2c"+
		"\u0175\3\2\2\2e\u017b\3\2\2\2g\u0186\3\2\2\2i\u018c\3\2\2\2kl\7%\2\2l"+
		"m\7k\2\2mn\7o\2\2no\7r\2\2op\7q\2\2pq\7t\2\2qr\7v\2\2r\4\3\2\2\2st\7e"+
		"\2\2tu\7q\2\2uv\7p\2\2vw\7u\2\2wx\7v\2\2xy\7c\2\2yz\7p\2\2z{\7v\2\2{\6"+
		"\3\2\2\2|}\7w\2\2}~\7p\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080\u0081\7"+
		"q\2\2\u0081\u0082\7t\2\2\u0082\u0083\7o\2\2\u0083\b\3\2\2\2\u0084\u0085"+
		"\7#\2\2\u0085\n\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7v\2\2\u0089\f\3\2\2\2\u008a\u008b\7&\2\2\u008b\16\3\2\2\2\u008c\u008d"+
		"\7W\2\2\u008d\u008e\7p\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\u0093\7o\2\2\u0093\u0094\7E\2\2"+
		"\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\u0097\7u\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7c\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\20\3\2\2\2\u009c\u009d\7K\2\2\u009d\u009e\7p\2\2\u009e\u009f\7r\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7v\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7W\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\u00a9\7o\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7"+
		"Q\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7v\2\2\u00b0\26\3\2\2\2\u00b1\u00b2\7Y\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7m\2\2\u00b5\u00b6\7i\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7r\2\2"+
		"\u00ba\30\3\2\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7"+
		"q\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7Y\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7m\2\2\u00c4\u00c5\7i\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7r\2\2"+
		"\u00c9\32\3\2\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7"+
		"k\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\34\3\2\2\2\u00d2\u00d3\7H\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7p\2\2\u00da\36\3\2\2\2\u00db\u00dc\7I\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7e\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7R\2"+
		"\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8"+
		"\7E\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7u\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2"+
		"\u00ef\"\3\2\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7q"+
		"\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7"+
		"\7E\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7p\2\2\u00fa"+
		"\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7t\2\2\u00fd$\3\2\2\2\u00fe"+
		"\u00ff\7K\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7c\2\2\u0101\u0102\7i\2\2"+
		"\u0102\u0103\7g\2\2\u0103&\3\2\2\2\u0104\u0105\7w\2\2\u0105\u0106\5\63"+
		"\32\2\u0106(\3\2\2\2\u0107\u0108\7w\2\2\u0108\u0109\5+\26\2\u0109*\3\2"+
		"\2\2\u010a\u010b\5? \2\u010b\u010c\5\67\34\2\u010c,\3\2\2\2\u010d\u0111"+
		"\5? \2\u010e\u010f\5G$\2\u010f\u0110\5? \2\u0110\u0112\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7f\2\2\u0114"+
		".\3\2\2\2\u0115\u0119\5? \2\u0116\u0117\5G$\2\u0117\u0118\5? \2\u0118"+
		"\u011a\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\5\65\33\2\u011c\60\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7t\2\2\u011f\u0120\7w\2\2\u0120\u0127\7g\2\2\u0121\u0122\7h\2\2\u0122"+
		"\u0123\7c\2\2\u0123\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0127\7g\2\2"+
		"\u0126\u011d\3\2\2\2\u0126\u0121\3\2\2\2\u0127\62\3\2\2\2\u0128\u0129"+
		"\5? \2\u0129\64\3\2\2\2\u012a\u012b\7h\2\2\u012b\66\3\2\2\2\u012c\u012d"+
		"\7N\2\2\u012d8\3\2\2\2\u012e\u012f\7=\2\2\u012f\u0130\7=\2\2\u0130:\3"+
		"\2\2\2\u0131\u0132\7=\2\2\u0132<\3\2\2\2\u0133\u0141\7\62\2\2\u0134\u013e"+
		"\5C\"\2\u0135\u0137\5? \2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013f\3\2\2\2\u0138\u013a\7a\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\5? \2\u013e\u0136\3\2\2\2\u013e\u0139\3\2\2\2\u013f\u0141\3\2\2"+
		"\2\u0140\u0133\3\2\2\2\u0140\u0134\3\2\2\2\u0141>\3\2\2\2\u0142\u014a"+
		"\5A!\2\u0143\u0145\5E#\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014b\5A!\2\u014a\u0146\3\2\2\2\u014a\u014b\3\2\2\2\u014b@"+
		"\3\2\2\2\u014c\u014f\7\62\2\2\u014d\u014f\5C\"\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014fB\3\2\2\2\u0150\u0151\t\2\2\2\u0151D\3\2\2\2\u0152"+
		"\u0155\5A!\2\u0153\u0155\7a\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2"+
		"\2\u0155F\3\2\2\2\u0156\u0157\7\60\2\2\u0157H\3\2\2\2\u0158\u0159\7-\2"+
		"\2\u0159J\3\2\2\2\u015a\u015b\7/\2\2\u015bL\3\2\2\2\u015c\u015d\7,\2\2"+
		"\u015dN\3\2\2\2\u015e\u015f\7\61\2\2\u015fP\3\2\2\2\u0160\u0161\7<\2\2"+
		"\u0161R\3\2\2\2\u0162\u0163\7*\2\2\u0163T\3\2\2\2\u0164\u0165\7+\2\2\u0165"+
		"V\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0168\7@\2\2\u0168X\3\2\2\2\u0169\u016a"+
		"\7<\2\2\u016a\u016b\7?\2\2\u016bZ\3\2\2\2\u016c\u016d\7?\2\2\u016d\\\3"+
		"\2\2\2\u016e\u016f\4c|\2\u016f^\3\2\2\2\u0170\u0171\4C\\\2\u0171`\3\2"+
		"\2\2\u0172\u0173\t\3\2\2\u0173b\3\2\2\2\u0174\u0176\t\4\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\b\62\2\2\u017ad\3\2\2\2\u017b\u017f\5g\64\2"+
		"\u017c\u017e\5i\65\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180f\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0187\t\5\2\2\u0183\u0187\n\6\2\2\u0184\u0185\t\7\2\2\u0185\u0187\t\b"+
		"\2\2\u0186\u0182\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"h\3\2\2\2\u0188\u018d\t\t\2\2\u0189\u018d\n\6\2\2\u018a\u018b\t\7\2\2"+
		"\u018b\u018d\t\b\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018dj\3\2\2\2\22\2\u0111\u0119\u0126\u0136\u013b\u013e\u0140"+
		"\u0146\u014a\u014e\u0154\u0177\u017f\u0186\u018c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}