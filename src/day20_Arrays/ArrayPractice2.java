package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26];
        /*for (char i = 'A',j=0; i <= 'Z'&& j< letters.length; i++, j++) {
            letters[j]=i;


        }

         */
        char ch='A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]= ch;
            ch++;

        }

        System.out.println(Arrays.toString(letters));
    }
}
