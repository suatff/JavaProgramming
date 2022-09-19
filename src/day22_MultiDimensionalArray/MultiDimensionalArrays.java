package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        int[] arr2= {40,50};
        int[] arr3={60,70,80,90};

       /* If we know Array we do not need to write  so;
        int [][] arr2d =new int[3][];

        arr2d[0] =arr1;
        arr2d[1]= arr2;
        arr2d[2]= arr3;

        */

        int [][] arr2D={{10,20,30},{40,50},{60,70,80,90} };
           //                 0           1       2
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println( arr2D[2][2]  );

    }
}
