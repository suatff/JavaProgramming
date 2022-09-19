package day24_CustomMethods_Return;

public class WarmUpTasks {
    public static void main(String[] args) {
        initialsOfPerson("Suat","Özcelik");
        domainOfMail("suat.ozcelik@gmail.com");

        System.out.println("-------");

        String[] emails={"josh@gmail.com", "jim@yahoo.com", "suat@cydeo.com"};
        for (String email:emails){
            domainOfMail(email);
        }
        months(4);
        day(5);

    }

   // 1. Create a method that can display the initials of the person
public static void initialsOfPerson(String firstName, String lastName){

        String initials= firstName.charAt(0)+"."+ lastName.charAt(0);
        initials=initials.toUpperCase();
    System.out.println("initial= "+ initials);

}

//2. Create a method that can display the domain of the email
public static void domainOfMail(String email){
        String domainOfMail= email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("Domain: "+ domainOfMail);
}

//3. Create a method that can display the name of the month based on the given number to the method
public static void months(int num){
        String name="";
        if(num>=1 && num<=12){
            name=(num==1)? "Jan":(num==2)?"Feb":(num==3)?
                    "March":(num==4)?"April":(num==5)?"Maj":(num==6)?
                    "June":(num==7)?"July" :(num==8)?"August":(num==9)?
                    "Sep":(num==10)?"Oct":(num==11)?"Nov":"Dec";
        }else {name="Invalid";}

    System.out.println("Month name = " + name);
}


//4. Create a method that can print the name of the day based on the given number to the method
public static void day(int num){
    String name="";
    if(num>=1 && num<=7){
        name=(num==1)? "Mon":(num==2)?"Tue":(num==3)?
                "Wed":(num==4)?"Thur":(num==5)?"Fri":(num==6)?
                "Sat":"Sun";
    }else {name="Invalid";}

    System.out.println("Day name = " + name);}


//5. Create a method that can print how many days a month has


}