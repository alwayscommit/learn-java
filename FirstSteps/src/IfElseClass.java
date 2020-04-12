public class IfElseClass {

    public static void main(String[] args) {

        boolean isAdult = false;
        if (isAdult == false) {
            System.out.println("You are not an adult! - 1");
        } else {
            System.out.println("You are an adult! - 1");
        }

        if (isAdult == false) ; // this semicolon ends the if else statement
        System.out.println("You are an adult! - 2"); // this line will anyway execute

        if (isAdult == true) // this works
            System.out.println("You are an adult! - 3");
        System.out.println("You are an adult! - 4");// This will anyway execute as there's no code block after if statement,
        // accepts only the immediate line next to if

        //You are not an adult! - 1
        //You are an adult! - 2
        //You are an adult! - 4

        //Always add a code block

        int maxAge = 150;
        if (maxAge == 150) {
            System.out.println("Your time has come!");
        }
        maxAge = 20;
        if (maxAge < 150) {
            System.out.println("Enjoy your life!");
        }

        //Young
        int minYoungAge = 15;
        int maxYoungAge = 60;
        int age = 40;
        //Logical AND operator, both conditions need to be true
        if ((age >= minYoungAge) && (age <= maxYoungAge)) {
            System.out.println("Young Adult! AND condition");
        }

        age = 12;
        //Only one condition needs to be true in OR
        if ((age >= minYoungAge) || (age <= maxYoungAge)) {
            System.out.println("Young Adult! OR Condition");
        }

        //Difference between operators
        int someNum = 200;

        //Assignment operator is different than equal-to operator
        /*if(someNum = 200){
            System.out.println("Error!");
        }*/

        if(someNum == 200){
            System.out.println("Assignment vs Equal-to Operator!");
        }

        boolean isAlive = false;
        if(isAlive = true){
            System.out.println("---This shouldn't happen!");
            System.out.println("The isCar value changed from false to : " + isAlive);
            System.out.println("Assignment happens inside IF condition---");
        }

        if(isAlive){
            System.out.println("Alive!");
        } else {
            System.out.println("Not Alive!");
        }



    }


}
