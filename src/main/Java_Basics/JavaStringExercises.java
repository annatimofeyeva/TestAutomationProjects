public class JavaStringExercises {
    public static void main(String[] args) {

        //1. Write a Java program to get the character at the given index within the String.

        String result1 = "Hello";
        System.out.println("Char at 3: " + result1.charAt(3));

        //2. Write a Java program to get the character (Unicode code point) at the given index within the String.

        String result2 = "Hello";
        System.out.println("Unicode value for index 3: " + result2.codePointAt(3));

        //3. Write a Java program to get the character (Unicode code point) before the specified index within the String.

        String result3 = "Hello";
        System.out.println("Unicode value before 3: " + result3.codePointBefore(2));

        //4. Write a java program to count a number of Unicode code points in the specified text range of a String.

        String result4 = "Hello world";
        System.out.println("Unicode value from 4 to 6 (count): " + result4.codePointCount(4, 6));

        //5.  Write a java program to compare two strings lexicographically

        String str1 = "Hello";
        String str2 = "world";

        int i = str1.compareToIgnoreCase(str2);

        if (i < 0) {
            System.out.println("str1 < str2");
        } else if (i > 0) {
            System.out.println("str2 > str1");
        } else // i == 0

        {
            System.out.println("str1 = str2");
        }


        System.out.println("Alla's: ");

        //
        String name = "Marina";
        System.out.println("Char at 3: " + name.charAt(3));
        System.out.println("unicode value at 3: " + name.codePointAt(3));

        // ex.2

        String nm = "xxx";
        System.out.println(name.contains(nm));

        //ex.3
        int myArray [] = {2,2,2,2,2};
        int sum = 0;

        for (int g :myArray)
            sum += g;
        System.out.println("the sum = " + sum);



    }
}



