package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        int [] number={100,200,300,400,500, 600};
        number=removeElement(number,1);//{100,300,400,500,600}
        number=removeElement(number,1);//{100,400,500,600}
        System.out.println(Arrays.toString(number));

    }


    //removes the index from the array, returns new array
    public static  int[] removeElement(int [] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//If the index of array is  matching with the given INDEX!!
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }
    //removes the index from the array, returns new array
    public static  char[] removeElement(char [] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//If the index of array is  matching with the given INDEX!!
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }
    //removes the index from the array, returns new array
    public static  double[] removeElement(double [] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//If the index of array is  matching with the given INDEX!!
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }
    //removes the index from the array, returns new array
    public static  String[] removeElement(String [] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//If the index of array is  matching with the given INDEX!!
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }


}

