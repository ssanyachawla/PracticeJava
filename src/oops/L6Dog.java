package oops;
// Java Program to Demonstrate the
// use of a class with instance variable
public class L6Dog {
    String name;
    String breed;
    int age;
    String color;
    //    Constructor declaration of class
    public L6Dog(String name, String breed, int age, String color){
        this.name =name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    @Override public String toString(){
        return("Name is: "+this.getName()+"\nBreed, age and color are: "+this.getBreed()+", "+this.getAge()+", "+this.getColor());
    }

    public static void main(String[] args) {
        L6Dog tuffy = new L6Dog("tuffy", "papillon", 5,"white");
        System.out.println(tuffy.toString());

    }
}
