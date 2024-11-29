package deque;

public class DequeList {
    private Node trailer;
    private Node head;

    public DequeList(){
        this.trailer = new Node();
        this.head = new Node();
    }

    public void addFirst(String name){
        Node obj = new Node(name);
        Node headAnchiest = head.next;
        head.next = obj;
        obj.next = headAnchiest;
    }

    public void addElement(String name){
        Node obj = new Node(name);
        firstElement().next = obj;
    }

    public Node lastElement(){
        return trailer.previous;
    }

    public Node firstElement(){
        return head.next;
    }

    public void removeFirst(){
        Node current = head.next;
        head.next = current.next;
    }
}
