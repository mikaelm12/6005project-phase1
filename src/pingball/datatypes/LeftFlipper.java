package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.Geometry;
import physics.LineSegment;
import physics.Vect;
import static org.junit.Assert.*;

public class LeftFlipper implements Gadget{
    
    private final double boxLength;
    private final double coR;
    private int orientation;
    private final LineSegment flipper;
    private final String name;
    private List<Gadget> gadgetsToFire;
    private String state = "initial"; //not triggered yet
    private double angularVelocity;
    
    //Rep invariant:
    //box within board
    //if orientation == 0, then lineSegment is at left of bounding box initially
    //if orientation == 90, then lineSegment is at bottom of bounding box initially
    //if orientation == 180, then lineSegment is at right of bounding box initially
    //if orientation == 270, then lineSegment is at top of bounding box initially
    //Abstraction Function
    //lineSegment represents flipper that rotates
    
    
    public LeftFlipper(String name, double x, double y, int orientation){
        this.name = name;
        this.boxLength = 2.0;
        this.coR = 0.95;
        this.orientation = orientation;
        this.gadgetsToFire = new ArrayList<Gadget>();
        this.angularVelocity = (1080/180)*Math.PI;
        
        if(orientation == 0){
            this.flipper = new LineSegment(x,y,x,y+2);
        }
        else if(orientation == 90){
            this.flipper = new LineSegment(x+2,y,x,y);
        }
        else if(orientation == 180){
            this.flipper = new LineSegment(x+2,y+2,x+2,y);
        }
        else{ //orientation == 270
            this.flipper = new LineSegment(x,y+2,x+2,y+2);
        }
        
        checkRep();
    }
    
    /**
     * fires the actions of gadgets in gadgetsToFire
     */
    private void trigger(){
        for (Gadget gadget : gadgetsToFire) {
            gadget.action();
        }
    }
    
    /**
     * rotates 90degrees when triggered
     */
    @Override
    public void action() {
        //TODO: perform rotation when triggered
        
        checkRep();
    }
    
    /**
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR() {
        return new Double(coR).doubleValue();
    }
    
    /**
     * computes time until ball collides with flipper
     * @param ball to collide with
     * @return time until ball collides with flipper
     */
    @Override
    public double timeUntilCollision(Ball ball) {
        return Geometry.timeUntilRotatingWallCollision(flipper, flipper.p1(), angularVelocity, 
                                                        ball.getCircle(), ball.getVelocity());
    }
    
    /**
     * reflects the ball off gadget
     * @param ball to be reflected
     */
    @Override
    public void reflectOffGadget(Ball ball){
        Vect newVelocityVector = Geometry.reflectRotatingWall(flipper, flipper.p1(), angularVelocity, 
                                                                ball.getCircle(), ball.getVelocity(), coR);
        ball.setVelocity(newVelocityVector);
        //update state of flipper
        if(state.equals("initial")){
            state = "final";
        }
        else{
            state = "initial";
        }
        this.trigger();    
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
     * 
     * @return current state of flipper
     */
    public String getState(){
        return new String(state);
    }
    
    /**
     * @return String representation of the flipper
     */
    @Override
    public String toString(){
        return "LEFTFLipper";
    }
    
    /**
     * check representation
     */
    private void checkRep(){
        assertTrue(name.length() > 0);
        assertTrue(state.equals("initial") || state.equals("final"));
    }

}
