import java.util.Scanner;
public class elementary8 {
    
    public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);
    System.out.println("Till which number?");
    int n = userIn.nextInt();
    for (int i=1; i<=n; i++){
       if (Prime(i)==true) {
           System.out.print(i + ",");
       }
    }
    }
    public static boolean Prime(int n){
        boolean prime=false;
        if (n==2){
            return true;
        }else{
            for (int i=2; i < n;i++){
            if (n%i == 0){
                prime = false;
                i=n;
            } else{
                prime = true;
            }
        }

        }
                return prime;
    }
}
