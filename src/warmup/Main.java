package warmup;

import physics.Vect;

/**
 * TODO: put documentation for your class here
 */
public class Main {
    
    /**
     * TODO: describe your main function's command line arguments here
     */
    public static void main(String[] args) {
        
        /*
         * Create board with size x,y
         * Create one ball and put it in the board with an initial velocity
         * Get initial time
         * for every so many seconds, print a state of the board
         */
        long start = System.currentTimeMillis();
        int x = 20;
        int y = 20;
        int xc = 10;
        int yc = 10;
        Vect vel = new Vect(3.0, 4.0);
        Board board = new Board(x, y);
        Ball ball = new Ball(xc, yc, .25, vel);
        System.out.println(board.toString);
        while (true){
            long current = System.currentTimeMillis();
            if ((current-start) % 50 == 0){
                System.out.println(board.toString);
            }
        }
    }
}