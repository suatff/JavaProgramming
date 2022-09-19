package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

            // age: 38 years old
            byte age = 38;

            // weight:160 pounds
            //byte wieght = 160 is out of byte' range
            short wieght = 160;

            //salary: 100000$
            //short salary = 100000 is out of short's range
            int salary = 100_000; //int is the preferred data type for integer numbers

            long asset = 3_333_333_333L; // we need to write L after number in order to java understand it is long number

            //tax:0.26
            float tax = 0.26F; //We need to write F after number in order to work float

            double PI = 3.14;

            // double is the preferred data types for decimals

            char ch1 = '#';
            System.out.println("ch1 = " + ch1);

            char ch2 = 35;
            System.out.println("ch2 = " + ch2);
            
            char ch3 = 3590;
            System.out.println("ch3 = " + ch3);

            // char

            boolean isEmployeed = true;
            boolean isMarieed = false;
            boolean result = 300<100;

            System.out.println("isEmplooyed = " + isEmployeed);
            System.out.println("isMarieed = " +isMarieed );
            System.out.println("result = " + result);






    }



}
