
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


}
