package warmup;

public interface BallInterface {
    
   /**
    * Sets the velocity of the ball object
    */
    public void setVelocity(int velocity);
    
    
    /**
    * Gets the current velocity of the ball object
    * @return a double representing the velocity of the ball 
    *         object
    */
    public double getVelocity();
    
    
    /**
     * Gets the current angle of the ball object
     * 
     * @return A double representing the angle of the ball object
     */
    public double getAngle();
    
    
    /**
     * Returns the radius of the ball
     * @return A double representing the radius of the ball
     */
    public double geetRadius();
    
    
    
    /**
     * Returns the current position of the ball in the board
     * that it's in.
     * @return An array of length 2 representing where the ball is in
     * in it's current board
     */
    public double[] getPosition();
    
    
    /**
     * Sets the gravity of the ball to the gravity 
     * of it's board
     * @return
     */
    public double setGravity();
    
    /**
     * Gets the gravity of the ball 
     * @return A double representing the gravity of the ball
     */
    public double getGravity();
    

}
