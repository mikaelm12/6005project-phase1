package pingball.datatypes;


public interface Gadget {
    
    /**
     * event that happens at the gadget such as when the ball collides with it
     * @return a Trigger object
     */
    public Trigger trigger();
    
    /**
     * response that the gadget makes to a trigger happening somewhere on the board
     */
    public void action(Trigger trigger);
    
    /**
     * 
     * @return coefficient of reflection of the gadget
     */
    public double getCoR();
    
    /**
     * computes the time until the ball collides with the gadget
     * @param ball the ball 
     * @return time until ball collides with gadget
     */
    public double timeUntilCollision(Ball ball);
    
    /**
     * 
     * @return string representation of the gadget
     */
    @Override
    public String toString();
    
    
}
