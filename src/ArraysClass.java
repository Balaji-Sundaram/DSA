import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ArraysClass {

    public static void main(String[] args) {
        System.out.println("Hey");
        char alphaChar[] = new char[26];  // this is the char array
        alphaChar[1] = 97;
        for (int iterator = 0, ascii = 97;iterator<26;iterator++,ascii++){
            alphaChar[iterator] = (char) ascii;
        }
        System.out.println(Arrays.toString(alphaChar));
        String converter = Arrays.toString((alphaChar));
        String charAlpha[] = converter.split(",");
//        converter = converter.replace(",","\n");
        System.out.println(Arrays.toString(charAlpha));


    }

}

class MatrixArray{
    public static void main (String[] args){
        //January month calendar
        String[][] janCalendar = new String[5][8];
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");

         int day = 1;
         for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                calendar.set(Calendar.DAY_OF_WEEK,j);
                if(i == 0 && j == 0)
                    janCalendar[i][j] = "Wk\\DA ";
                else if(i == 0)
                    janCalendar[i][j] = simpleDateFormat.format(calendar.getTime());
                else if(j == 0)
                    janCalendar[i][j] = "Week";
                else{
                    janCalendar[i][j] = String.valueOf(day);
                    day++;
                }


            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                if(i == 0)
                    System.out.print(janCalendar[i][j]+"|");
                else
                    System.out.print(janCalendar[i][j]+"  |  ");
            }
            System.out.print("\n");
        }



    }
}

class MatrixProject{
    public static void main(String[] args){
        int mealRoutine[][] = {
                {1, 2, 3, 4, 5, 6, 7},
                {0, 1, 1, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0},
        };
        int v1[] = {1,2,3,4};
        int v2[] = {1,2,3,4};
        int rout [][] = Arrays.copyOfRange(mealRoutine,1, mealRoutine.length-2);  // seems we can copy only the rows, not to the specific column.
        System.out.println(Arrays.deepToString(rout));
        System.out.println(Arrays.equals(v1,v2));  //proper way to compare the 1D arrays
        System.out.println(Arrays.deepEquals(mealRoutine,rout));//proper way to compare the Multi dimensional arrays


        //Instead of print the matrix in a loop this is an easy way to print the value, and it's efficient too
       // System.out.println(Arrays.deepToString(medicineRoutine).replace("],", "]\n"));
        char vari[] = {'q','e','z','a','o'};
        String  var[] = {"hay", "Hey", "dood","Dood"}; // sorting will sort caps and small letter even though same, first priority is caps sorting then small letter sorting
        Arrays.sort(vari);                          //sorting the array to ascending
        char vari2[] = Arrays.copyOf(vari,vari.length);// proper way to copy an array
        System.out.println(Arrays.toString(vari));
        int i = Arrays.binarySearch(vari,'a');  //finding the index pos of the small 'a'
        System.out.println(i);
        //array filling
        Arrays.fill(vari,i,(i+1),'A');  // Giving the index position to fill with the replacement character
        System.out.println(Arrays.toString(vari));
        System.out.println(Arrays.toString(vari2));


    }
}

class ArrayListProject{
    public static void main(String[] args){

        //need to check the time complexity with GPT
        //declaring an array list
        ArrayList<Integer> arrayList = new ArrayList<> ();
        arrayList.add(1);
        arrayList.add(4);
        System.out.println(arrayList.toString());

        //cloning an array
        ArrayList<Integer> arrayList1 = (ArrayList<Integer>) arrayList.clone();
        arrayList1.add(12313);
        arrayList1.add(12);
        arrayList1.add(123);
        arrayList1.add(121);
        System.out.println(arrayList1.toString());

        //Lambda based condition
//        arrayList.removeIf(list -> list==1); // this is straight forward loop

        // this is somewhat complex loop, if you want to remove based on some complex logics you can go for this again,
        // it will process one by one. So, need to be carefully handle this thing.
        arrayList.removeIf(list -> {
            if(list == 1){
                System.out.println(list+" Value found");
                return true;
            }
            else {
                System.out.println(list+" Not Value found");
                return false;
            }
        });
        System.out.println(arrayList.toString());

        //set two of lambda
        //not only removeIf will do the for loop, if you need a perfect loop use this foreach method
        AtomicInteger temp = new AtomicInteger(); //if you want to use inside Lambda need to convert this into atomic one
        Integer t = 0;

        arrayList1.forEach(list->{
            System.out.println("Value in Index "+temp+": "+list);
            temp.getAndIncrement();
        });


        //sorting
        //descending order
        arrayList1.sort(Comparator.reverseOrder());
        System.out.println(arrayList1.toString());
        //ascending order
        arrayList1.sort(Comparator.naturalOrder());
        System.out.println(arrayList1.toString());

        //this method will replace the values based on the condition used in lambda
//        arrayList1.replaceAll(te->te*2);
        arrayList1.replaceAll(te->{
            if(te == 1)
                return 250;
            else
                return te;
        });
        System.out.println("Replace all method : "+arrayList1.toString());

        //if you want to keep the common elements in an arraylist use this method
        //retainAll

        arrayList1.retainAll(arrayList); // this will keep the common elements in the arraylist(the second list)
        System.out.println(arrayList1.toString());




    }
}

class HashMapProject{
    public static void main (String[] args){
        System.out.println("Hash Value found...!");
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Weeknd");
        hashMap.putIfAbsent(1, "heyy"); //works for key, if the key is existing, then it won't add, if not, it will add.
        System.out.println(hashMap.toString());
        System.out.println(hashMap.getOrDefault(5,"heyy")); // this is like kind of switch default, if the key found it will print the key value of the map, else will print the default that you defined
        HashMap<Integer, String > hashMap1 = hashMap;//here it will copy, but if you modufy anything in the old, it will reflect in the new map also, it will be wise versa.
        hashMap.put(2,"bilie eilish");
        hashMap1.put(3,"eminem");
        System.out.println(hashMap1+"\n"+hashMap);
        HashMap<Integer, String> hashMap2 = (HashMap<Integer, String>) hashMap1.clone();
        hashMap2.put(4, "Drake");
        hashMap2.put(5,"tupac");
        hashMap2.put(6,"Dr.Dre");
        hashMap2.put(7,"Snoop Dogg");
        hashMap2.put(8,"Dua Lipa");
        hashMap2.put(9,"Michael Jackson");
        hashMap2.put(10,"Ice Cube");
        hashMap2.put(11,"The Notorious B.I.G.   ");
        hashMap2.put(12,"DMX");
        System.out.println(hashMap2.toString().replace(",","\n"));
        //Work with lambdas
        //foreach
        hashMap2.forEach((key , value) -> {
            if(value.equalsIgnoreCase("dmx")){
                System.out.println("Value Found " +value);
                hashMap2.replace(key, "Lana Del Ray");
            }
        });

        System.out.println(hashMap2.toString().replace(",","\n"));




    }
}