package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score =101;
        String result ="";
        if(score>=0 &&score<=100){
            if (score>=90){//false: Score<90
                result="Excellent";
                //System.out.println("Excellent");
            }else if(score>=80) {//false: Score<80
                result="Great";
                //System.out.println("Great");
            }else if(score>=70){
                result="Good";
                //System.out.println("Good");
            }else if(score>=60){
                result="Passed";
                //System.out.println("Passed");
            }else{
                result="Failed";
                //System.out.println("Failed");
            }


        }else{
            result="Invalid score";
            //System.out.println("Invalid score");
    }
        System.out.println("Result = "+ result);
}
}
