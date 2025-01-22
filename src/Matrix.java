import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Matrix {
    public static void main (String[] args){
        //matrix logic
        String [] [] matrix = new String[2][2];
        String [] [] matrix_2 = new String[4][4]; // array of string
        Arrays[][] arrays = new Arrays[5][5];  // array of object
        Arrays[] arrays2 = new Arrays[5];
        matrix[1][0] = "1223";
        matrix_2[0][1] ="243";
        Array[] arrays3 = new Array[5];


        Map<Integer,String[][]>nMap = new HashMap<>();
        nMap.put(1,matrix_2);
        nMap.put(2,matrix);
        System.out.println(Arrays.deepToString(nMap.get(1))+Arrays.deepToString(nMap.get(2)));
      System.out.println(Arrays.deepToString(matrix_2));

    }
}
