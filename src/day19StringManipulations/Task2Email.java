package day19StringManipulations;

public class Task2Email {
    public static void main(String[] args) {


   String email = "test@gmail.com";
   String domain = email.substring(email.indexOf("g"),email.indexOf("."));

        System.out.println("the domain is :"+domain);

   String email2 = "Cybertek@yahoo.com";
   String domain2 = email2.substring(email2.lastIndexOf("y"), email2.indexOf("."));

        System.out.println("the domain is:"+domain2);

















    }
}
