//import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of your choice");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num=1234;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        //sc.close();
        System.out.println("Number of digits: " + count);
    }
}
