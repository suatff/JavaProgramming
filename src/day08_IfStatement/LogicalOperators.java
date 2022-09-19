package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        //Logical and

        boolean isEligiable = age>= 18 && citizen == "USA";

        System.out.println(name + " is eligiable to vote: " + isEligiable);
        //logical or
        String name2 = "Shay";
        int age2= 21;
        char gender = 'F';
        boolean isEligiable2 = age >= 18 && (gender == 'M' || gender =='F');

        System.out.println(name2 + " is eligiable to regsiter : " + isEligiable2);
        //logical NOT
        int score= 86;
        boolean passed = score>=60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }


}
