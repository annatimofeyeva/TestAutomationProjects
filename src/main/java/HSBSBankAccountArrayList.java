public class HSBSBankAccountArrayList extends BankAccountSimple implements BankAccount{

    private int accountNumber;
    private double balance;
    private String customerName;

    public HSBSBankAccountArrayList(int accountNumber, double balance, String customerName) {
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) {
        HSBSBankAccountArrayList hsbs1 =
                new HSBSBankAccountArrayList(111, 5000, "John");
        HSBSBankAccountArrayList hsbs2 =
                new HSBSBankAccountArrayList(222, 6000, "Mary");
        HSBSBankAccountArrayList hsbs3 =
                new HSBSBankAccountArrayList(333, 7000, "Steve");
        HSBSBankAccountArrayList hsbs4 =
                new HSBSBankAccountArrayList(444, 8000, "Mike");
        HSBSBankAccountArrayList hsbs5 =
                new HSBSBankAccountArrayList(555, 9000, "Emily");



    } //end of main

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
        return balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
}
