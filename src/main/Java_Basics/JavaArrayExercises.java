import java.util.Arrays;

public class JavaArrayExercises {
    public static void main(String[] args) {

        //Write a Java program to sum values of an array.

        int[] myArray = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : myArray)
            sum += i;
        System.out.println("Sum of integers in the first array is: " + sum);

        int[] secondInt = {2, 4, 6, 8, 10};
        int sumOne = 0;
        for (int i : secondInt)
            sumOne = sumOne + i;
        System.out.println("Sum of integers in the second array is: " + sumOne);

        Double[] myDouble = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double myDoubleSum = 0;
        for (double i : myDouble) {
            myDoubleSum += i;
            if (i > 5) {
                System.out.println("Sum of doubles in the first array is: " + myDoubleSum);
            }
        }

        Double[] second = {2.0, 4.0, 6.0, 8.0};
        double result = 0.0;
        for (double i : second)
            result += i;
        System.out.println("Sum of doubles in the second array is: " + result);
    } // end of main
} // end of class