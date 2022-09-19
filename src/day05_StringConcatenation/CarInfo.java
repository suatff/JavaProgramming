package day05_StringConcatenation;

public class CarInfo {
    public static void main(String[] args) {
        String year = "2017",
                make = "Lexus",
                model = "CT-200h",
                miles = "72000 km",
                color = "Black",
                price = "190000:-";

        String carInfo = year + " " + make + " " + model + ", " + miles + ", " + color + ", " + price + ".";
        System.out.println(carInfo);
    }

}
