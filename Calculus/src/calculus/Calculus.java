package calculus;
import java.util.Scanner;

public class Calculus {
    public static Equation derive(Equation n)
    {
        Equation der = new Equation(n.terms.length);
        for (int i = 0; i<n.terms.length;i++)
        {
            der.coeff[i]=n.coeff[i]*n.exponent[i];
            der.exponent[i]=n.exponent[i]-1;
        }
        der.getTerm();
        return der;
    }
    public static Equation integrate(Equation n)
    {
        Equation der = new Equation(n.terms.length);
        for (int i = 0; i<n.terms.length;i++)
        {
            der.exponent[i]=n.exponent[i]+1;
            der.coeff[i]=n.coeff[i]/der.exponent[i];
            
        }
        der.getTerm();
        return der;
    }
    
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int terms = userIn.nextInt();
        Equation y = new Equation(terms);
        for (int i=0; i<terms;i++)
        {
            y.setEquation(i, userIn.next());
        }
        Equation x = derive(y);
        Equation z = integrate(y);
        System.out.print(z.guiGetEqn());
    }
    
}
