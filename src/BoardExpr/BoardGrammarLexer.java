// Generated from BoardGrammar.g4 by ANTLR 4.0

package BoardExpr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoardGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, COMMENT=5, WHITESPACE=6, INTEGER=7, X=8, 
		Y=9, EQUALS=10, NAMEKEY=11, XVEL=12, YVEL=13, GRAVITY=14, FRICTION1=15, 
		FRICTION2=16, TRIGGER=17, ORIENTATIONKEY=18, ACTION=19, WIDTH=20, HEIGHT=21, 
		BOARD=22, BALL=23, ABSORBER=24, FIRE=25, SQUAREBUMPER=26, CIRCLEBUMPER=27, 
		TRIANGLEBUMPER=28, LEFTFLIPPER=29, RIGHTFLIPPER=30, FLOAT=31, NAME=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'90'", "'270'", "'0'", "'180'", "COMMENT", "WHITESPACE", "INTEGER", "'x'", 
		"'y'", "'='", "'name'", "'xVelocity'", "'yVelocity'", "'gravity'", "'friction1'", 
		"'friction2'", "'trigger'", "'orientation'", "'action'", "'width'", "'height'", 
		"'board'", "'ball'", "'absorber'", "'fire'", "'squareBumper'", "'circleBumper'", 
		"'triangleBumper'", "'leftFlipper'", "'rightFlipper'", "FLOAT", "NAME"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "COMMENT", "WHITESPACE", "INTEGER", "X", 
		"Y", "EQUALS", "NAMEKEY", "XVEL", "YVEL", "GRAVITY", "FRICTION1", "FRICTION2", 
		"TRIGGER", "ORIENTATIONKEY", "ACTION", "WIDTH", "HEIGHT", "BOARD", "BALL", 
		"ABSORBER", "FIRE", "SQUAREBUMPER", "CIRCLEBUMPER", "TRIANGLEBUMPER", 
		"LEFTFLIPPER", "RIGHTFLIPPER", "FLOAT", "NAME"
	};


	    /**
	     * Call this method to have the lexer or parser throw a RuntimeException if
	     * it encounters an error.
	     */
	    public void reportErrorsAsExceptions() {
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }
	    
	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public BoardGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BoardGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 5: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\"\u013c\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\7\6S\n\6\f\6\16\6V\13\6\3\6\3\6\3\6\3\6\3\7\6\7]\n"+
		"\7\r\7\16\7^\3\7\3\7\3\b\6\bd\n\b\r\b\16\be\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \5"+
		" \u0127\n \3 \6 \u012a\n \r \16 \u012b\3 \3 \6 \u0130\n \r \16 \u0131"+
		"\5 \u0134\n \3!\3!\7!\u0138\n!\f!\16!\u013b\13!\2\"\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\2\r\b\3\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1\3\2\t\3\f\f\6\13"+
		"\f\17\17\"\"..\3\62;\3\62;\3\62;\5C\\aac|\b..\60\60\62;C\\aac|\u0143\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5F\3\2\2\2\7J\3\2\2\2"+
		"\tL\3\2\2\2\13P\3\2\2\2\r\\\3\2\2\2\17c\3\2\2\2\21g\3\2\2\2\23i\3\2\2"+
		"\2\25k\3\2\2\2\27m\3\2\2\2\31r\3\2\2\2\33|\3\2\2\2\35\u0086\3\2\2\2\37"+
		"\u008e\3\2\2\2!\u0098\3\2\2\2#\u00a2\3\2\2\2%\u00aa\3\2\2\2\'\u00b6\3"+
		"\2\2\2)\u00bd\3\2\2\2+\u00c3\3\2\2\2-\u00ca\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d5\3\2\2\2\63\u00de\3\2\2\2\65\u00e3\3\2\2\2\67\u00f0\3\2\2\29\u00fd"+
		"\3\2\2\2;\u010c\3\2\2\2=\u0118\3\2\2\2?\u0126\3\2\2\2A\u0135\3\2\2\2C"+
		"D\7;\2\2DE\7\62\2\2E\4\3\2\2\2FG\7\64\2\2GH\79\2\2HI\7\62\2\2I\6\3\2\2"+
		"\2JK\7\62\2\2K\b\3\2\2\2LM\7\63\2\2MN\7:\2\2NO\7\62\2\2O\n\3\2\2\2PT\7"+
		"%\2\2QS\n\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3"+
		"\2\2\2WX\7\f\2\2XY\3\2\2\2YZ\b\6\2\2Z\f\3\2\2\2[]\t\3\2\2\\[\3\2\2\2]"+
		"^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\7\3\2a\16\3\2\2\2bd\t\4\2"+
		"\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\20\3\2\2\2gh\7z\2\2h\22\3"+
		"\2\2\2ij\7{\2\2j\24\3\2\2\2kl\7?\2\2l\26\3\2\2\2mn\7p\2\2no\7c\2\2op\7"+
		"o\2\2pq\7g\2\2q\30\3\2\2\2rs\7z\2\2st\7X\2\2tu\7g\2\2uv\7n\2\2vw\7q\2"+
		"\2wx\7e\2\2xy\7k\2\2yz\7v\2\2z{\7{\2\2{\32\3\2\2\2|}\7{\2\2}~\7X\2\2~"+
		"\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081\u0082\7e\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7v\2\2\u0084\u0085\7{\2\2\u0085\34\3\2\2\2\u0086"+
		"\u0087\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2\u0089\u008a\7x\2\2"+
		"\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7{\2\2\u008d\36\3\2"+
		"\2\2\u008e\u008f\7h\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7\63\2\2\u0097 \3\2\2\2\u0098\u0099\7h\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b\u009c\7e\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7k\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1"+
		"\7\64\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7\7i\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2"+
		"\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7q\2\2"+
		"\u00bb\u00bc\7p\2\2\u00bc(\3\2\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7k\2"+
		"\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7j\2\2\u00c2*\3\2"+
		"\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7i\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7v\2\2\u00c9,\3\2\2\2\u00ca\u00cb"+
		"\7d\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ce"+
		"\u00cf\7f\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7c\2\2\u00d2"+
		"\u00d3\7n\2\2\u00d3\u00d4\7n\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7d\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2"+
		"\u00da\u00db\7d\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7t\2\2\u00dd\62\3\2"+
		"\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7s\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"\u00ea\7D\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed\7r\2\2"+
		"\u00ed\u00ee\7g\2\2\u00ee\u00ef\7t\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7"+
		"e\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5"+
		"\7n\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7D\2\2\u00f7\u00f8\7w\2\2\u00f8"+
		"\u00f9\7o\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7t\2\2"+
		"\u00fc8\3\2\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7k\2"+
		"\2\u0100\u0101\7c\2\2\u0101\u0102\7p\2\2\u0102\u0103\7i\2\2\u0103\u0104"+
		"\7n\2\2\u0104\u0105\7g\2\2\u0105\u0106\7D\2\2\u0106\u0107\7w\2\2\u0107"+
		"\u0108\7o\2\2\u0108\u0109\7r\2\2\u0109\u010a\7g\2\2\u010a\u010b\7t\2\2"+
		"\u010b:\3\2\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e\u010f\7h\2"+
		"\2\u010f\u0110\7v\2\2\u0110\u0111\7H\2\2\u0111\u0112\7n\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7r\2\2\u0114\u0115\7r\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7t\2\2\u0117<\3\2\2\2\u0118\u0119\7t\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7i\2\2\u011b\u011c\7j\2\2\u011c\u011d\7v\2\2\u011d\u011e\7H\2\2"+
		"\u011e\u011f\7n\2\2\u011f\u0120\7k\2\2\u0120\u0121\7r\2\2\u0121\u0122"+
		"\7r\2\2\u0122\u0123\7g\2\2\u0123\u0124\7t\2\2\u0124>\3\2\2\2\u0125\u0127"+
		"\7/\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u012a\t\5\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u0133\3\2\2\2\u012d\u012f\13\2\2\2\u012e"+
		"\u0130\t\6\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134@\3\2\2\2\u0135\u0139\t\7\2\2\u0136\u0138\t\b\2\2"+
		"\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013aB\3\2\2\2\u013b\u0139\3\2\2\2\13\2T^e\u0126\u012b\u0131"+
		"\u0133\u0139";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}