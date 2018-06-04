public class TestBankAccountSimple {
    public static void main(String[] args) {

        BankAccountSimple account1 = new BankAccountSimple(1234, 6000, "John");
        double acc = account1.getBalance();
        System.out.println(acc);
        account1.deposit(2000);
        System.out.println("First account balance: " + account1.getBalance());

        BankAccountSimple account2 = new BankAccountSimple(23456, 6000, "Steve");
        BankAccountSimple account3 = new BankAccountSimple(23333, 7000, "Anna");
        BankAccountSimple account4 = new BankAccountSimple(33333, 8000, "Alla");
        BankAccountSimple account5 = new BankAccountSimple(44444, 9000, "Alex");
        BankAccountSimple account6 = new BankAccountSimple(55555, 9500, "Alec");
        BankAccountSimple account7 = new BankAccountSimple(66666, 6000, "Marina");
        BankAccountSimple account8 = new BankAccountSimple(77777, 6000, "Natasha");
        BankAccountSimple account9 = new BankAccountSimple(88888, 6000, "Olena");
        BankAccountSimple account10 = new BankAccountSimple(99999, 6000, "Lynn");

        // creating an array of personal accounts. accounts - name of the array

        BankAccountSimple[] accounts = new BankAccountSimple[10];

        // put in array "account" object accordingly to the index:

        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        accounts[4] = account5;
        accounts[5] = account6;
        accounts[6] = account7;
        accounts[7] = account8;
        accounts[8] = account9;
        accounts[9] = account10;

        System.out.println("Fourth account(account3) balance is: " + accounts[3].getBalance());
        System.out.println("Forth accountHolder name is : " + accounts[3].getCustomerName());
        System.out.println("Forth account number is: " + accounts[3].getAccountNumber());

        //find all accounts with balance more then 5000

        for (int i = 0; i < accounts.length; i++) {
            double x = accounts[i].getBalance(); // each account balance
            if (x > 5000) {
                System.out.println(accounts[i].getCustomerName() + " has the balance: " + accounts[i].getBalance());
            }
        }
    }
}