package CodePractice;

public class EvenOdd {
    static void evenOdd(int num){
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");

        }
        
    }
    public static void main(String[] args) {
        int num=78;
        evenOdd(num);

    }
}
