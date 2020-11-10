package Loops;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String name = scan.nextLine();
       String result = "";
       scan.close();

       for(int i = name.length()-1;i>=0;i--){
     //  result += name.charAt(i);
         result += name.substring(i,i+1);//gets one character at a time

   }


        System.out.println(result);






    }
}
