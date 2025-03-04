package oops;
class Std{

//    Constr with one argument
    Std(String name){
        System.out.println("Constr with one argument:"+ "String: "+name);
    }

//    Constr with two arg
    Std(String name,int age){
        System.out.println("Constr with two arguments: " + "String and Integer: "+name+" "+age);
    }

//   Constr with one arg with different
    Std(long id)  {
        System.out.println("Constr with one arg: "+"Long: "+id);
    }
}

public class L9ConstrOverload {
    public static void main(String[] args) {
        Std obj1 = new Std("Shikhar");
        Std obj2 = new Std("sanya",23);
        Std obj3 = new Std(22553633);

    }
}
