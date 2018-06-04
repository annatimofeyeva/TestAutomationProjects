public interface BankAccount {
    public int getAccountNumber();
    public double getBalance();
    public String getCustomerName();
    public double withDraw(double amount);
    public void deposit(double amount);
}
