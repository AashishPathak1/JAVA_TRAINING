import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = new1.nextInt();
        System.out.println("Enter the second number");
        int n2 = new1.nextInt();
        System.out.println("Enter the second number");
        int n3 = new1.nextInt();
        int input1 = n3 > (n1 > n2 ? n1 : n2) ? n3 : ((n1 > n2) ? n1 : n2);
        System.out.println(input1);
        new1.close();
    }
}
