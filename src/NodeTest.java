import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    public void createNode(){
        Album album = new Album(1, "testTitle", 12);
        Node node = new Node(album);
        System.out.println(node.album.toString());
    }
}
