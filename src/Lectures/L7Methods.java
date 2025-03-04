package Lectures;

//public class L7Methods {
////    <access_modifier><return_type><method_name>(list_of_parameters){//body}
////    Modifier-protected,public,private
////    Return Type-void,if no value returned
////    Method Name-start with lowercase, use camelcase
////    Parameters-Empty parentheses, if no parameters are needed
//
//    public void printMessage(){
//        System.out.println("Hello,Geeks!");
//    }
//
//    public static void main(String[] args) {
//        L7Methods m = new L7Methods();
//        m.printMessage();
//    }
//
//}

//Predefined Methods- already on java class libraries- Math.random(),Math.PI()
//User-defined Methods- by the user or programmer
//Instance Method- declared inside class, using obj name
//Static Method- access using class name, declared inside class with static keyword

//1. Method Calling using Object
//class Add{
//    int s=0;
//    public int addTwoInt(int a,int b){
//        s=a+b;
//        return s;
//    }
//}
//
//public class L7Methods {
//    public static void main(String[] args) {
//        CodePractice.Add a=new CodePractice.Add();
//        int res= a.addTwoInt(1,2);
//        System.out.println("Sum: "+res);
//
//    }
//}

//2. Method calling in Diff ways
//class Test{
//    public static int i=0;
////    Constr to count objects
//    Test(){
//        i++;
//    }
////    static method to get the number of objs created
//    public static int getObj(){
//        return i;
//    }
////    Instance method m1 calling another method m2
//    public int m1(){
//        System.out.println("Inside m1");
//        this.m2();
//        return 1;
//    }
////    method m2 prints a message
//    public void m2(){
//        System.out.println("In method m2");
//    }
//}

//class L7Methods{
//    // Main driver method
//    public static void main(String[] args) {
//
//        // Creating object of Test class
//        Test obj = new Test();
//
//        // Calling m1 method
//        int i = obj.m1();
//        System.out.println("Control returned after m1: " + i);
//
//        // Get and print the number of objects created
//        int o = Test.getObj();
//        System.out.println("No of instances created: " + o);
//    }
//}

public class L7Methods {
    private int num;
    private String n;

    public int getNumber(){
        return num;
    }
    public String getName(){
        return n;
    }
    public void setNumber(int num){
        this.num=num;
    }
    public void setName(String n){
        this.n=n;
    }
    public void printDetails(){
        System.out.println("Number: "+num);
        System.out.println("Name: "+n);
    }

    public static void main(String[] args) {
        L7Methods g=new L7Methods();
        g.setNumber(123);
        g.setName("GFG Write");
        g.printDetails();
    }

}
