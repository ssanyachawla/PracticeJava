package Lectures;

import java.util.Date;

public class L2ReferenceTypes {
    public static void main(String[] args) {
        byte age=30;
//    in case of primitive types we don't need to allocate memory, done by JRE
//    Primitive types don't have members
//    but in reference types we always have to allocate memory using new opr
//    memory released by JRE
        Date now= new Date();
//    This var is the instance of the Date class i.e. object
//    it members can be accessed by dot opr, since this class Date is predefined we can use its members using (.)
        System.out.println(now.getTime());
        System.out.println(now);

    }

}