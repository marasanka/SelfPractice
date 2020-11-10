package day_18StringMethods;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class CharAt {
    public static void main(String[] args) {

    String day = "Today was a rough day";
    char fifthLet = day.charAt(4);
    char last3Last = day.charAt(day.length()-3);




        System.out.println(fifthLet);
        System.out.println(last3Last);
        System.out.println(day);

    String firstName = "Cybertek";
    String lastName = "School";

        String initials = firstName.charAt(0)+"."+ lastName.charAt(0);
        System.out.println(initials);










    }
}
