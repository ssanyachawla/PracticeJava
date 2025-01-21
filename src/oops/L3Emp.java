package oops;
// Encapsulation using private modifier

// Employee class contains private data
// called employee id and employee name
class EmpDetails {
    private int  empid;
    private String ename;

    public void set(int empid,String ename){
        this.empid=empid;
        this.ename=ename;
    }
    public int get_id(){
        return empid;
    }
    public String get_name(){
        return ename;
    }
}
public class L3Emp{
    public static void main(String[] args) {
        EmpDetails e=new EmpDetails();
        e.set(78,"John");
        System.out.println("Employee id: "+ e.get_id());
        System.out.println("Employee Name: "+ e.get_name());
    }
}
