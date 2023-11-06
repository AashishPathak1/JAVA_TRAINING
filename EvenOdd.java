//import java.util.Scanner;

public class EvenOdd {

  static void CheckEO(int n) {
    int num = n;
    System.out.println("Even and Odd Numbers are as follows:");
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 0) {
        System.out.println("Even:\t" + i);
      } else {
        System.out.println("Odd:\t" + i);
      }
    }
  }

  public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    CheckEO(100);
  }
}
