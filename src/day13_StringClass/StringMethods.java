package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        char thirdChar=word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);


        System.out.println("-------------------------------");

        String s1= "Batch 9 is the best batch";
        int totalChars= s1.length();

        System.out.println("totalChars = " + totalChars);
        
        char lastChar= s1.charAt(s1.length()-1);

        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------");

        String str="wooden spoon";
        str=str.toUpperCase();//WOODEN SPOON
        System.out.println(str);

        String s="JAVA";
        s=s.toLowerCase();//java
        System.out.println(s);
        
}}
