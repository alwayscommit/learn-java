public class TernaryOperator {

    public static void main(String[] args) {

        boolean adult = false;

        boolean isAdult = adult == true ? true : false;
        System.out.println("isAdult : " + isAdult);

        int age = 15;
        isAdult = age > 18 ? true : false;
        System.out.println("isAdult : " + isAdult);

    }

}
