import java.util.Scanner;

public class FactorialFn {
    static long FACT(int num) {

        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * FACT(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for the negative number");
        } else {
            long res1 = FACT(num);
            System.out.println("The factorial of " + num + " is :" + res1);
        }
        sc.close();
    }
}
