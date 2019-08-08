import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ReentrantLock rlock = new ReentrantLock();
        BankAccount account = new BankAccount("12345-678", 1000.00, rlock);

        Thread user1 = new Thread() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        };

        Thread user2 = new Thread() {
            @Override
            public void run() {
                account.withdraw(100.00);
                account.deposit(203.75);
            }
        };

        user1.start();
        user2.start();
    }
}
