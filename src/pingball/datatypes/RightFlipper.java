package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.LineSegment;
import physics.Vect;


public class RightFlipper implements Gadget{
    
    private final double boxLength;
    private final double coR;
    private int orientation;
    private final String name;
    private final LineSegment flipper;
    private List<Gadget> gadgetsToFire;
    
    //Rep invariant
    //if orientation == 0, then lineSegment is at right of bounding box
    //if orientation == 90, then lineSegment is at bottom of bounding box
    //if orientation == 180, then lineSegment is at left of bounding box
    //if orientation == 270, then lineSegment is at top of bounding box
    //Abstraction Function
    //lineSegment represents flipper that rotates
    
    public RightFlipper(String name, double x, double y,int orientation){
        this.name = name;
        this.boxLength = 2.0;
        this.coR = 0.95;
        this.orientation = orientation;
        
        this.gadgetsToFire = new ArrayList<Gadget>();
        
        
        if(orientation == 0){
            this.flipper = new LineSegment(x+2,y,x+2,y+2);
        }
        else if(orientation == 90){
            this.flipper = new LineSegment(x,y+2,x+2,y+2);
        }
        else if(orientation == 180){
            this.flipper = new LineSegment(x,y,x,y+2);
        }
        else{ //orientation == 270
            this.flipper = new LineSegment(x,y,x+2,y);
        }
        
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
     * rotates 90degrees when triggered
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
     * computes time until ball collides with flipper
     * @param ball to collide with
     * @return time until ball collides with flipper
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
     * 
     * @return current orientation of the flipper
     */
    public int getOrientation(){
       return 0; 
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
     * @return String representation of the flipper
     */
    @Override
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }
}
