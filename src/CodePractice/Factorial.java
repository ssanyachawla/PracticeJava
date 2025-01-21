package CodePractice;

public class Factorial {
    static int factorialIterative(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    static int factorialRecursive(int n){
        if(n==0){
            return 1;
        }
        return n*factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        int num=5;
        System.out.println("Factorial of "+ num+" is "+ factorialIterative(5));
    }
}
