package day34_GarbageCollection_AccessModifiers;

//import static day34_GarbageCollection_AccessModifiers.StaticMembers.num;
//import static packageName.class.staticMember----------------->it imports just one member of the class
//import static day34_GarbageCollection_AccessModifiers.StaticMembers.*;
//import static packageName.class.*----------------------------->it imports all static members of a class


import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {
    public static void main(String[] args) {
      //  System.out.println(Circle.pi); class name is not needed to write
        System.out.println(pi);

    }
}
