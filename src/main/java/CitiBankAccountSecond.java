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

        CitiBankAccountSecond citi1 = new CitiBankAccountSecond(111, 2000, "Alla");
        CitiBankAccountSecond citi2 = new CitiBankAccountSecond(222, 2000, "Anna");
        CitiBankAccountSecond citi3 = new CitiBankAccountSecond(333, 2000, "Steve");
        CitiBankAccountSecond citi4 = new CitiBankAccountSecond(444, 2000, "Natasha");
        CitiBankAccountSecond citi5 = new CitiBankAccountSecond(555, 2000, "Nicole");

        HSBSBankAccountSecond hsbs1 = new HSBSBankAccountSecond(999, 3000, "Kirill");

        BankAccount[] allCitiAccounts = {citi1, citi2, citi3, citi3, citi4, citi5, hsbs1};
        String name = allCitiAccounts[6].getCustomerName();
        System.out.println("Customer name of HSBS class (index3) is: " + name);

        double totalSum = 0.0;

        for (int i = 0; i < allCitiAccounts.length; i++) {
            double balanceOfEachPerson = allCitiAccounts[i].getBalance();
            totalSum = totalSum + balanceOfEachPerson;
            if (i >= 6) {
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
