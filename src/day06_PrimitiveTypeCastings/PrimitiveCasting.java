package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //Implicit casting
        byte a = 100;
        short b = a;


        System.out.println("-----------------------------");

        //Explicit casting () casting operator

        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " +s);

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : "+s1);

        System.out.println(10/3);

        int w = 3, r=2;
        long u = (w+r)*2/3%2;




    }
}
