package oops;

public class L1Numbers {
    //    Properties
    private int a;
    private int b;
    //    Methods
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        L1Numbers obj = new L1Numbers();
//      Assigning Values to Properties
        obj.a=1;
        obj.b=2;
//      Methods
        obj.sum();
        obj.sub();

    }
}
//Class: A user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
//Modifiers: A class can be public or have default access (Refer to this for details).
//Class name: The class name should begin with the initial letter capitalized by convention.
//Body: The class body is surrounded by braces, { }.
//Object: A basic unit of Object-Oriented Programming that represents real-life entities.
//State: It is represented by the attributes of an object. It also reflects the properties of an object.
//Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
//Identity: A unique name given to an object that enables it to interact with other objects.
//Method: A collection of statements that perform some specific task and return the result to the caller, without returning anything, allow us to reuse the code-considered time savers.