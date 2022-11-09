import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {
    @Test
    public void createAlbum(){
        Album album1 = new Album(1, "test Album", 12);
        // album1.artistNames.add("Artist1");
        // album1.artistNames.add("Artist2");
        System.out.println(album1.toString());
    }

}
