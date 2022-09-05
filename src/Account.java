


public abstract class Account {

    private double balance;
    private String name;
    private String typeAcc;
    private int id;
    private static int idCounter;
    private String status;

    public Account(String name, String typeAcc){
        this.name = name;
        this.typeAcc = typeAcc;
        this.id = idCounter; // each time an account is made, auto-generate the id.
        idCounter++;
        status = "";
    }

    public double getBalance() {
        return balance;
    }

    public void displayMenu(){
        System.out.println("Here are your options: ");
        System.out.println("1. Check account balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. View Previous Transaction");
        System.out.println("5. Exit");
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("Sorry invalid amount!\n");
        }
        else{
            balance+=amount;
            status ="Previous Transaction: Deposited $" + String.format("%.2f", amount);

        }
    }

    public void withdraw(double amount){
        if(amount<0){
            System.out.println("Sorry invalid amount!\n");
        }
        else if(amount>balance){
            System.out.println("Sorry you do not have enough to withdraw!\n");
        }
        else{
            balance-=amount;
            status ="Previous Transaction: Withdrawn $" + String.format("%.2f", amount);
        }
    }

    public String viewPrevTransaction(){
        if (status.isEmpty()){
            status = "No transactions made.";
        }
       return status;
    }






}
