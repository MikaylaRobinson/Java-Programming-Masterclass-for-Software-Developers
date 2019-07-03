public class Main {

    public static void main(String[] args) {
	// write your code here


        Bank bank = new Bank("FakeBank");

        bank.addBranch("Brooklyn");
        bank.addCustomer("Brooklyn", "Mikayla", 200.1);
        bank.addCustomer("Brooklyn", "Brian", 100.5);
        bank.addCustomer("Brooklyn", "KitKat", 20.2);

        bank.addBranch("Columbus");
        bank.addCustomer("Columbus", "Stephanie", 300.3);
        bank.addCustomer("Columbus", "Justin", 300.2);

        bank.addAnotherTransaction("Brooklyn", "Mikayla", 100.50);
        bank.addAnotherTransaction("Columbus", "Stephanie", 50.5);

        // Testing when branch does not exist
        bank.addAnotherTransaction("wdnjwdn", "Mikayla", 60.0);

        // When customer does not exist
        bank.addAnotherTransaction("Brooklyn", "Stephanie", 90.0);


        bank.printCustomerList("Brooklyn");
    }
}
