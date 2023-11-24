package Recursion;

public class EvenNum {
    static void printeven (int num)
    {
        if (num==0) {
            return;
        }
        printeven(num-1);
        if (num%2==0) {
            System.out.println(num);

        }
       // System.out.println(num);

    }

    public static void main(String[] args) {
        printeven(10);
    }
}
