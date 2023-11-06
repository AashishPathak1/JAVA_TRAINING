import java.util.Scanner;

public class Numbers {

  static void result(int num) {
    int num_copy = REV(num);
    int num_copy1 = 1;
    while (num_copy > 0) {
      num_copy1 = num_copy % 10;
      System.out.println(num_copy1);
      num_copy /= 10;
    }
  }

  static int REV(int num1) {
    int rev = 0, rem;
    while (num1 > 0) {
      rem = num1 % 10;
      rev = (rev * 10) + rem;
      num1 = num1 / 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int n = sc.nextInt();
    result(n);
    sc.close();
  }
}
