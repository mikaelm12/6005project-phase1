package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.LineSegment;
import physics.Vect;

public class Absorber implements Gadget{
    
    private final int width;
    private final int height;
    private final int coR;
    private final LineSegment top;
    private final LineSegment right;
    private final LineSegment bottom;
    private final LineSegment left;
    private final String name;
    private List<Gadget> gadgetsToFire;
    
    //Rep invariant:
    //width>0, height>0, name!=null && name.length>0
    //Abstraction Function:
    //represents an absorber with width width and height height
    
    public Absorber(String name,double x,double y, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;
        this.coR = 0;    
        this.top = new LineSegment(x,y,x+width,y);
        this.right = new LineSegment(x+width,y,x+width,y+height);
        this.bottom = new LineSegment(x,y+height,x+width,y+height);
        this.left = new LineSegment(x,y,x,y+height);
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
     * shoots out a stored ball when triggered
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
     * compute time until collision
     * @param ball to collide with
     * @return time until ball collides with absorber
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
     * @return String representation of the absorber
     */
    @Override 
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }
}
