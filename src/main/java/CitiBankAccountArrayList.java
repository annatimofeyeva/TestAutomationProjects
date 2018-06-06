import java.util.ArrayList;

public class CitiBankAccountArrayList extends BankAccountSimple {
    private int accountNumber;
    private double balance;
    private String customerName;

    public CitiBankAccountArrayList(int accountNumber, double balance, String customerName) {
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) {
        BankAccountSimple citi1 =
                new CitiBankAccountArrayList(111, 1, "Alla");
        BankAccountSimple citi2 =
                new CitiBankAccountArrayList(222, 1, "Anna");
        BankAccountSimple citi3 =
                new CitiBankAccountArrayList(333, 1, "Steve");
        BankAccountSimple citi4 =
                new CitiBankAccountArrayList(444, 1, "Mila");
        BankAccountSimple citi5 =
                new CitiBankAccountArrayList(555, 1, "Nicole");

        BankAccountSimple hsbs1 =
                new HSBSBankAccountArrayList(666, 1, "John");
        BankAccountSimple hsbs2 =
                new HSBSBankAccountArrayList(777, 1, "Mary");
        BankAccountSimple hsbs3 =
                new HSBSBankAccountArrayList(888, 1, "Steve");
        BankAccountSimple hsbs4 =
                new HSBSBankAccountArrayList(999, 1, "Mike");
        BankAccountSimple hsbs5 =
                new HSBSBankAccountArrayList(1000, 1, "Emily");

        /* arrayList is an Object. Here: citiArrayList - is an object, ArrayList - class
        of this object. Because citiArrayList is an object, we can use for it all methods,
        which exists in the ArrayList class
         */

        /* - here there is the place where you can change ArrayList size. ArrayList size is not
      fixed. Because arraylist is an object - size() - is a method.
       */
      /* but you can also execute some code and after it add some more elements
       */

        ArrayList<BankAccountSimple> citiArrayList =
                new ArrayList<BankAccountSimple>();

        citiArrayList.add(citi1);
        citiArrayList.add(citi2);
        citiArrayList.add(citi3);
        citiArrayList.add(citi4);
        citiArrayList.add(citi5);

        citiArrayList.add(hsbs1);
        citiArrayList.add(hsbs2);
        citiArrayList.add(hsbs3);
        citiArrayList.add(hsbs4);
        citiArrayList.add(hsbs5);

        /* but you can also execute some code and after it add some more elements
//        in the arraylist:
//        */
        System.out.println("Please find adding new arraylist elements below:");

//        //you can also remove an element
        citiArrayList.remove(hsbs5);

        // and add again
        citiArrayList.add(hsbs5);

            System.out.println("List of all customers: ");
        for (int i = 0; i < citiArrayList.size(); i++) {
            System.out.println(citiArrayList.get(i).getCustomerName());
        }
        /* For each loop:
            for each object of BankAccountSimple in the Arraylist - citiArrayList
         */
        System.out.println("Customers accounts numbers: ");
        for (BankAccountSimple t : citiArrayList) {
            System.out.println(t.getAccountNumber());
        }

            System.out.println("Total balance is : ");
        double totalBalance = 0;
        for (int i = 0; i < citiArrayList.size(); i++) {
            totalBalance = totalBalance + citiArrayList.get(i).getBalance();}
            System.out.println(totalBalance);
    }


//        double totalBalance = 0;
//        System.out.println("Total balance is : ");
//        for (BankAccountSimple t : citiArrayList) {
//            totalBalance += t.getBalance();
//
//        }
// System.out.println(totalBalance);
    }


