public class OperatorClass {

    public static void main(String[] args) {

        int result = 2 + 2; // 4
        //= and + are the two operators used here.
        System.out.println("2 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3
        System.out.println("4 - 1 = " + result);

        result = result * 5;
        System.out.println("3 * 5 = " + result);

        result = result / 5;
        System.out.println("15 / 5 = " + result);

        result = result % 3;
        System.out.println("3 % 3 = " + result);

        //Abbreviate Operators
        int intVal = 2;
        intVal++;
        System.out.println("2 + 1 = " + intVal);

        intVal--;
        System.out.println("3 - 1 = " + intVal);

        intVal += 10;
        System.out.println("2 + 10 = " + intVal);

        intVal *= 2;
        System.out.println("12 * 2 = " + intVal);

        intVal /= 6;
        System.out.println("24 / 6 = " + intVal);

        intVal -= 2;
        System.out.println("4 - 2 = " + intVal);

    }

}
