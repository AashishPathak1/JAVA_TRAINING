/*Find out entered number is Positive or Negative Number.*/

import java.util.Scanner;

public class PosNeg {
    static void check_num(int num){
        if(num>0){
            System.out.println("NUMBER IS POSITIVE");
        }
        else{
            System.out.println("NUMBER IS NEGATIVE");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        check_num(num);
        sc.close();
    }
}
