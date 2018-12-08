package school.lemon.java1009.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server have started");
        try (
                ServerSocket sereServerSocket = new ServerSocket(8080);
                Socket clientSocket = sereServerSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            System.out.println("New connection from: " + clientSocket.getRemoteSocketAddress().toString());

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Have read from client: " + inputLine);
                out.println(Integer.valueOf(inputLine) + 1);
                System.out.println("Have wrote to client: " + (Integer.valueOf(inputLine) + 1));
            }
            System.out.println("Client has disconnected");
        } catch (Exception e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
