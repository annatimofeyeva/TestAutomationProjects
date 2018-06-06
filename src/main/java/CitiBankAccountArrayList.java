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
                new HSBSBankAccountArrayList(111, 1, "John");
        BankAccountSimple hsbs2 =
                new HSBSBankAccountArrayList(222, 1, "Mary");
        BankAccountSimple hsbs3 =
                new HSBSBankAccountArrayList(333, 1, "Steve");
        BankAccountSimple hsbs4 =
                new HSBSBankAccountArrayList(444, 1, "Mike");
        BankAccountSimple hsbs5 =
                new HSBSBankAccountArrayList(555, 1, "Emily");


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


        for (int i = 0; i < citiArrayList.size(); i++) {
            System.out.println(citiArrayList.get(i).getCustomerName());
        }


        /* arrayList is an Object. Here: banksAcountsArrayList - is an object, ArrayList - class
        of this object. Because banksAccountsArrayList is an object, we can use for it all methods,
        which exists in the ArrayList class
         */

//        ArrayList<BankAccountSimple> b = new ArrayList<BankAccountSimple>();
//
//        b.add(citi1);
//        b.add(citi2);
//        b.add(citi3);
//        b.add(citi4);
//        b.add(citi5);
//        b.add(hsbs1);
//        b.add(hsbs2);
//        b.add(hsbs3);
//        b.add(hsbs4);
//
//        /* - here there is the place where you can change ArrayList size. ArrayList size is not
//        fixed. Because arraylist is an object - arraylist.size() - is a method.
//        */
//        /* but you can also execute some code and after it add some more elements
//        in the arraylist:
//        */
//        System.out.println("Please find adding new arraylist elements below:");
//        b.add(hsbs5);
//
//        //you can also remove an element
//        b.remove(hsbs5);
//
//        // and add again
//        b.add(hsbs5);
//
//
//
//      for(int i = 0; i < b.size(); i++) {
//          double a = b.get(i).getBalance();
//          System.out.println(a);
//      }
//
//
//
//


    }
}//end of main

