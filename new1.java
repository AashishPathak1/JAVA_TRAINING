import java.util.Scanner;

public class new1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int M =input.nextInt();
        input.close();
        if((M%3==0) && (M%5==0))
            System.out.println("Good Number");
        else if((M%3==0) && (M%5!=0))
            System.out.println("Bad Number");
        else if((M%3!=0) && (M%5==0))
            System.out.println("Poor Number");
        else
            System.out.println("-1");
    }
}
