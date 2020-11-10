package SundayPractice;

public class Increments {
    public static void main(String[] args) {

        int a = 10;
        int b = (-a + ++a - --a * a++ - a--);
        System.out.println(b);
        System.out.println(a);

    }

}
