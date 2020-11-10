package day_18StringMethods;

public class Initials {
    public static void main(String[] args) {


      String fn = "John" ;
      String ln = "Aaron";

      String initials = fn.charAt(0) +"." +ln.charAt(0);

        System.out.println(initials);

      String name = "Valeria";// number of characters are 7;
      int n1 = name.length();
        System.out.println(n1);

  String fullname = "Duane Davis";
  int number = fullname.length();
        System.out.println(number);
  int indexNumber = fullname.length()-1;
        System.out.println(indexNumber);

        System.out.println("========================");

  String school = "Java";
  char firstChar = school.charAt(1);
  char lastChar = school.charAt(school.length()-1);
        System.out.println(firstChar);
        System.out.println(lastChar);

        System.out.println("===========================");

    String t1 = "            Hello World        ";
       t1= t1.trim();
        System.out.println(t1);








    }
}
