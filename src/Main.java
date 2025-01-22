import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    static int tempo;
    public static void main(String[] args) {
        System.out.println(tempo);
    }
}

class RevMain {
    public static void main(String[] args) {
        boolean test$Test = true;
        System.out.println(test$Test);
        Character test$c = 'r';
        String amt = "Total Amount";
        System.out.println(  test$c.charValue());
        double dbl = 1.2f;
        System.out.println(dbl);
        System.out.printf("%.2f :            %s",dbl,amt);

        System.out.println("\n\n\n\nInt to Double Conversion");
        int num1 = 12;
        double db;
        db = num1;
        System.out.println(db);
        db = 334.43;
        System.out.println(db);
        num1 = (int) db;
        System.out.println(num1);
        System.out.println("Int to Double Conversion\n");

        System.out.println("\nWork with Strings");
        //String Format codes
        //%b, %B	Boolean
        //%s, %S	String
        //%c, %C	Unicode Character
        //%d	    Decimal Integer
        //%f	    Floating Point Numbers
        //%o        for octal integers
        //%x, %X    for hexadecimal numbers
        //%e, %E    for scientific notations
        //String Format codes

        String literalDeclaration = "Snoop Dogg";
        String objDeclaration = new String("Notorious Big");
        System.out.println((literalDeclaration.equals(objDeclaration)) + " IT WILL BE FALSE");
        objDeclaration = "Snoop Dogg";
        System.out.println((literalDeclaration == objDeclaration)+" IT WILL BE TRUE");
        System.out.printf("Hey this is %s %d \n","Yezdi Adventure ",2024);
        System.out.printf("Hexa value for 255 is:  %x \n", 255 );

        // using comma, or space based on the preference we can split a string
        //here are some examples
        String testSample = "Hey buddy boss born bucks bucket";
        System.out.println(Arrays.toString(testSample.split(" "))); //here we split the string to array, then the Array.toString will convert to readable format

        String testToString[] = testSample.split(" ");
        String testJoinString = "dood ";
        testJoinString += String.join("|",testToString);
        System.out.println(testJoinString);
        //testing the equal and elseIgnore case
        String test1 = "DOOD", test2 = "dood";
        System.out.println(test1.equals(test2));
        System.out.println(test1.equalsIgnoreCase(test2));
        test1 = test1.replace("DOOD", "hey");
        System.out.println(test1);
        System.out.println("Work with Strings\n");

        System.out.println("\nWork with Scanners");
        Scanner scanner = new Scanner(System.in);
        int inp1 = scanner.nextInt();
//        scanner.nextLine();// this will consume the newline character created by nextInt
        int inp2 = scanner.nextInt();
        System.out.println(inp1);
        System.out.println(inp2);
        System.out.println("Work with Scanners\n");

        System.out.println("\nWork with Switches");
        System.out.println("1: Add | 2: Subtract | 3: Divide | 4: Multiply\n");
        int optionsToPerform = scanner.nextInt();

        switch(optionsToPerform){
            case 1:
                System.out.println("The Sum of two values is : " + (inp1+inp2));
                break;
            case 2:
                System.out.println("The Subtraction of two values is : " + (inp1-inp2));
                break;
            case 3:
                System.out.println("The Division of two values is : " + (inp1/inp2));
                break;
            case 4:
                System.out.println("The Multiply of two values is : " + (inp1*inp2));
                break;
            default:
                System.out.println("Invalid Things...!");
        }

        scanner.close();
        System.out.println("Work with Switches\n");






    }
}

class RevIIMain{
    public static void main(String [] args){
        String str1 = new String("dood");
        String str2 = new String("dood");

        System.out.println(str2 == str1);
    }
}