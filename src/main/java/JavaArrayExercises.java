import java.util.Arrays;

public class JavaArrayExercises {
    public static void main(String[] args) {

        //Write a Java program to sum values of an array.

        int[] myArray = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : myArray)
            sum += i;
        System.out.println("Sum of all integers is: " + sum);

        Double[] myDouble = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double myDoubleSum = 0;
        for (double i : myDouble) {
            myDoubleSum += i;
            if(i > 5) {
                System.out.println("Sum of all doubles is: " + myDoubleSum);
            }
        }
    } // end of main
} // end of class