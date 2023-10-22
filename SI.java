import java.util.Scanner;

public class SI {

    static Float SimpleI(float p, float r, float t) {
        return ((p * r * t) / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amout:");
        float p = sc.nextFloat();
        System.out.println("Enter rate of Interest amout:");
        float r = sc.nextFloat();
        System.out.println("Enter time amout:");
        float t = sc.nextFloat();
        float result = SimpleI(p, r, t);
        System.out.println(result);
    }

}
