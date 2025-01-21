package CodePractice;

class Car{
    //Instance variable
    String make;
    String model;
    int year;

    //Constructor (used to intialize objects)
    public Car(String make, String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Car Make:" + make);
        System.out.println("Car Model:" + model);
        System.out.println("Car Year:" + year);
    }
}

public class ObjectExample {
    public static void main(String[] args){
        Car myCar= new Car("Toyato","Corolla",2020);
        myCar.displayInfo();
        Car dreamCar = new Car("Mercedes","AMG",2023);
        dreamCar.displayInfo();

    }

}
