public class TestExceptions {
    public static void main(String[] args) throws InactiveAccountException, MinimumBalanceNotMaintainedException{
        BankAccountSimple b = new BankAccountSimple(111, 1000, "John");
        try {
            b.withDraw(200);
        } catch (MinimumBalanceNotMaintainedException e) {
            System.out.println("You don't have sufficient balance");
        }
        System.out.println("You have enougth amount for withdraw");

        // I am trying to create exception for account which is not active:

        //1. In class - bankAccountSimple - I throw 2 exceptions and here I tried to catch them


//        try {
//            b.isActive = false;
//        }catch (InactiveAccountException e) {
//            System.out.println("your account is inactive");
//        }
    }
}
