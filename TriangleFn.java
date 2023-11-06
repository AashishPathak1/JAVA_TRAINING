/*  WAP to check whether the triangle is isosceles , equilateral or scalene. */

import java.util.Scanner;

public class TriangleFn {
    static void TRI(int s1, int s2, int s3) {
        if (s1 == s2 && s2 == s3 && s3 == s1) {
            System.out.println("This traingle is Equilateral Traingle");
        } else if (s1 != s2 && s2 != s3 && s3 != s1) {
            System.out.println("This is the Scalene Triangle");
        } else {
            System.out.println("This traingle is known as Isosceles");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIDES OF TRIANGLE:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        TRI(s1, s2, s3);
        sc.close();
    }
}
