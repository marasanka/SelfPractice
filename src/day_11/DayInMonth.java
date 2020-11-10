package day_11;

public class DayInMonth {
    public static void main(String[] args) {

     int month = 3;//1 to 12;
     boolean has28day =28==2;
     boolean has30days = month == 4|| month ==6||month == 9||month==11;
     boolean has31day= !has28day && !has30days;

     int days = 0;

     if(has28day){
         System.out.println("28 days");
     }
     if(has30days){
         System.out.println("30 days");
     }
     if(has31day){
            System.out.println("31 days");
        }
     if(has28day){
         days = 28;
     }
     if(has30days){
         days = 30;
      if(has31day){
          days = 31;
          System.out.println(days);
      }
     }










    }
}
/*

	1. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		Ex:
	 			month = 2

	 			output:
	 				28 days


 				month = 9

 				output:
 					30 days

		Hints: it cannot be done with if&else statement, you will need single if statements

		28 days: 2
		30 days: 4, 6, 9, 11
		31 days: 1, 3, 5, 7,8,10


 */

