import java.util.Scanner;

public class PrimeFnRange {
    static void prime_num(int limit) {
        System.out.println("The Prime Number between the range from 2 to " + limit + " is");
        for (int i = 2; i <= limit; i++) {
            int prime = 0;
            for (int j = 2; j <= (i - 1); j++) {
                if (i % j == 0) {
                    prime = 1;
                    break;
                }
            }
            if (prime == 0) {
                System.out.print("   " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int limit = sc.nextInt();
        prime_num(limit);
        sc.close();
    }
}
