package CodePractice;//Method 1
//public class CodePractice.SwapNumber {
//    static void swapValuesUsingThirdVar(int m, int n){
//        int temp=m;
//        m=n;
//        n=temp;
//        System.out.println("Value of m is "+m+" and n is "+n);
//    }
//    public static void main(String[] args){
//        int m=2;
//        int n=3;
//        swapValuesUsingThirdVar(m,n);
//    }
//}

//Method 2
public class SwapNumber{
    static void swapValuesWithoutThirdVar(int[] values){
//        m=9-5=4
//        n=4+5=9
//        m=9-4=5
        values[0]= values[0]-values[1];
        values[1]= values[0]+values[1];
        values[0]= values[1]-values[0];
    }
    public static void main(String[] args){
//        Array reference
        int[] values ={9,5};
        swapValuesWithoutThirdVar(values);
        System.out.println("Value of m is "+ values[0] + " and Value of n is " + values[1]);
    }
}

