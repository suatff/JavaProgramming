package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();

        students.add("Ahmet");
        students.add("Kamuran");
        students.add("Mehmet");
        students.add(2,"Kemal");

        System.out.println(students);


        System.out.println(students.size());
        int lastIndex= students.size()-1;
        System.out.println("Last Index: "+ lastIndex);


        String student= students.get(2);
        System.out.println(student);

        System.out.println("-------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

        }

        System.out.println("--------------");
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");
        list.set(3, "C++");

        System.out.println(list);

        

    }
}
