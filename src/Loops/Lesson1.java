package Loops;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

  int result = 0;//to contain the sum of each user entered number

  for(int i =1; i<= 5; i++){
      System.out.println("Enter a number:" +i) ;

      result += scan.nextInt();
  }

        System.out.println("result = "+ result);
























    }
}
