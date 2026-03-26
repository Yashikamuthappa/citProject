import java.util.Scanner;
public class Controlstructuer {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System .in);
        // System.out.println("Enter the age");
        // int age = sc.nextInt();
        // if(age>=18)
        //     System.out.println("Eligible for voting");
        // sc.close();
        //if else-biggest of two numbers
            Scanner sc = new Scanner (System .in);
            System.out.println("Enter the first number");
            int a=sc.nextInt();
            System.out.println("Enter the secound number");
            int b=sc.nextInt();
            if (a>b)
                System.out.println("first number is largest");
            else
                System.out.println("secound is largest");



    }
    
}
