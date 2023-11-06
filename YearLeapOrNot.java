/* Check whether the year is leap or not */
import java.util.Scanner;

public class YearLeapOrNot {
    static void Leap(int num) {

        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println("THE YEAR IS LEAP YEAR");
        } else {
            System.out.println("GIVEN YEAR IS NOT A LEAP YEAR");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year of your choice:");
        int n = sc.nextInt();
        Leap(n);
        sc.close();
    }
}
