public class CharAndBoolean {

    public static void main(StringPlay[] args) {

        //width 16 bits, 2 bytes
        //Allows you to store Unicode characters
        char charVal = 'D';
//      char charVal = 'Dd'; Too many characters in character literal
        char unicodeChar = '\u0044';
        char copyrightChar = '\u00A9';

        System.out.println("charVal = " + charVal);
        System.out.println("unicodeChar = " + unicodeChar);
        System.out.println("copyrightChar = " + copyrightChar);
        //char use - to capture last keystroke, array chars.

        boolean booleanTrueVal = true;
        boolean booleanFalseVal = false;
        boolean isAdult = false;

    }

}
