import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        // We are defining the socket for the server. The port number could
        // be any integer between 1 and 65535 inclusive.
	    try (ServerSocket serverSocket = new ServerSocket(5000)){

            // We intentionally use an infinite loop here because we want this to remain open until
            // the client no longer needs it and it is exited manually by sending the message "exit"
            // Every time the server gets a connection, it starts a new thread
            while (true) {
                new Echoer(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}
