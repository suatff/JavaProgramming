package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> emplooyes=new ArrayList<>();
        emplooyes.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));
        emplooyes.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(emplooyes);

    }
}
