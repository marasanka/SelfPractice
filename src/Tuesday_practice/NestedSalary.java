package Tuesday_practice;

public class NestedSalary {
    public static void main(String[] args) {

        int hourlyRate = 100;
        int weeklyHours = 35;
        int numberOfWeeks = 50;
        int salary = 0;


        if (hourlyRate > 0) {
            if (weeklyHours > 1 && weeklyHours <= 65) {
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {
                    salary = hourlyRate * weeklyHours * numberOfWeeks;
                } else {
                    System.out.println("Number of weeks cant be less than 1");
                }
            } else {
                System.out.println("Weekly hours cant be less than 1");
            }
        } else {
            System.out.println("Hourly Rate cannot be 0");
        }

        System.out.println(salary);


    }
}
