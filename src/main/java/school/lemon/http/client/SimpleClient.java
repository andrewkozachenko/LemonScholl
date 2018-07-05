package school.lemon.http.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Client side");


        Socket socket = new Socket("192.168.1.30",8888);

        String hello = "Hello World! exit";

        socket.getOutputStream().write(hello.getBytes());

        BufferedReader in  = new
                BufferedReader(new
                InputStreamReader(socket.getInputStream()));

        PrintWriter out = new
                PrintWriter(socket.getOutputStream(),true);
        BufferedReader inu = new
                BufferedReader(new InputStreamReader(System.in));

        String fuser,fserver;

        while ((fuser = inu.readLine())!=null) {
            out.println(fuser);
            fserver = in.readLine();
            System.out.println(fserver);
            if (fuser.equalsIgnoreCase("close")) break;
            if (fuser.equalsIgnoreCase("exit")) break;
        }

        out.close();
        in.close();
        inu.close();
        socket.close();
    }
}
