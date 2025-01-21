package CodePractice;

public class Fibonacci {
    public static void main(String[] args){
        int n=20;
        System.out.println("Fibonacci sequence up to"+n+ " terms");
        int a=0;
        int b=1;
        System.out.println(a); // Print the first term
        System.out.println(b); // Print the second term
        int c=a+b;
        while(c<n){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
