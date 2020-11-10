package Tuesday_practice;

public class NestedGrade {
    public static void main(String[] args) {

        String citizen = "Canada ";
        int age = 22;
        boolean isResident = true;
        boolean isAlien = false;
        boolean hasDiploma = true;


        if (citizen == "USA" || isResident || isAlien) {
            if (age >= 17 && age <= 31) {
                if (hasDiploma) {
                    System.out.println("You are qualified");
                } else {
                    System.err.println("You must habe a high school diploma");
                }

            } else {
                System.err.println("You must be between 17 and 34 years old");
            }


        } else {
            System.err.println("You must be a citizen or a resident or alien");
        }


    }
}
