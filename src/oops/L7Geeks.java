package oops;

public class L7Geeks {
    L7Geeks(){
//        The purpose of this super() call is to initialize the superclass before the subclass constructor executes.
        super(); // Implicitly added by the compiler if not explicitly written
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        L7Geeks geek= new L7Geeks();
    }
}

//The constructor(s) of a class must have the same name as the class name in which it resides.
//A constructor in Java can not be abstract, final, static, or Synchronized.
//Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.

