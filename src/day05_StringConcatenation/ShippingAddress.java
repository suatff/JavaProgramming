package day05_StringConcatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Suat Özcelik",
                buildningNumber = "Lgh1201",
                streetName = "Moränvägen 3C",
                city = "Borås",
                state = "SE",
                zipCode = "51840";

        //System.out.println(name + "\n" + buildningNumber + " " + streetName + "\n" + city + ", " + state + "-" + zipCode);

        String address = name + "\n" + buildningNumber + " " + streetName + "\n" + city + ", " + state + "-" + zipCode;
        System.out.println(address);




    }
}
