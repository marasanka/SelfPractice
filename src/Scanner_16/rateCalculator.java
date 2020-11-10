package Scanner_16;
import java.util.Scanner;
public class rateCalculator {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("Enter your hours a week");
        int hours = input.nextInt();

        double hourlyRate = salary / (hours * 52);
        System.out.println("Your hourly rate is: "+ hourlyRate);
















    }
}
