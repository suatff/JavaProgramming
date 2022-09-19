package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade =5;
        String location="";
        int groupNumber =0;
        String teacher ="";
        if(grade>=1 && grade<=6){
            if (grade==1) {
                location="Apple orchard";
                groupNumber= 3;
                teacher ="Ms. Smith";
            }else if(grade==2) {
                location="Zoo";
                groupNumber=7;
                teacher="Mr. Lee";
            }else if(grade==3){
                location="Aquarium";
                groupNumber=5;
                teacher="Ms. Wilson";
            }else if(grade==4){
                location="Movie theater";
                groupNumber=2;
                teacher="Ms. Reyes";
            }else if(grade==5) {
                location="Shopping center";
                groupNumber=1;
                teacher="Mr. Suat";
            }else{
                location="School";
                groupNumber=8 ;
                teacher="Mr.Kerim";
            }


        }else {
            System.out.println("Invalid Grade");
        }

        System.out.println("location - "+ location+"\nnumbers of groups - "+groupNumber+"\nteacher - "+ teacher);
}}

