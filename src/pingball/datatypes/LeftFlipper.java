package pingball.datatypes;

import physics.LineSegment;
import physics.Vect;


public class LeftFlipper implements Gadget{
    
    private final double boxLength;
    private final double coR;
    private int orientation;
    private final LineSegment flipper;
    private final String name;
    
    //Rep invariant:
    
    //Abstraction Function
    
    
    public LeftFlipper(String name, double x, double y, int orientation){
        this.name = name;
        this.boxLength = 2.0;
        this.coR = 0.95;
        this.orientation = orientation;
        
        this.flipper = new LineSegment(x,y,x,y+2);
        
        //TODO: handle orientation
        if(orientation == 0){
            
        }
        
        checkRep();
    }
    
    /**
     * generates trigger when the ball hits it
     * @return a Trigger object
     */
    @Override
    public Trigger trigger() {
        return null;
    }
    
    /**
     * rotates 90degrees when triggered
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
     * @return String representation of the flipper
     */
    @Override
    public String toString(){
        return null;
    }
    
    private void checkRep(){
        
    }

}
