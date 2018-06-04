public class Calculator {
    // exercise for Polymorfism and Overloading
    // Constructor
    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double sum1 = cal.addNumbers(2, 5);
        System.out.println(sum1);
        double sum2 = cal.addNumbers(3, 20, 5);
        System.out.println(sum2);
        double sum3 = cal.addNumbers(3, 20, 5, 55);
        System.out.println(sum3);
        double sum4 = cal.addNumbers(3, 20, 5, 55);
        System.out.println(sum4);
        double sum5 = cal.addNumbers(3, 20, 5, 55, 60);
        System.out.println(sum5);
    }
    // Methods Overloading -same name , but different method signatures

    public double addNumbers(double a, double b) {
        double sum;
        sum = a + b;
        return sum;
    }

    public double addNumbers(double a, double b, double c) {
        double sum;
        sum = a + b + c;
        return sum;
    }

    public double addNumbers(double a, double b, double c, double d) {
        double sum;
        sum = a + b + c + d;
        return sum;
    }

    public double addNumbers(double a, double b, double c, double d, double e) {
        double sum;
        sum = (a + b + c + d + e);
        return sum;
    }
}
