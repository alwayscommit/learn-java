public class StatementIndentClass {

    public static void main(String[] args) {

        int randomVar = 40; //Entire line is a statement
        randomVar++;//Statement, method calls are also a statement
        System.out.println("This is a statement");//semicolon is needed to end a statement in most cases.
        System.out.println("This " + //; semicolon here would confuse Java
                "is " +
                "just " +
                "fine " +
                "as far as Java is concerned."); // Makes code more readable.

        int numA = 1; int numB = 2; int numC = 3; //This is fine but better to separate them on different lines.

        int numWhitespace           = 100; //this works too but not recommended.

        //Indentation
int x=1;
int y=2;
int z=3;
System.out.println(x+y+z);
if(x==1){
System.out.println("hello");
}
//Indentation just makes code more readable. IDE usually does this automatically.
    }
}
