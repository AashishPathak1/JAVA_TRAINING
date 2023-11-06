import java.util.Scanner;

public class NaturalSum {

  static void Natural(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println("Sum of Natural Series :" + sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit:");
    int limit = sc.nextInt();
    Natural(limit);
    sc.close();
  }
  
}
