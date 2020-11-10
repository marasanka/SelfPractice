package Loop;

public class ReversedString {
    public static void main(String[] args) {

    String str = "ALLA";
//                012
    String result = ""; // cba

        for(int i = str.length()-1; i >=0; i--){
           result += str.charAt(i);
        }

        System.out.println(result);












    }

}
