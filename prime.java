/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
public class prime {
    
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
            for (int i=2; i < n/2;i++){
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
