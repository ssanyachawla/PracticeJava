package CodePractice;

class PersonDetails {
    String name;
    int age;

    //Constructor
    PersonDetails(String name, int age){
        this.name=name;
        this.age =age;
    }

    void introduce(){
        System.out.println("Hi, I am "+ name+ " and I am "+ age + " years old.");
    }
}
public class Person{
    public static void main(String[] args){
        PersonDetails person1 = new PersonDetails("Alice", 25);
        PersonDetails person2 = new PersonDetails("Bob", 30);

        person1.introduce();
        person2.introduce();
    }
}
