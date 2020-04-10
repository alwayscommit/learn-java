public class IntegerApp {
    public static void main(String[] args) {

        //width 32 bits
        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + minIntValue);
        System.out.println("Integer Maximum Value = " + maxIntValue);
        //Integer Minimum Value = -2147483648
        //Integer Maximum Value = 2147483647
        int maxIntValuePlusOne = Integer.MAX_VALUE + 1;
        System.out.println("Integer Maximum Value + 1 = " + maxIntValuePlusOne);
        //Integer Maximum Value + 1 = -2147483648; overflows to the negative range

        int maxIntValuePlusTen = Integer.MAX_VALUE + 10;
        System.out.println("Integer Maximum Value + 10 = " + maxIntValuePlusTen);
        //Integer Maximum Value + 1 = -2147483648; overflows

        int minIntValueMinusOne = Integer.MIN_VALUE - 1;
        System.out.println("Integer Minimum Value - 1 = " + minIntValueMinusOne);
        //Integer Minimum Value - 1 = 2147483647; underflow to the positive range

        int minIntValueMinusTen = Integer.MIN_VALUE - 10;
        System.out.println("Integer Minimum Value - 10 = " + minIntValueMinusTen);
        //Integer Minimum Value - 1 = 2147483638; underflow

        //Compile time error if the number is out of range
        //int maxIntPlusOneCompile = 2147483648; //Integer number too large

        //To make it more readable for the programmer, not used much
        int numWithUnderscore = 2_147_483_647;
        System.out.println("Integer numWithUnderscore (2_147_483_647) = " + numWithUnderscore);


    }
}
