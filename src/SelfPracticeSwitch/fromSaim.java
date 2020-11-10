package SelfPracticeSwitch;


public class fromSaim {
    public static void main(String[] args) {
 /*
 Given 3 numbers (int) and a boolean calculate a number based on these conditions:

	- If the first number is even, multiple it by 5, but if it's odd, multiple it by 10.

	- If the last number is a multiply of 5 divide it by 5, but if the number is not divide it by 2

	- If the given boolean is true:
		- add all the numbers together
		- After adding the numbers if the total value is divisible by 10 evenly then print the number, otherwise print "invalid result"
	- If the given boolean is false:
		- multiple all the numbers together
		- After multiplying the numbers, if the number is odd, then print it, otherwise print "invalid result"
  */

        int n1 = 30;
        int n2 = 20;
        int n3 = 10;
        int total = 0;
        boolean b1 = true;


        if (n1 % 2 == 0) {
            n1 *= 5;
        } else {
            n1 *= 10;
        }

        if (n3 % 5 == 0) {
            n3 /= 5;
        } else {
            n3 = n3 / 2;
        }

        if (b1) {
            total = n1 += n2 += n3;
            if (total % 10 == 0) {
                System.out.println(total);
            } else {
                System.out.println(" Invalid result");
            }

        } else {
            total = n1 *= n2 *= n3;
            if (total % 2 != 0) {
                System.out.println(total);
            } else {
                System.out.println("Invalid");
            }


        }
    }
}