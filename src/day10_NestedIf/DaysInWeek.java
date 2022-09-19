package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 4;

        String daysinweek= (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday":(n==4)? "Thursday"
                :(n==5)?"Friday":(n==6)?"Saturday":"Sunday";
        System.out.println(daysinweek);

        /*if (number == 1) {
            day= "Monday";
        } else if (number == 2) {
            day="Tuesday";
        } else if (number == 3) {
            day="Wednesday";
        } else if (number == 4) {
            day="Thursday";
        } else if (number == 5) {
            day="Friday";
        } else if (number == 6) {
            day="Saturday";
        } else {
            day="Sunday";
        }
        System.out.println("Day ="+ day);*/
    }
}
