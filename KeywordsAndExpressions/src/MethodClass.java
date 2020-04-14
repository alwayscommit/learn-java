//Methods are a way to lessen code duplication and make it easier to maintain it
public class MethodClass {

    //main is a method, can't put a method within a method
    public static void main(String[] args) {
        //isAdult(); //This doesn't really help because we can't pass any parameters
        //If we want to change maxAge and minAge conditions, we'll have to rewrite another method
        boolean isOld = isOld(40, 50, 20);
        System.out.println("Is the man old? : " + isOld);
        isOld = isOld(20, 60, 25);
        System.out.println("Is the man old? : " + isOld);


        //Programming challenge
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Aakash", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Water", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Ice", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Fire", position);

        position = calculateHighScorePosition(1000); //comes as position 4 if you don't have >=
        displayHighScorePosition("Air", position);
    }

    //Program this method only once
    public static boolean isOld(int age, int maxAge, int minAge) {
        //Parameters are coming from outside the method.
        /*int age = 40;
        int maxAge = 50;
        int minAge = 10;*/

        if (age < maxAge && age > minAge) {
            return false;
        } else {
            return true;
        }
    }
    //if the return type is int, you can return -1 to denote there was an error in the method

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        //Make these as >= <=
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 /*&& score < 1000*/) {//&& score < 1000 is not needed as first if already checks this.
            return 2;
        } else if (score >= 100 /*&& score < 500*/) {
            return 3;
        } /*else {
            return 4;
        }*/
        //If multiple returns are confusing, you can initialize a local variable
        //int position = 4 by default, and assign appropriate value to it and return just once
        return 4;
    }


    //method should be within the class
}
