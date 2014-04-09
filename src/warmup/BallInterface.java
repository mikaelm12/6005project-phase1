package warmup;

import physics.Vect;

public interface BallInterface {
    
   /**
    * Sets the velocity of the ball object

    * @param magnitude of the velocity
    * @param direction of the velocity
    */
    public void setVelocity(double magnitude, double direction);

    
    
    /**
    * Gets the current velocity of the ball object
    * @return the vector velocity of the ball
    */
    public Vect getVelocity();
    
    
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
    public double getRadius();
    
    
    
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
     * @param the gravity of the board
     */
    public void setGravity(double gravity);

    
    /**
     * Gets the gravity of the ball according to its current board
     * @return A double representing the gravity of the ball
     */
    public double getGravity();
    

}
