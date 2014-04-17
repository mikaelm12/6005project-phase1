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
		RULE_board = 0, RULE_boardObjects = 1, RULE_boardspec = 2, RULE_ball = 3, 
		RULE_gravity = 4, RULE_friction1 = 5, RULE_friction2 = 6, RULE_bumper = 7, 
		RULE_bumpertype = 8, RULE_flipperleft = 9, RULE_flipperright = 10, RULE_absorber = 11, 
		RULE_fire = 12, RULE_x = 13, RULE_y = 14, RULE_xv = 15, RULE_yv = 16, 
		RULE_orientationvalue = 17, RULE_orientation = 18, RULE_width = 19, RULE_height = 20, 
		RULE_id = 21;
	public static final String[] ruleNames = {
		"board", "boardObjects", "boardspec", "ball", "gravity", "friction1", 
		"friction2", "bumper", "bumpertype", "flipperleft", "flipperright", "absorber", 
		"fire", "x", "y", "xv", "yv", "orientationvalue", "orientation", "width", 
		"height", "id"
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
		public BoardObjectsContext boardObjects(int i) {
			return getRuleContext(BoardObjectsContext.class,i);
		}
		public List<BoardObjectsContext> boardObjects() {
			return getRuleContexts(BoardObjectsContext.class);
		}
		public BoardspecContext boardspec() {
			return getRuleContext(BoardspecContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BoardGrammarParser.EOF, 0); }
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
			setState(44); boardspec();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BALL) | (1L << ABSORBER) | (1L << FIRE) | (1L << SQUAREBUMPER) | (1L << CIRCLEBUMPER) | (1L << TRIANGLEBUMPER) | (1L << LEFTFLIPPER) | (1L << RIGHTFLIPPER))) != 0)) {
				{
				{
				setState(45); boardObjects();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51); match(EOF);
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

	public static class BoardObjectsContext extends ParserRuleContext {
		public AbsorberContext absorber() {
			return getRuleContext(AbsorberContext.class,0);
		}
		public BallContext ball() {
			return getRuleContext(BallContext.class,0);
		}
		public FlipperrightContext flipperright() {
			return getRuleContext(FlipperrightContext.class,0);
		}
		public FlipperleftContext flipperleft() {
			return getRuleContext(FlipperleftContext.class,0);
		}
		public BumperContext bumper() {
			return getRuleContext(BumperContext.class,0);
		}
		public FireContext fire() {
			return getRuleContext(FireContext.class,0);
		}
		public BoardObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boardObjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterBoardObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitBoardObjects(this);
		}
	}

	public final BoardObjectsContext boardObjects() throws RecognitionException {
		BoardObjectsContext _localctx = new BoardObjectsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boardObjects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			switch (_input.LA(1)) {
			case BALL:
				{
				setState(53); ball();
				}
				break;
			case SQUAREBUMPER:
			case CIRCLEBUMPER:
			case TRIANGLEBUMPER:
				{
				setState(54); bumper();
				}
				break;
			case LEFTFLIPPER:
				{
				setState(55); flipperleft();
				}
				break;
			case RIGHTFLIPPER:
				{
				setState(56); flipperright();
				}
				break;
			case ABSORBER:
				{
				setState(57); absorber();
				}
				break;
			case FIRE:
				{
				setState(58); fire();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 4, RULE_boardspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(BOARD);
			setState(62); id();
			setState(63); gravity();
			setState(64); friction1();
			setState(65); friction2();
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
		enterRule(_localctx, 6, RULE_ball);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(BALL);
			setState(68); id();
			setState(69); x();
			setState(70); y();
			setState(71); xv();
			setState(72); yv();
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
		enterRule(_localctx, 8, RULE_gravity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(GRAVITY);
			setState(75); match(EQUALS);
			setState(76); match(FLOAT);
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
		enterRule(_localctx, 10, RULE_friction1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(FRICTION1);
			setState(79); match(EQUALS);
			setState(80); match(FLOAT);
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
		enterRule(_localctx, 12, RULE_friction2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(FRICTION2);
			setState(83); match(EQUALS);
			setState(84); match(FLOAT);
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
		enterRule(_localctx, 14, RULE_bumper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); bumpertype();
			setState(87); id();
			setState(88); x();
			setState(89); y();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORIENTATIONKEY) {
				{
				{
				setState(90); orientation();
				}
				}
				setState(95);
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
		enterRule(_localctx, 16, RULE_bumpertype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 18, RULE_flipperleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(LEFTFLIPPER);
			setState(99); id();
			setState(100); x();
			setState(101); y();
			setState(102); orientation();
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
		enterRule(_localctx, 20, RULE_flipperright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(RIGHTFLIPPER);
			setState(105); id();
			setState(106); x();
			setState(107); y();
			setState(108); orientation();
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
		enterRule(_localctx, 22, RULE_absorber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(ABSORBER);
			setState(111); id();
			setState(112); x();
			setState(113); y();
			setState(114); width();
			setState(115); height();
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
		enterRule(_localctx, 24, RULE_fire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(FIRE);
			setState(118); match(TRIGGER);
			setState(119); match(EQUALS);
			setState(120); match(NAME);
			setState(121); match(ACTION);
			setState(122); match(EQUALS);
			setState(123); match(NAME);
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
		enterRule(_localctx, 26, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(X);
			setState(126); match(EQUALS);
			setState(127);
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
		enterRule(_localctx, 28, RULE_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(Y);
			setState(130); match(EQUALS);
			setState(131);
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
		enterRule(_localctx, 30, RULE_xv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(XVEL);
			setState(134); match(EQUALS);
			setState(135); match(FLOAT);
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
		enterRule(_localctx, 32, RULE_yv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(YVEL);
			setState(138); match(EQUALS);
			setState(139); match(FLOAT);
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
		enterRule(_localctx, 34, RULE_orientationvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 36, RULE_orientation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(ORIENTATIONKEY);
			setState(144); match(EQUALS);
			setState(145); orientationvalue();
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
		enterRule(_localctx, 38, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(WIDTH);
			setState(148); match(EQUALS);
			setState(149); match(INTEGER);
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
		enterRule(_localctx, 40, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(HEIGHT);
			setState(152); match(EQUALS);
			setState(153); match(INTEGER);
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
		enterRule(_localctx, 42, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(NAMEKEY);
			setState(156); match(EQUALS);
			setState(157); match(NAME);
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
		"\2\3\"\u00a2\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\3\2\3\2\7\2\61\n\2\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3>\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t^\n\t\f"+
		"\t\16\ta\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\2\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\6\3\34\36\4\t\t!!\4\t\t!!\3\3\6\u0092\2.\3\2"+
		"\2\2\4=\3\2\2\2\6?\3\2\2\2\bE\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16T\3\2\2"+
		"\2\20X\3\2\2\2\22b\3\2\2\2\24d\3\2\2\2\26j\3\2\2\2\30p\3\2\2\2\32w\3\2"+
		"\2\2\34\177\3\2\2\2\36\u0083\3\2\2\2 \u0087\3\2\2\2\"\u008b\3\2\2\2$\u008f"+
		"\3\2\2\2&\u0091\3\2\2\2(\u0095\3\2\2\2*\u0099\3\2\2\2,\u009d\3\2\2\2."+
		"\62\5\6\4\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\1\2\2\66\3\3\2\2\2\67>\5"+
		"\b\5\28>\5\20\t\29>\5\24\13\2:>\5\26\f\2;>\5\30\r\2<>\5\32\16\2=\67\3"+
		"\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@"+
		"\7\30\2\2@A\5,\27\2AB\5\n\6\2BC\5\f\7\2CD\5\16\b\2D\7\3\2\2\2EF\7\31\2"+
		"\2FG\5,\27\2GH\5\34\17\2HI\5\36\20\2IJ\5 \21\2JK\5\"\22\2K\t\3\2\2\2L"+
		"M\7\20\2\2MN\7\f\2\2NO\7!\2\2O\13\3\2\2\2PQ\7\21\2\2QR\7\f\2\2RS\7!\2"+
		"\2S\r\3\2\2\2TU\7\22\2\2UV\7\f\2\2VW\7!\2\2W\17\3\2\2\2XY\5\22\n\2YZ\5"+
		",\27\2Z[\5\34\17\2[_\5\36\20\2\\^\5&\24\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`\21\3\2\2\2a_\3\2\2\2bc\t\2\2\2c\23\3\2\2\2de\7\37\2\2ef"+
		"\5,\27\2fg\5\34\17\2gh\5\36\20\2hi\5&\24\2i\25\3\2\2\2jk\7 \2\2kl\5,\27"+
		"\2lm\5\34\17\2mn\5\36\20\2no\5&\24\2o\27\3\2\2\2pq\7\32\2\2qr\5,\27\2"+
		"rs\5\34\17\2st\5\36\20\2tu\5(\25\2uv\5*\26\2v\31\3\2\2\2wx\7\33\2\2xy"+
		"\7\23\2\2yz\7\f\2\2z{\7\"\2\2{|\7\25\2\2|}\7\f\2\2}~\7\"\2\2~\33\3\2\2"+
		"\2\177\u0080\7\n\2\2\u0080\u0081\7\f\2\2\u0081\u0082\t\3\2\2\u0082\35"+
		"\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\f\2\2\u0085\u0086\t\4\2\2"+
		"\u0086\37\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089\7\f\2\2\u0089\u008a"+
		"\7!\2\2\u008a!\3\2\2\2\u008b\u008c\7\17\2\2\u008c\u008d\7\f\2\2\u008d"+
		"\u008e\7!\2\2\u008e#\3\2\2\2\u008f\u0090\t\5\2\2\u0090%\3\2\2\2\u0091"+
		"\u0092\7\24\2\2\u0092\u0093\7\f\2\2\u0093\u0094\5$\23\2\u0094\'\3\2\2"+
		"\2\u0095\u0096\7\26\2\2\u0096\u0097\7\f\2\2\u0097\u0098\7\t\2\2\u0098"+
		")\3\2\2\2\u0099\u009a\7\27\2\2\u009a\u009b\7\f\2\2\u009b\u009c\7\t\2\2"+
		"\u009c+\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u009f\7\f\2\2\u009f\u00a0\7"+
		"\"\2\2\u00a0-\3\2\2\2\5\62=_";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}