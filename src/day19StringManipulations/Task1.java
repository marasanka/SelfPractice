package day19StringManipulations;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Apple product");
        String product = scan.nextLine();
        product= product.replace(" ","").toLowerCase();

        switch (product){
            case " macbook":
                System.out.println("Which model would you like");
                String model = scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("it is $2400");
                }else if(model.equalsIgnoreCase("pro")){
                    System.out.println("$2000");
                }else{
                    System.err.println("Invalid model of mac");
                }
                break;
            case "iphone":
                System.out.println("Which model of iphone ");
                String model2 = scan.nextLine().toLowerCase();
                if(model2.equals("12")) {
                    System.out.println("Iphone is 2000");
                }else if(model2.equals("10")){
                    System.out.println("it is 750");
                }else{
                    System.err.println("Invalid model of iPhone");
                }
                break;
            case "ipod":
                System.out.println("Enter the model of ipod");
                String model3 = scan.nextLine().toLowerCase();
                if(model3.equals("air")){
                    System.out.println("price is 300");
                }else if(model3.equals("pro")){
                    System.out.println("price is 500");
                }else{
                    System.out.println("None of the are matching");
                }
                break;
            default:
                System.out.println("Invalid product name");

        }




















    }
}
