package day19StringManipulations;

import java.util.Scanner;

public class SubsstringScanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);



















    }
}
