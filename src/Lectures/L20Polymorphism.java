package Lectures;

class Person{
    void role(){
        System.out.println("I am a person");
    }
}
class Father extends Person{
    @Override
    void role(){
        System.out.println("I am a father");
    }
}
public class L20Polymorphism {
    public static void main(String[] args) {
        Person p=new Father();
        p.role();
    }

}
//this is polymorphism-we are referring to type Person to point to anobject of type Father, ensures that the overidden method in Father is invoked when role() is called
