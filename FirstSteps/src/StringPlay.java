public class StringPlay {
    public static void main(String[] args) {

        String primitiveType = "byte, short, int, long";
        String morePrimitiveType = ", float, double, char, boolean";
        String copyrightString = ". \u00A9 2019";
        System.out.println("Primitive Types : " + primitiveType + morePrimitiveType + copyrightString);

        String numberString = "1";
        int anotherNumber = 2;
        String finalNumber = numberString + anotherNumber;
        System.out.println("Number String : " + finalNumber);


    }
}
