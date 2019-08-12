import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {

    // socket instance used to communicate with the client
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // Wrapping the input string to a buffered reader, taking whatever the string/string length is
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();
                System.out.println("Received client input : " + echoString);
                if (echoString.equals("exit")) {
                    break;
                }

                // This 15 second delay is here for the purpose of simulating the timeout on
                // the client end. The client application is terminated by a 5 second timeout.
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
                // if the client has entered any message other than the command to exit,
                // the message will be sent back to the client
                output.println(echoString);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
    }
}
