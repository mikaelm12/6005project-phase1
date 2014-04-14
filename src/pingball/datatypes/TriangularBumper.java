package pingball.datatypes;

import physics.LineSegment;
import physics.Vect;


public class TriangularBumper implements Gadget{
    
    private final double sideLength;
    private final double coR;
    private final int orientation;
    private final LineSegment sideA;
    private final LineSegment sideB;
    private final LineSegment hypotenuse;
    private final String name;
    
    //Rep invariant:
    //orientation == 0 || orientation == 90 || orientation == 180 || orientation == 270
    //name!=null && name.length>05
    //Abstraction Function:
    //lineSegments represent sides of a triangle
    
    
    public TriangularBumper(String name, double x, double y, int orientation){
        this.name = name;
        this.sideLength = 1.0;
        this.coR = 1.0;
        this.orientation = orientation;
        
        if(orientation == 0){
            this.sideA = new LineSegment(x,y,x+1,y);
            this.sideB = new LineSegment(x,y,x,y+1);
            this.hypotenuse = new LineSegment(x,y+1,x+1,y);
        }
        else if(orientation == 90){
            this.sideA = new LineSegment(x,y,x+1,y);
            this.sideB = new LineSegment(x+1,y,x+1,y+1);
            this.hypotenuse = new LineSegment(x,y,x+1,y+1);
        }
        else if(orientation == 180){
            this.sideA = new LineSegment(x+1,y,x+1,y+1);
            this.sideB = new LineSegment(x,y+1,x+1,y+1);
            this.hypotenuse = new LineSegment(x,y+1,x+1,y);
        }
        else{ //orientation = 270
            this.sideA = new LineSegment(x,y,x,y+1);
            this.sideB = new LineSegment(x,y+1,x+1,y+1);
            this.hypotenuse = new LineSegment(x,y,x+1,y+1);   
        }
        
        checkRep();
        
        
    }
    
    /**
     * generates a trigger when the ball hits it
     * @return a Trigger object
     */
    @Override
    public Trigger trigger() {
        return null;
    }
    
    /**
     * no action i.e does not respond to any trigger
     */
    @Override
    public void action(Trigger trigger) {   
    }
    
    /**
     * @return coefficient of Reflection
     */
    @Override
    public double getCoR() {
        return 0;
    }
    
    /**
     * computes time until ball collides with bumper
     * @param ball to collide with
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
     * @return a String representation of TriangularBumper in the orientation specified
     */
    @Override
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }

}
