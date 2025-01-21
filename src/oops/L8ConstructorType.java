package oops;

//This is the default constructor, takes no parameter
//Replaces the one compiler creates automatically
//gives default values to the object like 0,null depending on the type
/*
public class L7ConstructorType {
    L7ConstructorType(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        L7ConstructorType obj= new L7ConstructorType();

    }
}
*/

//Parameterised Constructor- that has parameters
class Student{
    String name;
    int id;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    Student(String name){
        this(name,18);
    }
    Student(int id){
        this("Amit",id);
    }

    void display(){
        System.out.println("StudentName: "+name+" and StudentId: "+id);
    }

}


public class L8ConstructorType {
    public static void main(String[] args) {
        Student stud1= new Student("Sanya",21);
        Student stud2= new Student(21);
        Student stud3= new Student("Bob");
        stud1.display();
        stud2.display();
        stud3.display();
    }
}
