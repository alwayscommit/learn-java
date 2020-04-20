public class DoWhileClass {

    public static void main(String[] args) {

        int count = 10;
        //never enters while loop because of the condition
        //There are no semicolons here, like for-loop
        while (count != 10) {
            System.out.println(count);
            count++;
        }

        int anotherCount = 10;
        //Enters the loop block once, then checks the condition
        do {
            System.out.println("Hello " + anotherCount);
            anotherCount++;
        } while (anotherCount != 11);//This semicolon is needed

        int i = 10;
        int evenCount = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Even Number : " + i);
                evenCount++;
            } else {
                i++; //This is needed because of the below mentioned reason
                continue;
            }

            if (evenCount == 3) {
                System.out.println("Found 3 even numbers!");
                break; // breaks the loop, exits the loop on finding 3 even numbers
            }

            i++; // This will cause the loop to stop at 11 itself because no increment happens before continue statement.
        }

    }


}
