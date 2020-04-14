//There are about 53 keywords reserved in Java for special operations
public class KeywordExpressionClass {

    public static void main(String[] args) {

//      int int = 5; won't work as int is a keyword
        int int2 = 5; // works, other keywords are true, false, boolean, total over 50...

        double mileToKmMultiplier = 1.609344; // expression, entire line except datatype and semicolon is an expression
        double twoMiles = 2 * mileToKmMultiplier; // expression

        int randomNum = 1000;
        if(randomNum==1000){ //randomNum==1000 is an expression
            System.out.println("This is also an expression!"); //anything between brackets is an expression
        }

    }


}
