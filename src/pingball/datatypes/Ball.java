package pingball.datatypes;

import physics.Circle;
import physics.LineSegment;
import physics.Vect;

public class Ball {
    
    private Circle ball;
    private Vect velocityVector;
    private final double radius = 0.5;
    
    //Rep invariant:
    
    //Abstraction Function:

    public Ball(double cx, double cy, Vect vel){
        this.ball = new Circle(cx, cy, 0.5);
        this.velocityVector = vel;
        
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
        this.ball = new Circle(xLoc, yLoc, this.radius);
    }
    
    /**
     * 
     * @return the current position of the ball
     */
    public double[] getPosition() {
        double[] posArray = new double[2];
        posArray[0] = this.ball.getCenter().x();
        posArray[1] = this.ball.getCenter().y();
       return posArray;
    }
    
    /**
     * 
     * @return the Circle object that the ball represents
     */
    public Circle getCircle(){
        return this.ball;
    }
    
    /**
     * updates the velocity vector of the ball after a collision
     * @param line the line segment the ball collides with
     * @param coR coefficient of reflection of the gadget that the ball collides with
     */
    public void updateVelocityVector(LineSegment line, double coR) {
       Vect newVector = physics.Geometry.reflectWall(line, this.velocityVector, coR); 
       this.velocityVector = newVector;
    }
    
    private void checkRep(){
        
    }

}
