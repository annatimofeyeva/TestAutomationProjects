// parent class - super class

import java.sql.SQLOutput;

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

    public double withDraw(double amount) throws MinimumBalanceNotMaintainedException {


        if (balance >= 500 + amount) {
            return balance = balance - amount;
        } else {
            MinimumBalanceNotMaintainedException minbalance =
                    new MinimumBalanceNotMaintainedException();
            throw minbalance;
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
}


