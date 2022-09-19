package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        //replace

        String str= "Java is fun, I love learning Java";
        str=str.replace("Java", "Python");
        //String str2=str.replace("Java", "Python");
        System.out.println(str);
        
        String email="johnsmith@yahoo.com";
        System.out.println("email = " + email);
        String email2=email.replace("yahoo", "gmail");
        System.out.println("email2 = " + email2);

        String sentence= "Java java Python Python C# C# C++ C++ Python Python Python";
        String sentence2 =sentence.replace("Python", "").replace("  ", "");
        System.out.println("sentence2 = " + sentence2);


        System.out.println("----------------------------------");

        //replaceFirst

        String result= "Java Java Java";
        result=result.replaceFirst("Java", "Python");
        System.out.println(result);

        

    }
}
