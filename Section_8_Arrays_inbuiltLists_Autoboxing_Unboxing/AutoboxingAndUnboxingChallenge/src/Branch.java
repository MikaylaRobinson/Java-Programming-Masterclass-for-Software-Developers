import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> CustomerInfo = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
        this.CustomerInfo = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void printCustomers() {
        for (int i = 0; i < CustomerInfo.size(); i++) {
            System.out.println(CustomerInfo.get(i).getName());
        }
    }

    // Add new customer with initial amount deposited
    public void addNewCustomer(String name, double initialDeposit) {
        if (findPosition(name) >= 0) {
            System.out.println("Customer already exists");
        } else {
            CustomerInfo.add(new Customer(name, initialDeposit));
        }
    }

    // Add transaction for existing customer
    public void addNewTransaction(String name, double amount) {
        int position = findPosition(name);
        if (position >= 0) {
            Customer existingCustomer = CustomerInfo.get(position);
            existingCustomer.addTransaction(amount);
            System.out.println(amount + " added to the account for " + name);
        } else {
            System.out.println("Customer does not exist");
        }
    }

    // find position for existing contact
    public int findPosition(String name) {
        int position = -1;

        for (int i = 0; i < CustomerInfo.size(); i++) {
            if (CustomerInfo.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                position = i;
                break;
            }
        }
        return position;
    }
}
