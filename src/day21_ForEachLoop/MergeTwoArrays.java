package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] groups1={"Ali", "Layan", "Aysenur"};
        String[] groups2={"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
    String[] students=new String[groups1.length+ groups2.length];

    int i=0;
    for (String each:groups1){
        students[i++]=each;
    }
    for (String each:groups2){
        students[i++]=each;

    }
        System.out.println(Arrays.toString(students));


    }
}
