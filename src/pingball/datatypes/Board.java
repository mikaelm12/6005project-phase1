package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;


public class Board {

    private final String name;
    private OuterWall wallLeft;
    private OuterWall wallRight;
    private OuterWall wallTop;
    private OuterWall wallBottom;
    private final double width = 20;
    private final double height = 20;
    private final double gravity;
    private final double mu;
    private final double mu2;
    private List<Ball> balls;
    private List<Gadget> gadgets;
    private String[][] board;
    
    //Rep invariant:
    
    //Abstraction Function:

    /**
     * 
     * @param x width of board
     * @param y height of board
     */
    public Board(String name){ //TODO: board take in list of gadgets
        wallLeft = new OuterWall("left", 0,0,0,height,true);
        wallRight = new OuterWall( "right",width,0,width,height,true);
        wallTop = new OuterWall("top",0,0,width,0,true);
        wallBottom = new OuterWall("bottom",0,height,width,height,true);
        this.name = name;
        this.gravity = 0;
        this.mu = 0;
        this.mu2 = 0;
        balls = new ArrayList<Ball>();
        gadgets = new ArrayList<Gadget>();
        
        checkRep();
        
    }

    @Override
    public String toString(){
        return null;
    }
    
    /**
     * 
     * @return array containing all walls
     */
    public OuterWall[] getOuterWalls(){
        OuterWall[] walls = {wallLeft, wallTop, wallRight, wallBottom};
        return walls;
    }
    
    /**
     * adds ball to list of balls contained in board
     * @param ball to be added to the board
     */
    public void addBall(Ball ball){
        balls.add(ball);
    }
    
    /**
     * adds a gadget to the board
     * @param gadget to be added to the board
     */
    public void addGadget(Gadget gadget){
        
    }
    
    private void checkRep(){
        
    }
}
