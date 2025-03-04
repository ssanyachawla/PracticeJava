package oops;
//Eg1
//abstract class Shape{
//    String color;
////    these are abstract methods
//    abstract double area();
//    public abstract String toString();
////    constr
//    public Shape(String color){
//        System.out.println("Shape constr called");
//        this.color=color;
//    }
//    public String getColor(){
//        return color;
//    }
//}
//class Circle extends Shape{
//    double radius;
//    public Circle(String color, double radius){
//        super(color);
//        System.out.println("Circle Constr called");
//        this.radius=radius;
//    }
//    @Override double area(){
//        return Math.PI*Math.pow(radius,2);
//    }
//    @Override public String toString(){
//        return "Circle color is: "+super.getColor()+" and area is: "+area();
//    }
//}
//class Rectangle extends Shape{
//    double length;
//    double width;
//    public Rectangle(String color, double length,double width){
////        calling Shape constr
//        super(color);
//        System.out.println("Rectangle Constr called");
//        this.length=length;
//        this.width=width;
//    }
//    @Override double area(){
//        return length*width;
//    }
//    @Override public String toString(){
//        return "Rectangle color is: "+ super.getColor()+" and area is: "+area();
//    }
//}
//
//public class L13Abstraction2 {
//    public static void main(String[] args) {
//        Shape s1=new Circle("Red",2.2);
//        Shape s2=new Rectangle("Yellow",2,4);
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//    }
//}

//Eg2
abstract class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void makeSound();
    public String getName(){
        return name;
    }
}
//Abstracted Class
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+" barks");
    }
}

//Abstracted class
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+" meows");
    }
}

//Driver Class
public class L13Abstraction2 {
    public static void main(String[] args) {
        Animal myDog=new Dog("Tuffy");
        Animal myCat=new Cat("Whispers");
        myDog.makeSound();
        myCat.makeSound();
    }

}