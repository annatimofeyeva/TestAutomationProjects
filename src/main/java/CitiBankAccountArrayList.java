public class CitiBankAccountArrayList {
    private int accountNumber;
    private double balance;
    private String customerName;

    public CitiBankAccountArrayList(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {
        CitiBankAccountArrayList citi1 =
                new CitiBankAccountArrayList(111, 1, "Alla");
        CitiBankAccountArrayList citi2 =
                new CitiBankAccountArrayList(222, 1, "Anna");
        CitiBankAccountArrayList citi3 =
                new CitiBankAccountArrayList(333, 1, "Steve");
        CitiBankAccountArrayList citi4 =
                new CitiBankAccountArrayList(444, 1, "Mila");
        CitiBankAccountArrayList citi5 =
                new CitiBankAccountArrayList(555, 1, "Nicole");


    } //end of main
} // end of class
