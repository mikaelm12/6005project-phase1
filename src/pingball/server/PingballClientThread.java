package pingball.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import BoardExpr.BoardFactory;
import pingball.datatypes.Board;

/**
 * Thread to handle a single client's game
 * @author AlexR
 *
 */
public class PingballClientThread extends Thread {
    private final Socket socket;
    private final Board board;
    private final World world;
    
    /**
     * Initializes a user
     * @param socket to be used by this thread
     * @param world where this client's game is stored
     * @throws IOException 
     */
    public PingballClientThread(Socket socket, World world) throws IOException {
        super("PingballClientThread");
        String kill = "END OF FILE!!";
        this.socket = socket;
        this.world = world;
        //Receive and recreate the file of this user to create the corresponding board
        PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
        String fileBoard = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        String line;
        while ((line = in.readLine()) != null){
            if (line.equals(kill)){
                break;
            }
            fileBoard+= line + "\n";
        }
        board = BoardFactory.parse(fileBoard);
        out.println(board.toString());
        world.addBoard(board);
    }

    /**
     * Run this specific thread
     */
    public void run() {
        try {
            handleConnection(socket);
        } catch (IOException e) {
            e.printStackTrace(); // but don't terminate serve()
        } finally {
            try {
                world.removeBoard(board);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Handle a single client connection. Returns when client disconnects.
     * 
     * @param socket socket where the client is connected
     * @throws IOException if connection has an error or terminates unexpectedly
     */
    public void handleConnection (Socket socket) throws IOException{
        /*Game is played here. Output to the client is the string representation of the board
        * sent every so often. 
        * PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        * out.println(board.toString());
        */
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        
        out.println("hello world!\n");
        //PLAY!!
        
//        long start = System.currentTimeMillis();
//        long previous = start;
//        Ball ball = board.balls.get(0);
//        while (true){
//            
//            long current = System.currentTimeMillis();
//           
//            previous = current;
//            OuterWall wallToCollide = null;
//
//            if ((current-start) % 50 == 0){
//                double timeToClosestCollision = 1000;
//                OuterWall[] walls = board.getOuterWalls();                
//                for (OuterWall wall: walls){
//                    double timeToWall = Geometry.timeUntilWallCollision(wall.getLine(), ball.getCircle(), ball.getVelocity());
//                    if (timeToClosestCollision > timeToWall){
//                        timeToClosestCollision = timeToWall;
//                        wallToCollide = wall;
//                    }
//                }
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
//                System.out.println(board.toString());
//            }
//        }
            
    }
}
