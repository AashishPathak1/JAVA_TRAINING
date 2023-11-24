package Recursion;

import java.util.Scanner;

public class NNaturalSumSum {
    static void returnsum(int n,int sum){//n is for number 
    if (n==0) {
        System.out.println("sum:"+sum);
        return;
    } 
    sum +=n;
    returnsum(n-1, sum);
    }


    // static int returnsum1(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n+returnsum1(n-1)
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number as a limit:");
        int n = sc.nextInt();
        int sum =0;
        returnsum(n, sum);
        //for integer
        // int res1 = returnsum1(n);
        // System.out.println("Sum:"+res1);
    }
}
