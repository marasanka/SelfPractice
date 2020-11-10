package Tuesday_practice;

import javax.jws.soap.SOAPBinding;

public class If_practice {
    public static void main(String[] args) {

   int n = 1000;

  if(n%2 !=0) {
      System.out.println(n + " is odd number");
  }else{
      System.out.println(n+" is even");
  }

        System.out.println("===================================================");

  int age = 14;

        if(age>=18){
            System.out.println("elegible for license");
        }else{
            System.out.println("Not eligible");
        }


        System.out.println("======================================");

        char grade = 'A';

        if(grade =='A' || grade == 'B'){
            System.out.println("Passed the test");
        }else{
            System.out.println(" didint pass");
        }

        System.out.println("=============================");

// else if_ 3 or more

        int n1 = 100;
        int n2 = 200;

        if(n1>n2){
            System.out.println(n1 +" is greater number");
        }else if(n2>n1 ) {
            System.out.println(n2 + " is greater number");
        }else{
            System.out.println(n1+" is equal"+ n2);
        }

        System.out.println("===========================================");

      int num = 1;

















    }






}
