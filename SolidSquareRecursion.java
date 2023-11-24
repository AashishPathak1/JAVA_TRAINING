package Recursion;

import java.util.Scanner;

public class SolidSquare {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the square: ");
    int Length = scanner.nextInt();
    printSquare(Length);
  }

  static void printSquare(int Length) {
    if (Length <= 0) {
      System.out.println("length must be a positive integer.");
      return;
    }

    printSolidSquare(Length, Length);
  }

  static void printSolidSquare(int original, int current) {
    if (current == 0) {
      return;
    }

    for (int i = 1; i <= original; i++) {
      System.out.print("* ");
    }

    System.out.println();
    printSolidSquare(original, current - 1);
  }
}
