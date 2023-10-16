import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a Color Transition");
        System.out.print("1.Red\n 2.Yellow\n 3.Green\n");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("YELLOW");
                break;
            case 2:
                System.out.println("GREEN");
                break;

            case 3:
                System.out.println("YELLOW");
                break;

            default:
                System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
                break;
        }
        sc.close();
    }
}
