package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import javax.crypto.spec.PSource;

public class Test {

    public static void main(String[] args) {
        String str="Java Programming Language";

        StringUtility.printEachChar(str);

        String str2= StringUtility.reverse(str);
        System.out.println(str2);

        System.out.println("------");
        String word="Civic";
        boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------");
        String [] names= {"Anna", "Java", "Python", "racecar", "mom", "Cydeo"};
        int count =0;
        for (String each:names) {
            if(StringUtility.isPalindrome(each)){
                count ++;
            }
        }
        System.out.println(count);

        System.out.println("----------------------");

        boolean anagram= StringUtility.anagram("abr", "bra");
        System.out.println("anagram = " + anagram);

        System.out.println("-----------------");
        String str3="aaaaahhhhbbbbeee";
        String word2= StringUtility.removeDuplicates(str3);
        System.out.println(word2);



    }

}
