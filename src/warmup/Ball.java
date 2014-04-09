package warmup;

import physics.Circle;
import physics.Vect;

public class Ball implements BallInterface{
    
    double angle;
    Vect velocityVector;
    double radius;
    double gravity;
    int x;
    int y;
    

    public Ball(Circle circle){
        
        this.x = (int)circle.getCenter().x();
        this.y = (int)circle.getCenter().y();
        
    };
    
    @Override
    public void setVelocity(Vect veloVector) {
        this.velocityVector = veloVector;
        
    }

    @Override
    public Vect getVelocity() {
        
        return this.velocityVector;
    }

    @Override
    public double getAngle() {
        
        return this.angle;
    }

    @Override
    public double getRadius() {
        
        return this.radius;
    }
    
    @Override
    public void setPosition(int xLoc, int yLoc) {
        this.x = xLoc;
        this.y = yLoc;
        
    }
    
    @Override
    public int[] getPosition() {
        int[] posArray = new int[10];
        posArray[0] = this.x; 
        posArray[1] = this.y;
       return posArray;
    }

    @Override
    public void setGravity(double newGravity) {
        this.gravity = newGravity;
        
    }

    @Override
    public double getGravity() {
      
        return this.gravity;
    }

    @Override
    public void update(Wall wall, Vect veloVector) {
       
         
        this.velocityVector = physics.Geometry.reflectWall(wall.getLine(), this.velocityVector, wall.getCoR());
        
    }



}
