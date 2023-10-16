import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r1 = sc.nextInt();
        System.out.println("Area Of Circle" + 3.14 * r1 * r1);
        sc.close();
    }

}
