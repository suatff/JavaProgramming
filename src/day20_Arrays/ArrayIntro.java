package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String myGroup []=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]= "Hulya";
        myGroup[4]= "Mikael";

       // System.out.println(myGroup);//wrong way to print Array

        System.out.println(Arrays.toString(myGroup));


        System.out.println("--------------");

        String[] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number=1;
        if(1>number && 7<number){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);



        System.out.println();

        System.out.println("-----------");

        String[] months={"Januari", "february","March", "April", "Maj", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(months));

        int number1=4;

        if(number1<1 && number1>12){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(months[number1-1]);

        for (int i = 0; i < months.length-1; i++) {
            System.out.println(months[i]);

        }
    }
}
