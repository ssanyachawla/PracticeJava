package Lectures;

//public class L21Sum {
////    Method Overloading
//    public int sum(int x,int y){
//        return(x+y);
//    }
//    public int sum(int x,int y,int z){
//        return(x+y+z);
//    }
//    public double sum(double x,double y){
//        return (x+y);
//    }
//
//    public static void main(String[] args) {
//        L21Sum s=new L21Sum();
//        System.out.println(s.sum(10,20));
//        System.out.println(s.sum(10,20,30));
//        System.out.println(s.sum(10.5,20.5));
//    }
//}

// 1.   changing the number of parameters
//class Product{
//    public int multiply(int a,int b){
//        int prod=a*b;
//        return prod;
//    }
//    public int multiply(int a,int b,int c){
//        int prod=a*b*c;
//        return prod;
//    }
//}
//class L21Sum{
//    public static void main(String[] args) {
//        Product ob= new Product();
//        int prod1=ob.multiply(1,2);
//        System.out.println("Product of two Integer value: "+prod1);
//        int prod2=ob.multiply(1,2,3);
//        System.out.println("Product of the three integer value: "+prod2);
//    }
//}

//2. changing Data types of arguments
//class Product {
//    // Multiplying three integer values
//    public int Prod(int a, int b, int c)
//    {
//        int prod1 = a * b * c;
//        return prod1;
//    }
//
//    // Multiplying three double values.
//    public double Prod(double a, double b, double c)
//    {
//        double prod2 = a * b * c;
//        return prod2;
//    }
//}
//
//class L21Sum {
//    public static void main(String[] args)
//    {
//        Product obj = new Product();
//
//        int prod1 = obj.Prod(1, 2, 3);
//        System.out.println(
//                "Product of the three integer value :" + prod1);
//
//        double prod2 = obj.Prod(1.0, 2.0, 3.0);
//        System.out.println(
//                "Product of the three double value :" + prod2);
//    }
//}

//3. Changing the Order of the Parameters of Methods
class Student {
    // Method 1
    public void StudentId(String name, int roll_no)
    {
        System.out.println("Name :" + name + " "
                + "Roll-No :" + roll_no);
    }

    // Method 2
    public void StudentId(int roll_no, String name)
    {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " "
                + "Name :" + name);
    }
}

class L21Sum {
    public static void main(String[] args)
    {
        Student obj = new Student();
        // Passing name and id
        // Note: Reversing order
        obj.StudentId("Spyd3r", 1);
        obj.StudentId(2, "Kamlesh");
    }
}

