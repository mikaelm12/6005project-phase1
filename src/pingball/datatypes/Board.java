package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;


public class Board {

    private final String name;
    private OuterWall wallLeft;
    private OuterWall wallRight;
    private OuterWall wallTop;
    private OuterWall wallBottom;
    private Board neighborLeft = null;
    private Board neighborRight = null;
    private Board neighborTop = null;
    private Board neighborBottom = null;
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
     * removes ball from the list of balls contained in board
     * @param ball to be removed to the board
     */
    public void removeBall(Ball ball){
        balls.remove(ball);
    }
    
    /**
     * adds a gadget to the board
     * @param gadget to be added to the board
     */
    public void addGadget(Gadget gadget){
        gadgets.add(gadget);
    }
    
    private void checkRep(){
    }
    
    /**
     * Gets this board's neighbor that shares the left wall
     * @return neighbor to the left
     */
    public Board getNeighborLeft(){
        return neighborLeft;
    }
    
    /**
     * Gets this board's neighbor that shares the right wall
     * @return neighbor to the right
     */
    public Board getNeighborRight(){
        return neighborRight;
    }
    
    /**
     * Gets this board's neighbor that shares the top wall
     * @return neighbor to the top
     */
    public Board getNeighborTop(){
        return neighborTop;
    }
    
    /**
     * Gets this board's neighbor that shares the bottom wall
     * @return neighbor to the bottom
     */
    public Board getNeighborBottom(){
        return neighborBottom;
    }
    
   /**
    * Sets this board's left neighbor to be the given board
    * @param board new neighbor
    */
    public void setNeighborLeft(Board board){
        neighborLeft = board;
    }
    
    /**
     * Sets this board's right neighbor to be the given board
     * @param board new neighbor
     */
    public void setNeighborRight(Board board){
        neighborRight = board;
    }

    /**
     * Sets this board's top free day neighbor to be the given board
     * @param board new neighbor
     */
    public void setNeighborTop(Board board){
        neighborTop = board;
    }
    
    /**
     * Sets this board's bottom neighbor to be the given board
     * @param board new neighbor in the bottom
     */
    public void setNeighborBottom(Board board){
        neighborBottom = board;
    }
    
    /**
     * Removes a given board from this board's neighbors
     * @param board to be removed from neighbors
     */
    public void unNeighbor (Board board){
        if (neighborBottom == board){neighborBottom = null;}
        else if (neighborTop == board){neighborTop = null;}
        else if (neighborLeft == board){neighborLeft = null;}
        else if (neighborRight == board){neighborRight = null;}
    }
    
    /**
     * Transfers a ball from the left or right extreme of this board to the
     *  opposite extreme of the other one, keeping same vertical location
     * Ball keeps original velocity vector
     * @param to board where the ball will appear
     * @param ball to be transfered from board to board
     */
    public void transferBallHorizontal(Board to, Ball ball){
        balls.remove(ball);
        if (ball.getPosition()[0] > 10){
            Ball newBall = new Ball(0, ball.getPosition()[1], ball.getVelocity());
            to.addBall(newBall);
        } else {
            Ball newBall = new Ball(20, ball.getPosition()[1], ball.getVelocity());
            to.addBall(newBall);
        }
    }
    
    /**
     * Transfers a ball from the top or bottom extreme of this board to the
     *  opposite extreme of the other one, keeping same vertical location
     * Ball keeps original velocity vector
     * @param to board where the ball will appear
     * @param ball to be transfered from board to board
     */
    public void transferBallVertical(Board to, Ball ball){
        balls.remove(ball);
        if (ball.getPosition()[1] > 10){
            Ball newBall = new Ball(ball.getPosition()[0], 0, ball.getVelocity());
            to.addBall(newBall);
        } else {
            Ball newBall = new Ball(ball.getPosition()[0], 20, ball.getVelocity());
            to.addBall(newBall);
        }
        
        
    }
}