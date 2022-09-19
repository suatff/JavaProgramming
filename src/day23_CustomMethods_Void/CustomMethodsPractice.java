package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        message();
        message2();
        evenNumbers();
    }

    public static void message(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");

        }

    }
    public static void message2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
}
    public static void evenNumbers(){
        int evenNumbers=0;

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }
    }


}
