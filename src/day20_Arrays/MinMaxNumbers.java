package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int numbers[]=new int [10];



        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();

        }
        int max=numbers[0];
        int min=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {

            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println("Minimun number = " + min);
        System.out.println("Maximum number = " + max);




    }
}
