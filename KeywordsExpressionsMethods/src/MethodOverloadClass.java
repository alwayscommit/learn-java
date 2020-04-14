public class MethodOverloadClass {

    public static void main(String[] args) {
        printPersonInfo(10,"aakash");
        printPersonInfo(10);
    }

    public static void printPersonInfo(int age, String name){
        System.out.println(name + " is " + age + " years old.");
    }

    public static void printPersonInfo(int age){
        System.out.println("Unknown is " + age + " years old.");
    }

    //change in return type does not overload the method
    //'printPersonInfo(int, String)' is already defined in 'MethodOverloadClass'
    /*public static String printPersonInfo(int age, String name){
        System.out.println(name + " is " + age + " years old.");
        return "done!";
    }*/

}
