package Lectures;

public class L4Strings2 {
    public static void main(String[] args) {
        String s1 ="knowledge";
//        string pool creates a space in memory and stores knowledge
//        now s1 points to this space
        String s2=s1;
//        now s2 points to this space as well
        s1=s1.concat("base");
//        Creates a new String "knowledge base"
//        s1 points to this new string
//        String pool-stores string literals in a pool to save memory.

        String s3="Computer-";
        String s4="Science";
        String s5=s3.concat(s4);
//        String s6=null;
//        String s7=s5.concat(s6);

        System.out.println(s5);

        String a="Geeks";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            String ch1=Character.toString(ch);
            b=b.concat(ch1);

        }
        System.out.println(""+a);
        System.out.println();

    }

}
