package oops;

class StudentDetails {
    int id;
    String name;

    // Printing Student
    public void printStudent()
    {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }
}
public class L5Student{
    public static void main(String[] args) {
        StudentDetails obj= new StudentDetails();
        obj.id=1;
        obj.name="ABC";

        obj.printStudent();
    }
}