package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        //TRIM
        String str1= "         batch          25           ";
        str1=str1.trim();//Release white spaces (unused spaces)
        System.out.println(str1);

        System.out.println("-----------------");

        //IndexOF and lastIndexOf

        String str2="Cydeo School";
        int n1= str2.indexOf("h");
        System.out.println("n1 = "+ n1);

        int n2=str2.indexOf("ool");//Write special feature for the character
        System.out.println("n2 = " + n2);
        
        String str3="Jawa programmering";
        int n3=str3.lastIndexOf("r");
        System.out.println("n3 = " + n3);
        
        




    }
}
