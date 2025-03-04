package oops;

class Geek{
    String name;
    int id;

    Geek(String name,int id){
        this.name = name;
        this.id = id;
    }

//    Copy Constr
    Geek(Geek obj2){
        this.name=obj2.name;
        this.id=obj2.id;
    }
}

public class L10CopyConstr {
    public static void main(String[] args) {
        System.out.println("First Object");
        Geek geek1=new Geek("Avinash",60);
        System.out.println("GeekName: "+geek1.name+" and GeekId: "+geek1.id);
        System.out.println();

//        This would invoke copy const
        Geek geek2 = new Geek(geek1);
        System.out.println("Copy constr used Second Obj");
        System.out.println("GeekName: "+geek2.name+" and GeekId: "+ geek2.id);
    }

}
