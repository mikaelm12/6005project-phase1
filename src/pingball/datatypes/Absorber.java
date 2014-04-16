package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.Geometry;
import physics.LineSegment;
import physics.Vect;
import static org.junit.Assert.*;

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
    private final LineSegment[] edges = new LineSegment[4];
    private String state = "empty";
    public Ball ball;
    
    //Rep invariant:
    //width>0, height>0, name!=null && name.length>0
    //Abstraction Function:
    //represents an absorber with width, width, and height, height
    
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
        edges[0] = left;
        edges[1] = top;
        edges[2] = right;
        edges[3] = bottom;

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
     * shoots out a stored ball when triggered
     */
    @Override
    public synchronized void action() {
        if(state.equals("full")){
            ball.setVelocity(new Vect(0,-50));//set to ball velocity to 50L/sec straight upwards
            state = "empty";
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
     * compute time until collision
     * @param ball to collide with
     * @return time until ball collides with absorber
     */
    @Override
    public double timeUntilCollision(Ball ball) {
        double timeToClosestCollision = Double.POSITIVE_INFINITY;
        for (LineSegment edge : edges) {
            double timeToEdgeCollision = Geometry.timeUntilWallCollision(edge, ball.getCircle(), ball.getVelocity());
            if(timeToEdgeCollision < timeToClosestCollision){
                timeToClosestCollision = timeToEdgeCollision;
            }
        }
        return timeToClosestCollision;
    }
    
    /**
     * stop ball and store it unmoving in the bottom right hand corner of the absorber
     * @param ball to be reflected
     */
    @Override
    public void reflectOffGadget(Ball ball){
        ball.setVelocity(new Vect(0,0)); //stop ball
        //set ball center position .25L away from bottom and right wall
        ball.setPosition(bottom.p2().x()-0.25, bottom.p2().y()-0.25);
        this.ball = ball;
        state = "full";
        this.trigger();
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
     * @return String representation of the absorber
     */
    @Override 
    public String toString(){
        return null;
    }
    
    /**
     * check representation
     */
    private void checkRep(){
        assertTrue(name.length() > 0);
        assertTrue(width > 0 && height > 0);
    }


}
