import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        System.out.println((n % 2 == 0) ? "even" : "odd");
        sc.close();
    }

}
