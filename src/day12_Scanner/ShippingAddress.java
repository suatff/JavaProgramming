package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your building number:");
        String building= scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String street=scan.nextLine();

        System.out.println("Enter city name:");
        String city=scan.nextLine();

        System.out.println("Enter your state name:");
        String state=scan.next();

        System.out.println("Enter your zip code:");
        String zipCode=scan.next();
        scan.nextLine();

        System.out.println("Enter your country name:");
        String country=scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

    }
}
