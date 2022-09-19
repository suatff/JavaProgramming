package day05_StringConcatenation;

public class FullName {

    public static void main(String[] args) {
        String firstName = "Suat";
        String lastName = "Özcelik";
        int age = 32;
        String jobTitle = "SDET";
        String companyName = "Apple INC";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;


        //Full name of the person is ....
        System.out.println("Full name of the person is " + fullName);

        //..... is .... years old
        System.out.println(fullName + " is " + age + " years old");

        //FullName is JobTitle, works att CompanyName, and FullName' salary is Salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " +fullName + "'s salary is $"+salary);




    }
}
