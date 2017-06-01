import java.util.Scanner;
public class NewMain5 {

    public static void main(String[] args) {
    int n;
    Scanner userIn = new Scanner(System.in);
    n = userIn.nextInt();
    for (int i = 1; i<13; i++) {
        System.out.println(n + " times " + i + " is:" + i*n);
    }
    }
    
}
