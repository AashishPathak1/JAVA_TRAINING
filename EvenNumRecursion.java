package Recursion;

public class EvenNumRecursion {
    static void printevenodd (int num)
    {
        if (num==0) {
            return;
        }
        printevenodd(num-1);
        if (num%2==0) {
            System.out.println(num);

        }
       // System.out.println(num);

    }

    public static void main(String[] args) {
        printevenodd(10);
    }
}
