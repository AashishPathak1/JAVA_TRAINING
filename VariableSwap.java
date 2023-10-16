import java.util.Scanner;

public class VariableSwap {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = new1.nextInt();
        System.out.println("Enter the second number");
        int n2 = new1.nextInt();
        System.out.println("before swapping");
        System.out.println(n1);
        System.out.println(n2);
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("after swapping");
        System.out.println(n1);
        System.out.println(n2);
        new1.close();

    }
}
