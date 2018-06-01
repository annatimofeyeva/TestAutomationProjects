public class BankAccountSimple {

    private int accountNumber;
    private double balance;
    private String customerName;

    public BankAccountSimple(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
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

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void withDraw(double amount) {
        balance = balance - amount;
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return amount;
    }
}
