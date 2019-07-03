import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> Branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.Branches = new ArrayList<Branch>();
    }

    // Add new branch
    public void addBranch(String nameOfBranch) {
        if (findBranchPosition(nameOfBranch) >= 0) {
            System.out.println("Branch already exists");
        } else {
            Branches.add(new Branch(nameOfBranch));
        }
    }

    // Add customer to a branch with an initial transaction
    public void addCustomer(String branchName, String customerName, double initialDeposit) {
        if (findBranchPosition(branchName) >= 0) {
            Branch branch = Branches.get(findBranchPosition(branchName));
            branch.addNewCustomer(customerName, initialDeposit);
        } else {
            System.out.println("Branch does not exist");
        }
    }

    // Add transaction to a branch for an existing customer
    public void addAnotherTransaction(String branchName, String customerName, double initialDeposit) {
        if (findBranchPosition(branchName) >= 0) {
            Branch branch = Branches.get(findBranchPosition(branchName));
            branch.addNewTransaction(customerName, initialDeposit);
        } else {
            System.out.println("Branch does not exist");
        }
    }

    // Show list of customers for a certain branch
    public void printCustomerList(String branchName) {
        if (findBranchPosition(branchName) >= 0) {
            Branch branch = Branches.get(findBranchPosition(branchName));
            branch.printCustomers();
        } else {
            System.out.println("Branch does not exist");
        }
    }

    // Find position of branch in arraylist
    public int findBranchPosition(String name) {
        int position = -1;

        for (int i = 0; i < Branches.size(); i++) {
            if (Branches.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                position = i;
                break;
            }
        }
        return position;
    }


}
