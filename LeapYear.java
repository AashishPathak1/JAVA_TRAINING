import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY YEAR");
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println("THE YEAR IS LEAP YEAR");
        } else {
            System.out.println("GIVEN YEAR IS NOT A LEAP YEAR");
        }
        sc.close();
    }
}
