//Our Board Grammar

grammar BoardGrammar;

// This puts a Java package statement at the top of the output Java files.
@header {
package BoardExpr;
}

// This adds code to the generated lexer and parser.
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 * *** ANTLR requires tokens to be CAPITALIZED, like START_ITALIC, END_ITALIC, and TEXT.
 */
X : 'X';
Y : 'Y';
EQUALS : '=';
NAMEKEY : 'name';
XVEL: 'xVelocity';
YVEL :'yVelcocity';
GRAVITY :'gravity';
FRICTION1 :'friction1';
FRICTION2 : 'friction2';
TRIGGER : 'trigger';
ORIENTATION : 'orientation';
ACTION : 'action';
WIDTH : 'width';
HEIGHT : 'height';
WHITESPACE : [ \t\r\n]+ -> skip;

BOARD : 'board';
BALL :'ball';
ABSORBER : 'absorber';
FIRE : 'fire';



// Bumpers
SQUAREBUMPER : 'squareBumper';
CIRCLEBUMPER : 'circleBumper';
TRIANGLEBUMPER : 'triangleBumper';

// Flippers
LEFTFLIPPER : 'leftFlipper';
RIGHTFLIPPER :'rightFlipper';

INTEGER : [0-9]+;
FLOAT : ('-')?[0-9]+(.[0-9]+)?;
NAME : [A-Za-z_][A-Za-z_0-9]*;
WHITESPACE : [ \t\r\n]+ -> skip ;

/*
 * These are the parser rules. They define the structures used by the parser.
 * *** ANTLR requires grammar nonterminals to be lowercase, like html, normal, and italic.
 */

board : boardspec ball* bumper* trianglebumper* flipperleft* flipperright* absorber* fire* EOF;
x : X EQUALS  FLOAT;
y : Y EQUALS FLOAT;
xv: XVEL EQUALS FLOAT;
yv : YVEL EQUALS FLOAT;
orientation: ORIENTATION ('0'|'90'|'180'|'270');
width : WIDTH EQUALS INTEGER;
height : HEIGHT EQUALS INTEGER;
id : NAMEKEY EQUALS NAME;

boardspec : BOARD id GRAVITY EQUALS FLOAT FRICTION1 EQUALS FLOAT FRICTION2 EQUALS FLOAT;

ball : id x y xv yv;

bumper : (SQUAREBUMPER | CIRCLEBUMPER) id x y;
trianglebumper : TRIANGLEBUMPER bumper orientation;

flipperleft : LEFTFLIPPER id x y orientation;  //Not sure if they need to be different
flipperright : RIGHTFLIPPER id x y orientation;

absorber : ABSORBER id x y width height;

fire : FIRE TRIGGER EQUALS id ACTION EQUALS id;



