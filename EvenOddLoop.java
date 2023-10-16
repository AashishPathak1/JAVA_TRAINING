import java.util.Scanner;

public class EvenOddLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even" + i);

            } else {
                System.out.println("Odd" + i);
            }
        }
        sc.close();
    }
}
