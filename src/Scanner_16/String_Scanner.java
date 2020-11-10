package Scanner_16;
import java.util.Scanner;
public class String_Scanner {
    public static void main(String[] args) {


       Scanner input = new Scanner(System.in) ;

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your full name");
String fullName = input.nextLine();

        System.out.println("Name "+ fullName);
        System.out.println("Age "+age);


















    }
}
