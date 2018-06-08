public class PrimeNumbers {
    // shortcut for main - psvm
    public static void main(String[] args) {
        /* Printing Prime numbers. Prime numbers - which are dividible only by 1 and itself
         Prime numbers always stars from 2

         1. Take some number
         2. Divide number from 2 to (self -1)
         3. If not divisible - then prime
        */
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                int x = i % j;
                if (x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
