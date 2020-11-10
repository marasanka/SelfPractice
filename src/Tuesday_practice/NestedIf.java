package Tuesday_practice;

public class NestedIf {
    public static void main(String[] args) {

   int age = 2;

   if(age >=1 && age <= 150){
      if(age<21){
          System.out.println("teenager");
      }else if(age >=21 && age <=55){
          System.out.println("Adult");
      }else{
          System.out.println("senior");
      }

   }else{
       System.out.println("Invalid age");
   }




















    }
}
