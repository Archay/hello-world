import java.util.Scanner;
import java.util.Random;
public class elementary9 {
    

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Random generate = new Random();
        int counter = 0;
        int n = userIn.nextInt(); //Upper Limit
        int ans = generate.nextInt(n); //Question generation
        boolean[] store = new boolean[n + 1]; //Array define
        int guess = userIn.nextInt(); //Guess holder
        if (guess == ans) {
            System.out.println("Correct");
            counter++;
            System.out.println("Tries=" + counter);
        } else if (guess > ans) {
            System.out.println("Too big");
            counter++;
        } else if (guess < ans){   
            System.out.println("Too small");
            counter++;
        }

    }
}
