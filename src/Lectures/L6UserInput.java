package Lectures;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class L6UserInput {
    public static void main(String[] args) {
//        Part 1
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        int a = scn.nextInt();
//        System.out.print("Enter Second Number: ");
//        int b=scn.nextInt();
//        System.out.println("Sum: "+(a+b));
//        System.out.println("Enter String: ");
//        String str1 = scn.next();
//        System.out.println(str1);
//        scn.close();

//        Part 2
        Scanner scn= new Scanner(System.in);
//        input is a string(one word), read by next() method
        String str1= scn.next();
        System.out.println("Entered String str1: "+str1);
//        input is a string(complete Sentence), read by nextLine() method
        String str2= scn.nextLine();
        System.out.println("Entered String str2: "+str2);
        float f = scn.nextFloat();
        System.out.println("Entered FloatValue: "+ f);

    }
}

//    Scanner class - read input from console, files , streams
//    part of java.util package
//    import the scanner using: import java.util.Scanner
//    Create Scanner obj and connect with System.in by passing it as an argument
//    Scanner scn = new Scanner(System.in);
//    use various methods of scanner class like nextInt(), nextLine(), next(), nextDouble
//    nextBoolean()- Used for reading Boolean value.
//    nextByte()- Used for reading Byte value.
//    nextDouble()- Used for reading Double value.
//    nextFloat()- Used for reading Float value.
//    nextInt()- Used for reading Int value.
//    nextLine()- Used for reading Line value.
//    nextLong()- Used for reading Long value.
//    nextShort()- Used for reading Short value.

