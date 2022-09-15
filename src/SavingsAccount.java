import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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

//    public double getInterestRate(){
//        URL url = null;
//        try {
//            url = new URL("https://api.api-ninjas.com/v1/interestrate");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Request setup
//            connection.setRequestProperty("accept", "application/json");
//
////            InputStream responseStream = connection.getInputStream();
////            ObjectMapper mapper = new ObjectMapper();
////            JsonNode root = mapper.readTree(responseStream);
////            System.out.println(root.path("fact").asText());
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return 0.0;
//    }


    public String getInterestRate(){
        // per year
        double interestRate = 1.75;
        double interestBalance = this.getBalance()*(interestRate/100)*5;
        return "The current interest rate is " + interestRate + "%. Based on the current balance on your account," +
                " the interest you earn over 5 years will be: $" + String.format("%.2f",interestBalance) + "\n";


    }
}
