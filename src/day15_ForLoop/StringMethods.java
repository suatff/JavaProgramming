package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str="";
        boolean r= str.isEmpty();
        System.out.println(r);

        System.out.println("----------------------------------------------");


        String str2= "  ";
        boolean r2=str2.isBlank();
        System.out.println(r2);
        boolean r3=str2.isEmpty();
        System.out.println(r3);


        System.out.println("---------------------------------");
        String s1="CYDEO";
        String s2= "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));



        //YES, yes, YeS, YEs

        System.out.println("yEs".equalsIgnoreCase("Yes"));


        System.out.println("-------------------------");

        String sentence= "My favorite programming language is Java";
        boolean hasCSharp=sentence.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava=sentence.contains("Java");
        System.out.println(hasJava);


        System.out.println("-------------------------");
        String a="Wooden Spoon";
        boolean x=a.startsWith("Woo");
        boolean y= a.endsWith("Spoon");


        System.out.println(x);
        System.out.println(y);
    }
}
