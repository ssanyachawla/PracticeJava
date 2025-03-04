package oops;
//Demonstrating Abstraction in Java
abstract class Geeks{
    abstract void turnOn();
    abstract void turnOff();
}
//class implementing the abstract methods
class TVRemote extends Geeks{
    @Override void turnOn(){
        System.out.println("TV is turned ON.");
    }
    @Override void turnOff(){
        System.out.println("TV is turned OFF");
    }
}
//Class to demonstrate abstraction
public class L12Abstraction1 {
    public static void main(String[] args) {
        Geeks remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

//abstract class: declared with abstract keyword
//declared without implementation
//abstract method must be redefined in subclass-overriding compulsory
//no obj in abstract class, must not be instantiated
