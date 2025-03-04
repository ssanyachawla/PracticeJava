package oops;

//Superclass serves as base for more than one subclass
//Class A serves as base class for derived classes B,C and D

class A{
    public void print_A(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void print_B(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void print_C() {
        super.print_A();
        System.out.println("Class C");
    }
}

class D extends A{
    public void print_D(){
        System.out.println("Class D");
    }
}
public class L20HierarchicalInh {
    public static void main(String[] args) {
        B obj_B=new B();
        obj_B.print_A();
        obj_B.print_B();

        C obj_C=new C();
        obj_C.print_A();
        obj_C.print_C();

        D obj_D=new D();
        obj_D.print_A();
        obj_D.print_D();

    }

}
