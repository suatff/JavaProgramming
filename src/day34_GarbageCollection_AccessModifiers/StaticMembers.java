package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {
    static class class1{

    }
    public static int num=100;
    public static void method(){

    }
    static {}


}


class A{
    static class B{
        public static void method1(){

        }
    }
}

class C{
    public static void main(String[] args){
        A.B.method1();
    }
}