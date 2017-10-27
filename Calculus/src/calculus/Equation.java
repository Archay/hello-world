package calculus;

public class Equation {
    String[] terms;
    int[] exponent;
    double[] coeff;
    
    public Equation(int n)
    {
        terms = new String[n];
        exponent = new int[n];
        coeff = new double[n];
    }
    public double getExp(int index)
    {
        return exponent[index];
    }
    public double getCoeff(int index)
    {
        return coeff[index];
    }
    public void setEquation(int index, String func)
    {
        terms[index]=func;
        exponent[index]=Integer.parseInt(func.substring(func.indexOf("x")+1));
        coeff[index]=Integer.parseInt(func.substring(0,func.indexOf("x")));
    }
    public void getTerm()
    {
        for (int i=0; i<coeff.length;i++)
        {
            terms[i]=(coeff[i]+"x"+exponent[i]);
        }
    }
    public void setExp(int index, int value)
    {
        exponent[index]=value;
    }
    public void setCoeff(int index, int value)
    {
        coeff[index]=value;
    }
    public String guiGetEqn()
    {
        String eqn="";
        for (int i = 0;i<terms.length;i++)
        {
            eqn = eqn + "+" + coeff[i] + "x^"+exponent[i];
        }
        return eqn;
    }
    
}
