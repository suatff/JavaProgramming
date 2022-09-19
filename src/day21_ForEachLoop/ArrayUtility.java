package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int [] scores={95, 100, 55, 65, 90};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min num " + scores[0]);
        System.out.println("Max num = " + scores[scores.length-1]);

        String[]names={"Maria", "Anna", "Zuhal", "Suat", "Kamuran"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        System.out.println("-------------");

        int[]arr1={1,3,2};
        int[]arr2={1,2,3};
        boolean r1= Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1, arr2);

        System.out.println(r2);

    }
}
