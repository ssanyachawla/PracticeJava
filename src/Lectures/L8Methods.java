package Lectures;

//    Calling abstract methods
abstract class Help{
    abstract void check(String n);
}
class test{
    static void hello(){
        System.out.println("Hello");
    }
}
public class L8Methods extends Help{
    @Override void check(String n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        L8Methods ob = new L8Methods();
        ob.check("Gfg");
//        calling predefined methods
        System.out.println(ob.hashCode());
        test.hello();


    }
}
