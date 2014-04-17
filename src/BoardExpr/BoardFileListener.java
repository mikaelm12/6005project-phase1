package BoardExpr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import physics.Vect;
import pingball.datatypes.Absorber;
import pingball.datatypes.Ball;
import pingball.datatypes.Board;
import pingball.datatypes.CircularBumper;
import pingball.datatypes.Gadget;
import pingball.datatypes.LeftFlipper;
import pingball.datatypes.RightFlipper;
import pingball.datatypes.SquareBumper;
import pingball.datatypes.TriangularBumper;
import BoardExpr.BoardGrammarParser.AbsorberContext;
import BoardExpr.BoardGrammarParser.BallContext;
import BoardExpr.BoardGrammarParser.BoardContext;
import BoardExpr.BoardGrammarParser.BoardspecContext;
import BoardExpr.BoardGrammarParser.BumperContext;
import BoardExpr.BoardGrammarParser.FlipperleftContext;
import BoardExpr.BoardGrammarParser.FlipperrightContext;


public class BoardFileListener extends BoardGrammarBaseListener {
    
    List<Gadget>  gadgets = new ArrayList<Gadget>();
    List<Ball> gameBalls = new ArrayList<Ball>();
    Board board;
    
    //Board board;
   // List<Ball> balls = new ArrayList<Ball>();
   // String[] boardInfo = new String[4];  // position 0 = name  pos 1 = gravity pos2 = friction1 pos3 = friction2
    
    
    
    
    @Override
    public void exitBoard(BoardContext ctx) {
        
        String name = ctx.boardspec().id().NAME().getText();
        double gravity = Double.parseDouble(ctx.boardspec().gravity().FLOAT().getText());
        double friction1 = Double.parseDouble(ctx.boardspec().friction1().FLOAT().getText());
        double friction2 = Double.parseDouble(ctx.boardspec().friction2().FLOAT().getText());
        this.board = new  Board(name , gravity, friction1, friction2);
        
        for(Ball ball: gameBalls){
            board.addBall(ball);
        }
        for(Gadget gadget: gadgets){
            
            board.addGadget(gadget);
        }
        
        
        
    super.exitBoard(ctx);
    }
    
    @Override
    public void exitBoardspec(BoardspecContext ctx) {
        double gravity = Double.parseDouble(ctx.gravity().FLOAT().getText());
        double friction1 = Double.parseDouble(ctx.friction1().FLOAT().getText());
        double friction2 = Double.parseDouble(ctx.friction2().FLOAT().getText());
        
        String name = ctx.id().NAME().getText();
        
        
       
        super.exitBoardspec(ctx);
    }
    
    @Override
    public void exitBall(BallContext ctx) {
        
        double  x = Double.parseDouble(ctx.x().FLOAT().getText());
        double y = Double.parseDouble(ctx.y().FLOAT().getText());
        double xvel = Double.parseDouble(ctx.xv().FLOAT().getText());
        double yvel = Double.parseDouble(ctx.yv().FLOAT().getText());
       
        String name = ctx.id().NAME().getText();
        
        Ball ball = new Ball(name , x,y, xvel,yvel);
        gameBalls.add(ball);
        
        
        
        super.exitBall(ctx);
    }
    
    @Override
    public void exitBumper(BumperContext ctx) {
        
        int x = Integer.parseInt(ctx.x().INTEGER().getText());
        int y = Integer.parseInt(ctx.y().INTEGER().getText());
        String name = ctx.id().NAME().getText();
        
        
        if(ctx.bumpertype().getText().equals("circleBumper")){
            CircularBumper bumper = new CircularBumper(name,x,y);
            gadgets.add(bumper);
         
        }
        else if(ctx.bumpertype().getText().equals("squareBumper")){
            SquareBumper bumper = new SquareBumper(name, x,y);
            gadgets.add(bumper);
        }
        else if (ctx.bumpertype().getText().equals("triangleBumper")){
          int orientation = Integer.parseInt(ctx.objectorientation(0).INTEGER().getText());
           TriangularBumper bumper = new TriangularBumper(name,x,y, orientation );
            gadgets.add(bumper);
        }
       
        
        
        super.exitBumper(ctx);
    }
    

    
    
    
    @Override
    //Grammar for flippers
    //flipperleft : LEFTFLIPPER id x y orientation;  //Not sure if they need to be different
    //flipperright : RIGHTFLIPPER id x y orientation;
    public void exitFlipperleft(FlipperleftContext ctx) {
        
        String name = ctx.id().NAME().getText();
        int x = Integer.parseInt(ctx.x().INTEGER().getText());
        int y = Integer.parseInt(ctx.y().INTEGER().getText());
        
        int orientation = Integer.parseInt(ctx.objectorientation().INTEGER().getText());
       
        LeftFlipper leftflipper = new LeftFlipper(name, x, y, orientation);
        
        gadgets.add(leftflipper);
        
        
        super.exitFlipperleft(ctx);
    }
    
    @Override
    public void exitFlipperright(FlipperrightContext ctx) {
       
        String name = ctx.id().NAME().getText();
        int x = Integer.parseInt(ctx.x().INTEGER().getText());
        int y = Integer.parseInt(ctx.y().INTEGER().getText());
        
        int orientation = Integer.parseInt(ctx.objectorientation().INTEGER().getText());
        
        RightFlipper rightflipper = new RightFlipper(name, x, y, orientation);
        
        gadgets.add(rightflipper);
       
        
        super.exitFlipperright(ctx);
    }
    
    @Override
    public void exitAbsorber(AbsorberContext ctx) {
        
        
        String name = ctx.id().NAME().getText();
        int x = Integer.parseInt(ctx.x().INTEGER().getText());
        int y = Integer.parseInt(ctx.y().INTEGER().getText());
        int width = Integer.parseInt(ctx.width().INTEGER().getText());
        int height = Integer.parseInt(ctx.height().INTEGER().getText());
        
        Absorber abs = new Absorber(name, x, y, width, height);
        gadgets.add(abs);
       
        super.exitAbsorber(ctx);
    }
    
    public List<Gadget> getGadgets(){
        return gadgets;
    }
    public Board getBoard(){
        return board;
    }
    


}
