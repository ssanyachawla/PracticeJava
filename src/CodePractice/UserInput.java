package CodePractice;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the integer: ");

//        Create the scanner object
        Scanner s= new Scanner(System.in);
//        Read the next int from the console
        num=s.nextInt();
        System.out.println("Entered integer is: "+num);

        s.close();
    }
}
//Scanner Class- to read user input from various input sources, such as the console (keyboard), files, or other input streams
//For primitive types:
//nextInt(): Reads the next token as an int.
//nextFloat(): Reads the next token as a float.
//nextDouble(): Reads the next token as a double.
//nextBoolean(): Reads the next token as a boolean, and so on.
//For strings:
//next(): Reads the next token (up to the delimiter).
//nextLine(): Reads the entire line.

//System.in: Specifies that the input source is the console.
//s.close()- Frees the resources used by the scanner.