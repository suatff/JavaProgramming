package day25_CustomMethod_Overloading;

import javax.crypto.spec.PSource;

public class SumOfNumbers {

    public static void main(String[] args) {

       int result= sumOf2Numbers(10,35);
        System.out.println("Sum of two numbers: "+ result);

        int result1=sumOf3Numbers(19,20,40);
        System.out.println("Sum of three numbers = " + result1);

    }

    public static int sumOf2Numbers(int num1, int num2){
        return num1+num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }



    /*
     1. create a method that can find the sum of two numbers
                    method name:
sumOf2Numbers
    2. create a method that can find the sum of three numbers
                    method name:
sumOf3Numbers
    3. create a method that can find the sum of four numbers
                    method name:
sumOf4Numbers
     */
}
