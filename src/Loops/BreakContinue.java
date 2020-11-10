package Loops;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        for(int i = 0; i==0;) {


            System.out.println("Enter two numbers");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Sum is " + (n1 + n2));

            System.out.println("Would you like to continue");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;
            }











        }













    }
}
