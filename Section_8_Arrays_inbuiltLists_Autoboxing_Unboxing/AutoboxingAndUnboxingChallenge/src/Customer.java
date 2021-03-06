import java.util.ArrayList;

public class Customer {

    private String name;
    // This project uses autoboxing and unboxing which is the conversion between
    // primitive types like double to their object wrapper classes like Double.
    private ArrayList<Double> TransactionList = new ArrayList<Double>();

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.TransactionList = new ArrayList<Double>();
        addTransaction(initialDeposit);
    }

    public void addTransaction(double amount) {
        TransactionList.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return TransactionList;
    }
}
