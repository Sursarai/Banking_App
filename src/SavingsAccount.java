public class SavingsAccount extends Account{


    public SavingsAccount(String name, String typeAcc) {
        super(name, typeAcc);
    }

    @Override
    public void displayMenu() {
        super.displayMenu();
        System.out.println("5. Calculate Interest");
    }
}
