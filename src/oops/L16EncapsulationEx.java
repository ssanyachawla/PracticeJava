package oops;

//Eg1
//class Person{
//    private String name;
//    private int age;
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name=name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//}
//
//public class L16EncapsulationEx {
//    public static void main(String[] args) {
//        Person p=new Person();
//        p.setName("Jay");
//        p.setAge(45);
//        System.out.println("Name: "+p.getName());
//        System.out.println("Age: "+p.getAge());
//    }
//}

//Eg2
//class Area{
//    private int l;
//    private int b;
//    Area(int l,int b){
//        this.l=l;
//        this.b=b;
//    }
//    public void getArea(){
//        int area=l*b;
//        System.out.println("Area: "+area);
//    }
//}
//
//public class L16EncapsulationEx{
//    public static void main(String[] args) {
//        Area rect=new Area(2,16);
//        rect.getArea();
//    }
//}

//Eg3
//class Encapsulate{
//    private String geekName;
//    private int geekRoll;
//    private int geekAge;
//
//    public int getAge(){
//        return geekAge;
//    }
//    public String getName(){
//        return geekName;
//    }
//    public int getRoll(){
//        return geekRoll;
//    }
//    public void setAge(int newAge){
//        geekAge=newAge;
//    }
//    public void setName(String newName){
//        geekName=newName;
//    }
//    public void setRoll(int newRoll){
//        geekRoll=newRoll;
//    }
//}
//
//public class L16EncapsulationEx{
//    public static void main(String[] args) {
//        Encapsulate o=new Encapsulate();
//        o.setName("Harsh");
//        o.setAge(19);
//        o.setRoll(51);
//
//        System.out.println("Geeks name: "+o.getName());
//        System.out.println("Geeks age: "+o.getAge());
//        System.out.println("Geeks roll: "+o.getRoll());
//
//    }
//}

//Eg4
class Account{
    private long accNo;
    private String name;
    private String email;
    private float amount;

    public long getAccNo(){
        return accNo;
    }
    public void setAccNo(long accNo){
        this.accNo= accNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return this.email=email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}
public class L16EncapsulationEx {
    public static void main(String[] args) {
        Account acc= new Account();
        acc.setAccNo(90435362771L);
        acc.setName("ABC");
        acc.setEmail("abc@gmail.com");
        acc.setAmount(1028377f);
        System.out.println("Account Number: "+acc.getAccNo());
        System.out.println("Name: "+acc.getName());
        System.out.println("Email: "+acc.getEmail());
        System.out.println("Amount: "+acc.getAmount());
    }
}

