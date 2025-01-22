package union_Find;

import java.lang.reflect.Array;

public class Union_find_Algorithm {
//@Author Balaji Sundaram
//this is Union find algorithm / quick find.
//by using this the user can find the values quickly


    private int[] array;

    public void setLength(int len){
        // this will set the no of values will be stored in the array
        this.array= new int[len];
        for(int i = 0; i < len; i++){
            this.array[i] = i;
        }
    }

    public int[] getArray(){
        return this.array;
    }

    public Boolean findUnion(int a, int b){
        return this.array[a] == b && this.array[b] == b;
    }

    public void setUnion(int a, int b){
//        if(this.array[a] == a && this.array[b] == b){
//            this.array[a] = b;
//        }
//            int temp = this.array[b];
//            int old = this.array[a];
        if(!findUnion(a,b)){
            for (int i=0;i<this.array.length;i++){
                if(this.array[i] == this.array[a]){//a is old one, getting the old mapping value, if true, then
                    this.array[i] = this.array[b]; // setting the new value for mapping the nodes.
                }
            }
        }
    }

    public Union_find_Algorithm() {
    }
}
