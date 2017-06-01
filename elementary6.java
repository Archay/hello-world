package javaapplication3;

/**
 *
 * @author Archay
 */
import java.util.Scanner;
public class NewMain4 {

    
    public static void main(String[] args) {
        int n;
        int op;
        int out = 0;
        Boolean run = true;
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter number");
        n = userIn.nextInt();
        System.out.println("Enter operation type:(1 for add, 2 for multiply");
        while (run) {
        op = userIn.nextInt();
        switch (op) {
            case 1 :
                out = Alg(n);
                run = false;
                System.out.print("Sum output is:");
                break;
            case 2 :
                out = Geo(n);
                run = false;
                System.out.print("Product output is:");
                break;
            default :
                System.out.println("Unknown command. Please try again");
                run = true;
                }
        }
        System.out.print(out);
    }
    }
    public static int Alg(int n) {
        int sum;
        sum = (n/2)*(n+1);
        return sum;
    }
    public static int Geo(int n) {
        int prod = 1;
        while (n != 0) {
            prod = prod * n;
            n = n - 1;
        }
        return prod;
    }
}
