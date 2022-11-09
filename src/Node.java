public class Node {
    Album album;
    Node prev;
    Node next;

    public Node(Album album){
        this.prev = null;
        this.next = null;
        this.album = album;
    }
}
