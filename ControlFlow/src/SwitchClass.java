public class SwitchClass {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value 1");
        } else if (value == 2) {
            System.out.println("Value 2");
        } else {
            System.out.println("No Value");
        }

        int switchVal = 3;
        switch (switchVal) {
            case 1:
                System.out.println("Switch value 1");
                break; //Without break, following cases will get executed
            case 2:
                System.out.println("Switch value 2");
                break;
            //Multiple cases with same functionality can be written like this
            case 3:
            case 4:
            case 5:
                System.out.println("Multi switch 3, 4, 5");
                System.out.println("Actual Multi switch " + switchVal);
                break;
            default:
                System.out.println("Switch no value");
                break;
        }


        String switchValString = "January";
        switch (switchValString.toLowerCase()) {
            case "january":
                System.out.println("january");
                break; //Without break, following cases will get executed
            case "FebRuary":
                System.out.println("FebRuary");
                break;
            default:
                System.out.println("Switch no value");
                break;
        }
    }
}
