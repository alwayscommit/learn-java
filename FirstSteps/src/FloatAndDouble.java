public class FloatAndDouble {

    public static void main(StringPlay[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float Min Value : " + minFloat);
        System.out.println("Float Max Value : " + maxFloat);
//Float Min Value : 1.4E-45
//Float Max Value : 3.4028235E38

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double Min Value : " + minDouble);
        System.out.println("Double Max Value : " + maxDouble);
//Double Min Value : 4.9E-324
//Double Max Value : 1.7976931348623157E308

        int intVal = 5;
//      float floatVal = 5.25; //default double, need to explicitly write f
        float floatVal = 5.25f;
        float floatVal2 = (float) 5.25;
        
        double doubleVal = 10.25; //works even if you don't write 'd'



    }

}
