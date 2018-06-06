// parent class - super class

public class BankAccountSimple {

    protected int accountNumber;
    protected double balance;
    protected String customerName;

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

    public double withDraw(double amount) {
        return balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
}
