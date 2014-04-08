package warmup;

public interface Board {
    
    //TODO 
    //include methods for gadgets on the board
    //methods below are targeted toward warmup exercise where there is only one ball
    //some methods are not fully defined because corresponding classes have not been defined
    
    /**
     * 
     * @return the gravity of the board
     */
    public double getBoardGravity();
    
    /**
     * 
     * @return friction1 of the board
     */
    public double getFriction1();
    
    /**
     * 
     * @return friction2 of the board
     */
    public double getFriction2();
    
    //TODO: method should take in a ball instance since board could contain >1 ball
    /**
     * Gets the position of the ball within the board
     * @return position of the ball within the board
     */
    public double[] getBallPosition();
    
    //TODO: method should take in a ball instance since board could contain >1 ball
    /**
     * Sets the position of the ball
     * @param x new x-coordinate of the ball
     * @param y new y-coordinate of the ball
     */
    public void setBallPosition(double x, double y);
    

    //TODO: replace with method that returns array of walls that 
    //enclose the board 
    /**
     * Gets the coordinates of the four lines that enclose the board
     * each in the form [x1,y1,x2,y2]
     * @return array containing coordinates of walls that enclose the board
     */
    public double[] getBoardBorders();
    
    

}
