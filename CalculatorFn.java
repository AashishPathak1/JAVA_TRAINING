import java.util.Scanner;

public class CalculatorFn {

  static void calculate(int num, int n1, int n2) {
    switch (num) {
      case 1:
        System.out.println("The sum of two number is :" + (n1 + n2));
        break;
      case 2:
        System.out.println("The subtraction of two number is :" + (n1 - n2));
        break;
      case 3:
        System.out.println("The division of two number is :" + (n1 / n2));
        break;
      case 4:
        System.out.println("The multiplication of two number is :" + (n1 * n2));
        break;
      default:
        System.out.println("Invalid input!!!!");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE FIRST NUMBER: ");
    int n1 = sc.nextInt();
    System.out.println("ENTER THE SECOND NUMBER: ");
    int n2 = sc.nextInt();
    System.out.println(
      "Choose Operation as follows:\n 1.ADD\n 2.SUBTRACTION\n 3.DIVISON\n 4.MULTIPLICATION"
    );
    int opr = sc.nextInt();
    calculate(opr, n1, n2);
    sc.close();
  }
}
