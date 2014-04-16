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
		T__3=1, T__2=2, T__1=3, T__0=4, COMMENT=5, WHITESPACE=6, INTEGER=7, X=8, 
		Y=9, EQUALS=10, NAMEKEY=11, XVEL=12, YVEL=13, GRAVITY=14, FRICTION1=15, 
		FRICTION2=16, TRIGGER=17, ORIENTATIONKEY=18, ACTION=19, WIDTH=20, HEIGHT=21, 
		BOARD=22, BALL=23, ABSORBER=24, FIRE=25, SQUAREBUMPER=26, CIRCLEBUMPER=27, 
		TRIANGLEBUMPER=28, LEFTFLIPPER=29, RIGHTFLIPPER=30, FLOAT=31, NAME=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'90'", "'270'", "'0'", "'180'", "COMMENT", "WHITESPACE", 
		"INTEGER", "'x'", "'y'", "'='", "'name'", "'xVelocity'", "'yVelocity'", 
		"'gravity'", "'friction1'", "'friction2'", "'trigger'", "'orientation'", 
		"'action'", "'width'", "'height'", "'board'", "'ball'", "'absorber'", 
		"'fire'", "'squareBumper'", "'circleBumper'", "'triangleBumper'", "'leftFlipper'", 
		"'rightFlipper'", "FLOAT", "NAME"
	};
	public static final int
		RULE_board = 0, RULE_boardspec = 1, RULE_ball = 2, RULE_gravity = 3, RULE_friction1 = 4, 
		RULE_friction2 = 5, RULE_bumper = 6, RULE_bumpertype = 7, RULE_flipperleft = 8, 
		RULE_flipperright = 9, RULE_absorber = 10, RULE_fire = 11, RULE_x = 12, 
		RULE_y = 13, RULE_xv = 14, RULE_yv = 15, RULE_orientationvalue = 16, RULE_orientation = 17, 
		RULE_width = 18, RULE_height = 19, RULE_id = 20;
	public static final String[] ruleNames = {
		"board", "boardspec", "ball", "gravity", "friction1", "friction2", "bumper", 
		"bumpertype", "flipperleft", "flipperright", "absorber", "fire", "x", 
		"y", "xv", "yv", "orientationvalue", "orientation", "width", "height", 
		"id"
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
			setState(42); boardspec();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BALL) {
				{
				{
				setState(43); ball();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQUAREBUMPER) | (1L << CIRCLEBUMPER) | (1L << TRIANGLEBUMPER))) != 0)) {
				{
				{
				setState(49); bumper();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTFLIPPER) {
				{
				{
				setState(55); flipperleft();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIGHTFLIPPER) {
				{
				{
				setState(61); flipperright();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSORBER) {
				{
				{
				setState(67); absorber();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIRE) {
				{
				{
				setState(73); fire();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(EOF);
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
			setState(81); match(BOARD);
			setState(82); id();
			setState(83); gravity();
			setState(84); friction1();
			setState(85); friction2();
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
			setState(87); match(BALL);
			setState(88); id();
			setState(89); x();
			setState(90); y();
			setState(91); xv();
			setState(92); yv();
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
			setState(94); match(GRAVITY);
			setState(95); match(EQUALS);
			setState(96); match(FLOAT);
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
			setState(98); match(FRICTION1);
			setState(99); match(EQUALS);
			setState(100); match(FLOAT);
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
			setState(102); match(FRICTION2);
			setState(103); match(EQUALS);
			setState(104); match(FLOAT);
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
		public OrientationContext orientation(int i) {
			return getRuleContext(OrientationContext.class,i);
		}
		public BumpertypeContext bumpertype() {
			return getRuleContext(BumpertypeContext.class,0);
		}
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
			setState(106); bumpertype();
			setState(107); id();
			setState(108); x();
			setState(109); y();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORIENTATIONKEY) {
				{
				{
				setState(110); orientation();
				}
				}
				setState(115);
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

	public static class BumpertypeContext extends ParserRuleContext {
		public TerminalNode SQUAREBUMPER() { return getToken(BoardGrammarParser.SQUAREBUMPER, 0); }
		public TerminalNode TRIANGLEBUMPER() { return getToken(BoardGrammarParser.TRIANGLEBUMPER, 0); }
		public TerminalNode CIRCLEBUMPER() { return getToken(BoardGrammarParser.CIRCLEBUMPER, 0); }
		public BumpertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bumpertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterBumpertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitBumpertype(this);
		}
	}

	public final BumpertypeContext bumpertype() throws RecognitionException {
		BumpertypeContext _localctx = new BumpertypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bumpertype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQUAREBUMPER) | (1L << CIRCLEBUMPER) | (1L << TRIANGLEBUMPER))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_flipperleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(LEFTFLIPPER);
			setState(119); id();
			setState(120); x();
			setState(121); y();
			setState(122); orientation();
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
		enterRule(_localctx, 18, RULE_flipperright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(RIGHTFLIPPER);
			setState(125); id();
			setState(126); x();
			setState(127); y();
			setState(128); orientation();
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
		enterRule(_localctx, 20, RULE_absorber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(ABSORBER);
			setState(131); id();
			setState(132); x();
			setState(133); y();
			setState(134); width();
			setState(135); height();
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
		enterRule(_localctx, 22, RULE_fire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(FIRE);
			setState(138); match(TRIGGER);
			setState(139); match(EQUALS);
			setState(140); match(NAME);
			setState(141); match(ACTION);
			setState(142); match(EQUALS);
			setState(143); match(NAME);
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
			setState(145); match(X);
			setState(146); match(EQUALS);
			setState(147);
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
			setState(149); match(Y);
			setState(150); match(EQUALS);
			setState(151);
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
			setState(153); match(XVEL);
			setState(154); match(EQUALS);
			setState(155); match(FLOAT);
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
			setState(157); match(YVEL);
			setState(158); match(EQUALS);
			setState(159); match(FLOAT);
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

	public static class OrientationvalueContext extends ParserRuleContext {
		public OrientationvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orientationvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterOrientationvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitOrientationvalue(this);
		}
	}

	public final OrientationvalueContext orientationvalue() throws RecognitionException {
		OrientationvalueContext _localctx = new OrientationvalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orientationvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4))) != 0)) ) {
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

	public static class OrientationContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode ORIENTATIONKEY() { return getToken(BoardGrammarParser.ORIENTATIONKEY, 0); }
		public OrientationvalueContext orientationvalue() {
			return getRuleContext(OrientationvalueContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_orientation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(ORIENTATIONKEY);
			setState(164); match(EQUALS);
			setState(165); orientationvalue();
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
		enterRule(_localctx, 36, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(WIDTH);
			setState(168); match(EQUALS);
			setState(169); match(INTEGER);
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
		enterRule(_localctx, 38, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(HEIGHT);
			setState(172); match(EQUALS);
			setState(173); match(INTEGER);
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
		enterRule(_localctx, 40, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(NAMEKEY);
			setState(176); match(EQUALS);
			setState(177); match(NAME);
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
		"\2\3\"\u00b6\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7"+
		"\2/\n\2\f\2\16\2\62\13\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\7\2;\n\2\f"+
		"\2\16\2>\13\2\3\2\7\2A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2"+
		"\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\2\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\34\36\4\t\t!!\4\t\t!!\3"+
		"\3\6\u00a7\2,\3\2\2\2\4S\3\2\2\2\6Y\3\2\2\2\b`\3\2\2\2\nd\3\2\2\2\fh\3"+
		"\2\2\2\16l\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24~\3\2\2\2\26\u0084\3\2\2"+
		"\2\30\u008b\3\2\2\2\32\u0093\3\2\2\2\34\u0097\3\2\2\2\36\u009b\3\2\2\2"+
		" \u009f\3\2\2\2\"\u00a3\3\2\2\2$\u00a5\3\2\2\2&\u00a9\3\2\2\2(\u00ad\3"+
		"\2\2\2*\u00b1\3\2\2\2,\60\5\4\3\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60."+
		"\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63\65\5\16\b\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\28\66\3\2\2"+
		"\29;\5\22\n\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2"+
		"\2\2?A\5\24\13\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3"+
		"\2\2\2EG\5\26\f\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH"+
		"\3\2\2\2KM\5\30\r\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2"+
		"PN\3\2\2\2QR\7\1\2\2R\3\3\2\2\2ST\7\30\2\2TU\5*\26\2UV\5\b\5\2VW\5\n\6"+
		"\2WX\5\f\7\2X\5\3\2\2\2YZ\7\31\2\2Z[\5*\26\2[\\\5\32\16\2\\]\5\34\17\2"+
		"]^\5\36\20\2^_\5 \21\2_\7\3\2\2\2`a\7\20\2\2ab\7\f\2\2bc\7!\2\2c\t\3\2"+
		"\2\2de\7\21\2\2ef\7\f\2\2fg\7!\2\2g\13\3\2\2\2hi\7\22\2\2ij\7\f\2\2jk"+
		"\7!\2\2k\r\3\2\2\2lm\5\20\t\2mn\5*\26\2no\5\32\16\2os\5\34\17\2pr\5$\23"+
		"\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2vw\t\2"+
		"\2\2w\21\3\2\2\2xy\7\37\2\2yz\5*\26\2z{\5\32\16\2{|\5\34\17\2|}\5$\23"+
		"\2}\23\3\2\2\2~\177\7 \2\2\177\u0080\5*\26\2\u0080\u0081\5\32\16\2\u0081"+
		"\u0082\5\34\17\2\u0082\u0083\5$\23\2\u0083\25\3\2\2\2\u0084\u0085\7\32"+
		"\2\2\u0085\u0086\5*\26\2\u0086\u0087\5\32\16\2\u0087\u0088\5\34\17\2\u0088"+
		"\u0089\5&\24\2\u0089\u008a\5(\25\2\u008a\27\3\2\2\2\u008b\u008c\7\33\2"+
		"\2\u008c\u008d\7\23\2\2\u008d\u008e\7\f\2\2\u008e\u008f\7\"\2\2\u008f"+
		"\u0090\7\25\2\2\u0090\u0091\7\f\2\2\u0091\u0092\7\"\2\2\u0092\31\3\2\2"+
		"\2\u0093\u0094\7\n\2\2\u0094\u0095\7\f\2\2\u0095\u0096\t\3\2\2\u0096\33"+
		"\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7\f\2\2\u0099\u009a\t\4\2\2"+
		"\u009a\35\3\2\2\2\u009b\u009c\7\16\2\2\u009c\u009d\7\f\2\2\u009d\u009e"+
		"\7!\2\2\u009e\37\3\2\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\7!\2\2\u00a2!\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4#\3\2\2\2\u00a5"+
		"\u00a6\7\24\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\5\"\22\2\u00a8%\3\2\2"+
		"\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\7\t\2\2\u00ac"+
		"\'\3\2\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\7\t\2"+
		"\2\u00b0)\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4"+
		"\7\"\2\2\u00b4+\3\2\2\2\t\60\66<BHNs";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}