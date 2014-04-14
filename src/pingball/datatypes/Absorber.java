package pingball.datatypes;

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
    
    //Rep invariant:
    //width>0, height>0, name!=null && name.length>0
    //Abstraction Function:
    //represents an absorber with width width and height height
    
    public Absorber(String name,double x,double y, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;
        this.coR = 0;    
        this.top = new LineSegment(x,y,x+1,y);
        this.right = new LineSegment(x+1,y,x+1,y+1);
        this.bottom = new LineSegment(x,y+1,x+1,y+1);
        this.left = new LineSegment(x,y,x,y+1);
        
        checkRep();
    }
    
    /**
     * generates a trigger when a ball hits it
     * @return a Trigger object
     */
    @Override
    public Trigger trigger() {
        return null;
    }
    
    /**
     * shoots out a stored ball when triggered
     */
    @Override
    public void action(Trigger trigger) {
        
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
     * @return String representation of the absorber
     */
    @Override 
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }
}
