package CrazyOne;

public class CreditScore {

    public static void main(String[] args) {

        /*
        if  the credit score is between 600 and 700 write “your credit score is good.
         If credit score is less than 600 write “your credit score is not good. Your need to work on it.”
          If the credit score is more than 700  print “Your score is excellent. Good job.”
         */

        int creditScore = 555;

        if (creditScore < 600) {
            System.out.println(" your credit score is not good. Your need to work on it ");
        }
        if (creditScore >= 600 && creditScore <= 700) {
            System.out.println("your credit score is good");
        }
        if (creditScore > 700) {
            System.out.println(" You score is excellent. Good job.");
        }


    }




    }