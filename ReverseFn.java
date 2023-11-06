import java.util.Scanner;

public class ReverseFn {
    static int REV(int num) {
        int rev = 0, rem;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int num = sc.nextInt();
        int res1 = REV(num);
        System.out.println("REVERSE OF THE NUM IS : " + res1);
        sc.close();
    }
}
