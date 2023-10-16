import java.util.Scanner;

public class SeasonOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any month number");
        int m = sc.nextInt();
        switch (m) {
            case 12:
            case 1:
            case 2:
                System.out.println("WINTER");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("SPRING");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("FALL");
                break;

            default:
                System.out.println("WRONG");
                break;
        }
        sc.close();
    }
}
