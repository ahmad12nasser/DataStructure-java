import java.util.*;
public class CD {
    int CDid;
    String AlbumName;
    int year;
    String ArtistName;
    int currSize;
    CD next;
    ArrayList<Song> Playlist;
    public CD(int i, String album1, int i1, String artist1){
        this.Playlist = new ArrayList<>();
    }
    public CD(int CDid, String AlbumName, int year, String ArtistName, int currSize) {
        this.CDid = CDid;
        this.AlbumName = AlbumName;
        this.year = year;
        this.ArtistName = ArtistName;
        this.currSize = currSize;
        this.next = null;
        this.Playlist = new ArrayList<>();
    }

    public void Burn(Song s) {
        if (currSize + s.Size <= 700) {
            Playlist.add(s);
            currSize += s.Size;
        } else {
            System.out.println("Cannot add song to CD. CD is full.");
        }
    }
}

