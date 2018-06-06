public class HSBCBankAccountArrayList {
    private int accountNumber;
    private double balance;
    private String customerName;

    public HSBCBankAccountArrayList(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {
        HSBCBankAccountArrayList hsbs1 =
                new HSBCBankAccountArrayList(111, 5000, "John");
        HSBCBankAccountArrayList hsbs2 =
                new HSBCBankAccountArrayList(222, 6000, "Mary");
        HSBCBankAccountArrayList hsbs3 =
                new HSBCBankAccountArrayList(333, 7000, "Steve");
        HSBCBankAccountArrayList hsbs4 =
                new HSBCBankAccountArrayList(444, 8000, "Mike");
        HSBCBankAccountArrayList hsbs5 =
                new HSBCBankAccountArrayList(555, 9000, "Emily");



    } //end of main
} // end of class


