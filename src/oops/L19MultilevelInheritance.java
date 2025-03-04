package oops;
//A is base class for derived class B, B is base class for derived class C

class Uno{
    public void print_geek(){
        System.out.println("Geeks");
    }
}
class Deux extends Uno{
    public void print_for(){
        System.out.println("for");
    }
}
class Tres extends Deux{
    public void print_lastgeek(){
        System.out.println("Geeks");
    }
}
public class L19MultilevelInheritance {
    public static void main(String[] args) {
        Tres g= new Tres();
        g.print_geek();
        g.print_for();
        g.print_lastgeek();

    }
}


