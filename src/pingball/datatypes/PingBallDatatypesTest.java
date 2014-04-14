package pingball.datatypes;

import static org.junit.Assert.*;

import org.junit.Test;

import physics.Vect;
/**
 * Test some super complicated stuff.
 * @category no_didit
 */

public class PingBallDatatypesTest {
    
    @Test public void testFlippersAction(){
        LeftFlipper leftFlipper = new LeftFlipper("leftFlipper",2,2,0);
        RightFlipper rightFlipper = new RightFlipper("rightFlipper",5,5,0); 
        SquareBumper square = new SquareBumper("square",3,1);
        square.addGadgetToFire(leftFlipper);
        square.addGadgetToFire(rightFlipper);
        square.trigger();
        
        assertTrue(leftFlipper.getOrientation() == 90);
        assertTrue(rightFlipper.getOrientation() == 90);
        
        square.trigger();
        
        assertTrue(leftFlipper.getOrientation() == 0);
        assertTrue(rightFlipper.getOrientation() == 0);
        
    }
    
    @Test public void testTimeUntilCollision(){
        Ball ball = new Ball(2,1.2,new Vect(1,0)); //moving in x+ direction
        TriangularBumper triangle = new TriangularBumper("triangle",1,1,0);
        SquareBumper square = new SquareBumper("square",3,1);
        assertTrue(square.timeUntilCollision(ball) < triangle.timeUntilCollision(ball));
    }
    
    

}
