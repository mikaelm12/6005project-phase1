package pingball.datatypes;

import physics.Circle;
import physics.LineSegment;
import physics.Vect;

public class Ball {
    
    private Circle circle;
    private Vect velocityVector;
    private final double radius = 0.25;
    private final String name;
    
    //Rep invariant:
    
    //Abstraction Function:

    public Ball(String name, double cx, double cy, double xVel, double yVel){
        this.name = name;
        this.circle = new Circle(cx, cy, 0.5);
        this.velocityVector = new Vect(xVel,yVel);
        
        checkRep();
    }
    
    /**
     * 
     * @return the velocity vector of the ball
     */
    public Vect getVelocity() {
        return this.velocityVector;
    }
    
    /**
     * set the velocity of the ball
     * @param vect new velocity vector of the ball
     */
    public void setVelocity(Vect vect){
        this.velocityVector = vect;
    }
    
    /**
     * sets the position of the ball
     * @param xLoc the new x-position of the ball
     * @param yLoc the new y-position of the ball
     */
    public void setPosition(double xLoc, double yLoc) {
        this.circle = new Circle(xLoc, yLoc, this.radius);
    }
    
    /**
     * 
     * @return the current position of the ball
     */
    public double[] getPosition() {
        double[] posArray = new double[2];
        posArray[0] = this.circle.getCenter().x();
        posArray[1] = this.circle.getCenter().y();
       return posArray;
    }
    
    /**
     * 
     * @return Circle object that the ball represents
     */
    public Circle getCircle(){
        return new Circle(circle.getCenter(),radius);
    }
    
    /**
     * 
     * @return name of ball
     */
    public String getName(){
        return new String(name);
    }
    
    /**
     * 
     * @param mu friction1 of board 
     * @param mu2 friction2 of board
     * @param delta_t timestep
     */
    public void updateBallVelocityAfterTimestep(double gravity, double mu,double mu2,double delta_t){
        //v1 = v0 + gt
        double yVel = velocityVector.y() + gravity*delta_t; //gravity only affects y-direction
        //assumed formula given should be applied to both x and y
        double VoldMagnitude = Math.sqrt(Math.pow(velocityVector.x(),2) + Math.pow(yVel, 2));
        Vect newVelocityVector = new Vect(velocityVector.x()*(1-mu*delta_t-mu2*VoldMagnitude*delta_t),
                                            yVel*(1-mu*delta_t-mu2*VoldMagnitude*delta_t));
        this.setVelocity(newVelocityVector);
    }
    
    private void checkRep(){
        
    }
    


}
