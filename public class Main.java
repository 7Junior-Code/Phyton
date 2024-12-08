import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        int port = 12345;  // Port to listen on
        try {
            // Create a ServerSocket to listen on the specified port
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);

            // Wait for a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Get input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  // FIXED
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read the message from the client
            String clientMessage = in.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Send a response to the client
            out.println("Hello, client!");

            // Close the connection
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
