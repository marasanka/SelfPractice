package StringScanner;
import java.util.Scanner;
public class HomeTask2 {
    public static void main(String[] args) {

  Scanner info = new Scanner(System.in);

        System.out.println("How many shares do you have ");
        int share = info.nextInt();

        if(share < 0 ) {
        }else {


            System.out.println("How much is the total vallue in stock market ");
            double totalValue = info.nextDouble();

            System.out.println("What is the name of the company your have the most shares in ");
            String companyName = info.nextLine();
            info.nextLine();
            System.out.println("What is the value of your shares");
            double shareValue = info.nextDouble();

            double companyValue = totalValue * shareValue;

            System.out.println("Your total stock market holding is " + totalValue + " which is made up of " +
                    share + "." + companyName + " is the largest company holdings you have of " +
                    companyValue + " between " + share);

        }


/*
- Stock market
    - Ask the user how many total shares they have already? (int)
        -> If the user gives 0 or give a negative number none of the rest condition should be executed
    - Ask the user how much their total value in the stock market is (double)
    - Ask the user to enter the name of the company they have the most shares in (String, multiple words)
    - Ask the user the value of those shares (double)
    - Calculate and print the difference of the user's total stock market valued with the biggest share value
    - Print in the following format:
        "Your total stock market holding is $totalValue which is made up of $totalShareNumber. $companyName is the largest company holdings you have of $companyValue between $companyShares."
 */


    }
}
