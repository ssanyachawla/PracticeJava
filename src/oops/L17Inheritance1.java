package oops;
class Bicycle{
//    variables
    public int gear;
    public int speed;

//    constructor
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBrake(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
//   toString() method to print info of Bicycle
    public String toString(){
        return ("No of gears are "+gear+"\n"+"speed of bicycle is "+speed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear,int speed,int startHeight){
        super(gear,speed);
        seatHeight=startHeight;
    }
    public void setHeight(int newValue){
        seatHeight=newValue;
    }
    @Override public String toString(){
        return(super.toString()+"\n seat height is "+seatHeight);
    }
}
public class L17Inheritance1 {
    public static void main(String[] args) {
        MountainBike mb=new MountainBike(3,100,25);
        System.out.println(mb.toString());
    }
}
