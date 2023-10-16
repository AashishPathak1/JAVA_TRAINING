import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()
        for (int index = 1; index <=n; index++) {
            for (int j = 1; j <=index; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
