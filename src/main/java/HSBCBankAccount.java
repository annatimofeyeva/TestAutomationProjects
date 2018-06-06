/**
 * HSBCBankAccount class include information about customer's accounts, such as
 * account number, customer name, balance etc
 */
public class HSBCBankAccount extends BankAccountSimple {

    /**
     * Contsructor for the class inherits the BankAccountSimple
     * Constructor
     * <p>
     * accountNumber is Unique for every Customer
     * balance will give current money of each account
     * customer name provide the name of each customer
     *
     * @param accountNumber
     * @param balance
     * @param customerName
     */
    public HSBCBankAccount(int accountNumber, double balance, String customerName) {
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) {
        HSBCBankAccount account1 = new HSBCBankAccount(1111, 1000, "Anna");
        HSBCBankAccount account2 = new HSBCBankAccount(2222, 2000, "Alla");
        HSBCBankAccount account3 = new HSBCBankAccount(3333, 3000, "Steve");
        HSBCBankAccount account4 = new HSBCBankAccount(4444, 4000, "John");
        HSBCBankAccount account5 = new HSBCBankAccount(5555, 5000, "Donald");

        HSBCBankAccount[] accounts = new HSBCBankAccount[5];
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        accounts[4] = account5;

        double sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            double balanceOfEachPerson = accounts[i].getBalance();
            sum = sum + balanceOfEachPerson;
        }
        System.out.println("Total balance of all accounts is: " + sum);
    }
}

