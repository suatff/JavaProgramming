package day17_While_DoWhile;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String str="JavaJavaJavaJavaJavaJavaJavaJava";

        int frequency= 0;
//                                  8-4
        for (int i = 0; i < str.length()-3; i++) {
            String eachSub= str.substring(i, i+4);
            //System.out.println(eachSub);
            if(eachSub.equals("Java")){
                frequency ++;
            }

        }
        System.out.println(frequency);
    }
}
