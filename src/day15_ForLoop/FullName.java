package day15_ForLoop;

public class FullName {
    public static void main(String[] args) {
        String firtsName="cyDEo",
                lastName="SCHOOL";

        firtsName=firtsName.substring(0,1).toUpperCase()+ firtsName.substring(1).toLowerCase();
        System.out.println(firtsName);

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(lastName);

        String fullName= firtsName+ " " + lastName;
        System.out.println(fullName);
    }
}
