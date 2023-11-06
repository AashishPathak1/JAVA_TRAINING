package Function;

import java.util.Scanner;

public class VowelChecker {
    public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any character:");
    char ch = sc.next().charAt(0);
    if (isVowel(ch)) {
      System.out.println(ch + " is a vowel.");
    } else {
      System.out.println(ch + " is not a vowel.");
    }
  }
}
