package Lectures;

public class L9StaticMethod {
    public static void greet(){
        System.out.println("Hello Geek");
    }

    public static void main(String[] args) {
//        call directly
        greet();
//        call using class name
        L9StaticMethod.greet();
    }
}
