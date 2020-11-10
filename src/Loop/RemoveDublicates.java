package Loop;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "abcbaaabbbcccbbbad";
        String nonDubL = "";// abcd

        for (int i = 0; i <= str.length() - 1; i++) {
            //   nonDubL += str.charAt(i);
            if (nonDubL.contains(""+ str.charAt(i))) {
                 continue;
            }else{
                nonDubL += str.charAt(i);
            }


        }

        System.out.println(nonDubL);











    }
}