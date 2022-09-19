package day21_ForEachLoop;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class StringMetods {
    public static void main(String[] args) {

        String str="Java";
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each:str.toCharArray()){
        System.out.println(each);}


        System.out.println("------------------");

        String sentence="Wooden Spoon";
        String[] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));




    }
}
