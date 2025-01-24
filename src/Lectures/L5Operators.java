package Lectures;

public class L5Operators {
    public static void main(String[] args) {
//        Arithmetic Opr
        int num1= 500;
        int num2= 100;
        int sum=num1+num2;
        int diff=num1-num2;
//        Arithmetic opr on strings
        String n1="15";
        String n2="25";

//        Convert Strings to Integers
        int a1=Integer.parseInt(n1);
        int b1=Integer.parseInt(n2);
//        System.out.println("a+b = "+(a1+b1));
//        System.out.println("a-b = "+(a1-b1));
//        System.out.println("a*b = "+(a1*b1));
//        System.out.println("a/b = "+(a1/b1));
//        System.out.println("a%b = "+(a1%b1));

//        Unary Opr
//        int a=10;
//        int b=10;
//        System.out.println("Postincr : "+(a++));
//        System.out.println("Preincr : "+(++a));
//        System.out.println("Value of a : "+(a));
//        System.out.println("Postdecr : "+(b--));
//        System.out.println("Predecr : "+(--b));
//        System.out.println("Value of b : "+(b));

//        Assignment Operators
        int f=7;
//        System.out.println("f+=3: "+(f+=3));
//        System.out.println("f-=2: "+(f-=2));
//        System.out.println("f*=4: "+(f*=4));
//        System.out.println("f/=3: "+(f/=3));
//        System.out.println("f%=2: "+(f%=2));

//        Relational Operators
        int x=10;
        int y=3;
        int z=5;
//        System.out.println("x>y: "+(x>y));
//        System.out.println("x<y: "+(x<y));
//        System.out.println("x>=y: "+(x>=y));
//        System.out.println("x<=y: "+(x<=y));
//        System.out.println("x==z: "+(x==z));
//        System.out.println("x!=z: "+(x!=z));

//        Logical Operators
        boolean m= true;
        boolean n=false;
//        System.out.println("m && n: "+(m && n));
//        System.out.println("m || n: "+(m || n));
//        System.out.println("!m: "+(!m));

//        Ternary Operator
//        condition?if true:if false
        int a=20;
        int b=10;
        int c=30;
        int result;
//        *condition1* if a is greater than b ? *if condition1 true* then *condition2* check if a is also greater than c ? *if condition2 true* then return a : *if condition2 false* return c : *if condition1 false* then check *condition3* b is greater than c ? *if condition3 true* return b : *if condition3 false* return c

//        result=((a>b)?(a>c)?a:c:(b>c)?b:c);

//      Shift Opr
        int s = 10;

        // Using left shift: multiplies by 2
        System.out.println("s<<1 : " + (s << 1));

        // Using right shift: divides by 2
        System.out.println("s>>1 : " + (s >> 1));



    }
}
