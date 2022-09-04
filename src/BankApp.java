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
        Account a1;
        if(type ==1){
            a1 = new SavingsAccount(name, "Savings");
        }
        else{
            a1 = new ChequingAccount(name, "Chequing");
        }

        a1.displayMenu();




    }



}
