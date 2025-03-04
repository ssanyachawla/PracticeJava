package Lectures;

//1. Default Methods- interface can define methods with default implementations
//interface Test {
//    final int a = 10;
//
//    default void display() {
//        System.out.println("hello");
//    }
//}
//
//public class L18Interface1 implements Test {
//    public static void main(String[] args) {
//        L18Interface1 t= new L18Interface1();
//        t.display();
//    }
//}

//2. Static Methods- Interfaces can now include static methods
//interface Test{
//    final int a=10;
//    static void display(){
//        System.out.println("hello");
//    }
//}
//class L18Interface1 implements Test{
//    public static void main(String[] args) {
//        Test.display();
//    }
//}

//3. Extending Interfaces- One interface can inherit another by using extends keyword
//So when a class implements an interface that inherits another interface

//interface A{
//    void method1();
//    void method2();
//}
////B now includes method1 and method2
//interface B extends A{
//    void method3();
//}
////now this class must implement all methods of A and B
//class Interfaces implements B{
//    public void method1(){
//        System.out.println("Method 1");
//    }
//
//    public void method2() {
//        System.out.println("Method 2");
//    }
//    public void method3(){
//        System.out.println("Method 3");
//    }
//    public static void main(String[] args) {
//        Interfaces x=new Interfaces();
//        x.method1();
//        x.method2();
//        x.method3();
//    }
//
//}

//4. Interface levels-interface has multiple methods so we write implementation in implementation class
//if implementation is unable to provide an implementation of all abstract methods, then declare implementation class with abstract modifier, and complete the remaining method implementation in next child classes
interface Bank{
    void deposit();
    void withdraw();
    void loan();
    void account();
}

abstract class Dev1 implements Bank{
    public void deposit(){
        System.out.println("your deposit Amount: "+100);
    }
}
abstract class Dev2 extends Dev1{
    public void withdraw(){
        System.out.println("Your withdraw Amount: "+50);
    }
}
class Dev3 extends Dev2{
    public void loan(){};
    public void account(){};
}

class L18Interface1{
    public static void main(String[] args) {
        Dev3 d= new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}
