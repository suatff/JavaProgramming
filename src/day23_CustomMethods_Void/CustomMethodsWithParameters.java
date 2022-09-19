package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(6);
        ageOfPerson(2015);
        printNumbers(100,200);
    }
    //create a function that can chech if a number is odd number or even number

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number +" is even number");

        }else {
            System.out.println(number + " is odd number");
        }

    }

    //Create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age=2022- birthYear;

        System.out.println("Your age is: " + age);

    }


    //Create a function that can print all the numbers between X and Y


    public static void printNumbers(int x , int y){

        for (int i = x+1; i <y; i++) {
            System.out.println(i);

        }

    }

}
