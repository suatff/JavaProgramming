package day32_Constructor;

public class Test {
    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        this();
        System.out.println("B");
    }
    public Test (String str){
        this(10);
        System.out.println("C");
    }
    public Test(double a){
        this("");
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java");
    }
}
