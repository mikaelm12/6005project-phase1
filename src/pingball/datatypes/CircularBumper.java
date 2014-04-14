package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.Circle;
import physics.Vect;


public class CircularBumper implements Gadget{
    
    private final double diameter;
    private final double coR;
    private final Circle circle;
    private final String name;
    private List<Gadget> gadgetsToFire;
    
    //Rep invariant:
    //diameter=1.0, name!=null && name.length>0
    //Abstraction Function:
    //circle represents circularBumper
    
    public CircularBumper(String name,double x, double y){
        this.name = name;
        this.diameter = 1.0;
        this.coR = 1.0;
        this.circle = new Circle(x+0.5,y+0.5,diameter);
        this.gadgetsToFire = new ArrayList<Gadget>();
        
        checkRep();
    }
    
    /**
     * triggers the actions of gadgets in gadgetsToFire
     */
    @Override
    public void trigger(){

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
     * computes time until the ball collides with the circular Bumper
     * @param ball ball to collide with
     * @return time until ball collides with circularBumper
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
     * @return a String representation of the CircularBumper
     */
    @Override
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }

}
