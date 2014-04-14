package pingball.datatypes;

import physics.Circle;


public class CircularBumper implements Gadget{
    
    private final double diameter;
    private final double coR;
    private final Circle circle;
    private final String name;
    
    //Rep invariant:
    //diameter=1.0, name!=null && name.length>0
    //Abstraction Function:
    //circle represents circularBumper
    
    public CircularBumper(String name,double x, double y){
        this.name = name;
        this.diameter = 1.0;
        this.coR = 1.0;
        this.circle = new Circle(x,y,diameter); //TODO: do some math????
        
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
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR() {
        return 0;
    }
    
    /**
     * @return a String representation of the CircularBumper
     */
    @Override
    public String toString(){
        return null;
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
    
    private void checkRep(){
        
    }

}
