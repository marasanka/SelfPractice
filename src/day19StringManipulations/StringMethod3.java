package day19StringManipulations;

public class StringMethod3 {
    public static void main(String[] args) {

      String sentence = "Java is fun, Java is cool";
      sentence=sentence.replace("Java","Python");


        System.out.println(sentence);

        String email = "Cybertek is my favorite school Cybertek";
        email= email.replaceFirst("tek","pop");
        System.out.println(email);

      String a = "Java is favorite Java, my Love, my Career Java";
              a = a.replaceFirst("Java","Python");
        System.out.println(a);















    }
}
