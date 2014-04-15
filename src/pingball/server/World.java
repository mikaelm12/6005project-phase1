package pingball.server;

import java.util.ArrayList;
import java.util.List;

import pingball.datatypes.Board;


/**
 * Represents a world of boards connected through a network
 * 
 * @author AlexR
 *
 */
public class World implements WorldInterface {
    /*
     * Rep Invariants
     *   N/A
     * Abstraction Function
     *    Represents an abstract world of Pingball boards
     *    that may or may not be connected to each other
     * Thread Safety Argument
     *   boards is a private and final variable
     *   All accesses to boards happen within World methods,
     *   which are all synchronized and guarded by this World's lock
     *   allowing only one joining of boards to happen at the same time
     */
    
    private final List<Board> boards;
    
    public World(){
        boards = new ArrayList<Board>();
    }

    @Override
    public synchronized void addBoard(Board board) {
        boards.add(board);

    }

    @Override
    public synchronized void removeBoard(Board board) {
        if (board.getNeighborLeft() != null){
            board.getNeighborLeft().unNeighbor(board);
        }
        if (board.getNeighborRight() != null){
            board.getNeighborRight().unNeighbor(board);
        }
        if (board.getNeighborTop() != null){
            board.getNeighborTop().unNeighbor(board);
        }
        if (board.getNeighborBottom() != null){
            board.getNeighborBottom().unNeighbor(board);
        }
        boards.remove(board);
    }

    @Override
    public synchronized void joinVertical(Board boardTop, Board boardBottom) {
        boardTop.setNeighborBottom(boardBottom);
        boardBottom.setNeighborTop(boardTop);

    }

    @Override
    public synchronized void joinHorizontal(Board boardLeft, Board boardRight) {
        boardLeft.setNeighborRight(boardRight);
        boardRight.setNeighborLeft(boardLeft);

    }


}
