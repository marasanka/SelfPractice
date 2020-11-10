package Loop;

import java.util.Scanner;

public class SumOfBetweenNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = scan.nextInt();//100;
        scan.close();
        int result = 0;

        if (num > 1) {

            for (int i = 1; i <= num; i++) {// calculating the sum of all numbers
                // and add them into result.
                result += i;
            }

            System.out.println("Result= " + result);
        } else {
            System.out.println("Invalid entry");


        }
    }
}