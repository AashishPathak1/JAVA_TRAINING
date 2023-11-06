import java.util.Scanner;
public class SumPsum {
  static void SumP(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += power(i, (i + 1));
    }
    System.out.println(sum);
  }
  static int power(int b, int e) {
    int pow = 1;
    for (int i = 1; i <= e; i++) {
      pow *= b;
    }
    return pow;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    SumP(num);
    sc.close();
  }
}
