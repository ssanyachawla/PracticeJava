package CodePractice;// Method 1- Using Arrays
//1. Store the remainder when the number is divided by 2 in an array i.e. binaryNum[i]=n%2
//2. Divide the number by 2 i.e. n/2
//3 Repeat it until the number n is greater than 0 i.e. while(n>0)
//4. Print the binaryNum array in reverse order

//public class CodePractice.DecToBinary {
//    static void decToBinary(int n){
////  array to store the remainders
//        int[] binaryNum= new int[100];
//        int i=0;
//        while (n>0){
////          store remainder in binary array
//            binaryNum[i]=n%2;
//            n=n/2;
//            i++;
//        }
////  printing the binary array in reverse order
//        for (int j=i-1;j>=0;j--){
//            System.out.print(binaryNum[j]);
//        }
//    }
//
//    public static void main(String[] args){
//        int n=17;
//        System.out.println("Decimal- "+n);
//        System.out.print("Binary- ");
//        decToBinary(n);
//    }
//}

// Method 2- Using Math.pow()

public class DecToBinary {
    static int decToBinary(int n){
        int binaryNum=0;
        int cnt=0;
        while(n!=0){
            int rem=n%2;
            binaryNum+=rem*10;
            n=n/2;
        }
        return binaryNum;
    }

    public static void main(String[] args){
        int n=17;
        System.out.println("Decimal-"+ n);
        System.out.print("Binary-");
        System.out.println(decToBinary(n));
    }
}



