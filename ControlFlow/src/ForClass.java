public class ForClass {

    public static void main(String[] args) {
        /*System.out.println("Calculate simple interest with 10 different rates...");
        System.out.println("1% Interest on 100 = " + calculateInterest(100,1));
        System.out.println("2% Interest on 100 = " + calculateInterest(100,2));
        System.out.println("3% Interest on 100 = " + calculateInterest(100,3));
        System.out.println("4% Interest on 100 = " + calculateInterest(100,4));
        */
        //Like this you'll have to write 10 different statements

        //Instead you could just use a for-loop
        /*for(initialization, termination, increment){

        }*/

        for(int i=1; i<=10; i++){
            //int i is valid only within this loop, that is its scope
            System.out.println(i+"% Interest on 100 = " + calculateInterest(100,i));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
