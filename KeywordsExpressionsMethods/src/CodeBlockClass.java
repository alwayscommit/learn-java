public class CodeBlockClass {

    public static void main(String[] args) {

        boolean isOld = true;
        int age = 40;
        int maxAge = 50;
        int minAge = 10;

        //Can work without braces, only for the next immediate line.
        if (age > maxAge)
            System.out.println("This man is old!");

        System.out.println("This man is young!");//This will always execute irrespective of the IF condition

        //Best practice, always include code blocks, if a new developer comes and enters another line below the first line after IF, it'll cause problems as it'll always execute.
        if (age > maxAge) {
            System.out.println("This man is old!");
        }


        if (age > maxAge) {
            System.out.println("This man is old!");
        } else {
            System.out.println("This man is young!");
        }

        if (age > maxAge) {
            System.out.println("This man is old!");
        } else if (age < minAge) {
            System.out.println("This is a baby!");
        } else {
            System.out.println("This man is young!");
        }

        if(true){ //code block begins
            int blockVar = 100;
            System.out.println("Block!" + blockVar);
        } //code block ends
        //You can't access blockVar outside the code block
//       System.out.println(blockVar);


        //Challenge
        //Define new max and min age without disrupting the above output conditions

        //One option is to copy paste the code and create similar code like shown here
        boolean isOldNew = true;
        int ageNew = 40;
        int maxAgeNew = 50;
        int minAgeNew = 10;
        //This will result in wastage of memory, instead you could just reuse the above variables
        //below the output condition statements like shown below
        //Challenge
        //Define new max and min age without disrupting the above output conditions

        //One option is to copy paste the code and create similar code like shown here
        isOld = true;
        age = 20;
        maxAge = 60;
        minAge = 15;
        //This will save memory by reusing old variables, we won't have to declare new variables.

        //Code duplication is a bad thing because if you want to make a change, you'll not
        //know where all the changes are supposed to reflect.



    }//Main ends here

}
