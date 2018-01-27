package ChatBot;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        ServerSocket myServer=null;
        try {
            myServer = new ServerSocket(1024);
        } catch (IOException e) {
            System.out.println(e);
        }
        Socket clientSocket = null;
        DataInputStream input;
        PrintStream output;
        try {
            clientSocket = myServer.accept();
            input = new DataInputStream(clientSocket.getInputStream());
            output = new PrintStream(clientSocket.getOutputStream());
            while(true)
            {
                System.out.println(input.readLine());
                output.println(UserIn.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
