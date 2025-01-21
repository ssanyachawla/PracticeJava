package CodePractice;

public class PrimeNumbers {
    public static void main(String[] args){
        int limit=100;
        System.out.println("Prime numbers from 1 to "+ limit +"are:");

        //loop through numbers from 2 to the limit
        for(int num=2;num<=limit;num++){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }
    public static boolean isPrime(int number){
        if (number<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
