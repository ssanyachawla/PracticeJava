package Lectures;

import java.awt.*;

public class L3PrimVsRef {
//    public static void main(String[] args) {
//        byte x=1;
//        byte y=x;
//        x=2;
//        System.out.println(y);
//        System.out.println(x);
////        none is affected as x and y are completely unaffected of each other
//    }
     public static void main(String[] args) {
//         in case of reference types, the var is not gonna hold the actual value, instead it will hold the address to the object
//         so in memory at some address say 100 point(1,1) is stored
//         and now point1 stores address 100 and point2 stores address 100
//         both are references to point(1,1)
//         if there is a change in either one, it will be showcased in both

         Point point1 = new Point(1,1);
         Point point2 = point1;
         point1.x=2;
         System.out.println(point2);

     }
}


