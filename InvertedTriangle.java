import java.util.Scanner;

public class InvertedTriangle {
    
    public static void main(String[] args) {
        System.out.println("Enter a limit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = i; j <=num; j++) {
                System.out.print("*");  
            }
            System.out.println();
        }
        sc.close();
    }
    
}
