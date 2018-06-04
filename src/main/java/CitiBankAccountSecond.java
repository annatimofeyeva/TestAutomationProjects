public class CitiBankAccountSecond implements BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;

    public CitiBankAccountSecond(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {

        CitiBankAccountSecond citi1 =
                new CitiBankAccountSecond(111, 1, "Alla");
        CitiBankAccountSecond citi2 =
                new CitiBankAccountSecond(222, 1, "Anna");
        CitiBankAccountSecond citi3 =
                new CitiBankAccountSecond(333, 1, "Steve");
        CitiBankAccountSecond citi4 =
                new CitiBankAccountSecond(444, 1, "Mila");
        CitiBankAccountSecond citi5 =
                new CitiBankAccountSecond(555, 1, "Nicole");

        HSBSBankAccountSecond hsbs1 =
                new HSBSBankAccountSecond(666, 1, "Daniel");
        HSBSBankAccountSecond hsbs2 =
                new HSBSBankAccountSecond(777, 1, "Gabriel");
        HSBSBankAccountSecond hsbs3 =
                new HSBSBankAccountSecond(888, 1, "Harry");
        HSBSBankAccountSecond hsbs4 =
                new HSBSBankAccountSecond(999, 1, "Albert");
        HSBSBankAccountSecond hsbs5 =
                new HSBSBankAccountSecond(1000, 1, "Bryan");

        BankAccount[] allCitiAccounts =
                {citi1, citi2, citi3, citi4, citi5, hsbs1, hsbs2, hsbs3, hsbs4, hsbs5};
        String name = allCitiAccounts[2].getCustomerName();
        System.out.println("Customer name of HSBS class (index2) is: " + name);

        double totalSum = 0.0;

        for (int i = 0; i < allCitiAccounts.length; i++) {
            double balanceOfEachPerson = allCitiAccounts[i].getBalance();
            totalSum = totalSum + balanceOfEachPerson;
            if (i >=9) {
                System.out.println("Total balance is: " + totalSum);
            }
        }
    } // end of main

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
        balance = balance + amount + 100;
    }
}
