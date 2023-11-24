package Recursion;
import java.util.Scanner;
public class HollowSquare{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        int Length = scanner.nextInt();
        printHollowSquare(Length,Length);
    }
    static void printHollowSquare(int Length) {
        if (Length <= 0) {
            System.out.println("Length must be a positive integer.");
            return;
        }

        printHollowSquare(Length,Length);
    }
    static void printHollowSquare(int original, int current) {
        if (current == 0) {
            return;
        }

        for (int i = 1; i <= original; i++) {
            if (i == 1 || i == original || current == 1 || current == original) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }

        System.out.println();
        printHollowSquare(original, current - 1);
    }
}
