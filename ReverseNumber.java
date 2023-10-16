//public class  {
    import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int num = value.nextInt();
        int rem, rev = 0;
        value.close();
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }
    
}
