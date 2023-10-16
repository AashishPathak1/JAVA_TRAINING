
import java.util.Scanner;

public class Rhombus2 {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int index = 1; index <= num; index++) {
            for (int j = num; j > index; j--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= num; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
