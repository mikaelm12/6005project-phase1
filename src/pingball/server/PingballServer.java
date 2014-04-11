package pingball.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import physics.Vect;
import warmup.Ball;
import warmup.Board;


public class PingballServer {
    private final ServerSocket serverSocket;
    
    /**
     * Make a Pingball server that listens for connections on port.
     * 
     * @param port port number, requires 0 <= port <= 65535
     * @throws IOException 
     */
    public PingballServer(int port) throws IOException{
        serverSocket = new ServerSocket(port);
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
            new PingballClientThread(socket, board).start();
        }
    }
    
    public static void main(String[] args) throws IOException {
        int port = 10987;
        PingballServer server = new PingballServer(port);
        try {
            server.serve();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static void runPingBallServer(){
        
    }
}
