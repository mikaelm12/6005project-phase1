package BoardExpr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pingball.datatypes.Absorber;
import pingball.datatypes.CircularBumper;
import pingball.datatypes.Gadget;
import pingball.datatypes.LeftFlipper;
import pingball.datatypes.RightFlipper;
import pingball.datatypes.SquareBumper;
import pingball.datatypes.TriangularBumper;
import BoardExpr.BoardGrammarParser.AbsorberContext;
import BoardExpr.BoardGrammarParser.BallContext;
import BoardExpr.BoardGrammarParser.BumperContext;
import BoardExpr.BoardGrammarParser.FlipperleftContext;
import BoardExpr.BoardGrammarParser.FlipperrightContext;


public class BoardFileListener extends BoardGrammarBaseListener {
    
    List<Gadget>  gadgets = new ArrayList<Gadget>();
    
    @Override
    public void exitBall(BallContext ctx) {
        
        
        super.exitBall(ctx);
    }
    
    @Override
    public void exitBumper(BumperContext ctx) {
        
        int x = Integer.parseInt(ctx.x().INTEGER().getText());
        int y = Integer.parseInt(ctx.y().INTEGER().getText());
        String name = ctx.id().NAME().getText();
        
        
        if(ctx.bumpertype().getText().equals("circularBumper")){
            CircularBumper bumper = new CircularBumper(name,x,y);
            gadgets.add(bumper);
        }
        else if(ctx.bumpertype().getText().equals("squareBumper")){
            SquareBumper bumper = new SquareBumper(name, x,y);
            gadgets.add(bumper);
        }
//        else if (ctx.bumpertype().getText().equals("triangularBumper")){
//            int orientation = Integer.parseInt(ctx.orientation().orientationvalue().getText());
//            TriangularBumper bumper = new TriangularBumper(name,x,y, orientation );
//            gadgets.add(bumper);
//        }
       
        
        
        super.exitBumper(ctx);
    }
    

    
    
    
    @Override
    //Grammar for flippers
    //flipperleft : LEFTFLIPPER id x y orientation;  //Not sure if they need to be different
    //flipperright : RIGHTFLIPPER id x y orientation;
    public void exitFlipperleft(FlipperleftContext ctx) {
        
        String name = ctx.id().NAME().getText();
        double x = Double.parseDouble(ctx.x().INTEGER().getText());
        double y = Double.parseDouble(ctx.y().INTEGER().getText());
        
        int orientation = Integer.parseInt(ctx.orientation().orientationvalue().getText());
       
        LeftFlipper leftflipper = new LeftFlipper(name, x, y, orientation);
        
        gadgets.add(leftflipper);
        System.out.println(gadgets);
        
        super.exitFlipperleft(ctx);
    }
    
    @Override
    public void exitFlipperright(FlipperrightContext ctx) {
       
        String name = ctx.id().NAME().getText();
        double x = Double.parseDouble(ctx.x().INTEGER().getText());
        double y = Double.parseDouble(ctx.y().INTEGER().getText());
        
        int orientation = Integer.parseInt(ctx.orientation().orientationvalue().getText());
        
        RightFlipper rightflipper = new RightFlipper(name, x, y, orientation);
        
        gadgets.add(rightflipper);
        System.out.println(gadgets);
        
        super.exitFlipperright(ctx);
    }
    
    @Override
    public void exitAbsorber(AbsorberContext ctx) {
        
        
        String name = ctx.id().NAME().getText();
        double x = Double.parseDouble(ctx.x().INTEGER().getText());
        double y = Double.parseDouble(ctx.y().INTEGER().getText());
        int width = Integer.parseInt(ctx.width().INTEGER().getText());
        int height = Integer.parseInt(ctx.height().INTEGER().getText());
        
        Absorber abs = new Absorber(name, x, y, width, height);
        gadgets.add(abs);
        System.out.println(gadgets);
        super.exitAbsorber(ctx);
    }
    
    public Gadget getGadget(){
        if (gadgets.size() > 0){
            Gadget g = gadgets.get(0);
            gadgets.remove(0);
            return g;
            
        }
        else return null;
    }

}
