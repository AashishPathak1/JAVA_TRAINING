import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Enter any operation");
        System.out.print("\n1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("the result of Addition is :" + (n1 + n2));
                break;

            case 2:
                System.out.println("the result of Subtraction is :" + (n1 - n2));
                break;
            case 3:
                System.out.println("the result of Multiplication is :" + (n1 * n2));
                break;
            case 4:
                System.out.println("the result of Divison is :" + (n1 / n2));
                break;

            default:
                System.out.println("You have entered a wrong choice");
                break;
        }
        sc.close();
    }
}
