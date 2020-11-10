package day19StringManipulations;

import javax.jws.soap.SOAPBinding;

public class Index {
    public static void main(String[] args) {

   String email = "CybertekSchool@gmail.com";

   int begginingIndex = email.indexOf("@")+1;
   int endingIndex = email.indexOf(".");

   String domain = email.substring(begginingIndex, endingIndex);

        System.out.println(domain);


   String p = "I like to watch movies and read books ";

   String word = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word);

        System.out.println("======================================");

   String y = "I like to learn java, Java is cool, I like to watch Jumanji";
   int n1 = y.indexOf("J");
        System.out.println(n1);

    String name = "My name is Muhtar";
    String result = name.substring(name.lastIndexOf("M"), name.indexOf("u"));
        System.out.println(result);














    }
}
