package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if(i=='C'){
                continue;
            }
            System.out.println(i);

        }

        for (int a = 1; a <11 ; a++) {
            if(a%2==0){
                continue;
            }
            System.out.println(a);

        }

        }
    }

