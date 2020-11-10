package Loop;

import java.util.Scanner;

public class SumOgUserEnterNumbers {
    public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
           int n1 = scan.nextInt();

        System.out.println("Enter ");
            int n2 = scan.nextInt();

        System.out.println("Enter a number");
             int n3 = scan.nextInt();
             int result = n1 +n2 + n3 ;
        System.out.println("The sum is : "+result);



        int times = scan.nextInt();
         int result2 = 0;
         for(int i = 1; i <= times; i ++){
             System.out.println("Enter a number: ");
             result2 +=scan.nextInt();
         }

        System.out.println("result = " + result2);









    }
}
