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
		COMMENT=1, WHITESPACE=2, INTEGER=3, X=4, Y=5, EQUALS=6, NAMEKEY=7, XVEL=8, 
		YVEL=9, GRAVITY=10, FRICTION1=11, FRICTION2=12, TRIGGER=13, ORIENTATIONKEY=14, 
		ACTION=15, WIDTH=16, HEIGHT=17, BOARD=18, BALL=19, ABSORBER=20, FIRE=21, 
		SQUAREBUMPER=22, CIRCLEBUMPER=23, TRIANGLEBUMPER=24, LEFTFLIPPER=25, RIGHTFLIPPER=26, 
		FLOAT=27, NAME=28;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "WHITESPACE", "INTEGER", "'x'", "'y'", "'='", 
		"'name'", "'xVelocity'", "'yVelocity'", "'gravity'", "'friction1'", "'friction2'", 
		"'trigger'", "'orientation'", "'action'", "'width'", "'height'", "'board'", 
		"'ball'", "'absorber'", "'fire'", "'squareBumper'", "'circleBumper'", 
		"'triangleBumper'", "'leftFlipper'", "'rightFlipper'", "FLOAT", "NAME"
	};
	public static final int
		RULE_board = 0, RULE_boardObjects = 1, RULE_boardspec = 2, RULE_ball = 3, 
		RULE_gravity = 4, RULE_friction1 = 5, RULE_friction2 = 6, RULE_bumper = 7, 
		RULE_bumpertype = 8, RULE_objectorientation = 9, RULE_flipperleft = 10, 
		RULE_flipperright = 11, RULE_absorber = 12, RULE_fire = 13, RULE_x = 14, 
		RULE_y = 15, RULE_xv = 16, RULE_yv = 17, RULE_width = 18, RULE_height = 19, 
		RULE_id = 20;
	public static final String[] ruleNames = {
		"board", "boardObjects", "boardspec", "ball", "gravity", "friction1", 
		"friction2", "bumper", "bumpertype", "objectorientation", "flipperleft", 
		"flipperright", "absorber", "fire", "x", "y", "xv", "yv", "width", "height", 
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
			setState(42); boardspec();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BALL) | (1L << ABSORBER) | (1L << FIRE) | (1L << SQUAREBUMPER) | (1L << CIRCLEBUMPER) | (1L << TRIANGLEBUMPER) | (1L << LEFTFLIPPER) | (1L << RIGHTFLIPPER))) != 0)) {
				{
				{
				setState(43); boardObjects();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49); match(EOF);
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
			setState(57);
			switch (_input.LA(1)) {
			case BALL:
				{
				setState(51); ball();
				}
				break;
			case SQUAREBUMPER:
			case CIRCLEBUMPER:
			case TRIANGLEBUMPER:
				{
				setState(52); bumper();
				}
				break;
			case LEFTFLIPPER:
				{
				setState(53); flipperleft();
				}
				break;
			case RIGHTFLIPPER:
				{
				setState(54); flipperright();
				}
				break;
			case ABSORBER:
				{
				setState(55); absorber();
				}
				break;
			case FIRE:
				{
				setState(56); fire();
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
			setState(59); match(BOARD);
			setState(60); id();
			setState(61); gravity();
			setState(62); friction1();
			setState(63); friction2();
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
			setState(65); match(BALL);
			setState(66); id();
			setState(67); x();
			setState(68); y();
			setState(69); xv();
			setState(70); yv();
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
			setState(72); match(GRAVITY);
			setState(73); match(EQUALS);
			setState(74); match(FLOAT);
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
			setState(76); match(FRICTION1);
			setState(77); match(EQUALS);
			setState(78); match(FLOAT);
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
			setState(80); match(FRICTION2);
			setState(81); match(EQUALS);
			setState(82); match(FLOAT);
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
		public List<ObjectorientationContext> objectorientation() {
			return getRuleContexts(ObjectorientationContext.class);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ObjectorientationContext objectorientation(int i) {
			return getRuleContext(ObjectorientationContext.class,i);
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
			setState(84); bumpertype();
			setState(85); id();
			setState(86); x();
			setState(87); y();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORIENTATIONKEY) {
				{
				{
				setState(88); objectorientation();
				}
				}
				setState(93);
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
			setState(94);
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

	public static class ObjectorientationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BoardGrammarParser.INTEGER, 0); }
		public TerminalNode EQUALS() { return getToken(BoardGrammarParser.EQUALS, 0); }
		public TerminalNode ORIENTATIONKEY() { return getToken(BoardGrammarParser.ORIENTATIONKEY, 0); }
		public ObjectorientationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectorientation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).enterObjectorientation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardGrammarListener ) ((BoardGrammarListener)listener).exitObjectorientation(this);
		}
	}

	public final ObjectorientationContext objectorientation() throws RecognitionException {
		ObjectorientationContext _localctx = new ObjectorientationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectorientation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(ORIENTATIONKEY);
			setState(97); match(EQUALS);
			setState(98); match(INTEGER);
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
		public ObjectorientationContext objectorientation() {
			return getRuleContext(ObjectorientationContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 20, RULE_flipperleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(LEFTFLIPPER);
			setState(101); id();
			setState(102); x();
			setState(103); y();
			setState(104); objectorientation();
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
		public ObjectorientationContext objectorientation() {
			return getRuleContext(ObjectorientationContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 22, RULE_flipperright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(RIGHTFLIPPER);
			setState(107); id();
			setState(108); x();
			setState(109); y();
			setState(110); objectorientation();
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
		enterRule(_localctx, 24, RULE_absorber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(ABSORBER);
			setState(113); id();
			setState(114); x();
			setState(115); y();
			setState(116); width();
			setState(117); height();
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
		enterRule(_localctx, 26, RULE_fire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(FIRE);
			setState(120); match(TRIGGER);
			setState(121); match(EQUALS);
			setState(122); match(NAME);
			setState(123); match(ACTION);
			setState(124); match(EQUALS);
			setState(125); match(NAME);
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
		enterRule(_localctx, 28, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(X);
			setState(128); match(EQUALS);
			setState(129);
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
		enterRule(_localctx, 30, RULE_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(Y);
			setState(132); match(EQUALS);
			setState(133);
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
		enterRule(_localctx, 32, RULE_xv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(XVEL);
			setState(136); match(EQUALS);
			setState(137); match(FLOAT);
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
		enterRule(_localctx, 34, RULE_yv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(YVEL);
			setState(140); match(EQUALS);
			setState(141); match(FLOAT);
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
			setState(143); match(WIDTH);
			setState(144); match(EQUALS);
			setState(145); match(INTEGER);
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
			setState(147); match(HEIGHT);
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
			setState(151); match(NAMEKEY);
			setState(152); match(EQUALS);
			setState(153); match(NAME);
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
		"\2\3\36\u009e\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3"+
		"\2\7\2/\n\2\f\2\16\2\62\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\\\n\t\f\t\16\t"+
		"_\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*\2\5\3\30\32\4\5\5\35\35\4\5\5\35\35\u008f\2,\3\2\2\2\4;\3\2\2\2\6"+
		"=\3\2\2\2\bC\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2\16R\3\2\2\2\20V\3\2\2\2\22"+
		"`\3\2\2\2\24b\3\2\2\2\26f\3\2\2\2\30l\3\2\2\2\32r\3\2\2\2\34y\3\2\2\2"+
		"\36\u0081\3\2\2\2 \u0085\3\2\2\2\"\u0089\3\2\2\2$\u008d\3\2\2\2&\u0091"+
		"\3\2\2\2(\u0095\3\2\2\2*\u0099\3\2\2\2,\60\5\6\4\2-/\5\4\3\2.-\3\2\2\2"+
		"/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63"+
		"\64\7\1\2\2\64\3\3\2\2\2\65<\5\b\5\2\66<\5\20\t\2\67<\5\26\f\28<\5\30"+
		"\r\29<\5\32\16\2:<\5\34\17\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2"+
		"\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\7\24\2\2>?\5*\26\2?@\5\n\6\2@A\5"+
		"\f\7\2AB\5\16\b\2B\7\3\2\2\2CD\7\25\2\2DE\5*\26\2EF\5\36\20\2FG\5 \21"+
		"\2GH\5\"\22\2HI\5$\23\2I\t\3\2\2\2JK\7\f\2\2KL\7\b\2\2LM\7\35\2\2M\13"+
		"\3\2\2\2NO\7\r\2\2OP\7\b\2\2PQ\7\35\2\2Q\r\3\2\2\2RS\7\16\2\2ST\7\b\2"+
		"\2TU\7\35\2\2U\17\3\2\2\2VW\5\22\n\2WX\5*\26\2XY\5\36\20\2Y]\5 \21\2Z"+
		"\\\5\24\13\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\21\3\2\2\2_]\3"+
		"\2\2\2`a\t\2\2\2a\23\3\2\2\2bc\7\20\2\2cd\7\b\2\2de\7\5\2\2e\25\3\2\2"+
		"\2fg\7\33\2\2gh\5*\26\2hi\5\36\20\2ij\5 \21\2jk\5\24\13\2k\27\3\2\2\2"+
		"lm\7\34\2\2mn\5*\26\2no\5\36\20\2op\5 \21\2pq\5\24\13\2q\31\3\2\2\2rs"+
		"\7\26\2\2st\5*\26\2tu\5\36\20\2uv\5 \21\2vw\5&\24\2wx\5(\25\2x\33\3\2"+
		"\2\2yz\7\27\2\2z{\7\17\2\2{|\7\b\2\2|}\7\36\2\2}~\7\21\2\2~\177\7\b\2"+
		"\2\177\u0080\7\36\2\2\u0080\35\3\2\2\2\u0081\u0082\7\6\2\2\u0082\u0083"+
		"\7\b\2\2\u0083\u0084\t\3\2\2\u0084\37\3\2\2\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0087\7\b\2\2\u0087\u0088\t\4\2\2\u0088!\3\2\2\2\u0089\u008a\7\n\2\2"+
		"\u008a\u008b\7\b\2\2\u008b\u008c\7\35\2\2\u008c#\3\2\2\2\u008d\u008e\7"+
		"\13\2\2\u008e\u008f\7\b\2\2\u008f\u0090\7\35\2\2\u0090%\3\2\2\2\u0091"+
		"\u0092\7\22\2\2\u0092\u0093\7\b\2\2\u0093\u0094\7\5\2\2\u0094\'\3\2\2"+
		"\2\u0095\u0096\7\23\2\2\u0096\u0097\7\b\2\2\u0097\u0098\7\5\2\2\u0098"+
		")\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009b\7\b\2\2\u009b\u009c\7\36\2\2"+
		"\u009c+\3\2\2\2\5\60;]";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}