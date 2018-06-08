public class FibonachiNumbers {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n = n1 + n2;

        while (n < 10) {
            System.out.printf("%d ", n);
            n1 = n2;
            n2 = n;
            n = n1 + n2;
        }
    }
}
