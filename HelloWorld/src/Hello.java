//public and class are keywords
//public is an access modifier
//class is a keyword used to define a class
public class Hello {

    //This is the main method that serves as an entry point for any Java program.
    public static void main(String[] args) { //Code block starts here

        //This is a statement, a complete command
        System.out.println("Hello World");

        System.out.println("Hello, Aakash!");

        //Expression, Camel-Casing name, int is short for Integer, it is a keyword
        int myFirstNumber = 1993; //declaration and initialization
        System.out.println("Value of myFirstNumber is " + myFirstNumber);
        int mySecondNumber = 10;
        int myThirdNumber = 17;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("Value of myTotal is " + myTotal);

        int myAge = myTotal - myFirstNumber;
        System.out.println("Value of myAge is " + myAge);

    } //the code block ends here

//keywords are case-sensitive
}
