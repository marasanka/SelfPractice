package Loop;

public class FrequencyOfCharOrWord {
    public static void main(String[] args) {

        String str = "aaaaaaaaaabbbbcccdddbbbbbb";
        char ch = 'a';
        int count = 0;//1 + 1 +1

        for (int i = 0; i <= str.length() - 1; i++) {
            char eachCharacter = str.charAt(i);

            if (eachCharacter == ch) {
             count++;            //a
// if each of the characters will compare to given 'a'
            }


        }


        System.out.println(count);



    }
}