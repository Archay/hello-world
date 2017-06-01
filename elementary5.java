/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Archay
 */
import java.util.Scanner;
public class NewMain3 {

    
    public static void main(String[] args) {
    int n;
    int out=0;
    int run=0;
    Scanner userIn = new Scanner(System.in);
    System.out.println("Enter a number");
    n = userIn.nextInt();
        for (int i=1; i<=n;i++) {
            if (Check(i)){
                out=out+i;
                run++;
            }else{
                
            }
        }
        System.out.println(out);
        System.out.println(run);

    }

    public static Boolean Check(int test){
        boolean check=true;
        
        if (test % 3 == 0 || test % 5 == 0){
            check =true;
        }else {
            check = false;
        }
        return check;
    }
}
