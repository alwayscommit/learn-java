public class OperatorChallenge {

    public static void main(String[] args) {

        double doubleVal1 = 20.00d;
        double doubleVal2 = 80.00d;
        double doubleResult = (doubleVal1 + doubleVal1) * 100;
        double remainderVal = doubleResult % 40;

       boolean hasRemainder = remainderVal==0 ? false : true;

       if(hasRemainder){
           System.out.println("Got some remainder!");
       } else {
           System.out.println("No remainder!");
       }


    }
}
