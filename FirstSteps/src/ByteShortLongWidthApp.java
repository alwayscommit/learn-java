public class ByteShortLongWidthApp {

    public static void main(StringPlay[] args) {

        //has a width of 8, occupies 8 bits
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + minByteValue);
        System.out.println("Byte Maximum Value = " + maxByteValue);
        //Byte Minimum Value = -128
        //Byte Maximum Value = 127
        //The range is much smaller, takes up less memory.
        //Could be used for performance optimization if you're
        //sure that a variable will play within this range.

        //larger range of numbers, 16 bits
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + minShortValue);
        System.out.println("Short Maximum Value = " + maxShortValue);
        //Short Minimum Value = -32768
        //Short Maximum Value = 32767

        //lowercase l throws an error, looks like one.
        long myLongValue = 100L;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + minLongValue);
        System.out.println("Long Maximum Value = " + maxLongValue);
        //Long Minimum Value = -9223372036854775808
        //Long Maximum Value = 9223372036854775807

        long myLongInt = 100; //Treated as Integer,
        // if you don't mention L at the end
        //Doesn't give an error.
        //long myLongerInt = 2147483648;
        //Gives an error as max int is 2147483647

        //byte < short < int < long
    }
}
