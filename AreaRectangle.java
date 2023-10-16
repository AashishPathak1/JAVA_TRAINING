import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the length");
        int n1 = sc.nextInt();
        System.out.println("Enter the Breadth");
        int n2 = sc.nextInt();

        System.out.println("Area of rectangle is :" + n1 * n2);
        sc.close();
    }
}
