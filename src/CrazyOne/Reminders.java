package CrazyOne;

public class Reminders {

    public static void DivisionRemainder(int num1, int num2){

        System.out.println(num1 + " devide by "+ num2+ " is equal to "+ (num1/num2)+ " with a reminder of "+ (num1%num2));

    }



    public static void main(String[] args) {


      int num1 = 20;
      int num2 = 6;

        System.out.println(num1 + " devide by "+ num2+ " is equal to "+ (num1/num2)+ " a reminder of "+ (num1%num2));


        int num3 = 21;
        int num4 = 6;

        System.out.println(num3 + " devide by "+ num4+ " is equal to "+ (num3/num4)+ " with a reminder of "+ (num3%num4));




        DivisionRemainder(40,6);

        DivisionRemainder(60,7);


    }
}
