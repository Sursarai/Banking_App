import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//import com.fasterxml.jackson.databind.ObjectMapper;



public class SavingsAccount extends Account{

    public SavingsAccount(String name, String typeAcc) {
        super(name, typeAcc);
    }

    @Override
    public void displayMenu() {
        System.out.println("Here are your options: ");
        System.out.println("1. Check account balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. View Previous Transaction");
        System.out.println("5. Calculate Interest");
        System.out.println("6. Exit");
    }

    public double getInterestRate(){
        return 0.0;
    }
}
