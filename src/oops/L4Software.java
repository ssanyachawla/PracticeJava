package oops;

public class L4Software {
    static String name;
    static float price;

    static void set(String n, float p){
        name= n;
        price= p;
    }

    static void get(){
        System.out.println("Software name is "+name);
        System.out.println("Software price is "+price);
    }

    public static void main(String[] args) {
        L4Software.set("Visual Studio",0.0f);
        L4Software.get();
    }
}