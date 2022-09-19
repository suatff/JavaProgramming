package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name ="Suat";
        int age =20;
        String citizen = "USA";

        boolean isEligible = age>=18 && citizen=="USA";

        if(isEligible){
            System.out.println(name+" is eligible to vote.");
        }else{
            System.out.println(name+"is not eligible to vote");
        }
    }
}
