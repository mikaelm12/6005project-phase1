package pingball.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import BoardExpr.BoardFactory;
import pingball.datatypes.Ball;
import pingball.datatypes.Board;
import pingball.datatypes.Gadget;
import pingball.datatypes.OuterWall;

/**
 * Client of a Pingball Game
 * May connect to PingballServer or play in single mode
 * @author AlexR
 *
 */
public class PingballClient {

    /**
     * Start a PingballClient using the given arguments.
     * 
     * Usage: PingballClient [--host HOST] [--port PORT] FILE
     * 
     * HOST is an optional hostname or IP address of the server to connect to. 
     * If no HOST is provided, then the client starts in single-machine play mode, as described above.
     * 
     * PORT is an optional integer in the range 0 to 65535 inclusive, specifying the port the
     * server should be listening on for incoming connections. E.g. "MinesweeperServer --port 1234"
     * starts the server listening on port 1234.
     * 
     * FILE is an argument specifying a file pathname where a board has been stored. The stored bored
     * is initialized as this client's board. If connected to a server, file will be sent to the server to create
     * the board and add it to the world. Otherwise, board created and run as single player mode.
     * 
     */
    public static void main(String[] args) throws IOException{
        int port = 10987; //default port
        String hostName = null;
//        File file = null;
//        File file = new File ("/Users/PeterGithaiga/Documents/6.005/projectPhase1/pingball-phase1/sampleBoard1"); 
        File file = new File ("/Users/AlexR/Desktop/6.005/pingball-phase1/sampleBoard1");
        Queue<String> arguments = new LinkedList<String>(Arrays.asList(args));
        try {
            while ( ! arguments.isEmpty()) {
                String flag = arguments.remove();
                try {
                    if (flag.equals("--port")) {
                        port = Integer.parseInt(arguments.remove());
                        if (port < 0 || port > 65535) {
                            throw new IllegalArgumentException("port " + port + " out of range");
                        }
                    } else if (flag.equals("--host")) {
                       hostName = arguments.remove();
                    } else if (flag.equals("--file")) {  //File is not an argument but a must
                        file = new File(arguments.remove());
                        if ( ! file.isFile()) {
                            throw new IllegalArgumentException("file not found: \"" + file + "\"");
                        }
                    } else {
                        throw new IllegalArgumentException("unknown option: \"" + flag + "\"");
                    }
                } catch (NoSuchElementException nsee) {
                    throw new IllegalArgumentException("missing argument for " + flag);
                } catch (NumberFormatException nfe) {
                    throw new IllegalArgumentException("unable to parse number for " + flag);
                }
            }
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
            System.err.println("usage: MinesweeperServer [--host HOST] [--port PORT]  FILE");
            return;
        }
        // if HOST was provided then run the server and connect
        if (hostName != null){
        try {
            runPingBallServerClient(hostName, port, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        } else { //Play single machine mode
           runSingleMachine(file);
        }
    }
    

    /**
     * Runs a multiplayer pingball... creates board and connects to server
     * @param host where the game is being held
     * @param port to establish communication to the server
     * @param file containing board of this client
     * @throws IOException
     */
    public static void runPingBallServerClient(String host, int port, File file) throws IOException{
        String kill = "END OF FILE!!";
        String hostName = host;
        int portNumber = port;
        //Establish communication with the server
        Socket toServerSocket = new Socket(hostName, portNumber);
        PrintWriter toServe = new PrintWriter(toServerSocket.getOutputStream(), true);
        
        //Send file to the server
        BufferedReader inputFileStream = null;
        try {
           inputFileStream = new BufferedReader(new FileReader(file));
           String l;
           while ((l = inputFileStream.readLine()) != null) {
               toServe.println(l);
           }
        } finally {
            toServe.println(kill);
            if (inputFileStream != null) {
                inputFileStream.close();
            }
        }
       
        BufferedReader fromServe = new BufferedReader(new InputStreamReader(toServerSocket.getInputStream()));
        String fromServer;
        while ((fromServer = fromServe.readLine()) != null) {
            System.out.println(fromServer);
        }
       
        
    }
    
    /**
     * Runs the Pingball Client in single machine mode
     * @param file of the board to be created and run
     * @throws IOException
     */
    public static void runSingleMachine (File file) throws IOException{
        //Turn file into a string
        String fileString = "";
        BufferedReader inputFileStream = null;
        try {
           inputFileStream = new BufferedReader(new FileReader(file));
           String l;
           while ((l = inputFileStream.readLine()) != null) {
               fileString += l + "\n";
           }
       } finally {
           if (inputFileStream != null) {
               inputFileStream.close();
           }
       }
        // Create the board
        Board board  =  BoardFactory.parse(fileString);
        System.out.println(board.toString());
        
        
        //PLAY!
        
        System.out.println("hello world");
        
        long start = System.currentTimeMillis();
        long previous = start;
        while(true){
            long current = System.currentTimeMillis();
            previous = current;
            
            
            if ((current-start) % 50 == 0){
                
                for (Ball ball : board.getBalls()) {
                    double timeToClosestWallCollision = Double.POSITIVE_INFINITY;
                    OuterWall wallToCollide = null;
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
                    
                    if(timeToClosestWallCollision < timeToClosestCollision){
                        if(wallToCollide != null && timeToClosestWallCollision < 0.05){
                            
                            
                            System.out.println("reflecting off wall");
                            wallToCollide.reflectOffGadget(ball);   
                        }
                    }
                    else if(gadgetToReflect != null && timeToClosestCollision < 0.05){
                        gadgetToReflect.reflectOffGadget(ball);
                    }
                    System.out.println("will be outofbounds: " + ball.ballOutOfBounds(0.05));
                    ball.updateBallPosition(0.05);
                    ball.updateBallVelocityAfterTimestep(board.getGravity(), board.getMu(), board.getMu2(), 0.05);
                    
                }
                //assume no successive collisions
                
                System.out.println(board.toString());
            }
            
        }
//        long start = System.currentTimeMillis();
//        long previous = start;
//        Ball ball = board.balls.get(0);
//        while (true){
//            long current = System.currentTimeMillis();
//           
//            previous = current;
//            Wall wallToCollide = null;
//
//            if ((current-start) % 50 == 0){
//                double timeToClosestCollision = 1000;
//                Wall[] walls = board.getWalls();                
//                for (Wall wall: walls){
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
