// Generated from BoardGrammar.g4 by ANTLR 4.0

package BoardExpr;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface BoardGrammarListener extends ParseTreeListener {
	void enterAbsorber(BoardGrammarParser.AbsorberContext ctx);
	void exitAbsorber(BoardGrammarParser.AbsorberContext ctx);

	void enterOrientation(BoardGrammarParser.OrientationContext ctx);
	void exitOrientation(BoardGrammarParser.OrientationContext ctx);

	void enterBall(BoardGrammarParser.BallContext ctx);
	void exitBall(BoardGrammarParser.BallContext ctx);

	void enterTrianglebumper(BoardGrammarParser.TrianglebumperContext ctx);
	void exitTrianglebumper(BoardGrammarParser.TrianglebumperContext ctx);

	void enterBoardspec(BoardGrammarParser.BoardspecContext ctx);
	void exitBoardspec(BoardGrammarParser.BoardspecContext ctx);

	void enterFlipperleft(BoardGrammarParser.FlipperleftContext ctx);
	void exitFlipperleft(BoardGrammarParser.FlipperleftContext ctx);

	void enterWidth(BoardGrammarParser.WidthContext ctx);
	void exitWidth(BoardGrammarParser.WidthContext ctx);

	void enterBoard(BoardGrammarParser.BoardContext ctx);
	void exitBoard(BoardGrammarParser.BoardContext ctx);

	void enterXv(BoardGrammarParser.XvContext ctx);
	void exitXv(BoardGrammarParser.XvContext ctx);

	void enterFire(BoardGrammarParser.FireContext ctx);
	void exitFire(BoardGrammarParser.FireContext ctx);

	void enterId(BoardGrammarParser.IdContext ctx);
	void exitId(BoardGrammarParser.IdContext ctx);

	void enterYv(BoardGrammarParser.YvContext ctx);
	void exitYv(BoardGrammarParser.YvContext ctx);

	void enterHeight(BoardGrammarParser.HeightContext ctx);
	void exitHeight(BoardGrammarParser.HeightContext ctx);

	void enterFlipperright(BoardGrammarParser.FlipperrightContext ctx);
	void exitFlipperright(BoardGrammarParser.FlipperrightContext ctx);

	void enterBumper(BoardGrammarParser.BumperContext ctx);
	void exitBumper(BoardGrammarParser.BumperContext ctx);

	void enterY(BoardGrammarParser.YContext ctx);
	void exitY(BoardGrammarParser.YContext ctx);

	void enterX(BoardGrammarParser.XContext ctx);
	void exitX(BoardGrammarParser.XContext ctx);
}