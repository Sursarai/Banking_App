
public abstract class Account {

    private double balance;
    private String name;
    private String typeAcc;
    private int id;
    private static int idCounter;

    public Account(String name, String typeAcc){
        this.name = name;
        this.typeAcc = typeAcc;
        this.id = idCounter; // each time an account is made, auto-generate the id.
        idCounter++;
    }

    public void displayMenu(){
        System.out.println("Here are your options: ");
        System.out.println("1. Check account balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. View Previous Transaction");
    }

}
