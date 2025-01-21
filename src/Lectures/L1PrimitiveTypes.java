package Lectures;

public class L1PrimitiveTypes {
    public static void main(String[] args) {
//        PRIMITIVE TYPES- TO STORE numbers,characters,booleans
//        we don't need 4 bytes of memory to store someone age
//        so instead of using int we can use byte that takes upto 1 byte
//        with range [-128, 127]
        byte age = 30;
//        to store views on Youtube video
        int viewCount = 1_123_456_789;
//        now if we want to store value bigger than int range i.e. 2Billion it cant be stored in int
//        int views = 3_123_456_789;
//        java still sees long as an integer so make sure to add l/L as suffix to the number
        long views = 3_123_456_789L;
//        for any decimal number java sees it as a double so you must add suffix F/f to represent it as a float
        float price = 10.99F;
//        single characters with single quotes
//        multiple characters with double quotes
        char letter = 'A';
        boolean isEligible = false;
    }
}
