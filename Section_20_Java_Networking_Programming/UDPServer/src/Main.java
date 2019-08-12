import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) {
	    try {
            DatagramSocket socket = new DatagramSocket(5000);

            while (true) {
                // The byte array accepts data from the socket.
                byte[] buffer = new byte[50];
                // The packet is populated with whatever is received from the socket.
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                System.out.println("Text received is: " + new String(buffer));
                // Unlike the TCP example, this is not two sided. The socket does not send
                // anything back to the client. The socket.receive() call does not form an
                // end to end connection.

                String returnString = "echo: " + new String(buffer, 0, packet.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                // Using the address and the port from the received packer (from the client)
                // We are creating a new packet that can be sent back to the client
                packet = new DatagramPacket(buffer2, buffer2.length, address, port);
                socket.send(packet);
            }

        } catch (SocketException e) {
            System.out.println("SocketException : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}