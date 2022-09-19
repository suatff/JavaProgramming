package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        String result;
        boolean a = score>=90 && score<=100;
        boolean b = score>=80 && score<=89; //boolean b=score>=80 && !a;
        boolean c = score>=70 && score<=79;
        boolean d = score>=60 && score<=69;
        boolean f = score>=0 && score<=59;

        if(a) {
            result="Excellent";}
        else if(b) {
            result="Great";
        }else if(c){
            result="Good";
        }else if (d){
            result="Pass";
        }else{
            result="Failed";
        }
        System.out.println("result =" + result);
    }
}
