package warmup;

import physics.Geometry;
import physics.Vect;

/**
 * TODO: put documentation for your class here
 * 
 * 
 * SOOO ITS NOT AS EASY AS WE THOUGHT. I MOVED ALL LOOPS TO THE MAIN METHOD AND THERE THE BALLS POSITION
 * AND VELOCITY IS UPDATED
 * THE BOARD IS NOT PRINTING COMPLETELY AND THE BALL DOESNT MOVE
 * DONT KNOW WHATS WRONG, WILL KEEP LOOKING AT IT ONCE I FINISH MY OTHER PSET
 * EITHER WAY, SEE YOU TOMORROW!
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
        System.out.println("hello world");
        long start = System.currentTimeMillis();
        int x = 20;
        int y = 20;
        int xc = 10;
        int yc = 10;
        Vect vel = new Vect(3.0, 4.0);
        Board board = new Board(x, y);
        Ball ball = new Ball(xc, yc, .25, vel, board);
        board.addBall(ball);
        System.out.println("hello");
        System.out.println(board.toString());
        System.out.println("      world");
        long previous = start;
        while (true){
            long current = System.currentTimeMillis();
           
            previous = current;
            Wall wallToCollide = null;
            Wall[] walls = board.getWalls();
            double timeToClosestCollision = 10000;
            for (Wall wall: walls){
                double timeToWall = Geometry.timeUntilWallCollision(wall.getLine(), ball.getCircle(), ball.getVelocity());
                if (timeToClosestCollision > timeToWall){
                    timeToClosestCollision = timeToWall;
                    wallToCollide = wall;
                }
            }
            if (timeToClosestCollision == 10){
                ball.update(wallToCollide, ball.getVelocity());
            }
            if ((current-start) % 50 == 0){
                double newx = ball.x + ball.getVelocity().x()*.050;
                double newy = ball.y + ball.getVelocity().y()*.050;
                ball.setPosition(newx, newy);
                System.out.println(board.toString());
            }
            
        }
    }
}