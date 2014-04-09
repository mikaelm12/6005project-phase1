package warmup;

import physics.Circle;
import physics.Vect;

public class Ball implements BallInterface{
    
    Circle ball;
    double angle;
    Vect velocityVector;
    Board board;
    double radius;
    double gravity;
    double x;
    double y;
    long previous;
    

    public Ball(double cx, double cy, double r, Vect vel, Board board){
        
        this.ball = new Circle(cx, cy, r);
        this.x = cx;
        this.y = cy;
        this.velocityVector = vel;
        this.board = board;
        previous = System.currentTimeMillis();
        
    }
    
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
    public void setPosition(double xLoc, double yLoc) {
        this.x = xLoc;
        this.y = yLoc;
        
    }
    
    @Override
    public int[] getPosition() {
        int[] posArray = new int[2];
        posArray[0] = (int) this.x; 
        posArray[1] = (int) this.y;
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
    
    public Circle getCircle(){
        return this.ball;
    }

    @Override
    public void update(Wall wall, Vect veloVector) {
       
         
        this.velocityVector = physics.Geometry.reflectWall(wall.getLine(), this.velocityVector, wall.getCoR());
        
    }



}
