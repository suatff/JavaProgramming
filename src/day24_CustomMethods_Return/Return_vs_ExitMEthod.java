package day24_CustomMethods_Return;

public class Return_vs_ExitMEthod {

    public static void main(String[] args) {
        months(50);
        System.out.println("Hello World");

    }

    public static void months(int num){

        if(num<1 || num>12){
            System.out.println("Invalid");
           // return;
            System.exit(0);
        }


        String name=(num==1)? "Jan":(num==2)?"Feb":(num==3)?
                "March":(num==4)?"April":(num==5)?"Maj":(num==6)?
                "June":(num==7)?"July" :(num==8)?"August":(num==9)?
                "Sep":(num==10)?"Oct":(num==11)?"Nov":"Dec";
        System.out.println("Month name= "+ name);
    }
}
