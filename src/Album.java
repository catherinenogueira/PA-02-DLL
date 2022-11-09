import java.util.ArrayList;
public class Album implements Comparable<Album> {
    int albumID;
    String albumTitle;
    Integer numOfSongs;
    ArrayList<String> artistNames = new ArrayList<String>();

    public Album() {
    }
    public Album(int albumid, String albumtitle, Integer numofsongs) {
        this.albumID = albumid;
        this.albumTitle = albumtitle;
        this.numOfSongs = numofsongs;
    }
    public Album(int albumid, String albumtitle, Integer numofsongs, ArrayList<String> artists) {
        this.albumID = albumid;
        this.albumTitle = albumtitle;
        this.numOfSongs = numofsongs;
        this.artistNames = artists;
    }
    @Override
    public int compareTo(Album album2){
        int result = -2;
        if(this.numOfSongs == album2.numOfSongs) result = 0;
        if(this.numOfSongs < album2.numOfSongs) result = -1;
        if(this.numOfSongs > album2.numOfSongs) result = 1;
        return result;
    }
    @Override
    public String toString(){
        StringBuilder stb = new StringBuilder();
        stb = stb.append("Album ID" + this.albumID);
        stb = stb.append(" NUM_SONGS: " + this.numOfSongs);
        stb = stb.append("-- ARTIST_NAMES: " );
        if(artistNames.size()>0) {
            stb = stb.append(artistNames.toString());
        }
        else stb = stb.append(" Artist Names Not Added");
        return stb.toString();
    }
}