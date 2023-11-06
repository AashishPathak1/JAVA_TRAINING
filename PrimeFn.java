import java.util.Scanner;

public class PrimeFn {
    static void prime_num(int num) {
        int prime = 0;
        for (int i = 2; i <= (num - 1); i++)
            if (num % i == 0) {
                prime = 1;
                break;
            }
        if (prime == 0) {
            System.out.println("This is a Prime Number");
        } else {
            System.out.println("This is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        prime_num(num);
        sc.close();
    }
}
