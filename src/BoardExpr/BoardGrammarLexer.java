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
		T__3=1, T__2=2, T__1=3, T__0=4, XEQUALS=5, YEQUALS=6, NAMEEQUALS=7, XVELEQUALS=8, 
		YVELEQUALS=9, GRAVITYEQUALS=10, FRICTION1=11, FRICTION2=12, TRIGGEREQUALS=13, 
		ORIENTATION=14, ACTIONEQUALS=15, WIDTH=16, HEIGHT=17, WHITESPACE=18, BOARD=19, 
		BALL=20, ABSORBER=21, FIRE=22, SQUAREBUMPER=23, CIRCLEBUMPER=24, TRIANGLEBUMPER=25, 
		LEFTFLIPPER=26, RIGHTFLIPPER=27, INTEGER=28, FLOAT=29, NAME=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'90'", "'270'", "'0'", "'180'", "'X='", "'Y='", "'name='", "'xVElocity='", 
		"'yVelcocity='", "'gravity='", "'friction1='", "'friction2='", "'trigger='", 
		"'orientation='", "'action='", "'width='", "'height='", "WHITESPACE", 
		"'board'", "'ball'", "'absorber'", "'fire'", "'squareBumper'", "'circleBumper'", 
		"'triangleBumper'", "'leftFlipper'", "'rightFlipper'", "INTEGER", "FLOAT", 
		"NAME"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "XEQUALS", "YEQUALS", "NAMEEQUALS", "XVELEQUALS", 
		"YVELEQUALS", "GRAVITYEQUALS", "FRICTION1", "FRICTION2", "TRIGGEREQUALS", 
		"ORIENTATION", "ACTIONEQUALS", "WIDTH", "HEIGHT", "WHITESPACE", "BOARD", 
		"BALL", "ABSORBER", "FIRE", "SQUAREBUMPER", "CIRCLEBUMPER", "TRIANGLEBUMPER", 
		"LEFTFLIPPER", "RIGHTFLIPPER", "INTEGER", "FLOAT", "NAME"
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
		case 17: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4 \u0135\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\6\23\u00bd\n\23\r\23\16\23\u00be\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\6\35\u011f\n\35\r\35\16\35\u0120\3\36\7\36\u0124"+
		"\n\36\f\36\16\36\u0127\13\36\3\36\3\36\6\36\u012b\n\36\r\36\16\36\u012c"+
		"\3\37\3\37\7\37\u0131\n\37\f\37\16\37\u0134\13\37\2 \3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\2\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1\3\2\b\5\13\f\17\17\"\"\3"+
		"\62;\3\62;\3\62;\5C\\aac|\6\62;C\\aac|\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2"+
		"\2\5B\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13L\3\2\2\2\rO\3\2\2\2\17R\3\2\2\2"+
		"\21X\3\2\2\2\23c\3\2\2\2\25o\3\2\2\2\27x\3\2\2\2\31\u0083\3\2\2\2\33\u008e"+
		"\3\2\2\2\35\u0097\3\2\2\2\37\u00a4\3\2\2\2!\u00ac\3\2\2\2#\u00b3\3\2\2"+
		"\2%\u00bc\3\2\2\2\'\u00c2\3\2\2\2)\u00c8\3\2\2\2+\u00cd\3\2\2\2-\u00d6"+
		"\3\2\2\2/\u00db\3\2\2\2\61\u00e8\3\2\2\2\63\u00f5\3\2\2\2\65\u0104\3\2"+
		"\2\2\67\u0110\3\2\2\29\u011e\3\2\2\2;\u0125\3\2\2\2=\u012e\3\2\2\2?@\7"+
		";\2\2@A\7\62\2\2A\4\3\2\2\2BC\7\64\2\2CD\79\2\2DE\7\62\2\2E\6\3\2\2\2"+
		"FG\7\62\2\2G\b\3\2\2\2HI\7\63\2\2IJ\7:\2\2JK\7\62\2\2K\n\3\2\2\2LM\7Z"+
		"\2\2MN\7?\2\2N\f\3\2\2\2OP\7[\2\2PQ\7?\2\2Q\16\3\2\2\2RS\7p\2\2ST\7c\2"+
		"\2TU\7o\2\2UV\7g\2\2VW\7?\2\2W\20\3\2\2\2XY\7z\2\2YZ\7X\2\2Z[\7G\2\2["+
		"\\\7n\2\2\\]\7q\2\2]^\7e\2\2^_\7k\2\2_`\7v\2\2`a\7{\2\2ab\7?\2\2b\22\3"+
		"\2\2\2cd\7{\2\2de\7X\2\2ef\7g\2\2fg\7n\2\2gh\7e\2\2hi\7q\2\2ij\7e\2\2"+
		"jk\7k\2\2kl\7v\2\2lm\7{\2\2mn\7?\2\2n\24\3\2\2\2op\7i\2\2pq\7t\2\2qr\7"+
		"c\2\2rs\7x\2\2st\7k\2\2tu\7v\2\2uv\7{\2\2vw\7?\2\2w\26\3\2\2\2xy\7h\2"+
		"\2yz\7t\2\2z{\7k\2\2{|\7e\2\2|}\7v\2\2}~\7k\2\2~\177\7q\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7\63\2\2\u0081\u0082\7?\2\2\u0082\30\3\2\2\2\u0083"+
		"\u0084\7h\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086\u0087\7e\2\2"+
		"\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7\64\2\2\u008c\u008d\7?\2\2\u008d\32\3\2\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7i\2\2"+
		"\u0092\u0093\7i\2\2\u0093\u0094\7g\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7?\2\2\u0096\34\3\2\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\u00a2\7p\2\2\u00a2\u00a3\7?\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7"+
		"c\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7?\2\2\u00ab \3\2\2\2\u00ac\u00ad"+
		"\7y\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7j\2\2\u00b1\u00b2\7?\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7j\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7i\2\2\u00b7\u00b8\7j\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\u00ba\7?\2\2\u00ba$\3\2\2\2\u00bb\u00bd\t\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\23\2\2\u00c1&\3\2\2\2"+
		"\u00c2\u00c3\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7f\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7n\2\2\u00cc*\3\2\2\2\u00cd\u00ce"+
		"\7c\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5,\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7t\2"+
		"\2\u00d9\u00da\7g\2\2\u00da.\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7"+
		"s\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7D\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7o\2\2\u00e4"+
		"\u00e5\7r\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7t\2\2\u00e7\60\3\2\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7e\2\2"+
		"\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7D\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7i\2\2"+
		"\u00fb\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7D\2\2\u00fe\u00ff"+
		"\7w\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7r\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7t\2\2\u0103\64\3\2\2\2\u0104\u0105\7n\2\2\u0105\u0106\7g\2\2\u0106"+
		"\u0107\7h\2\2\u0107\u0108\7v\2\2\u0108\u0109\7H\2\2\u0109\u010a\7n\2\2"+
		"\u010a\u010b\7k\2\2\u010b\u010c\7r\2\2\u010c\u010d\7r\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7t\2\2\u010f\66\3\2\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7k\2\2\u0112\u0113\7i\2\2\u0113\u0114\7j\2\2\u0114\u0115\7v\2\2\u0115"+
		"\u0116\7H\2\2\u0116\u0117\7n\2\2\u0117\u0118\7k\2\2\u0118\u0119\7r\2\2"+
		"\u0119\u011a\7r\2\2\u011a\u011b\7g\2\2\u011b\u011c\7t\2\2\u011c8\3\2\2"+
		"\2\u011d\u011f\t\3\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121:\3\2\2\2\u0122\u0124\t\4\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\13\2\2\2\u0129"+
		"\u012b\t\5\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d<\3\2\2\2\u012e\u0132\t\6\2\2\u012f\u0131"+
		"\t\7\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133>\3\2\2\2\u0134\u0132\3\2\2\2\b\2\u00be\u0120\u0125"+
		"\u012c\u0132";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}