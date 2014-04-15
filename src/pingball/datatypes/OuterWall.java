package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.LineSegment;
import physics.Vect;

public class OuterWall implements Gadget{
    
    private final LineSegment wall;
    private final double coR;
    private boolean solid;
    private final String name;
    private List<Gadget> gadgetsToFire;
    
    //Rep invariant:
    
    //Abstraction function:
    
    public OuterWall(String name, double x0 , double y0, double x1, double y1, boolean solid){
        this.wall = new LineSegment(x0, y0, x1, y1);
        this.coR = 1.0;
        this.solid = solid;
        this.name = name;
        this.gadgetsToFire = new ArrayList<Gadget>();
        
        checkRep();
    }
    
    /**
     * triggers the actions of gadgets in gadgetsToFire
     */
    @Override
    public void trigger(){
        for (Gadget gadget : gadgetsToFire) {
            gadget.action();
        }
    }
    
    /**
     * no action i.e does not respond to any trigger
     */
    @Override
    public void action() {
        
    }
    
    /**
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR() {
        return 0;
    }
    
    /**
     * computes time until ball collides with wall
     * @param ball to collide with
     * @return time until ball collides with wall
     */
    @Override
    public double timeUntilCollision(Ball ball) {
        return 0;
    }
    
    /**
     * reflects the ball off gadget
     * @param ball to be reflected
     * @return the new velocity vector of the ball
     */
    @Override
    public Vect reflectOffGadget(Ball ball){
        return null;
    }
    
    /**
     * @return list of gadgets that are fired when this gadget is triggered
     */
    public List<Gadget> getGadgetsToFire(){
        return null;
    }
    
    /**
     * adds gadget to gadgets to be fired when this gadget is triggered
     * @param gadget gadget to be added to the list of gadgets that are fired when this
     *          gadget is triggered
     */
    public void addGadgetToFire(Gadget gadget){
        
    }
    
    /**
     * @return String representation of the outer walls
     */
    @Override
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }
    
    

}
