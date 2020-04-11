public class CastingAndChallenge {

    public static void main(String[] args) {

        int intVar = Integer.MIN_VALUE / 2;
        int intDivision = intVar / 2; // works

        byte byteDivision = Byte.MIN_VALUE / 2;

        byte byteVar = Byte.MIN_VALUE;
//      byte byteVariableDivision = byteVar/2; //This line throws an error because by default whole
        //number used by Java is Integer

        //Casting is needed to tell java to treat byteVar as byte
        byte byteVariableDivision = (byte) (byteVar / 2);

        short minShort = Short.MIN_VALUE;
        //short shortVar = minShort / 2; // Required type: short // Provided: int
        short shortVar = (short) (minShort / 2);

        //Use an Integer most of the times unless you have a good reason not to

        //Challenge #1
        byte byteChallenge = 125;
        short shortChallenge = 111;
        int intChallenge = 140;
        long longChallenge = 50000L + 10L * (byteChallenge + shortChallenge + intChallenge);
        System.out.println("Long Challenge : " + longChallenge);
        //long will happily accept and int or any value of size less than long.

        //Here casting is needed as all vars are treated as int. Need to explicitly tell.
        short shortResult = (short) (1000+10*(byteChallenge+intChallenge+shortChallenge));


    }
}
