import java.util.Arrays;

public class JavaArrayExercises {
    public static void main(String[] args) {

        // calculate sum
        int[] myIntArray = new int[5];
        myIntArray[0] = 2;
        myIntArray[1] = 2;
        myIntArray[2] = 2;
        myIntArray[3] = 2;
        myIntArray[4] = 2;

        int sum = 0;

        for (int e : myIntArray) {
            sum += e;
        }
        System.out.println("Sum of all array's integers equals : " + sum);

        //fill array with numbers

        int[] nums = new int[10];
            for(int i = 0; i < nums.length; i++) {
                nums[i] = i + 1;
            }
            // if without Arrays class - we will receive the objects
        Arrays.toString(nums);
        System.out.println("Int array: " + Arrays.toString(nums));

        // sort

        double[] doubleNums = {5.0, 4.0, 1.0};

        Arrays.sort(doubleNums);
        for(int i = 0; i < doubleNums.length; i++) {
            System.out.println(doubleNums[i]);
        }

        // Write a Java program to print the following grid

        String [] myString= new String[10];

        for(int i = 0; i < myString.length; i++){
            myString[i] = String.valueOf(i + 1);
        }
        System.out.println(Arrays.toString(myString));

        int[][] a = new int[10][10];

        for(int i = 0; i< 10; i++){
            for(int j = 0; j< 10; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
        // Write a Java program to calculate the average value of array elements
        int[] myIntarray = new int[5];
            for(int i = 0; i < myIntArray.length; i++) {
                myIntArray[i] = i + 1;
            }

        System.out.println(Arrays.toString(myIntArray));
            int arrsum = 0;

            for(int i = 0; i < myIntArray.length; i++){
                arrsum = arrsum + myIntarray[i];
            }
            double average = sum/myIntArray.length;
        System.out.println("Average int in array: " + average);

        //Write a Java program to find the index of an array element










    } // end of main
} // end of class