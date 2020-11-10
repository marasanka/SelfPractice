package day_15_Scanner;
import java.util.Scanner ;
public class Scanner_firstTask {
    public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);

        System.out.println("Enter the int number");

        int num = scan.nextInt();
        System.out.println(num);

        if(num%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

















    }
}
