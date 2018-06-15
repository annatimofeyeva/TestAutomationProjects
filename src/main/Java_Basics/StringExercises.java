public class StringExercises {
    public static void main(String[] args) {

        //Write a Java program to get the character at the given index within the String
        String name = "Katerina";
        System.out.println("Char at 4 = " + name.charAt(4));

        // Write a Java program to get the character (Unicode code point)
        // at the given index within the String - Before given index
        System.out.println("Unicode at index 4: " + name.codePointAt(4));
        System.out.println("Unicode befor index4: " + name.codePointBefore(4));

        //Write a java program to compare two strings lexicographically.

//        String str1 = "This is Exercise 1";
//        String str2 = "This is Exercise 1";

        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        //int result = str1.compareTo(str2);
        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("str1 < str2");
        } else if (result > 0) {
            System.out.println("str1 > str2");
        } else if (result == 0) {
            System.out.println("str1 = str2");

        }
        // Concatination of two Strings
        String hello = "Hello ";
        String world = "world!";
        System.out.println("Concatinated String = " + hello.concat(world));

        // Write a Java program to compare a given string to the specified character sequence.
        String phrase = "Programming is nice";
        if (phrase.contains("nice")) {
            System.out.println("This phrase contains nice");
        } else {
            System.out.println("There is no such phrase");
        }
        // Write a Java program to compare a given string to the specified string buffer

        

    } // end of main
}// end of class
