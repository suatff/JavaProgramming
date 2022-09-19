package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int [] array={1,2,2,2,1,3,3,5,4,5,6,7};
        int []unique= uniqueElement(array);
        System.out.println(Arrays.toString(unique));


        System.out.println("------------------");
        double[] array2={1.5,1.5,2.5,4.6,4.7,4.7};
        double[] unique2=uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));

    }
    //Returns the unique elements of the array as a new array
    public static int[]uniqueElement (int[]array){
        int[] result={};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) ==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }
    //Returns the unique elements of the array as a new array
    public static double[]uniqueElement (double[]array){
        double[] result={};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) ==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //Returns the unique elements of the array as a new array
    public static String[]uniqueElement (String[]array){
        String[] result={};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) ==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }
    //Returns the unique elements of the array as a new array
    public static char[]uniqueElement (char[]array){
        char[] result={};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) ==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }
}
