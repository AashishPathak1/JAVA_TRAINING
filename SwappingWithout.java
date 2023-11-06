import java.util.Scanner;

public class SwappingWithout {

    static void Swap(int n1, int n2) {
        int x1 = n1;
        int x2 = n2;
        System.out.println("Before Swapping :" + x1 + " " + x2);
        x1 = x1 + x2;
        x2 = x1 - x2;
        x1 = x1 - x2;
        System.out.println("AFTER Swapping :" + x1 + " " + x2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Swap(n1, n2);
        sc.close();
    }
}
