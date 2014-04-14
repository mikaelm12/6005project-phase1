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
		T__3=1, T__2=2, T__1=3, T__0=4, X=5, Y=6, EQUALS=7, NAME=8, XVEL=9, YVEL=10, 
		GRAVITY=11, FRICTION1=12, FRICTION2=13, TRIGGER=14, ORIENTATION=15, ACTION=16, 
		WIDTH=17, HEIGHT=18, WHITESPACE=19, BOARD=20, BALL=21, ABSORBER=22, FIRE=23, 
		SQUAREBUMPER=24, CIRCLEBUMPER=25, TRIANGLEBUMPER=26, LEFTFLIPPER=27, RIGHTFLIPPER=28, 
		INTEGER=29, FLOAT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'90'", "'270'", "'0'", "'180'", "'X'", "'Y'", "'='", "'name'", "'xVElocity'", 
		"'yVelcocity'", "'gravity'", "'friction1'", "'friction2'", "'trigger'", 
		"'orientation'", "'action'", "'width'", "'height'", "WHITESPACE", "'board'", 
		"'ball'", "'absorber'", "'fire'", "'squareBumper'", "'circleBumper'", 
		"'triangleBumper'", "'leftFlipper'", "'rightFlipper'", "INTEGER", "FLOAT"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "X", "Y", "EQUALS", "NAME", "XVEL", "YVEL", 
		"GRAVITY", "FRICTION1", "FRICTION2", "TRIGGER", "ORIENTATION", "ACTION", 
		"WIDTH", "HEIGHT", "WHITESPACE", "BOARD", "BALL", "ABSORBER", "FIRE", 
		"SQUAREBUMPER", "CIRCLEBUMPER", "TRIANGLEBUMPER", "LEFTFLIPPER", "RIGHTFLIPPER", 
		"INTEGER", "FLOAT"
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
		case 18: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4 \u0129\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tU\n\t\f\t\16\tX\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00b4"+
		"\n\24\r\24\16\24\u00b5\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\6\36\u0116\n\36\r\36\16\36\u0117\3\37\5\37\u011b\n\37\3\37\6\37\u011e"+
		"\n\37\r\37\16\37\u011f\3\37\3\37\6\37\u0124\n\37\r\37\16\37\u0125\5\37"+
		"\u0128\n\37\2 \3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\2)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1"+
		"= \1\3\2\b\5C\\aac|\6\62;C\\aac|\5\13\f\17\17\"\"\3\62;\3\62;\3\62;\u012f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13L\3\2"+
		"\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23Y\3\2\2\2\25c\3\2\2\2\27n\3"+
		"\2\2\2\31v\3\2\2\2\33\u0080\3\2\2\2\35\u008a\3\2\2\2\37\u0092\3\2\2\2"+
		"!\u009e\3\2\2\2#\u00a5\3\2\2\2%\u00ab\3\2\2\2\'\u00b3\3\2\2\2)\u00b9\3"+
		"\2\2\2+\u00bf\3\2\2\2-\u00c4\3\2\2\2/\u00cd\3\2\2\2\61\u00d2\3\2\2\2\63"+
		"\u00df\3\2\2\2\65\u00ec\3\2\2\2\67\u00fb\3\2\2\29\u0107\3\2\2\2;\u0115"+
		"\3\2\2\2=\u011a\3\2\2\2?@\7;\2\2@A\7\62\2\2A\4\3\2\2\2BC\7\64\2\2CD\7"+
		"9\2\2DE\7\62\2\2E\6\3\2\2\2FG\7\62\2\2G\b\3\2\2\2HI\7\63\2\2IJ\7:\2\2"+
		"JK\7\62\2\2K\n\3\2\2\2LM\7Z\2\2M\f\3\2\2\2NO\7[\2\2O\16\3\2\2\2PQ\7?\2"+
		"\2Q\20\3\2\2\2RV\t\2\2\2SU\t\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2W\22\3\2\2\2XV\3\2\2\2YZ\7z\2\2Z[\7X\2\2[\\\7G\2\2\\]\7n\2\2]^\7q"+
		"\2\2^_\7e\2\2_`\7k\2\2`a\7v\2\2ab\7{\2\2b\24\3\2\2\2cd\7{\2\2de\7X\2\2"+
		"ef\7g\2\2fg\7n\2\2gh\7e\2\2hi\7q\2\2ij\7e\2\2jk\7k\2\2kl\7v\2\2lm\7{\2"+
		"\2m\26\3\2\2\2no\7i\2\2op\7t\2\2pq\7c\2\2qr\7x\2\2rs\7k\2\2st\7v\2\2t"+
		"u\7{\2\2u\30\3\2\2\2vw\7h\2\2wx\7t\2\2xy\7k\2\2yz\7e\2\2z{\7v\2\2{|\7"+
		"k\2\2|}\7q\2\2}~\7p\2\2~\177\7\63\2\2\177\32\3\2\2\2\u0080\u0081\7h\2"+
		"\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7e\2\2\u0084\u0085"+
		"\7v\2\2\u0085\u0086\7k\2\2\u0086\u0087\7q\2\2\u0087\u0088\7p\2\2\u0088"+
		"\u0089\7\64\2\2\u0089\34\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7k\2\2\u008d\u008e\7i\2\2\u008e\u008f\7i\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7t\2\2\u0091\36\3\2\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7t\2\2\u0094\u0095\7k\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7v\2\2\u0098\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a\u009b\7k\2\2"+
		"\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d \3\2\2\2\u009e\u009f\7c\2"+
		"\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7p\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7"+
		"\7k\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa"+
		"$\3\2\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7i\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7v\2\2\u00b1&\3\2\2\2\u00b2"+
		"\u00b4\t\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\24\2\2\u00b8"+
		"(\3\2\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7f\2\2\u00be*\3\2\2\2\u00bf\u00c0\7d\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7n\2\2\u00c3,\3\2\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7q\2\2"+
		"\u00c8\u00c9\7t\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4"+
		"\7s\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7D\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7o\2\2"+
		"\u00db\u00dc\7r\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\62\3\2"+
		"\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3"+
		"\7e\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7D\2\2\u00e6"+
		"\u00e7\7w\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7"+
		"t\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2"+
		"\7i\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7D\2\2\u00f5"+
		"\u00f6\7w\2\2\u00f6\u00f7\7o\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7g\2\2"+
		"\u00f9\u00fa\7t\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7"+
		"g\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7H\2\2\u0100\u0101"+
		"\7n\2\2\u0101\u0102\7k\2\2\u0102\u0103\7r\2\2\u0103\u0104\7r\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7t\2\2\u01068\3\2\2\2\u0107\u0108\7t\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7i\2\2\u010a\u010b\7j\2\2\u010b\u010c\7v\2\2"+
		"\u010c\u010d\7H\2\2\u010d\u010e\7n\2\2\u010e\u010f\7k\2\2\u010f\u0110"+
		"\7r\2\2\u0110\u0111\7r\2\2\u0111\u0112\7g\2\2\u0112\u0113\7t\2\2\u0113"+
		":\3\2\2\2\u0114\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118<\3\2\2\2\u0119\u011b\7"+
		"/\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011e\t\6\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u0123\13\2\2\2\u0122"+
		"\u0124\t\7\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128>\3\2\2\2\n\2V\u00b5\u0117\u011a\u011f\u0125\u0127";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}