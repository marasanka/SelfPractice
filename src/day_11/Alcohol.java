package day_11;

public class Alcohol {
    public static void main(String[] args) {




        int age = 25;

        String buyAlcohol = (age > 21) ? "Eligible to buy alcohol" : "Cant buy ";

        System.out.println(buyAlcohol);


        System.out.println("======================================");

        int age2= 25;
        String citizen = "USA";
        String Elible = ( age2 >= 18 && citizen == "USA") ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(Elible);










    }
}

