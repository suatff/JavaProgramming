package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {
        //Positive and negative
        int a = -100;
        int b = +200;

        boolean aIsNegative = a<0;
        boolean bIsPositive = b>0;

        System.out.println(aIsNegative);
        System.out.println(bIsPositive);

        // Pre Increment and Decrement
        int x = 10;
        System.out.println(++x); //11
        System.out.println(--x); //10

        //Post Increment & Decrement

        int z = 20;
        System.out.println(z++);//20
        System.out.println(z--);//21

        int r= 21;
        System.out.println(r--);
        System.out.println(r++);
        System.out.println(r--);



    }
}
