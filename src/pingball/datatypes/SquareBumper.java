package pingball.datatypes;

import physics.LineSegment;
import physics.Vect;


public class SquareBumper implements Gadget{
    
    private final double coR;
    private final double edgeLength;
    private final LineSegment top;
    private final LineSegment right;
    private final LineSegment bottom;
    private final LineSegment left;
    private final String name;
    
    //Rep invariant:
    //edgeLength = 1.0,name!=null && name.length>0
    //Abstraction Function:
    //the four lineSegments represent a square
    
    public SquareBumper(String name, double x, double y){
        assert(x>=0 && x<=19);
        assert(y>=0 && y<=19);
        this.name = name;
        this.edgeLength = 1.0;
        this.coR = 1.0;
        this.top = new LineSegment(x,y,x+1,y);
        this.right = new LineSegment(x+1,y,x+1,y+1);
        this.bottom = new LineSegment(x,y+1,x+1,y+1);
        this.left = new LineSegment(x,y,x,y+1);
        
        checkRep();
    }
    
    /**
     * generates a trigger when the ball hits it
     * @return a Trigger object
     */
    @Override
    public Trigger trigger(){
        return null;
    }
    
    /**
     * no action i.e does not respond to any trigger
     */
    @Override
    public void action(Trigger trigger){
        
    }
    
    /**
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR(){
        return 0;
    }
    
    
    /**
     * @param ball to collide
     * @return time until ball collides with bumper
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
     * @return string representation of the SquareBumper
     */
    @Override
    public String toString(){
        return null;
    }
    
    /**
     * checks rep invariant
     */
    private void checkRep(){
        assert(this.edgeLength == 1.0);
    }

}
