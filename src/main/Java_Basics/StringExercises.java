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

        // String length()
        String newName = "Katerina";
        int length = newName.length();
        System.out.println("New name length is: " + length);

        // String equals: return true or false; toUpperCase, toLowerCase
        boolean flag;
        String greetings = "Hello";
        String car = "toyota";
        flag = greetings.equals("Hello");
        System.out.println(flag);
        flag = greetings.equals("world");
        System.out.println(flag);
        flag = greetings.equalsIgnoreCase("hello");
        System.out.println(flag);
        String helloLow = greetings.toLowerCase();
        System.out.println("Hello to lowercase: " + helloLow.toLowerCase());
        String carUpper = car.toUpperCase();
        System.out.println("car to UpperCase: " + carUpper);

        // String trim - delete "white spaces"

        String whiteSpacesString = " Hello world!    ";
        String withoutWhiteSpaces = whiteSpacesString.trim();
        System.out.println("String without white spaces: " + withoutWhiteSpaces);

        // CharAt() = char at cirtan position:plus Unicode value:

        String welcome = "Welcome!";
        char determinationOfChar = welcome.charAt(4);
        System.out.println("At position 4 at Welcom is : " + determinationOfChar);
        int x = welcome.codePointAt(4);
        System.out.println("Unicode value od index 4 is: " + x);

        // String substruct() - start with argument int, included it till end of string

        String alphabet = "abcdefghigklmnop";
        String substructed = alphabet.substring(5);
        System.out.println("String after substruction: " + substructed);

        // String substring(Start, End)

        String alphabet1 = "abcdefghigklmnop";
        String substructed2 = alphabet.substring(3,7);
        System.out.println("String between 3 and 7 is: " + substructed2);

        // Returns the index (position) of the first occurrence of the string A_String in the calling object string.
        //Positions are counted 0, 1, 2, etc. Returns −1 if A_String is not found.

        String greetings2 = "Hi little Mary!";
        int res = greetings2.indexOf("M");
        System.out.println(res);

        String test = "abcdefg";
        System.out.println(test.substring(3));

        System.out.println("abc\\ndef");

//        String a = "WHY ARE YOU SHOUTING?";
//        a.toLowerCase();
//        System.out.println(a);

        String test5 = "WHY ARE YOU SHOUTING?";
        String test6 = test5.toLowerCase();
        System.out.println(test6);


    } // end of main
}// end of class
