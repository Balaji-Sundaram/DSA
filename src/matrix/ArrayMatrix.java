package matrix;

import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.security.PrivilegedAction;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class ArrayMatrix {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //testing the concept of scanner
//        String tempo2 = scanner.next();
//        String tempo = scanner.nextLine();// Consume the remaining newline character, means will skip the line because it read #n in the buffer
//        String tempo1 = scanner.nextLine();
//        System.out.println(tempo2+":"+tempo +":"+tempo1+":");


        //Array Matrix
        int[][] twoXtwo = new int[5][5];

        try{
           int tempo =  twoXtwo[6][6];
        }catch (IndexOutOfBoundsException e){
            System.out.println("Empty");
        }

       int tempo = 1;
        for (int i = 0; i < twoXtwo.length; i++) {
            for (int j = 0; j < twoXtwo.length; j++) {
                twoXtwo[i][j] = tempo;
                tempo++;
            }
        }
        for (int[] ints : twoXtwo) {
            for (int j = 0; j < twoXtwo.length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println();
        }

        // ThisIsAnAutomationEra
        String upperCaseWord = "ThisIsAnAutomationEra";

        upperCaseWord.transform(s -> {
           String tem=null;
            for(char temp : upperCaseWord.toCharArray()){
               System.out.println(temp);
                if (temp == 'I') {
                  tem = "he";
                }
            }
           return tem;


        });


        Callable<String> stringPrivilegedAction = () -> {
             String i = upperCaseWord.replace('I','i');
            return i;
        };

        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            Adder adder = new Adder();
            return adder.adr(a, b);
        };

        System.out.println(stringPrivilegedAction.call());


//        System.out.println(upperCaseWord);




    }
}
