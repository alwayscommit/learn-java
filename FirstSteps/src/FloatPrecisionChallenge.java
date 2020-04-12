public class FloatPrecisionChallenge {

    public static void main(StringPlay[] args) {

        int intVal = 5/3;
        float floatVal = 5f/3;
        double doubleVal = 5d/3;

        System.out.println("int value : " + intVal);
        System.out.println("float value : " + floatVal);
        System.out.println("double value : " + doubleVal);
        //int value : 1
        //float value : 1.6666666 //7 digits
        //double value : 1.6666666666666667 //16 digits

        //double numbers are processed faster at the processor level
        //Java libraries are also written to deal with double more than float
        //double is default if you don't mention d or f

        //Challenge #2
        double pounds = 200d;
        double poundToKgMultiplier = 0.45359237d;
        double kg = pounds * poundToKgMultiplier;
        System.out.println(pounds + " pound(s) = " + kg + " kg(s)");



    }

}
