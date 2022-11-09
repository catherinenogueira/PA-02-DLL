public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    public DoublyLinkedList(){

    }

    @Override
    public String toString(){
        StringBuilder stb = new StringBuilder();
        Node tempNode = this.head;
        if(tempNode == null) return "";
        else{
            while (tempNode!=null){
                stb = stb.append(this.head.album.toString());
                stb = stb.append(" <--> ");
                tempNode = tempNode.next;
                }
            stb = stb.append("NULL");
            }
        return stb.substring ();
    }
}
