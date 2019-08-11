import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        // We are defining the socket for the server. The port number could
        // be any integer between 1 and 65535 inclusive.
	    try (ServerSocket serverSocket = new ServerSocket(5000)){
            // socket instance used to communicate with the client
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            // Wrapping the input string to a buffered reader, taking whatever the string/string length is
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // We intentionally use an infinite loop here because we want this to remain open until
            // the client no longer needs it and it is exited manually by sending the message "exit"
            while (true) {
                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    break;
                }
                // if the client has entered any message other than the command to exit,
                // the message will be sent back to the client
                output.println("Echo from server: " + echoString);
            }

        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }

    }
}
