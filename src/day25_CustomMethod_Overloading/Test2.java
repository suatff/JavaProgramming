package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String[]arr={"Suat", "Kamuran", "Kemal", "Kenan"};
        ArraysUtility.printEachElement(arr);
        System.out.println("-----------");
        int [] arr2={1,2,3,4,5,6,7,8,};
        ArraysUtility.printEachElement(arr2);
        System.out.println("-----------");
        char[] arr3={'A', 'B', 'C','D','E', 'F'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("-----------");
        double[]arr4={4.5,5.6,4.8,2.7,8.6};
        ArraysUtility.printEachElement(arr4);


        System.out.println("----------------------");

        int[]array={1,5,3,7,9,5,3,5,7,90,98,20, 32,23};
        int max1=ArraysUtility.max(array);
        System.out.println("max number: "+ max1);

        double[] array2={1.2,5.6,7.8,87.5,90.5};
        double max2=ArraysUtility.max(array2);
        System.out.println("Max double: " +max2);


        System.out.println("----------------");
        int [] a1={1,2,3,4,5,6,7};
        boolean r1= ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);
    }
}
