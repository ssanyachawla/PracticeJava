package Lectures;

//Interface- specify the behaviour of class
//contains static constants and abstract methods
//by default- var are public, static and final

interface TestInterface{
    final int a=10;
    void display();
}
public class L15Interfaces implements TestInterface {

    public void display() {
        System.out.println("Geek");
    }
}
class Geeks{
    public static void main(String[] args) {
        L15Interfaces t = new L15Interfaces();
        t.display();
        System.out.println(L15Interfaces.a);
    }
}


