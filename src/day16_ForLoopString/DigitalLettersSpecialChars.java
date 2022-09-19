package day16_ForLoopString;

public class DigitalLettersSpecialChars {
    public static void main(String[] args) {

        String str="asdfghjklöä1234567890+!#€%&/()=";
        String digits="";
        String letter="";
        String specialChar="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);


            if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z') ) {
               letter+=ch;
            }else if(ch>='0'&&ch<='9'){
                digits+=ch;
            }else{
                if(ch!= ' ')//If the special character is not space.
                specialChar+=ch;
            }



        }
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);
    }
}
