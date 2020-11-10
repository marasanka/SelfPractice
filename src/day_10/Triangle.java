package day_10;

public class Triangle {
    public static void main(String[] args) {

    int angle1 = 40;
    int angle2 = 60;
    int angle3 = 90;


    boolean isValid = (angle1+angle2+angle3)==180;

    if(isValid){
        System.out.println(" the Traingle is valid");
    }

    if(!isValid){
        System.out.println(" it is not valid triangle");
    }



    }
}
/*
A triangle is valid if the sum of all the three angles is equal to 180 degree.
Write a program that declares three integers as angles and check whether a triangle is valid or not.
 */