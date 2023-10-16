import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int num = value.nextInt();
        int rem, rev = 0, temp;
        value.close();
        temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if (temp == rev)
            System.out.println("YES IT IS A PALINDROME NUMBER");
        else
            System.out.println("NO IT IS NOT A PALINDROME NUMBER");
    }
}