package Lectures;

public class L4Strings {
    public static void main(String[] args) {
//        String class defined in java.lang package
//        this package is automatically imported
//        Since this is a reference type we use:
//        String message = new String("Hello World");
//        but in java it can also be initialised as:
        String message = "  Hello World"+"!!   ";

//        System.out.println(message+"!!");
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("o"));
//        System.out.println(message.indexOf("z"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());


        System.out.println(message.replace("!","*"));
//        This method modifies the string as it replaces certain characters with new characters
//        but this won't modify the actual string as in java strings are immutable, we cant change them
//        it will return a new string obj
        System.out.println(message);
        String newMessage=message.replace("!","*");
        System.out.println(message.hashCode());
        System.out.println(newMessage.hashCode());
//        both contains diff characters so their hash values are diff
        System.out.println(message==newMessage);
//        in this case false, diff memory


        System.out.println("\n");
        String s1 = "hi John";
        System.out.println(s1.hashCode());
        System.out.println("hi John".hashCode());
//        both contains same characters so their hash values are identical
//        this == opr compares whether two references point to same obj in memory
//        in this case yes so true
        System.out.println("hi John"==s1);
//        equals() compares contents of two strings, not their references
//        in this case true
        System.out.println(s1.equals("hi John"));


//        == checks reference equality (memory address).
//        equals() checks value equality (contents of the strings).
//        hashCode() for String: Strings with identical contents have the same hash code.
    }
}
