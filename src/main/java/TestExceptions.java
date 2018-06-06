public class TestExceptions {
    public static void main(String[] args) {
        BankAccountSimple b = new BankAccountSimple(111, 1000, "John");
        try {
            b.withDraw(200);
        } catch (MinimumBalanceNotMaintainedException e) {
            System.out.println("You don't have sufficient balance");
        }
        System.out.println("You have enougth amount for withdraw");
    }
}
