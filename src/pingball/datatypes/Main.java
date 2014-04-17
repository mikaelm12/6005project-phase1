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
        LeftFlipper flipperL = new LeftFlipper("flipperL",10,7,0);
        RightFlipper flipperR = new RightFlipper("flipperR",12,7,0);
        Absorber absorber = new Absorber("abs",0,19,20,1);
        square.addGadgetToFire(flipperL);
        absorber.addGadgetToFire(absorber);
        board.addGadgetList(Arrays.asList(square,circleBumper,triangleBumper,flipperL,flipperR,absorber));
        Ball ball = new Ball("ball",1.8,4.5,-3.4,-2.3);
        board.addBall(ball);
        
        
        System.out.println(board.toString());
        
    }

}
