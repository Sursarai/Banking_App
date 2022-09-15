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

        boolean stay = true;
        while(stay){
            a1.displayMenu();
            int option = scan.nextInt();
            switch(option){
                case 1:
                    System.out.println("Your current balance is: $" + String.format("%.2f",a1.getBalance()) + "\n");
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?");
                    double amountD = scan.nextDouble();
                    a1.deposit(amountD);
                    break;

                case 3:
                    System.out.println("How much would you like to withdraw?");
                    double amountW = scan.nextDouble();
                    a1.withdraw(amountW);
                    break;
                case 4:
                    System.out.println(a1.viewPrevTransaction());
                    System.out.println();
                    break;
                case 5:
                    if(a1 instanceof SavingsAccount){
                        System.out.println( ((SavingsAccount) a1).getInterestRate());
                        break;
                    }
                    else{
                        // if chequing account, this is exit
                        stay = false;
                        break;
                    }
                case 6:
                    if(a1 instanceof SavingsAccount){
                        stay = false;
                        break;
                    }
                default:
                    System.out.println("Sorry invalid option. Please try again!");

            }
        }
        System.out.println("Thank you for banking with us!");






    }



}
