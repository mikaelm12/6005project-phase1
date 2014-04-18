package pingball.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;

import BoardExpr.BoardFactory;
import physics.Geometry;
import pingball.datatypes.Ball;
import pingball.datatypes.Board;
import pingball.datatypes.Gadget;
import pingball.datatypes.OuterWall;

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
        
        long start = System.currentTimeMillis();
        long previous = start;
        while(true){
            long current = System.currentTimeMillis();
            previous = current;
            
            if ((current-start) % 50 == 0){
                int counter = 1;
                
                for (Ball ball : board.getBalls()) {
                    double timeToClosestWallCollision = Double.POSITIVE_INFINITY;
                    OuterWall wallToCollide = null;
                    double timeToBallCollide = Double.POSITIVE_INFINITY;
                    Ball ballToCollide = null;
                    if(ball.ballOutOfBounds(0.05)){
                        
                        
                        for(OuterWall wall: board.getOuterWalls()){
                            double timeUntilWallCollision = wall.timeUntilCollision(ball);
                            if(timeUntilWallCollision < timeToClosestWallCollision){
                                timeToClosestWallCollision = timeUntilWallCollision;
                                wallToCollide = wall;
                            } 
                        }
                        System.out.println("timeTowall: " + timeToClosestWallCollision);
                        System.out.println("xvel: " + ball.getVelocity().x() + "  yvel: " + ball.getVelocity().y());
                        
                        
                        
                    }
                    double timeToClosestCollision = Double.POSITIVE_INFINITY;
                    Gadget gadgetToReflect = null;
                    
                    for (Gadget gadget : board.getGadgets()) {
                        double timeUntilGadgetCollision = gadget.timeUntilCollision(ball);
                        //System.out.println(gadget.timeUntilCollision(ball));
                        if(timeUntilGadgetCollision < timeToClosestCollision){
                            timeToClosestCollision = timeUntilGadgetCollision;
                            gadgetToReflect = gadget;
                        }
                    }
                    for (int i = counter; i < board.getBalls().size()-1; i++) {
                        Ball that = board.getBalls().get(i);
                        double timeToThatCollide = Geometry.timeUntilBallBallCollision(ball.getCircle(), 
                                                                                ball.getVelocity(), that.getCircle(), 
                                                                                that.getVelocity());
                        if(timeToThatCollide < timeToBallCollide){
                            timeToBallCollide = timeToThatCollide;
                            ballToCollide = that;
                        }
                    }
                    if(timeToClosestWallCollision <= timeToClosestCollision){
                        if(timeToClosestWallCollision <= timeToBallCollide){
                            if(wallToCollide != null && timeToClosestWallCollision < 0.11){
                                System.out.println("reflecting off wall");
                                if (wallToCollide.isSolid()){
                                wallToCollide.reflectOffGadget(ball);   
                                } else {
                                        world.transferBall(board, ballToCollide, wallToCollide);
                                        board.removeBall(ballToCollide);
                                    }
                                }
                            }
                        } 
                    
                    else if(timeToClosestCollision <= timeToBallCollide && 
                            gadgetToReflect != null && timeToClosestCollision < 0.11){
                        gadgetToReflect.reflectOffGadget(ball);
                        System.out.println("reflecting off: " + gadgetToReflect.getName());
                    }
                    else{
                        if(ballToCollide != null && timeToBallCollide < 0.11){
                            Geometry.VectPair ballVelocities = Geometry.reflectBalls(ball.getCircle().getCenter(),
                                    1, ball.getVelocity(), ballToCollide.getCircle().getCenter(), 
                                    1, ballToCollide.getVelocity());
                            System.out.println("reflecting against other ball");
                            ball.setVelocity(ballVelocities.v1);
                            ballToCollide.setVelocity(ballVelocities.v2);
                        }
                    }
                    System.out.println("time: " + timeToClosestCollision);
                    System.out.println("vel: " + ball.getVelocity());
                    System.out.println("pos: " + Arrays.toString(ball.getPosition()));
                    System.out.println("will be outofbounds: " + ball.ballOutOfBounds(0.05));
                    ball.updateBallPosition(0.05);
                    ball.updateBallVelocityAfterTimestep(board.getGravity(), board.getMu(), board.getMu2(), 0.05);
                    counter++;
                    
                }
                //assume no successive collisions
                
                System.out.println(board.toString());
            }
            
        }
    }
}
