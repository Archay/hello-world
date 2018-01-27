package ChatBot;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Socket MyClient=null;
        try {
            MyClient = new Socket("base", 1024);
        } catch (IOException e) {
            System.out.println(e);
        }
        DataInputStream input;
        PrintStream output;
        try {
            input = new DataInputStream(MyClient.getInputStream());
            output = new PrintStream(MyClient.getOutputStream());
            while(true)
            {
                output.println();
                System.out.println(input.readLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
