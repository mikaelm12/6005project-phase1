package BoardExpr;

import java.util.HashSet;
import java.util.Set;

import pingball.datatypes.CircularBumper;
import pingball.datatypes.Gadget;
import pingball.datatypes.LeftFlipper;
import pingball.datatypes.TriangularBumper;
import BoardExpr.BoardGrammarParser.BallContext;
import BoardExpr.BoardGrammarParser.BumperContext;
import BoardExpr.BoardGrammarParser.FlipperleftContext;


public class BoardFileListener extends BoardGrammarBaseListener {
    
    Set<Gadget>  gadgets = new HashSet<Gadget>();
    
    @Override
    public void exitBall(BallContext ctx) {
        
        
        super.exitBall(ctx);
    }
    
    @Override
    public void exitBumper(BumperContext ctx) {
        
        double x = Double.parseDouble(ctx.x().getText());
        double y = Double.parseDouble(ctx.y().getText());
        String name = ctx.id().NAME().getText();
        CircularBumper circularbumper = new CircularBumper(name,x,y);
        
        gadgets.add(circularbumper);
        
        
        super.exitBumper(ctx);
    }
    

    
    
    
    @Override
    //Grammar for flippers
    //flipperleft : LEFTFLIPPER id x y orientation;  //Not sure if they need to be different
    //flipperright : RIGHTFLIPPER id x y orientation;
    public void exitFlipperleft(FlipperleftContext ctx) {
        
        String name = ctx.id().NAME().getText();
        double x = Double.parseDouble(ctx.x().getText());
        double y = Double.parseDouble(ctx.y().getText());
        
        int orientation = Integer.parseInt(ctx.orientation().ORIENTATIONVALUE().getText());
        
        LeftFlipper leftflipper = new LeftFlipper(name, x, y, orientation);
        
        gadgets.add(leftflipper);
        
        super.exitFlipperleft(ctx);
    }

}
