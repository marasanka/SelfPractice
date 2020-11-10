package day_11;

public class TaskMaxNumber {
    public static void main(String[] args) {

    int n1 = 100;
    int n2 = 300;
    int n3 = 500;
    int inBetween = 0;

    if(n1 < n2 && n1 > n3){
        inBetween = n1;
    }else if(n2 > n1 && n2< n3 ){
        inBetween = n2;
    }else{
        inBetween = n3;
    }

        System.out.println("The number is between is :"+inBetween);
    









    }
}
