import union_Find.Union_find_Algorithm;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_DSA {
    public static void main(String[] args) {

        Union_find_Algorithm unionFindAlgorithm = new Union_find_Algorithm();
        unionFindAlgorithm.setLength(12);
        System.out.println(Arrays.toString(unionFindAlgorithm.getArray()));
//        System.out.println(unionFindAlgorithm.findUnion(1,2));
        unionFindAlgorithm.setUnion(1,2);
//        System.out.println(unionFindAlgorithm.findUnion(1,2));
        System.out.println(Arrays.toString(unionFindAlgorithm.getArray()));
        unionFindAlgorithm.setUnion(2,3);
        System.out.println(Arrays.toString(unionFindAlgorithm.getArray()));
        unionFindAlgorithm.setUnion(3,11);
        System.out.println(Arrays.toString(unionFindAlgorithm.getArray()));





    }
}