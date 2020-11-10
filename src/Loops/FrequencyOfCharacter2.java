package Loops;

public class FrequencyOfCharacter2 {
    public static void main(String[] args) {


   String str= "ababababa" ;
   char ch ='a';
   int count=0;

  while(str.contains(""+ch)){
      str = str.replaceFirst(""+ch,"");
     count++;
  }


        System.out.println(count);

// remove 'a' from a string.














    }
}
