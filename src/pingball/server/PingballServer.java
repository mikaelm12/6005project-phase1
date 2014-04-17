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
import pingball.datatypes.Board;
import warmup.Ball;


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
        System.out.println("Server is running now");
        while (true) {
            // block until a client connects
            Socket ClientSocket = serverSocket.accept();
            
            //Constantly wait for user input to join boards
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(ClientSocket.getOutputStream(), true);
            for (String line = fromUser.readLine(); line != null; line = fromUser.readLine()) {
                String output = handleRequest(line);
                    System.out.println(output);
            }
            new PingballClientThread(ClientSocket, world).start();
            
            int x = 20;
            int y = 20;
            int xc = 10;
            int yc = 10;
            Vect vel = new Vect(3.0, 4.0);
//            Board board = new Board("Name");
            Ball ball = new Ball(xc, yc, .25, vel);
//            board.addBall(ball);
            System.out.println("hello");
//            System.out.println(board.toString());
            
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
        World worl = new World();
        PingballServer server = new PingballServer(port, worl);
        server.serve();
    }
    
    private String handleRequest(String input) {
        String help = "Invalid input, please use  'h NAME_left NAME_right' or 'v NAME_top NAME_bottom' to join boards\n";
        String regex = "(h [a-zA-Z]+)|(v [a-zA-Z]+)";
        if ( ! input.matches(regex)) {
            // invalid input
            return help;
        }
        
        String[] tokens = input.split(" ");
        if (tokens[0].equals("h")) {
            world.joinHorizontal(tokens[1], tokens[2]);
        } else if (tokens[0].equals("v")) {
            world.joinVertical(tokens[1], tokens[2]);
            return null;
        // Should never get here
        }
        throw new UnsupportedOperationException();
    }
}
