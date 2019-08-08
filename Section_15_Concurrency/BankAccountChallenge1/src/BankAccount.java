import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double initialBalance, ReentrantLock reentrantLock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = reentrantLock;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Can't access lock");
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Transaction status : " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Can't access lock");
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Transaction status : " + status);

    }

    public void printAccountNumber() {
        System.out.println("Account number : " + accountNumber);
    }
}
