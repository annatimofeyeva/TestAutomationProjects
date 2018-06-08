/**
 * CitiBankAccountSecond - class, that implements BankAccount interface and
 * have an array of objects of both CitiBankAccountSecond and HSBSBankAccountSecond classes
 */
public class CitiBankAccountSecond implements BankAccount {
    /**
     * accountNumber - is the unique number of each customer account
     */
    private int accountNumber;
    /**
     * balance will give current money of each account
     */
    private double balance;
    private String customerName;

    /**
     * Consructor for the CitiBankAccountSecond class
     *
     * @param accountNumber
     * @param balance
     * @param customerName
     */
    public CitiBankAccountSecond(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {

        BankAccount citi1 =
                new CitiBankAccountSecond(111, 1, "Alla");
        BankAccount citi2 =
                new CitiBankAccountSecond(222, 1, "Anna");
        BankAccount citi3 =
                new CitiBankAccountSecond(333, 1, "Steve");
        BankAccount citi4 =
                new CitiBankAccountSecond(444, 1, "Mila");
        BankAccount citi5 =
                new CitiBankAccountSecond(555, 1, "Nicole");

        BankAccount hsbs1 =
                new HSBSBankAccountSecond(666, 1, "Daniel");
        BankAccount hsbs2 =
                new HSBSBankAccountSecond(777, 1, "Gabriel");
        BankAccount hsbs3 =
                new HSBSBankAccountSecond(888, 1, "Harry");
        BankAccount hsbs4 =
                new HSBSBankAccountSecond(999, 1, "Albert");
        BankAccount hsbs5 =
                new HSBSBankAccountSecond(1000, 1, "Bryan");

        BankAccount[] allCitiAccounts =
                {citi1, citi2, citi3, citi4, citi5, hsbs1, hsbs2, hsbs3, hsbs4, hsbs5};
        String name = allCitiAccounts[2].getCustomerName();
        System.out.println("Customer name of HSBS class (index2) is: " + name);

        double totalSum = 0.0;

        for (int i = 0; i < allCitiAccounts.length; i++) {
            double balanceOfEachPerson = allCitiAccounts[i].getBalance();
            totalSum = totalSum + balanceOfEachPerson;
        }
        System.out.println("Total balance is: " + totalSum);
    } // end of main

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * getAccountNumber displats current balance of an account
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * getCustomerName displays current customer name
     *
     * @return
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * withDraw method which allow customer to withdraw money
     *
     * @param amount
     * @return
     */
    public double withDraw(double amount) {
        return balance - amount;
    }

    /**
     * Deposit method
     *
     * @param amount
     */
    public void deposit(double amount) {
        balance = balance + amount + 100;
    }
}
