package pingball.datatypes;

import java.util.Arrays;

public class Main {
    
    /**
     * TODO: describe your main function's command line arguments here
     */
    public static void main(String[] args){
        
        Board board = new Board("board",1,0.025,0.025);
        SquareBumper square = new SquareBumper("square",0,2);
        CircularBumper circleBumper = new CircularBumper("circleBumper",4,3);
        TriangularBumper triangleBumper = new TriangularBumper("triangleBumper",1,1,270);
        LeftFlipper flipperL = new LeftFlipper("flipperL",6,7,0);
        RightFlipper flipperR = new RightFlipper("flipperR",10,7,0);
        Absorber absorber = new Absorber("abs",0,19,20,1);
        square.addGadgetToFire(flipperL);
        //flipperL.addGadgetToFire(flipperR);
        flipperL.addGadgetToFire(flipperL);
        flipperR.addGadgetToFire(flipperR);
        absorber.addGadgetToFire(absorber);
        board.addGadgetList(Arrays.asList(square,circleBumper,triangleBumper,flipperL,flipperR,absorber));
        Ball ball1 = new Ball("ball",10,10,-3.4,-2.3);
        Ball ball2 = new Ball("ball",5,5,4,2);
        board.addBall(ball1);
        board.addBall(ball2);
        
        long start = System.currentTimeMillis();
        long previous = start;
        while(true){
            long current = System.currentTimeMillis();
            previous = current;
            
            
            if ((current-start) % 50 == 0){
                
                for (Ball ball : board.getBalls()) {
                    double timeToClosestWallCollision = Double.POSITIVE_INFINITY;
                    OuterWall wallToCollide = null;
                    if(ball.ballOutOfBounds(0.05)){
                        
                        
                        for(OuterWall wall: board.getOuterWalls()){
                            double timeUntilWallCollision = wall.timeUntilCollision(ball);
                            if(timeUntilWallCollision < timeToClosestWallCollision){
                                timeToClosestWallCollision = timeUntilWallCollision;
                                wallToCollide = wall;
                            } 
                        }
                        System.out.println("timeTowall: " + timeToClosestWallCollision);
                        System.out.println("xvel: " + ball.getVelocity().x() + "  yvel: " + ball.getVelocity().y());
                        
                        
                        
                    }
                    double timeToClosestCollision = Double.POSITIVE_INFINITY;
                    Gadget gadgetToReflect = null;
                    
                    for (Gadget gadget : board.getGadgets()) {
                        double timeUntilGadgetCollision = gadget.timeUntilCollision(ball);
                        //System.out.println(gadget.timeUntilCollision(ball));
                        if(timeUntilGadgetCollision < timeToClosestCollision){
                            timeToClosestCollision = timeUntilGadgetCollision;
                            gadgetToReflect = gadget;
                        }
                    }
                    
                    if(timeToClosestWallCollision < timeToClosestCollision){
                        if(wallToCollide != null && timeToClosestWallCollision < 0.05){
                            
                            
                            System.out.println("reflecting off wall");
                            wallToCollide.reflectOffGadget(ball);   
                        }
                    }
                    else if(gadgetToReflect != null && timeToClosestCollision < 0.05){
                        gadgetToReflect.reflectOffGadget(ball);
                    }
                    System.out.println("will be outofbounds: " + ball.ballOutOfBounds(0.05));
                    ball.updateBallPosition(0.05);
                    ball.updateBallVelocityAfterTimestep(board.getGravity(), board.getMu(), board.getMu2(), 0.05);
                    
                }
                //assume no successive collisions
                
                System.out.println(board.toString());
            }
            
        }
        
        
        
    }

}
