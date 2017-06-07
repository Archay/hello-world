
import java.util.Scanner;
import java.util.Random;

public class Logger {

    int counter;
    boolean store[] = new boolean[100];

    public Logger(int n) {

        for (int i = 0; i < store.length; i++) {
            store[i] = false;
        }

    }

    public void checkNum(int n) {
        if (store[n] == false) {
            store[n] = true;
            counter++;
        }
    }

    public boolean getBool(int n) {
        return store[n];

    }

    public int getTries() {
        return counter;
    }

    public void incCount() {
        counter++;
    }

    public static void main(String[] args) {
        Logger myLog = new Logger(100);
        Scanner userIn = new Scanner(System.in);
        Random rng = new Random();
        int ans = rng.nextInt(100);
        boolean correct = false;
        while (correct == false) {
            System.out.println("Guess a number between 1-100:");
            int guess = userIn.nextInt();
            if (guess == ans) {
                System.out.println("Correct");
                correct = true;
                myLog.incCount();
                System.out.println("Tries=" + myLog.getTries());
            } else if (guess > ans) {
                System.out.println("Too big");
                if (myLog.getBool(guess) == false) {
                    myLog.checkNum(guess);
                }
            } else if (guess < ans) {
                System.out.println("Too small");
                if (myLog.getBool(guess) == false) {
                    myLog.checkNum(guess);
                }

            }
        }

    }

}
