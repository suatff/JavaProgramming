package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n= 100;
        if(n%2==0){
            System.out.println("Even");//String
        }else {
            System.out.println("Odd");//String
        }

        System.out.println("----------------------------------");

        //Ternaries


       String result1= (n%2==0)?"Even": "Odd";
        System.out.println(result1);


        System.out.println("--------------------");
        int age=23;
        if(age>21){
            System.out.println("Eligible");//String
        }else {
            System.out.println("Not Eligible");//String
        }
        System.out.println("------------");

        String result3=(age>=21)?"Eligible" :"Not Eligible";
        System.out.println(result3);


        System.out.println("-------------------");

        int number =100;
        String result2 = (number>0)? "Positive":(number<0)? "Negative":"Zero";
        System.out.println(result2);

    }
}
