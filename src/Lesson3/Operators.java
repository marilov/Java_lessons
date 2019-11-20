package Lesson3;

public class Operators {
    public static void main(String[] args){

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = 11 / 5.5 + 1.3 % 5 - 20;

        System.out.println(result);

        int a = 5;
        int b = 8;

        int c = a-- - --a + ++a + a++ + a;
        int d = ++b - b++ + ++b - --b;

        System.out.println(c);
        System.out.println(d);

    }
}
