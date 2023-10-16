import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter amout available as a balance");
        float balance = 50000;//sc.nextFloat();
        System.out.println("1.Deposit \n2.Withdraw \n3.Total Balance\n");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount you want to Deposit ");
                float amt = sc.nextFloat();
                System.out.println("Total amout in your bank is" + (amt + balance));
                balance += amt;
                break;

            case 2:
                System.out.println("Enter the amount you want to withdraw ");
                float amt2 = sc.nextFloat();
                if (amt2 > balance) {
                    System.out.println("You have INSUFFICIENT amount in your bank !!!");
                } else {
                    System.out.println("Your Transaction is SUCCESSFUL!!");
                    System.out.println("AVAILABLE AMOUNT " + (balance - amt2));
                    balance -= amt2;
                }
                break;

            case 3:
                System.out.println("TOTAL BALANCE IN ACCOUNT IS :" + balance);
                break;

            default:
                System.out.println("You have entered a wrong choice");
                break;
        }
        sc.close();
    }
}
