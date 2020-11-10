package day_18StringMethods;

import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println("First name is :"+ firstName);
















    }
}
