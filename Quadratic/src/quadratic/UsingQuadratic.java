package quadratic;

import java.util.Scanner;

public class UsingQuadratic {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        double delta;
        int sols;
        String ans;
        int a = userIn.nextInt();
        int b = userIn.nextInt();
        int c = userIn.nextInt();
        Quadratic quad = new Quadratic(a, b, c);
        boolean run = true;
        quad.setVal(a, b, c);
        System.out.println("Enter op");
        while (run) {
            String op=userIn.next();
            switch (op) {
                case ("delta"):
                    delta = quad.getDelta();
                    System.out.println(delta);
                    break;
                case ("reset"):
                    a = userIn.nextInt();
                    b = userIn.nextInt();
                    c = userIn.nextInt();
                    quad.setVal(a, b, c);
                    break;
                case ("solve"):
                    ans = quad.solve();
                    System.out.println(ans);
                    break;
                case ("exit"):
                    run = false;
                    break;

            }
        }
    }
}
