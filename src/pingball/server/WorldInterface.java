package pingball.server;

import warmup.Ball;
import warmup.Board;

/**
 * World that represents a set of boards connected through the network
 * @author AlexR
 */
public interface WorldInterface {

    /**
     * Adds a client's board to the world
     * @param board to be added
     */
    public void addBoard(Board board);
    
    /**
     * Removes a client's board from the world
     * @param board to be removed
     */
    public void removeBoard(Board board);
    
    /**
     * Joins two boards in the world vertically
     * @param boardTop Board to be on top
     * @param boardBottom  Board to be on bottom
     */
    public void joinVertical(Board boardTop, Board boardBottom);
    
    /**
     * Joins two boards in the world horizontally
     * @param boardLeft  Board to be on the left
     * @param boardRight   Board to be on the right
     */
    public void joinHorizontal(Board boardLeft, Board boardRight);
    
    /**
     * Moves a ball from one board to another
     * @param ball to be moved
     * @param from board that sends the ball
     * @param to Board that receives the ball
     */
    public void moveBall(Ball ball, Board from, Board to);
}
