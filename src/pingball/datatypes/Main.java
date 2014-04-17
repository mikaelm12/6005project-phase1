package pingball.datatypes;

import java.util.Arrays;

public class Main {
    
    /**
     * TODO: describe your main function's command line arguments here
     */
    public static void main(String[] args){
        
        Board board = new Board("board",25,0.025,0.025);
        SquareBumper square = new SquareBumper("square",0,2);
        CircularBumper circleBumper = new CircularBumper("circleBumper",4,3);
        TriangularBumper triangleBumper = new TriangularBumper("triangleBumper",1,1,270);
        LeftFlipper flipperL = new LeftFlipper("flipperL",6,7,0);
        RightFlipper flipperR = new RightFlipper("flipperR",18,7,0);
        //Absorber absorber = new Absorber("abs",0,19,20,1);
        square.addGadgetToFire(flipperL);
        //absorber.addGadgetToFire(absorber);
        board.addGadgetList(Arrays.asList(square,circleBumper,triangleBumper,flipperL,flipperR));
        Ball ball1 = new Ball("ball",5,5,-3.4,-2.3);
        board.addBall(ball1);
        
        long start = System.currentTimeMillis();
        long previous = start;
        while(true){
            long current = System.currentTimeMillis();
            previous = current;
            
            
            if ((current-start) % 50 == 0){
                //System.out.println(Arrays.toString(ball1.getPosition()));
                double timeToClosestCollision = Double.POSITIVE_INFINITY;
                Gadget gadgetToReflect = null;
                for (Ball ball : board.getBalls()) {
                    
                    
                    for (Gadget gadget : board.getGadgets()) {
                        double timeUntilGadgetCollision = gadget.timeUntilCollision(ball);
                        //System.out.println(gadget.timeUntilCollision(ball));
                        if(timeUntilGadgetCollision < timeToClosestCollision){
                            timeToClosestCollision = timeUntilGadgetCollision;
                            gadgetToReflect = gadget;
                        }
                    }
                    for(OuterWall wall: board.getOuterWalls()){
                        //System.out.println(wall.timeUntilCollision(ball));
                        double timeUntilWallCollision = wall.timeUntilCollision(ball);
                        if(timeUntilWallCollision < timeToClosestCollision){
                            timeToClosestCollision = timeUntilWallCollision;
                            gadgetToReflect = wall;
                        } 
                    }
                    if ((ball.getPosition()[0] + ball.getVelocity().x()*.50) >= 19 || 
                        (ball.getPosition()[1] + ball.getVelocity().y()*.50) >= 19||
                        (ball.getPosition()[0] + ball.getVelocity().x()*.50) <= 0 || 
                        (ball.getPosition()[1] + ball.getVelocity().y()*.50) <= 0){
                        //System.out.println("here");
                        gadgetToReflect.reflectOffGadget(ball);
                        
                    }
                    //System.out.println((ball.getPosition()[0] + ball.getVelocity().x()*.50) <= 0);
                    ball.updateBallVelocityAfterTimestep(board.getGravity(), board.getMu(), board.getMu2(), 0.05);
                    //System.out.println(Arrays.toString(ball.getPosition()));
                    ball.updateBallPosition(0.05);
                }
                //assume no successive collisions
                System.out.println(board.toString());
            }
            
        }
        
        
        
    }

}
