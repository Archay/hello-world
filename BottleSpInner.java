
Spinning A Bottle

import java.util.Scanner;   //For user input
import java.util.Random;    //For random number generation
public class NewMain {

    
    public static void main(String[] args) {
       
       int j;   //Number of participants
       int re = 999;    //Spoof value for sentinel
       Scanner userIn = new Scanner(System.in); //Initialise userIn
       System.out.println("Number of players?");
       j = userIn.nextInt();    //Input number of participants
       String [] pplPool = new String [j];  //Assign array  
       for(int i = 1; i <= j; ){
           System.out.println("Player" + i + ":");
           pplPool[i-1] = userIn.next();    //[i-1]:Since array index starts from 0
           i++;
       }
    while (re != 1337) {    //Leet hehe xD
        Random spin = new Random(); //Initialise RNG
        int draw1 = spin.nextInt(j);    //Question
        int draw2 = spin.nextInt(j);    //Answer
        System.out.println("(("+pplPool[draw1] + " asks " + pplPool[draw2]+"))");
        System.out.println("1337 to stop");
        re = userIn.nextInt(); 
        }
       
    }
    
}

