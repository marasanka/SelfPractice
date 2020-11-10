package PracticeLoop;

public class Vowles {
    public static void main(String[] args) {


        String word = "Conervatoria";// oeaoia;
        String vowels = "";


        for (int i = 0; i < word.length() ; i++) {
            String eachChar = "" + word.charAt(i);

    if(eachChar.equalsIgnoreCase("a")||eachChar.equalsIgnoreCase("u")
        || eachChar.equalsIgnoreCase("i")|| eachChar.equalsIgnoreCase("e")
        || eachChar.equalsIgnoreCase("o")){
        vowels +=eachChar;

          }

        }

        System.out.println(vowels);

        System.out.println(word.substring(0,1)+word.substring(word.length()-1) );


    }
}