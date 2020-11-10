package day25Arrays;



public class LongestWord {
    public static void main(String[] args) {

        String word1 = "Alexandria";
        String word2 = "Washington";

        String longest = "";

        if (word1.length() > word2.length()) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }

        System.out.println("=====================================");

        String word = "jar";
        int countLetter = word.length();//counts how many characters in the word.

        if (countLetter == 1) {
            System.out.println(word + word + word);
        } else if (countLetter == 2) {
            System.out.println(word + word);
        } else if (countLetter >= 3) {
            int middleIndex = countLetter / 2; // to find middle index;
            if (countLetter % 2 == 0) {
                System.out.println(word.charAt(middleIndex));

            } else {
                System.out.println(word.charAt(middleIndex - 1) + //middle letters;
                        word.charAt(middleIndex));
            }


        }

    }
}