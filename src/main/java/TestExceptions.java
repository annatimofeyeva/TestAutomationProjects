public class TestExceptions {
    public static void main(String[] args) {
        BankAccountSimple b = new BankAccountSimple(111, 300, "John");
        try{
            b.withDraw(500);
        }catch(Exception e){
            System.out.println("You don't have sufficient balance");
        }
    }
}
