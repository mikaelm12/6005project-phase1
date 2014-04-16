package pingball.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

import physics.Geometry;
import physics.Vect;
import pingball.datatypes.Board;
import pingball.datatypes.OuterWall;


public class PingballClientThread extends Thread {
    private final Socket socket;
    private final Board board;
    private final World world;
    
    /**
     * Initializes a user
     * @param socket to be used by this thread
     */
    public PingballClientThread(Socket socket, Board board2, World world) {
        super("PingballClientThread");
        this.socket = socket;
        this.board = board2;
        this.world = world;
    }

    public void run() {
        try {
            handleConnection(socket);
        } catch (IOException e) {
            e.printStackTrace(); // but don't terminate serve()
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void handleConnection (Socket socket) throws IOException{
        System.out.println("hello world");
        long start = System.currentTimeMillis();
        long previous = start;
//        Ball ball = board.balls.get(0);
        while (true){
            
            long current = System.currentTimeMillis();
           
            previous = current;
            OuterWall wallToCollide = null;

            if ((current-start) % 50 == 0){
                double timeToClosestCollision = 1000;
                OuterWall[] walls = board.getOuterWalls();                
                for (OuterWall wall: walls){
//                    double timeToWall = Geometry.timeUntilWallCollision(wall.getLine(), ball.getCircle(), ball.getVelocity());
//                    if (timeToClosestCollision > timeToWall){
//                        timeToClosestCollision = timeToWall;
//                        wallToCollide = wall;
//                    }
                }
//                if ((ball.getPosition()[0] + ball.getVelocity().x()*.50) >= 19 || (ball.getPosition()[1] + ball.getVelocity().y()*.50) >= 19||
//                        (ball.getPosition()[0] + ball.getVelocity().x()*.50) <= 0 || (ball.getPosition()[1] + ball.getVelocity().y()*.50) <= 0){
//                    //System.out.println("bouncing against " + wallToCollide.name);
//                    Vect newvel = ball.update(wallToCollide, ball.getVelocity());
//                    ball.setVelocity(newvel);
//                    System.out.println(ball.getVelocity());
//                }
//                double newx = ball.getPosition()[0] + ball.getVelocity().x()*.050;
//                double newy = ball.getPosition()[1] + ball.getVelocity().y()*.050;
//                System.out.println("old position: ("+ball.getPosition()[0]+","+ball.getPosition()[1]+")");
//                System.out.println("new position: ("+newx+","+newy+")");
//                ball.setPosition(newx, newy);
//                System.out.println("updated position: ("+ball.getCircle().getCenter().x()+","+ball.getPosition()[1]+")");
                System.out.println(board.toString());
            }
        }
            
    }
    
    
}
