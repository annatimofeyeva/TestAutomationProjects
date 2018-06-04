import java.util.Scanner;

public class Calculator {

    // exercise for Polymorfism and Overloading
    // Constructor

    public Calculator() {
    }



    public static void main(String[] args) {
        

        Calculator cal = new Calculator();
        double x = cal.addNumbers(2, 5);
        System.out.println(x);
        double y = cal.addNumbers(3, 20, 5);
        System.out.println(y);
        double z = cal.addNumbers(3, 20, 5, 55);
        System.out.println(z);
    }

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
}