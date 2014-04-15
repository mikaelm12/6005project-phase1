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
		X=1, Y=2, EQUALS=3, NAMEKEY=4, XVEL=5, YVEL=6, GRAVITY=7, FRICTION1=8, 
		FRICTION2=9, TRIGGER=10, ORIENTATIONKEY=11, ACTION=12, WIDTH=13, HEIGHT=14, 
		HASHTAG=15, WHITESPACE=16, BOARD=17, BALL=18, ABSORBER=19, FIRE=20, SQUAREBUMPER=21, 
		CIRCLEBUMPER=22, TRIANGLEBUMPER=23, ORIENTATIONVALUE=24, LEFTFLIPPER=25, 
		RIGHTFLIPPER=26, INTEGER=27, FLOAT=28, NAME=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'x'", "'y'", "'='", "'name'", "'xVelocity'", "'yVelocity'", "'gravity'", 
		"'friction1'", "'friction2'", "'trigger'", "'orientation'", "'action'", 
		"'width'", "'height'", "'#'", "WHITESPACE", "'board'", "'ball'", "'absorber'", 
		"'fire'", "'squareBumper'", "'circleBumper'", "'triangleBumper'", "ORIENTATIONVALUE", 
		"'leftFlipper'", "'rightFlipper'", "INTEGER", "FLOAT", "NAME"
	};
	public static final String[] ruleNames = {
		"X", "Y", "EQUALS", "NAMEKEY", "XVEL", "YVEL", "GRAVITY", "FRICTION1", 
		"FRICTION2", "TRIGGER", "ORIENTATIONKEY", "ACTION", "WIDTH", "HEIGHT", 
		"HASHTAG", "WHITESPACE", "BOARD", "BALL", "ABSORBER", "FIRE", "SQUAREBUMPER", 
		"CIRCLEBUMPER", "TRIANGLEBUMPER", "ORIENTATIONVALUE", "LEFTFLIPPER", "RIGHTFLIPPER", 
		"INTEGER", "FLOAT", "NAME"
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
		case 15: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\37\u012b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\6\21\u00a4\n\21\r\21\16\21\u00a5\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\6\34\u0111\n\34\r\34\16\34\u0112\3\35\5\35\u0116"+
		"\n\35\3\35\6\35\u0119\n\35\r\35\16\35\u011a\3\35\3\35\6\35\u011f\n\35"+
		"\r\35\16\35\u0120\5\35\u0123\n\35\3\36\3\36\7\36\u0127\n\36\f\36\16\36"+
		"\u012a\13\36\2\37\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\2#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1\3\2\b\7\13\f\17\17\"\"..\60\60\3\62;\3\62;\3\62;\5C\\aac|\b..\60"+
		"\60\62;C\\aac|\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2"+
		"\13H\3\2\2\2\rR\3\2\2\2\17\\\3\2\2\2\21d\3\2\2\2\23n\3\2\2\2\25x\3\2\2"+
		"\2\27\u0080\3\2\2\2\31\u008c\3\2\2\2\33\u0093\3\2\2\2\35\u0099\3\2\2\2"+
		"\37\u00a0\3\2\2\2!\u00a3\3\2\2\2#\u00a9\3\2\2\2%\u00af\3\2\2\2\'\u00b4"+
		"\3\2\2\2)\u00bd\3\2\2\2+\u00c2\3\2\2\2-\u00cf\3\2\2\2/\u00dc\3\2\2\2\61"+
		"\u00f4\3\2\2\2\63\u00f6\3\2\2\2\65\u0102\3\2\2\2\67\u0110\3\2\2\29\u0115"+
		"\3\2\2\2;\u0124\3\2\2\2=>\7z\2\2>\4\3\2\2\2?@\7{\2\2@\6\3\2\2\2AB\7?\2"+
		"\2B\b\3\2\2\2CD\7p\2\2DE\7c\2\2EF\7o\2\2FG\7g\2\2G\n\3\2\2\2HI\7z\2\2"+
		"IJ\7X\2\2JK\7g\2\2KL\7n\2\2LM\7q\2\2MN\7e\2\2NO\7k\2\2OP\7v\2\2PQ\7{\2"+
		"\2Q\f\3\2\2\2RS\7{\2\2ST\7X\2\2TU\7g\2\2UV\7n\2\2VW\7q\2\2WX\7e\2\2XY"+
		"\7k\2\2YZ\7v\2\2Z[\7{\2\2[\16\3\2\2\2\\]\7i\2\2]^\7t\2\2^_\7c\2\2_`\7"+
		"x\2\2`a\7k\2\2ab\7v\2\2bc\7{\2\2c\20\3\2\2\2de\7h\2\2ef\7t\2\2fg\7k\2"+
		"\2gh\7e\2\2hi\7v\2\2ij\7k\2\2jk\7q\2\2kl\7p\2\2lm\7\63\2\2m\22\3\2\2\2"+
		"no\7h\2\2op\7t\2\2pq\7k\2\2qr\7e\2\2rs\7v\2\2st\7k\2\2tu\7q\2\2uv\7p\2"+
		"\2vw\7\64\2\2w\24\3\2\2\2xy\7v\2\2yz\7t\2\2z{\7k\2\2{|\7i\2\2|}\7i\2\2"+
		"}~\7g\2\2~\177\7t\2\2\177\26\3\2\2\2\u0080\u0081\7q\2\2\u0081\u0082\7"+
		"t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7p\2\2\u008b\30\3\2\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090\7k\2\2\u0090\u0091\7q\2\2"+
		"\u0091\u0092\7p\2\2\u0092\32\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7"+
		"k\2\2\u0095\u0096\7f\2\2\u0096\u0097\7v\2\2\u0097\u0098\7j\2\2\u0098\34"+
		"\3\2\2\2\u0099\u009a\7j\2\2\u009a\u009b\7g\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7i\2\2\u009d\u009e\7j\2\2\u009e\u009f\7v\2\2\u009f\36\3\2\2\2\u00a0"+
		"\u00a1\7%\2\2\u00a1 \3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\b\21\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"$\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7d\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7d\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc(\3\2\2\2\u00bd\u00be\7h\2"+
		"\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1*\3\2"+
		"\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7s\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7D\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce,\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7k\2"+
		"\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7D\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7o\2\2\u00d8"+
		"\u00d9\7r\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7t\2\2\u00db.\3\2\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7c\2\2"+
		"\u00e0\u00e1\7p\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7D\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7o\2\2\u00e7"+
		"\u00e8\7r\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\60\3\2\2\2\u00eb"+
		"\u00f5\7\62\2\2\u00ec\u00ed\7;\2\2\u00ed\u00f5\7\62\2\2\u00ee\u00ef\7"+
		"\63\2\2\u00ef\u00f0\7:\2\2\u00f0\u00f5\7\62\2\2\u00f1\u00f2\7\64\2\2\u00f2"+
		"\u00f3\79\2\2\u00f3\u00f5\7\62\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2"+
		"\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\62\3\2\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7v\2\2\u00fa"+
		"\u00fb\7H\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7r\2\2"+
		"\u00fe\u00ff\7r\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101\64\3\2"+
		"\2\2\u0102\u0103\7t\2\2\u0103\u0104\7k\2\2\u0104\u0105\7i\2\2\u0105\u0106"+
		"\7j\2\2\u0106\u0107\7v\2\2\u0107\u0108\7H\2\2\u0108\u0109\7n\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7r\2\2\u010b\u010c\7r\2\2\u010c\u010d\7g\2\2"+
		"\u010d\u010e\7t\2\2\u010e\66\3\2\2\2\u010f\u0111\t\3\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"8\3\2\2\2\u0114\u0116\7/\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0122\3\2\2\2\u011c"+
		"\u011e\13\2\2\2\u011d\u011f\t\5\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u011c\3\2\2\2\u0122\u0123\3\2\2\2\u0123:\3\2\2\2\u0124\u0128\t\6\2\2"+
		"\u0125\u0127\t\7\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129<\3\2\2\2\u012a\u0128\3\2\2\2\13\2\u00a5"+
		"\u00f4\u0112\u0115\u011a\u0120\u0122\u0128";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}