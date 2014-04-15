// Generated from BoardGrammar.g4 by ANTLR 4.0

package BoardExpr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoardGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		X=1, Y=2, EQUALS=3, NAMEKEY=4, XVEL=5, YVEL=6, GRAVITY=7, FRICTION1=8, 
		FRICTION2=9, TRIGGER=10, ORIENTATIONKEY=11, ACTION=12, WIDTH=13, HEIGHT=14, 
		HASHTAG=15, WHITESPACE=16, BOARD=17, BALL=18, ABSORBER=19, FIRE=20, SQUAREBUMPER=21, 
		CIRCLEBUMPER=22, TRIANGLEBUMPER=23, ORIENTATIONVALUE=24, LEFTFLIPPER=25, 
		RIGHTFLIPPER=26, INTEGER=27, FLOAT=28, NAME=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'x'", "'y'", "'='", "'name'", "'xVelocity'", "'yVelocity'", 
		"'gravity'", "'friction1'", "'friction2'", "'trigger'", "'orientation'", 
		"'action'", "'width'", "'height'", "'#'", "WHITESPACE", "'board'", "'ball'", 
		"'absorber'", "'fire'", "'squareBumper'", "'circleBumper'", "'triangleBumper'", 
		"ORIENTATIONVALUE", "'leftFlipper'", "'rightFlipper'", "INTEGER", "FLOAT", 
		"NAME"
	};
	public static final int
		RULE_board = 0, RULE_boardspec = 1, RULE_ball = 2, RULE_gravity = 3, RULE_friction1 = 4, 
		RULE_friction2 = 5, RULE_bumper = 6, RULE_flipperleft = 7, RULE_flipperright = 8, 
		RULE_absorber = 9, RULE_fire = 10, RULE_comment = 11, RULE_x = 12, RULE_y = 13, 
		RULE_xv = 14, RULE_yv = 15, RULE_orientation = 16, RULE_width = 17, RULE_height = 18, 
		RULE_id = 19;
	public static final String[] ruleNames = {
		"board", "boardspec", "ball", "gravity", "friction1", "friction2", "bumper", 
		"flipperleft", "flipperright", "absorber", "fire", "comment", "x", "y", 
		"xv", "yv", "orientation", "width", "height", "id"
	};

	@Override
	public String getGrammarFileName() { return "BoardGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public BoardGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BoardContext extends ParserRuleContext {
		public List<AbsorberContext> absorber() {
			return getRuleContexts(AbsorberContext.class);
		}
		public List<BallContext> ball() {
			return getRuleContexts(BallContext.class);
		}
		public AbsorberContext absorber(int i) {
			return getRuleContext(AbsorberContext.class,i);
		}
		public BumperContext bumper(int i) {
			return getRuleContext(BumperContext.class,i);
		}
		public BoardspecContext boardspec() {
			return getRuleContext(BoardspecContext.class,0);
		}
		public List<FlipperleftContext> flipperleft() {
			return getRuleContexts(FlipperleftContext.class);
		}
		public List<FireContext> fire() {
			return getRuleContexts(FireContext.class);
		}
		public FlipperleftContext flipperleft(int i) {
			return getRuleContext(FlipperleftContext.class,i);
		}
		public FireContext fire(int i) {
			return getRuleContext(FireContext.class,i);
		}
		public List<FlipperrightContext> flipperright() {
			return getRuleContexts(FlipperrightContext.class);
		}
		public TerminalNode EOF() { return getToken(BoardGrammarParser.EOF, 0); }
		public BallContext ball(int i) {
			return getRuleContext(BallContext.class,i);
		}
		public FlipperrightContext flipperright(int i) {
			return getRuleContext(FlipperrightContext.class,i);
		}
		public List<BumperContext> bumper() {
			return getRuleContexts(BumperContext.class);
		}
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitBoard(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_board);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); boardspec();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BALL) {
				{
				{
				setState(41); ball();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQUAREBUMPER) | (1L << CIRCLEBUMPER) | (1L << TRIANGLEBUMPER))) != 0)) {
				{
				{
				setState(47); bumper();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTFLIPPER) {
				{
				{
				setState(53); flipperleft();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIGHTFLIPPER) {
				{
				{
				setState(59); flipperright();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSORBER) {
				{
				{
				setState(65); absorber();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIRE) {
				{
				{
				setState(71); fire();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(EOF);
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

	public static class BoardspecContext extends ParserRuleContext {
		public Friction1Context friction1() {
			return getRuleContext(Friction1Context.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BOARD() { return getToken(BoardGrammarParser.BOARD, 0); }
		public Friction2Context friction2() {
			return getRuleContext(Friction2Context.class,0);
		}
		public GravityContext gravity() {
			return getRuleContext(GravityContext.class,0);
		}
		public BoardspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boardspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterBoardspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitBoardspec(this);
		}
	}

	public final BoardspecContext boardspec() throws RecognitionException {
		BoardspecContext _localctx = new BoardspecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boardspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(BOARD);
			setState(80); id();
			setState(81); gravity();
			setState(82); friction1();
			setState(83); friction2();
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

	public static class BallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public YvContext yv() {
			return getRuleContext(YvContext.class,0);
		}
		public TerminalNode BALL() { return getToken(BoardGrammarParser.BALL, 0); }
		public XvContext xv() {
			return getRuleContext(XvContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public BallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ball; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterBall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitBall(this);
		}
	}

	public final BallContext ball() throws RecognitionException {
		BallContext _localctx = new BallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ball);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(BALL);
			setState(86); id();
			setState(87); x();
			setState(88); y();
			setState(89); xv();
			setState(90); yv();
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

	public static class GravityContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode GRAVITY() { return getToken(BoardGrammarParser.GRAVITY, 0); }
		public GravityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gravity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterGravity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitGravity(this);
		}
	}

	public final GravityContext gravity() throws RecognitionException {
		GravityContext _localctx = new GravityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gravity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(GRAVITY);
			setState(93); match(EQUALS);
			setState(94); match(FLOAT);
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

	public static class Friction1Context extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode FRICTION1() { return getToken(BoardGrammarParser.FRICTION1, 0); }
		public Friction1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_friction1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterFriction1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitFriction1(this);
		}
	}

	public final Friction1Context friction1() throws RecognitionException {
		Friction1Context _localctx = new Friction1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_friction1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(FRICTION1);
			setState(97); match(EQUALS);
			setState(98); match(FLOAT);
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

	public static class Friction2Context extends ParserRuleContext {
		public TerminalNode FRICTION2() { return getToken(BoardGrammarParser.FRICTION2, 0); }
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public Friction2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_friction2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterFriction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitFriction2(this);
		}
	}

	public final Friction2Context friction2() throws RecognitionException {
		Friction2Context _localctx = new Friction2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_friction2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(FRICTION2);
			setState(101); match(EQUALS);
			setState(102); match(FLOAT);
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

	public static class BumperContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<OrientationContext> orientation() {
			return getRuleContexts(OrientationContext.class);
		}
		public TerminalNode SQUAREBUMPER() { return getToken(BoardGrammarParser.SQUAREBUMPER, 0); }
		public TerminalNode TRIANGLEBUMPER() { return getToken(BoardGrammarParser.TRIANGLEBUMPER, 0); }
		public OrientationContext orientation(int i) {
			return getRuleContext(OrientationContext.class,i);
		}
		public TerminalNode CIRCLEBUMPER() { return getToken(BoardGrammarParser.CIRCLEBUMPER, 0); }
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public BumperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bumper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterBumper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitBumper(this);
		}
	}

	public final BumperContext bumper() throws RecognitionException {
		BumperContext _localctx = new BumperContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bumper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQUAREBUMPER) | (1L << CIRCLEBUMPER) | (1L << TRIANGLEBUMPER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(105); id();
			setState(106); x();
			setState(107); y();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORIENTATIONKEY) {
				{
				{
				setState(108); orientation();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FlipperleftContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OrientationContext orientation() {
			return getRuleContext(OrientationContext.class,0);
		}
		public TerminalNode LEFTFLIPPER() { return getToken(BoardGrammarParser.LEFTFLIPPER, 0); }
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public FlipperleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flipperleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterFlipperleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitFlipperleft(this);
		}
	}

	public final FlipperleftContext flipperleft() throws RecognitionException {
		FlipperleftContext _localctx = new FlipperleftContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flipperleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(LEFTFLIPPER);
			setState(115); id();
			setState(116); x();
			setState(117); y();
			setState(118); orientation();
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

	public static class FlipperrightContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OrientationContext orientation() {
			return getRuleContext(OrientationContext.class,0);
		}
		public TerminalNode RIGHTFLIPPER() { return getToken(BoardGrammarParser.RIGHTFLIPPER, 0); }
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public FlipperrightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flipperright; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterFlipperright(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitFlipperright(this);
		}
	}

	public final FlipperrightContext flipperright() throws RecognitionException {
		FlipperrightContext _localctx = new FlipperrightContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flipperright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(RIGHTFLIPPER);
			setState(121); id();
			setState(122); x();
			setState(123); y();
			setState(124); orientation();
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

	public static class AbsorberContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public TerminalNode ABSORBER() { return getToken(BoardGrammarParser.ABSORBER, 0); }
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public AbsorberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absorber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterAbsorber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitAbsorber(this);
		}
	}

	public final AbsorberContext absorber() throws RecognitionException {
		AbsorberContext _localctx = new AbsorberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_absorber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(ABSORBER);
			setState(127); id();
			setState(128); x();
			setState(129); y();
			setState(130); width();
			setState(131); height();
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

	public static class FireContext extends ParserRuleContext {
		public TerminalNode FIRE() { return getToken(BoardGrammarParser.FIRE, 0); }
		public List<TerminalNode> NAME() { return getTokens(BoardGrammarParser.NAME); }
		public List<TerminalNode> EQUALS() { return getTokens(BoardGrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(BoardGrammarParser.EQUALS, i);
		}
		public TerminalNode NAME(int i) {
			return getToken(BoardGrammarParser.NAME, i);
		}
		public TerminalNode ACTION() { return getToken(BoardGrammarParser.ACTION, 0); }
		public TerminalNode TRIGGER() { return getToken(BoardGrammarParser.TRIGGER, 0); }
		public FireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterFire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitFire(this);
		}
	}

	public final FireContext fire() throws RecognitionException {
		FireContext _localctx = new FireContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(FIRE);
			setState(134); match(TRIGGER);
			setState(135); match(EQUALS);
			setState(136); match(NAME);
			setState(137); match(ACTION);
			setState(138); match(EQUALS);
			setState(139); match(NAME);
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> HASHTAG() { return getTokens(BoardGrammarParser.HASHTAG); }
		public List<TerminalNode> NAME() { return getTokens(BoardGrammarParser.NAME); }
		public TerminalNode HASHTAG(int i) {
			return getToken(BoardGrammarParser.HASHTAG, i);
		}
		public TerminalNode NAME(int i) {
			return getToken(BoardGrammarParser.NAME, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141); match(HASHTAG);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HASHTAG );
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(146); match(NAME);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class XContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BoardGrammarParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode X() { return getToken(BoardGrammarParser.X, 0); }
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(X);
			setState(153); match(EQUALS);
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class YContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BoardGrammarParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode Y() { return getToken(BoardGrammarParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitY(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(Y);
			setState(157); match(EQUALS);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class XvContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode XVEL() { return getToken(BoardGrammarParser.XVEL, 0); }
		public XvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterXv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitXv(this);
		}
	}

	public final XvContext xv() throws RecognitionException {
		XvContext _localctx = new XvContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_xv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(XVEL);
			setState(161); match(EQUALS);
			setState(162); match(FLOAT);
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

	public static class YvContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(BoardGrammarParser.FLOAT, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode YVEL() { return getToken(BoardGrammarParser.YVEL, 0); }
		public YvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterYv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitYv(this);
		}
	}

	public final YvContext yv() throws RecognitionException {
		YvContext _localctx = new YvContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_yv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(YVEL);
			setState(165); match(EQUALS);
			setState(166); match(FLOAT);
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

	public static class OrientationContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode ORIENTATIONKEY() { return getToken(BoardGrammarParser.ORIENTATIONKEY, 0); }
		public TerminalNode ORIENTATIONVALUE() { return getToken(BoardGrammarParser.ORIENTATIONVALUE, 0); }
		public OrientationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orientation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterOrientation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitOrientation(this);
		}
	}

	public final OrientationContext orientation() throws RecognitionException {
		OrientationContext _localctx = new OrientationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orientation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(ORIENTATIONKEY);
			setState(169); match(EQUALS);
			setState(170); match(ORIENTATIONVALUE);
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

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BoardGrammarParser.INTEGER, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode WIDTH() { return getToken(BoardGrammarParser.WIDTH, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitWidth(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(WIDTH);
			setState(173); match(EQUALS);
			setState(174); match(INTEGER);
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

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BoardGrammarParser.INTEGER, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode HEIGHT() { return getToken(BoardGrammarParser.HEIGHT, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitHeight(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(HEIGHT);
			setState(177); match(EQUALS);
			setState(178); match(INTEGER);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(BoardGrammarParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode NAMEKEY() { return getToken(BoardGrammarParser.NAMEKEY, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(NAMEKEY);
			setState(181); match(EQUALS);
			setState(182); match(NAME);
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

	public static final String _serializedATN =
		"\2\3\37\u00bb\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2"+
		"\f\2\16\2\60\13\2\3\2\7\2\63\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16"+
		"\2<\13\2\3\2\7\2?\n\2\f\2\16\2B\13\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\7"+
		"\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\6\r\u0091\n\r\r\r\16\r\u0092\3\r\7\r\u0096\n\r\f\r\16\r"+
		"\u0099\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\2\26\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(\2\5\3\27\31\3\35\36\3\35\36\u00af\2*\3\2\2\2\4Q\3\2\2"+
		"\2\6W\3\2\2\2\b^\3\2\2\2\nb\3\2\2\2\ff\3\2\2\2\16j\3\2\2\2\20t\3\2\2\2"+
		"\22z\3\2\2\2\24\u0080\3\2\2\2\26\u0087\3\2\2\2\30\u0090\3\2\2\2\32\u009a"+
		"\3\2\2\2\34\u009e\3\2\2\2\36\u00a2\3\2\2\2 \u00a6\3\2\2\2\"\u00aa\3\2"+
		"\2\2$\u00ae\3\2\2\2&\u00b2\3\2\2\2(\u00b6\3\2\2\2*.\5\4\3\2+-\5\6\4\2"+
		",+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61"+
		"\63\5\16\b\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		":\3\2\2\2\66\64\3\2\2\2\679\5\20\t\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:"+
		";\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\22\n\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2"+
		"@A\3\2\2\2AF\3\2\2\2B@\3\2\2\2CE\5\24\13\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2GL\3\2\2\2HF\3\2\2\2IK\5\26\f\2JI\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\1\2\2P\3\3\2\2\2QR\7\23\2\2RS\5"+
		"(\25\2ST\5\b\5\2TU\5\n\6\2UV\5\f\7\2V\5\3\2\2\2WX\7\24\2\2XY\5(\25\2Y"+
		"Z\5\32\16\2Z[\5\34\17\2[\\\5\36\20\2\\]\5 \21\2]\7\3\2\2\2^_\7\t\2\2_"+
		"`\7\5\2\2`a\7\36\2\2a\t\3\2\2\2bc\7\n\2\2cd\7\5\2\2de\7\36\2\2e\13\3\2"+
		"\2\2fg\7\13\2\2gh\7\5\2\2hi\7\36\2\2i\r\3\2\2\2jk\t\2\2\2kl\5(\25\2lm"+
		"\5\32\16\2mq\5\34\17\2np\5\"\22\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2r\17\3\2\2\2sq\3\2\2\2tu\7\33\2\2uv\5(\25\2vw\5\32\16\2wx\5\34\17"+
		"\2xy\5\"\22\2y\21\3\2\2\2z{\7\34\2\2{|\5(\25\2|}\5\32\16\2}~\5\34\17\2"+
		"~\177\5\"\22\2\177\23\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0082\5(\25\2"+
		"\u0082\u0083\5\32\16\2\u0083\u0084\5\34\17\2\u0084\u0085\5$\23\2\u0085"+
		"\u0086\5&\24\2\u0086\25\3\2\2\2\u0087\u0088\7\26\2\2\u0088\u0089\7\f\2"+
		"\2\u0089\u008a\7\5\2\2\u008a\u008b\7\37\2\2\u008b\u008c\7\16\2\2\u008c"+
		"\u008d\7\5\2\2\u008d\u008e\7\37\2\2\u008e\27\3\2\2\2\u008f\u0091\7\21"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0096\7\37\2\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\31\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\3\2\2\u009b\u009c\7\5\2"+
		"\2\u009c\u009d\t\3\2\2\u009d\33\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0"+
		"\7\5\2\2\u00a0\u00a1\t\4\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3"+
		"\u00a4\7\5\2\2\u00a4\u00a5\7\36\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\b\2"+
		"\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\7\36\2\2\u00a9!\3\2\2\2\u00aa\u00ab"+
		"\7\r\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7\32\2\2\u00ad#\3\2\2\2\u00ae"+
		"\u00af\7\17\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\7\35\2\2\u00b1%\3\2\2"+
		"\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\7\35\2\2\u00b5"+
		"\'\3\2\2\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00b9\7\37\2"+
		"\2\u00b9)\3\2\2\2\13.\64:@FLq\u0092\u0097";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}