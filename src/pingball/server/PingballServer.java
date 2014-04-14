package pingball.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import physics.Vect;
import warmup.Ball;
import warmup.Board;


public class PingballServer {
    private final ServerSocket serverSocket;
    private final World world;
    
    /**
     * Make a Pingball server that listens for connections on port.
     * 
     * @param port port number, requires 0 <= port <= 65535
     * @throws IOException 
     */
    public PingballServer(int port, World world) throws IOException{
        serverSocket = new ServerSocket(port);
        this.world = world;
    }
    
    /**
     * Run the server, listening for client connections and handling them.
     * Never returns unless an exception is thrown.
     * 
     * @throws IOException if the main server socket is broken
     *                     (IOExceptions from individual clients do *not* terminate serve())
     */
    public void serve() throws IOException {
        while (true) {
            // block until a client connects
            Socket socket = serverSocket.accept();
            int x = 20;
            int y = 20;
            int xc = 10;
            int yc = 10;
            Vect vel = new Vect(3.0, 4.0);
            Board board = new Board(x, y, "Name");
            Ball ball = new Ball(xc, yc, .25, vel);
            board.addBall(ball);
            System.out.println("hello");
            System.out.println(board.toString());
            new PingballClientThread(socket, board, world).start();
        }
    }
    
    public static void main(String[] args) throws IOException {
        int port = 10987;
        
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
                    }
                 } catch (NoSuchElementException nsee) {
                    throw new IllegalArgumentException("missing argument for " + flag);
                 }
            }
        }
            catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
                System.err.println("usage: PingballServer [--port PORT]");
                return;
            }
        
        try {
            runPingballServer(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
        
       
            

    public static void runPingballServer(int port) throws IOException{
        //Create world
        World worl = null;
        PingballServer server = new PingballServer(port, worl);
        server.serve();
    }
}
