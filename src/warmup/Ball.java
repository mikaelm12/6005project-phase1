package warmup;

import physics.Vect;

public class Ball implements BallInterface{
    
    double angle;
    Vect velocityVector;
    double radius;
    double gravity;
    

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
    public double[] getPosition() {
        // TODO Auto-generated method stub
        return null;
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
