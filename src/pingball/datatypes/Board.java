package pingball.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import physics.Vect;


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
    private final int width = 20;
    private final int height = 20;
    private final double gravity;
    private final double mu;
    private final double mu2;
    private List<Ball> balls;
    private List<Gadget> gadgets;
    private String[][] boardString;
    
    //Rep invariant:
    
    //Abstraction Function:

    /**
     * 
     * @param x width of board
     * @param y height of board
     */
    public Board(String name,double gravity, double mu, double mu2){ 
        //set walls to be solid by default
        wallLeft = new OuterWall("left", 0,0,0,height,true);
        wallRight = new OuterWall( "right",width,0,width,height,true);
        wallTop = new OuterWall("top",0,0,width,0,true);
        wallBottom = new OuterWall("bottom",0,height,width,height,true);
        this.name = name;
        this.gravity = gravity;
        this.mu = mu;
        this.mu2 = mu2;
        balls = new ArrayList<Ball>();
        gadgets = new ArrayList<Gadget>();
        
        
        checkRep();
        
    }
    
    /**
     * Get this board's name
     * @return the name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * 
     * @return board gravity
     */
    public double getGravity(){
        return gravity;
    }
    
    /**
     * 
     * @return friction1
     */
    public double getMu(){
        return mu;
    }
    
    /**
     * 
     * @return friction2
     */
    public double getMu2(){
        return mu2;
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
     * updates positions and velocity of the balls on the board
     * @param timeStep difference in time
     */
    public void updateBallPositionsAndVelocity(double timeStep){
        //TODO: make this compatible with more than one ball
        for (Ball ball : balls) {
            ball.updateBallPosition(timeStep);
            ball.updateBallVelocityAfterTimestep(gravity, mu, mu2, timeStep);
        }
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
    
    /**
     * adds the gadgets in the list of gadgets to gadgets in the board
     * @param gadgets to be added to the board
     */
    public void addGadgetList(List<Gadget> gadgets){
        for(Gadget gadget: gadgets){
            this.gadgets.add(gadget);
        }
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
        if (neighborBottom == board){neighborBottom = null;} //TODO: define equals????
        else if (neighborTop == board){neighborTop = null;}
        else if (neighborLeft == board){neighborLeft = null;}
        else if (neighborRight == board){neighborRight = null;}
    }
    
    /**
     * 
     * @return list of balls in this board
     */
    public List<Ball> getBalls(){
        return balls;
    }
    
    /**
     * 
     * @return list of gadgets in this board
     */
    public List<Gadget> getGadgets(){
        return gadgets;
    }
    
    /**
     * @return string representation of the board
     */
    @Override
    public String toString(){
        boardString = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                boardString[i][j] = " ";
            }
        }
        
        String string = new String();
        string += wallTop.toString() + "\n";
        for (Gadget gadget : gadgets) {
            Vect pos = gadget.getPosition();
            int xPos = (int) pos.x();
            int yPos = (int) pos.y();
            String gadgetString = gadget.toString();
            if(gadgetString.length() == 1){
                boardString[yPos][xPos] = gadgetString;
            }
            else if(gadgetString.length() == 4){
                boardString[yPos][xPos] = Character.toString(gadgetString.charAt(0));
                boardString[yPos+1][xPos] = Character.toString(gadgetString.charAt(1));
                boardString[yPos][xPos+1] = Character.toString(gadgetString.charAt(2));
                boardString[yPos+1][xPos+1] = Character.toString(gadgetString.charAt(3));
            }
            else{
                if(gadgetString.length() <= 20){
                    for (int i = 0; i < gadgetString.length(); i++) {
                        boardString[yPos][xPos+i] = Character.toString(gadgetString.charAt(i));
                    }
                }else{
                    for (int i = 0; i < (gadgetString.length()/20); i++) {
                        for (int j = 0; j < 20; j++) {
                            boardString[yPos+i][xPos+j] = Character.toString(gadgetString.charAt((20*i)+j));
                        }
                    }
                }
            }
            
            
        }
        for (Ball ball : balls) {
            System.out.println(Arrays.toString(ball.getPosition()));
            int xPos = (int) Math.floor(ball.getPosition()[0]);
            int yPos = (int) Math.floor(ball.getPosition()[1]);
//            System.out.println(xPos);
//            System.out.println(yPos);
            if(yPos < 0){
                yPos += 1;
            }
            if(xPos < 0){
                xPos += 1;
            }
            boardString[yPos][xPos] = ball.toString();
        }
        for (int i = 0; i < height; i++) {
            string += ".";
            for (int j = 0; j < width; j++) {
                string += boardString[i][j];
            }
            string += ".\n";
        }
        string += wallBottom.toString();
        return string;
    }
    
}



