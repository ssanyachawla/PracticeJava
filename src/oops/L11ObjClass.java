package oops;

public class L11ObjClass {
//    name
    String n;

//    Constructor
    public L11ObjClass(String n){
        this.n=n;
    }
//    Override toString()
    @Override public String toString(){
        return "Person{name:'"+n+"'}";
    }

    public static void main(String[] args) {
        L11ObjClass p = new L11ObjClass("Geek");
        System.out.println(p.toString());
        System.out.println(p.hashCode());
    }
}


