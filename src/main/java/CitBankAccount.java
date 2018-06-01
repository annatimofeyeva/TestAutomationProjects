public class CitBankAccount extends BankAccountSimple {
    // Constructor
    public CitBankAccount(int accountNumber, double balance, String customerName) {
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) {
        CitBankAccount account1 = new CitBankAccount(1111, 2000, "Anna");
        CitBankAccount account2 = new CitBankAccount(1111, 3000, "Alla");
        CitBankAccount account3 = new CitBankAccount(1111, 4000, "Lynn");
        CitBankAccount account4 = new CitBankAccount(1111, 5000, "Emily");
        CitBankAccount account5 = new CitBankAccount(1111, 6000, "Alena");

        CitBankAccount[] accounts = new CitBankAccount[5];

        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        accounts[4] = account5;

        String customer3name = accounts[3].getCustomerName();
        System.out.println(customer3name);

        double totalsum = 0.00;

        for (int i = 0; i < accounts.length; i++) {
//            accounts[i].getBalance();
            double x = accounts[i].getBalance();
//            System.out.println(x);
            totalsum = totalsum + x;
            if (i >= 4) {
                System.out.println(totalsum);
            }
        }
    }
}