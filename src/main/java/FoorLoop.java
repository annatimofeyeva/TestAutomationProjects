public class FoorLoop {
    public static void main(String[] args) {
        // sout - System.out.println();

        // Printing odd numbers:
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " = "+ "even");
            }else
                System.out.println(i + " = " + "odd");
        }

        // Printing even number:
        System.out.println("Even numbers: ");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}
