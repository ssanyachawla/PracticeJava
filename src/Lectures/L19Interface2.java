package Lectures;
//Inheritance in Interface
interface intfA{
    void m1();
}
interface intfB{
    void m2();
}

class sample implements intfA, intfB{

    public void m1() {
        System.out.println("Welcome: inside the method m1");
    }

    public void m2(){
        System.out.println("Welcome: inside the method m2");
    }
}

public class L19Interface2 {
    public static void main(String[] args) {
        sample obj=new sample();
        obj.m1();
        obj.m2();
    }

}


