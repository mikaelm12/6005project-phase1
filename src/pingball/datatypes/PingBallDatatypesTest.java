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
        
        //square.trigger();
        
        assertTrue(leftFlipper.getState().equals("final"));
        assertTrue(rightFlipper.getState().equals("final"));
        
        //square.trigger();
        
        assertTrue(leftFlipper.getState().equals("initial"));
        assertTrue(rightFlipper.getState().equals("initial"));
        
    }
    
    @Test public void TestFlippersActionDifferentOrientation(){
        LeftFlipper leftFlipper = new LeftFlipper("leftFlipper",2,2,90);
        RightFlipper rightFlipper = new RightFlipper("rightFlipper",5,5,90); 
        SquareBumper square = new SquareBumper("square",3,1);
        square.addGadgetToFire(leftFlipper);
        square.addGadgetToFire(rightFlipper);
        
        //square.trigger();
        
        assertTrue(leftFlipper.getState().equals("final"));
        assertTrue(rightFlipper.getState().equals("final"));
        
        //square.trigger();
        
        assertTrue(leftFlipper.getState().equals("initial"));
        assertTrue(rightFlipper.getState().equals("initial"));
    }
    
    @Test public void testTimeUntilCollision(){
        Ball ball = new Ball("ball",2,1.2,1,0); //moving in x+ direction
        TriangularBumper triangle = new TriangularBumper("triangle",1,1,0);
        SquareBumper square = new SquareBumper("square",3,1);
        assertTrue(square.timeUntilCollision(ball) < triangle.timeUntilCollision(ball));
    }
    
    @Test public void testReflectOffGadget(){
        SquareBumper square = new SquareBumper("square",3,3);
        Ball ball1 = new Ball("ball1",4.2,3.3,-1.0,0); //moving in -x direction
        square.reflectOffGadget(ball1);
        assertTrue(ball1.getVelocity().x() == 1.0);
        assertTrue(ball1.getVelocity().y() == 0);
        
        TriangularBumper triangle = new TriangularBumper("triangle",5,5,180);
        Ball ball2 = new Ball("ball2",6.2,5.2,-1,0); //moving in -x direction
        triangle.reflectOffGadget(ball2);
        assertTrue(ball2.getVelocity().x() == 1);
        assertTrue(ball2.getVelocity().y() == 0);
        
        CircularBumper circular = new CircularBumper("circular",2.5,2.5);
        Ball ball3 = new Ball("ball3",3.7,3,-1,0); //moving in -x direction
        circular.reflectOffGadget(ball3);
        assertTrue(ball3.getVelocity().x() == 1.0);
        assertTrue(ball3.getVelocity().y() == 0);
        
        //TODO: test reflection off flippers after figuring out how to account for linear velocity
//        LeftFlipper leftFlipper = new LeftFlipper("leftFlipper",3,3,0);
//        Ball ball4 = new Ball(3.2,4,new Vect(-1,0)); //moving in -x direction
//        Vect ball4Vect = leftFlipper.reflectOffGadget(ball4);
//        ball4.setVelocity(ball4Vect);
//        assertTrue(ball4.getVelocity().x() == 1.0);
//        assertTrue(ball4.getVelocity().y() == 0);
//        
//        RightFlipper rightFlipper = new RightFlipper("leftFlipper",3,3,0);
//        Ball ball5 = new Ball(2.8,4,new Vect(1,0)); //moving in -x direction
//        Vect ball5Vect = rightFlipper.reflectOffGadget(ball4);
//        ball5.setVelocity(ball5Vect);
//        assertTrue(ball5.getVelocity().x() == 1.0);
//        assertTrue(ball5.getVelocity().y() == 0);
        
    }
    

}
