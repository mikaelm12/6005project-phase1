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

import physics.Geometry;
import physics.Vect;
import warmup.Ball;
import warmup.Board;
import warmup.Wall;

public class PingballClient {

    public static void main(String[] args){
        int port = 10987; //default port
        String hostName = null;
        File file = null;
        
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
     * @param host
     * @param port
     * @param file
     * @throws IOException
     */
    public static void runPingBallServerClient(String host, int port, File file) throws IOException{
        String hostName = host;
        int portNumber = port;
        Socket toServerSocket = new Socket(hostName, portNumber);
         
        PrintWriter toServe = new PrintWriter(toServerSocket.getOutputStream(), true);
        BufferedReader fromServe = new BufferedReader(new InputStreamReader(toServerSocket.getInputStream()));
        String fromServer;
        while ((fromServer = fromServe.readLine()) != null) {
            System.out.println(fromServer);
        }
        BufferedReader inputFileStream = null;
        try {
            inputFileStream = new BufferedReader(new FileReader(file));
            String l;
            while ((l = inputFileStream.readLine()) != null) {
                toServe.println(l);
            }
        } finally {
            if (inputFileStream != null) {
                inputFileStream.close();
            }
        }
    }
    
    public static void runSingleMachine (File file){
        Board board = null; //create board from file
        
        //PLAY!
        
        System.out.println("hello world");
        long start = System.currentTimeMillis();
        long previous = start;
        Ball ball = board.balls.get(0);
        while (true){
            long current = System.currentTimeMillis();
           
            previous = current;
            Wall wallToCollide = null;

            if ((current-start) % 50 == 0){
                double timeToClosestCollision = 1000;
                Wall[] walls = board.getWalls();                
                for (Wall wall: walls){
                    double timeToWall = Geometry.timeUntilWallCollision(wall.getLine(), ball.getCircle(), ball.getVelocity());
                    if (timeToClosestCollision > timeToWall){
                        timeToClosestCollision = timeToWall;
                        wallToCollide = wall;
                    }
                }
                if ((ball.getPosition()[0] + ball.getVelocity().x()*.50) >= 19 || (ball.getPosition()[1] + ball.getVelocity().y()*.50) >= 19||
                        (ball.getPosition()[0] + ball.getVelocity().x()*.50) <= 0 || (ball.getPosition()[1] + ball.getVelocity().y()*.50) <= 0){
                    //System.out.println("bouncing against " + wallToCollide.name);
                    Vect newvel = ball.update(wallToCollide, ball.getVelocity());
                    ball.setVelocity(newvel);
                    System.out.println(ball.getVelocity());
                }
                double newx = ball.getPosition()[0] + ball.getVelocity().x()*.050;
                double newy = ball.getPosition()[1] + ball.getVelocity().y()*.050;
                System.out.println("old position: ("+ball.getPosition()[0]+","+ball.getPosition()[1]+")");
                System.out.println("new position: ("+newx+","+newy+")");
                ball.setPosition(newx, newy);
                System.out.println("updated position: ("+ball.getCircle().getCenter().x()+","+ball.getPosition()[1]+")");
                System.out.println(board.toString());
            }
        }
    }
}
