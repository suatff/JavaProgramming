package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score=456;
        if(score>=0 && score<=100){
        if(score>60) {

            System.out.println("Passed");
        }else{
        System.out.println("Failed");
    }
            }else {
            System.out.println("invalid");
}
    int age= 56;
        boolean hasId= false;
        if (hasId) {
            if (age>=21) {
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
            System.out.println("You must have an Id to buy alcohol");
        }








    }
}
