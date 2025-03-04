package Lectures;

class geek {
    String value;
    public void test(String value){
        this.value=value;
    }
}

public class L10InstanceMethods {
    public static void main(String[] args) {
        geek t =new geek();
        t.test("hello");
        System.out.println(t.value);
    }


}
