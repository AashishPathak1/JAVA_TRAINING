import java.util.Scanner;

public class FibonacciFn {
    static int FIB(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        else
            return (FIB(num - 1) + FIB(num - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TERMS:");
        int num = sc.nextInt();
        System.out.println("FIBPNACCI SERIES IS:");
        for (int i = 0; i < num; i++) {
            System.out.println(FIB(i));
        }
        sc.close();
    }
}