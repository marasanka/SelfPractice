package Loops;

public class FrequencyOfAWord {
    public static void main(String[] args) {
//How many times word was used
 //   Frequency menas = how many times;
// we count this word by removing it from the string each time.
    String str = "cat cat cat cat cat" ;
    String word = "cat";
    int count = 0;

    while (str.contains(word)){
        str = str.replaceFirst(word,"");
        count++;
    }


        System.out.println(count);


















    }
}
