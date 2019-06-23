public class Main {

    public static void main(String[] args) {
        BankAccount exampleAccount = new BankAccount();
        System.out.println(exampleAccount.getAccountNumber());
        System.out.println(exampleAccount.getBalance());

        exampleAccount.deposit(150.0);
        exampleAccount.withdrawal(100.00);

        BankAccount test2Account = new BankAccount("Test2", "test2@test.com", "123456789");
        System.out.println(test2Account.getAccountNumber() + " name " + test2Account.getCustomerName());

        VipCustomer testVIP = new VipCustomer();
        System.out.println(testVIP.getName() + testVIP.getCreditLimit());

        VipCustomer testVIP2 = new VipCustomer("VIP", "VIP@test.com");
        System.out.println(testVIP2.getName() + testVIP2.getCreditLimit());

        VipCustomer testVIP3 = new VipCustomer("vip3", 2000, "vip3Etest.com");
        System.out.println(testVIP3.getName() + testVIP3.getCreditLimit() + testVIP3.getEmailAddress());

    }
}
