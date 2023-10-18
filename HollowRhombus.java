
import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int index = 1; index <= num; index++) {
            for (int j = num; j >=index; j--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= num; p++) {
                if (index == 1 || index == num || p == 1 || p == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}

