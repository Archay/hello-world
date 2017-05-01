
Spinning A Bottle
  
  
    public class NewMain {
    import java.util.Scanner;
    import java.util.Random;
    public static void main(String[] args) {
       
       int j;
       Scanner userIn = new Scanner(System.in);
       j = userIn.nextInt();
       String [] pplPool = new String [j];
       for(int i = 1; i <= j; i = i+1){
           pplPool[i-1] = userIn.next();
       }
       Random spin = new Random();
       int quest = spin.nextInt(j+1);
       System.out.println(pplPool[quest]);
    
       
        }
    }
