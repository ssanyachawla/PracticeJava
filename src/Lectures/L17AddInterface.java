package Lectures;

interface Add{
    int add(int a,int b);
}
interface Sub{
    int sub(int a,int b);
}
class Calculate implements Add,Sub{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
public class L17AddInterface {
    public static void main(String[] args) {
        Calculate x= new Calculate();
        System.out.println("Addition: "+ x.add(2,1));
        System.out.println("Subtraction: "+x.sub(2,1));
    }
}
