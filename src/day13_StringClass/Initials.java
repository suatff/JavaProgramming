package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firtsName=scan.next();

        System.out.println("Enter your last name");
        String lastname=scan.next();
        char f= firtsName.charAt(0);
        char l=lastname.charAt(0);
        String initial=f+"."+ l;

        System.out.println("initial = " + initial);

        scan.close();
        
    }
}
