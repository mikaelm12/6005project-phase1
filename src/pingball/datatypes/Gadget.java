package pingball.datatypes;

import java.util.List;

import physics.Vect;


public interface Gadget {
    
    /**
     * event that happens at the gadget such as when the ball collides with it
     * triggers the action of other gadgets that may include itself
     */
    public void trigger(); //TODO: consider making method private within gadgets
    
    /**
     * response that the gadget makes to a trigger happening somewhere on the board
     */
    public void action();
    
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
     * reflects the ball off gadget. Calls on trigger to trigger gadgets connected to this gadget
     * @param ball to be reflected
     * @return the new velocity vector of the ball
     */
    public Vect reflectOffGadget(Ball ball);
    
    /**
     * 
     * @return list of gadgets that are fired when this gadget is triggered
     */
    public List<Gadget> getGadgetsToFire();
    
    /**
     * adds gadget to gadgets to be fired when this gadget is triggered
     * @param gadget gadget to be added to the list of gadgets that are fired when this
     *          gadget is triggered
     */
    public void addGadgetToFire(Gadget gadget);
    
    /**
     * 
     * @return string representation of the gadget
     */
    @Override
    public String toString();
    
    
}
