package CrazyOne;

public class Practise2 {

    public static void main(String[] args) {

        int a = 25;

        int c = a++ + ++a - a-- - a++ + a-- - --a;

        System.out.println(c);
        System.out.println(a);

        System.out.println("=========================");

        int b = 19;

        int e = ++b - b-- + --b - b++ - b++;

        System.out.println(e);
        System.out.println(b);
    }
}
