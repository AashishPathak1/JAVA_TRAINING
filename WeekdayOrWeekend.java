import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a day:");
        System.out.print("1.Sunday\n 2.Monday\n 3.Tuesday\n 4.Wednesday\n 5.Thursday\n 6.Friday\n 7.Saturday");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("This day is weekend day");
                break;
            case 2:
                System.out.println("This day is Weekday day");
                break;
            case 3:
                System.out.println("This day is Weekday day");
                break;
            case 4:
                System.out.println("This day is Weekday day");
                break;
            case 5:
                System.out.println("This day is Weekday day");
                break;
            case 6:
                System.out.println("This day is Weekday day");
                break;
            case 7:
                System.out.println("This day is weekend day");
                break;
            default:
                break;
        }
        sc.close();
    }
}
