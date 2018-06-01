public class BankAccountSimple {

    private int accountNumber;
    private double balance;
    private String customerName;

    public BankAccountSimple(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }
    public void withDraw(double amount) {
        balance = balance - amount;
    }
    public double deposit(double amount) {
        balance = balance + amount;
        return amount;
    }
    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }
}
