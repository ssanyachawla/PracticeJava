package oops;
//subclass derived from only one superclass
//A-parent class, B is child class
class One{
    public void print_geek(){
        System.out.println("Geeks");
    }
}

class Two extends One{
    public void print_for(){
        System.out.println("for");
    }
}
public class L18SingleInheritance {
    public static void main(String[] args) {
        Two g=new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }

}
