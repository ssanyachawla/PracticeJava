package oops;

public class L2Employee {
    //   Instance variables
    String Employee_name;
    float Employee_salary;
    // Instance methods
    void set(String name,float salary){
        Employee_name =name;
        Employee_salary=salary;
    }

    void get(){
        System.out.println("Employee name is: "+ Employee_name);
        System.out.println("Employee CTC is: "+ Employee_salary);
    }

    public static void main(String[] args) {

        L2Employee emp1=new L2Employee();
        emp1.set("Sanya Chawla", 30000.0f);
        emp1.get();
        L2Employee emp2=new L2Employee();
        emp2.set("Rohan Verma", 20000.0f);
        emp2.get();
    }
}


