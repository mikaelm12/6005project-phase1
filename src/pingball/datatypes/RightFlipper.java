package pingball.datatypes;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import physics.Angle;
import physics.Geometry;
import physics.LineSegment;
import physics.Vect;


public class RightFlipper implements Gadget{
    
    private final double boxLength;
    private final double coR;
    private int orientation;
    private final String name;
    private LineSegment flipper;
    private List<Gadget> gadgetsToFire;
    private String state = "initial";//not triggered yet
    private final double rotationAngle;
    //private final Vect initialP2;
    //private final Vect finalP2;
    private double angularVelocity;
    private final Vect origin;
    
    //Rep invariant
    //if orientation == 0, then lineSegment is at right of bounding box initially
    //if orientation == 90, then lineSegment is at bottom of bounding box initially
    //if orientation == 180, then lineSegment is at left of bounding box initially
    //if orientation == 270, then lineSegment is at top of bounding box initially
    //Abstraction Function
    //lineSegment represents flipper that rotates
    
    public RightFlipper(String name, int x, int y,int orientation){
        this.name = name;
        this.boxLength = 2.0;
        this.coR = 0.95;
        this.orientation = orientation;
        this.angularVelocity = (1080.0/180)*Math.PI;
        this.rotationAngle = (90.0/180)*Math.PI;
        
        this.origin = new Vect(x,y);
        this.gadgetsToFire = new ArrayList<Gadget>();
        this.gadgetsToFire.add(this); //flipper triggers itself
        
        if(orientation == 0){
            this.flipper = new LineSegment(x+2,y,x+2,y+2);
//            this.initialP2 = flipper.p2();
//            this.finalP2 = new Vect(x,y);
        }
        else if(orientation == 90){
            this.flipper = new LineSegment(x+2,y+2,x,y+2);
//            this.initialP2 = flipper.p2();
//            this.finalP2 = new Vect(x+2,y);
        }
        else if(orientation == 180){
            this.flipper = new LineSegment(x,y+2,x,y);
//            this.initialP2 = flipper.p2();
//            this.finalP2 = new Vect(x+2,y+2);
        }
        else{ //orientation == 270
            this.flipper = new LineSegment(x,y,x+2,y);
//            this.initialP2 = flipper.p2();
//            this.finalP2 = new Vect(x,y+2);
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
        if(state.equals("initial")){
            //change to final state
            this.flipper = Geometry.rotateAround(flipper, flipper.p1(), new Angle(rotationAngle));
            //this.flipper = new LineSegment(flipper.p1(),finalP2);
            state = "final";
        }
        else{
            //change to initial state
            this.flipper = Geometry.rotateAround(flipper, flipper.p1(), new Angle(2*Math.PI-rotationAngle));
            //this.flipper = new LineSegment(flipper.p1(),initialP2);
            state = "initial";
        }
        
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
      //define +angularVelocity as being clockwise rotation
        if(state.equals("initial")){
            return Geometry.timeUntilRotatingWallCollision(flipper, flipper.p1(), angularVelocity, 
                    ball.getCircle(), ball.getVelocity());
        }
        
        return Geometry.timeUntilRotatingWallCollision(flipper, flipper.p1(), -angularVelocity, 
                                                        ball.getCircle(), ball.getVelocity());
    }
    
    /**
     * reflects the ball off gadget, updates ball's velocity and triggers this gadget
     * @param ball to be reflected
     */
    @Override
    public void reflectOffGadget(Ball ball){
        Vect newVelocityVector;
      //collision will cause instantaneous rotation of flipper
        //define +angularVelocity as being clockwise rotation
        if(state.equals("initial")){
            newVelocityVector = Geometry.reflectRotatingWall(flipper, flipper.p1(), angularVelocity, 
                                                             ball.getCircle(), ball.getVelocity(), coR);
        }else{
            newVelocityVector = Geometry.reflectRotatingWall(flipper, flipper.p1(), -angularVelocity, 
                                                             ball.getCircle(), ball.getVelocity(), coR);
        }
        ball.setVelocity(newVelocityVector);
        this.trigger(); 
    }
    
    /**
     * 
     * @return orientation of the flipper
     */
    public int getOrientation(){
       return orientation; 
    }
    
    /**
     * @return list of gadgets that are fired when this gadget is triggered
     */
    public List<Gadget> getGadgetsToFire(){
        return new ArrayList<Gadget>(gadgetsToFire);
    }
    
    /**
     * adds gadget to gadgets to be fired when this gadget is triggered
     * @param gadget gadget to be added to the list of gadgets that are fired when this
     *          gadget is triggered
     */
    public void addGadgetToFire(Gadget gadget){
        gadgetsToFire.add(gadget);
    }
    
    /**
     * @return name of this gadget
     */
    public String getName(){
        return new String(name);
    }
    
    /**
     * @return position of the gadget
     */
    @Override
    public Vect getPosition(){
        return new Vect(origin.x(),origin.y());
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
        if(state.equals("initial")){
            if(orientation == 0){
                return "  ||";
            }
            else if(orientation == 90){
                return " - -";
            }
            else if(orientation == 180){
                return "||  ";
            }
            else{
                return "- - ";
            }
            
        }
        else{
            if(orientation == 0){
                return "- - ";
            }
            else if(orientation == 90){
                return "  ||";
            }
            else if(orientation == 180){
                return " - -";
            }
            else{
                return "||  ";
            }
        }
    }
    
    /**
     * check representation
     */
    private void checkRep(){
        assertTrue(name.length() > 0);
        assertTrue(state.equals("initial") || state.equals("final"));
    }


}
