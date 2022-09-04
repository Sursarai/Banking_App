import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter the account type you would like: ");
        System.out.println("1.Savings Account\n2.Chequing Account");
        int type = scan.nextInt();

        if(type ==1){
            Account a1 = new SavingsAccount(name, "Savings");
        }
        else{
            Account a2 = new ChequingAccount(name, "Chequing");
        }



    }



}
