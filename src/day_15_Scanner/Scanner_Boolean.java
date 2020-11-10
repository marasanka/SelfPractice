package day_15_Scanner;
import java.util.Scanner;
public class Scanner_Boolean {
    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);


        System.out.println("The age is: ");
        byte age = input.nextByte();

        System.out.println("The favorite number is: ");
        long number = input.nextLong();

        System.out.println("Are you a student ");
        boolean isStudent = input.nextBoolean();

        System.out.println("Age "+ age);
        System.out.println("Favorite number "+ number);
        System.out.println("Is a student "+ isStudent);















    }
}
