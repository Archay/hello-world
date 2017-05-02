
Spinning A Bottle

import java.util.Scanner;
import java.util.Random;
public class NewMain {

    
    public static void main(String[] args) {
       
       int j;
       int re = 999;
       Scanner userIn = new Scanner(System.in);
       System.out.println("Number of players?");
       j = userIn.nextInt();
       String [] pplPool = new String [j];
       for(int i = 1; i <= j; ){
           System.out.println("Player" + i + ":");
           pplPool[i-1] = userIn.next();
           i++;
       }
    while (re != 1337) {
        Random spin = new Random();
        int draw1 = spin.nextInt(j);
        int draw2 = spin.nextInt(j);
        System.out.println("(("+pplPool[draw1] + " asks " + pplPool[draw2]+"))");
        System.out.println("1337 to stop");
        re = userIn.nextInt();
        }
       
    }
    
}

