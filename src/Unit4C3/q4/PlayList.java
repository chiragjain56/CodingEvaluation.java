package Unit4C3.q4;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        Song song1  = new Song();
        songs.add(song1);
        if(songs.contains(song1)){
            System.out.println("Song added to the playlist successfully.");
        }
        Song song2 = new Song();

    }
}
