import java.util.Scanner;

public class DigitSumFn {
    static int SOD(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int value = sc.nextInt();
        int result = SOD(value);
        System.out.println("The sum of the digits is:  " + result);
        sc.close();
    }
}
