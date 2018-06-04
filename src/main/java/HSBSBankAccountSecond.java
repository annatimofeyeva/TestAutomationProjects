public class HSBSBankAccountSecond implements BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;

    public HSBSBankAccountSecond(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {
        HSBSBankAccountSecond hsbs1 =
                new HSBSBankAccountSecond(111, 5000, "John");
        HSBSBankAccountSecond hsbs2 =
                new HSBSBankAccountSecond(222, 6000, "Mary");
        HSBSBankAccountSecond hsbs3 =
                new HSBSBankAccountSecond(333, 7000, "Steve");
        HSBSBankAccountSecond hsbs4 =
                new HSBSBankAccountSecond(444, 8000, "Mike");
        HSBSBankAccountSecond hsbs5 =
                new HSBSBankAccountSecond(555, 9000, "Emily");


        BankAccount[] allHsbsAccounts = {hsbs1, hsbs2, hsbs3, hsbs4, hsbs5};
        String name = allHsbsAccounts[3].getCustomerName();
        System.out.println("Customer name  of third index: " + name);
        System.out.println("Customer 4 account number: " + allHsbsAccounts[3].getAccountNumber());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double withDraw(double amount) {
        return balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount + 200;
    }
}
