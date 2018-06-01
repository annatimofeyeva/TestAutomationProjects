public class FoorLoop {
    public static void main(String[] args) {

        // sout - System.out.println();
        // Printing odd numbers:

        for (int i = 0; i <= 10; i++) {
            int x = i % 2;   // x = reminder
            if (x == 1) {
                System.out.println("Odd number: " + i);
            }
//
//            if(x == 0) {
//                System.out.println("Even number: " + i);
//            }
        }
//         Printing odd numbers #2:

//            if (i%2 == 0) {
//                System.out.println(i + " = "+ "even");
//            }else
//                System.out.println(i + " = " + "odd");
//        }
////            Printing even number #2:
//        System.out.println("Even numbers: ");
//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);
//        }

        // Printing Prime numbers. Prime numbers - which are dividible only by 1 and itself
        // Prime numbers always stars from 2

        // 1. Take some number
        // 2. Divide number from 2 to (self -1)
        // 3. If not divisible - then prime

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                int x = i % j;
                if (x == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime) {
                System.out.println("Prime number: " + i);
            }
        }

        System.out.println("Printed Fibonachi numbers: ");

        int n1 = 0;
        int n2 = 1;
        int n = n1 + n2;

        while (n < 1000) {
            System.out.printf("%d ", n);
            n1 = n2;
            n2 = n;
            n = n1 + n2;
        }
    }// end of main
} // end of class
