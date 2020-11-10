package day_18StringMethods;

public class Substring1 {
    public static void main(String[] args) {

    String firstName = "mArWaN";//Marwan;
    String firstChar =firstName.substring(0, 1).toUpperCase();
    String name = firstChar+ firstName.substring(1).toLowerCase();


        System.out.println(firstChar);
        System.out.println(name);

    String school = "cYBERtek";
    String firstLit = school.substring(0,1).toUpperCase();
    String rest = school.substring(1).toLowerCase();
    String f = firstLit+rest;
        System.out.println(f);














    }
}
