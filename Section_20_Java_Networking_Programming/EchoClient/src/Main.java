import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Setting up the socket for the client at the same port as the server
	    try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            do {
                // Receiving the string from the user
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();

                // Sending the string to the server using the PrintWriter object
                stringToEcho.println(echoString);

                // The process will continue as long as the user does not input exit.
                // If the user inputs exit, then the process will terminate
                if (!echoString.equals("exit")) {
                    response = echoes.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
