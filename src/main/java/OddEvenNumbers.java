public class OddEvenNumbers {
    public static void main(String[] args) {
        // sout - System.out.println();
        // Printing odd numbers:
        for (int i = 0; i <= 10; i++) {
            int x = i % 2;   // x = reminder
            if (x == 1) {
                System.out.println("Odd number: " + i);
            } else {
                System.out.println("Even number: " + i);
            }
            /*
            if(x == 0) {
                System.out.println("Even number: " + i);
            }
            */
        }
         /*
         Printing odd numbers #2:

            if (i%2 == 0) {
                System.out.println(i + " = "+ "even");
            }else
                System.out.println(i + " = " + "odd");
        }
            Printing even number #2:
        System.out.println("Even numbers: ");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        */
    }
}
