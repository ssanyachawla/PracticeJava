package oops;
//one class has one or more superclass
//Class z is child class of both x and y class- both A and B are parent classes
//java doesnt support multiple inheritance with classes, achieved thru interfaces
interface X{
    public void print_geek();
}
interface Y{
    public void print_for();
}
interface Z extends X,Y{
    public void print_geek();
}

class Child implements Z{
    @Override public void print_geek(){
        System.out.println("Geeks");
    }
    public void print_for(){
        System.out.println("for");
    }

}
public class L21MultipleInheritance {
    public static void main(String[] args) {
        Child c=new Child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }


}
