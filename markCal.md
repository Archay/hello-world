import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner MarkIn = new Scanner(System.in); //Init for scanner 
        
        int ecoExam;
        int chemExam;
        int perExam;
        int phyExam;
        int mathExam;
        int total;
        
        System.out.print("Eco:");
        ecoExam = MarkIn.nextInt();
        System.out.println("Acknowledged");
        
        System.out.print("Chemistry:");
        chemExam = MarkIn.nextInt();
        System.out.println("Acknowledged");
        
        System.out.print("Periodic:");
        perExam = MarkIn.nextInt();
        System.out.println("Acknowledged");
        
        System.out.print("Physics:");
        phyExam = MarkIn.nextInt();
        System.out.println("Acknowledged");
        
        System.out.print("Math:");
        mathExam = MarkIn.nextInt();
        System.out.println("Acknowledged");
        
        total = (ecoExam + chemExam + perExam + phyExam + mathExam)/5;
        System.out.println("Your final grade is:"+total);
        
        
        
       }
    }
