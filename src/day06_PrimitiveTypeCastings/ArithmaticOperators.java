package day06_PrimitiveTypeCastings;

public class ArithmaticOperators {
    public static void main(String[] args) {
        System.out.println("12"+ 1); //121, concatenation

        System.out.println(10+20); //Addition
        System.out.println(100-50); //Subtraction
        System.out.println(10*6); //Multiplication

        System.out.println(100/3);
        System.out.println((double) 100.0/3);
        System.out.println(100.0/3);
        System.out.println(100/3.0);
        System.out.println(100d/3);

        int a= 100;
        double b =a/6; //16.0

        System.out.println(b);

        //double c = a/6d;

        double c = (double) a/6; //16.6666

        System.out.println(c);





    }

}
/*
+:addition
-:Subtract
*:Multiplication
/:Division

    in math: 10/4=2.5
    In Java: 10/4 =2
                10.0/4: 2-5
%:Remainder

 */