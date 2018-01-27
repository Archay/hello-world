
package EchoServer;
import java.io.*;
import java.net.*;
public class EchoServer {
   public static void main(String[] args)
   {
       ServerSocket echoServer = null;
       String line;
       DataInputStream is;
       PrintStream os;
       Socket clientSocket = null;
       try{
           echoServer = new ServerSocket(1024);
       }catch(IOException e)
       {
           System.out.println(e);
       }
       try {
           clientSocket = echoServer.accept();
       }catch(IOException e)
       {
           System.out.println(e);
       }
   }
}
