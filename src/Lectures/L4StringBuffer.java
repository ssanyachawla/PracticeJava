package Lectures;

public class L4StringBuffer {
    public static void main(String[] args) {
//        Creating String Buffer
        StringBuffer s = new StringBuffer();

//        Adding elements in StringBuffer
        s.append("Hello");
        s.append(" ");
        s.append("world");
        System.out.println(s);

//        String str = s.toString();
        String str=s.toString();
        System.out.println(str);


    }
}

//String Buffer is mutable-can modify contents of obj after it has been created