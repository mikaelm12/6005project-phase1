package pingball.datatypes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test some super complicated stuff.
 * @category no_didit
 */


public class BoardTest {
/**
 * -Adding balls to board
 * -Adding bumpers/flippers/absorbers
 *    
 */

   
    
    Ball ball = new Ball("ball",2.2,1.2,1,0);
    Ball ball2 = new Ball("ball2",2.2,1.2,1,0);
   
    
    
    
    @Test public void addOneBall(){
        Board board = new Board("testBoard1", 20.0, 0.025, 0.025);
        board.addBall(ball);
        assertEquals(1,board.getBalls().size());
        
    }    
        
    
    @Test public void addAnotherBall(){
       
        Board board2 = new Board("testBoard1", 20.0, 0.025, 0.025);
        board2.addBall(ball);
        board2.addBall(ball2);
        assertEquals(2,board2.getBalls().size());
        
        
    }
    @Test public void removeABall(){
        Board board2 = new Board("testBoard1", 20.0, 0.025, 0.025);
        board2.addBall(ball);
        board2.addBall(ball2);
        board2.removeBall(ball);
        
        assertEquals(1,board2.getBalls().size());
        
        
    }
    @Test public void addGadget(){
        Board board3 = new Board("testBoard1", 20.0, 0.025, 0.025);
        SquareBumper sqb = new SquareBumper("square", 3, 5);
        System.out.println(board3.getGadgets());
        board3.addGadget(sqb);
        assertEquals(1,board3.getGadgets().size());
        
        
    }
    @Test public void addGadgets(){
        Board board4 = new Board("testBoard1", 20.0, 0.025, 0.025);
        SquareBumper sqb = new SquareBumper("square", 3, 5);
        LeftFlipper lf = new LeftFlipper("leftFlip", 10, 10,90);
        CircularBumper circ = new CircularBumper("CBump", 13, 17);
        board4.addGadget(sqb);
        board4.addGadget(lf);
        board4.addGadget(circ);
        assertEquals(3,board4.getGadgets().size());
        
        
    }
    
}
