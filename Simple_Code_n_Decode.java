package javaapplication3;

import java.util.Scanner;

public class Hasher {

    int salt1;
    int salt2;

    public Hasher(int m, int n) {
        salt1 = m;
        salt2 = n;
    }

    public char Salt1(char a) {
        int ascii = (int) a;
        ascii += salt1;
        char hash = (char) ascii;
        return hash;
    }

    public char Salt2(char a) {
        int ascii = (int) a;
        ascii += salt2;
        char hash = (char) ascii;
        return hash;
    }

    public char Pepper1(char a) {
        int ascii = (int) a;
        ascii -= salt1;
        char hash = (char) ascii;
        return hash;
    }

    public char Pepper2(char a) {
        int ascii = (int) a;
        ascii -= salt2;
        char hash = (char) ascii;
        return hash;
    }

    public String hash(String textIn) {
        String hashOut = "";
        int len = textIn.length() - 1;
        textIn.toCharArray();
        for (int i = 0; i <= len; i++) {
            if (i % 2 == 0) {
                hashOut = hashOut + Salt1(textIn.charAt(i));
            } else {
                hashOut = hashOut + Salt2(textIn.charAt(i));
            }
        }
        return hashOut;
    }

    public String unhash(String textIn) {
        String hashOut = "";
        int len = textIn.length() - 1;
        textIn.toCharArray();
        for (int i = 0; i <= len; i++) {
            if (i % 2 == 0) {
                hashOut = hashOut + Pepper1(textIn.charAt(i));
            } else {
                hashOut = hashOut + Pepper2(textIn.charAt(i));
            }
        }
        return hashOut;
    }

    public static void main(String[] args) {
        Boolean run = true;
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter 'food':");
        String input = userIn.nextLine();
        System.out.println("Enter number of 'shakes':");
        int n = userIn.nextInt();
        int m = userIn.nextInt();
        Hasher hashIn = new Hasher(n, m);
        while (run) {
            System.out.println("Salt or Pepper?");
            String op = userIn.next();
            switch (op) {
                case ("Salt"):
                    System.out.println(hashIn.hash(input));
                    run = false;
                    break;
                case ("Pepper"):
                    System.out.println(hashIn.unhash(input));
                    run = false;
                    break;
                default:
                    System.out.println("Please enter a valid 'spice':");
                    break;
            }

        }
    }
}
