package day16_ForLoopString;

public class Palindrome {
    public static void main(String[] args) {
        String word= "Level";
        String result="";

        for (int i = word.length()-1; i >=0; i--) {
            result +=word.charAt(i);

        }
        boolean isPalindrome=word.equalsIgnoreCase(result);
        System.out.println("Is Palindrome = " + isPalindrome);
    }
}
