package object_n_classes;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SongArtist {
    private String songName;
    private String songArtist;
    private LocalDate songReleasedYear;

    public void setSongName(String songName){
        this.songName = songName;
    }
    public void setSongArtist(String songArtist){
        this.songArtist = songArtist;
    }
    public void setSongReleasedYear(String songReleasedYear){
        LocalDate localDate = LocalDate.parse(songReleasedYear, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        this.songReleasedYear = localDate;
    }

    public String getSongName(){
        return this.songName;
    }
    public String getSongArtist(){
        return this.songArtist;
    }
    public LocalDate getSongReleasedYear(){
        return this.songReleasedYear;
    }


    public SongArtist() {
    }

    public SongArtist(String songName, String songArtist, String songReleasedYear) {
        this.songName = songName;
        this.songArtist = songArtist;
        LocalDate localDate = LocalDate.parse(songReleasedYear, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        this.songReleasedYear = localDate;
    }

    @Override
    public String toString() {
       return "Song: "+this.songName +" | Artist: "+ this.songArtist +" | Released: "+ this.songReleasedYear;
    }
}

