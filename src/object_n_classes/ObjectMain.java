package object_n_classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObjectMain {
    public static void main(String [] args){
        SongArtist songArtist = new SongArtist();
        songArtist.setSongReleasedYear("25-Jan-2025");
        songArtist.setSongName("Till i Collapse");
        songArtist.setSongArtist("Eminem");
        System.out.println(songArtist.getSongReleasedYear());
    }
}

class hashMapMain{
    public static void main(String [] args){
        HashMap<Integer, SongArtist> artistMap = new HashMap<>();
        artistMap.put(1,new SongArtist("Mocking Bird","Eminem","25-Apr-2004"));
        artistMap.put(2,new SongArtist("Till I Collapse","Eminem","26-May-2002"));
        artistMap.put(3,new SongArtist("Lose yourself","Eminem","26-Oct-2002"));
        artistMap.put(4,new SongArtist("Without me","Eminem","13-May-2002"));
        artistMap.put(5,new SongArtist("The Real SLim Shady","Eminem","26-Oct-2000"));
        artistMap.put(6,new SongArtist("The Next Episode","Snoop Dogg","25-Apr-1999"));
        artistMap.put(7,new SongArtist("Bitch Please","Snoop Dogg","26-May-2002"));
        artistMap.put(8,new SongArtist("California Love","Tupac","26-Oct-1996"));
        artistMap.put(9,new SongArtist("Hypnotize","The Notorious B.I.G.","13-May-1994"));
        artistMap.put(10,new SongArtist("Big Poppa","The Notorious B.I.G.","26-Oct-1994"));
        artistMap.put(11,new SongArtist("In Da Club","50 Cent","25-Apr-2003"));
        artistMap.put(12,new SongArtist("Just A Lil Bit","50 Cent","26-May-2005"));
        artistMap.put(13,new SongArtist("Ayo Technology","50 Cent","26-Oct-2007"));
        artistMap.put(14,new SongArtist("You Know How We Do It","Ice Cube","13-May-1993"));
        artistMap.put(15,new SongArtist("After Hours","The Weeknd","26-Oct-2020"));
        artistMap.put(16,new SongArtist("Starboy","The Weeknd","26-May-2016"));
        artistMap.put(17,new SongArtist("Save Your Tears","The Weeknd","26-Oct-2020"));
        artistMap.put(18,new SongArtist("Blinding Lights","The Weeknd","13-May-2020"));
        artistMap.put(19,new SongArtist("The Hills","The Weeknd","26-Oct-2016"));
        artistMap.put(20,new SongArtist("I feel it Coming","The Weeknd","26-Oct-2016"));



//        //using entry set, so this will return the object of the map and we can get the key and value
//        System.out.println("printing from entry set...");
//        for(HashMap.Entry<Integer, SongArtist> map : artistMap.entrySet()){
//            System.out.println(map.getKey() +" : "+ map.getValue());
//        }
//        //using key set will be able to get the keys alone, not the values
//        System.out.println("printing from Key set...");
//        for(Integer key : artistMap.keySet()){
//            System.out.println(artistMap.get(key));
//        }
//        //using values,
//        System.out.println("printing from values...");
//        for(SongArtist value:artistMap.values()){
//            System.out.println(value);
//        }
        // the difference is for key set and value set, we will print the values alone, even for keyset, we can find the keys so that we will be able to find the values.
        // but for entry set, the whole key and value will be taken

    }
}
