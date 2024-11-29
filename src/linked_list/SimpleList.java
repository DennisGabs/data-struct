package linked_list;

public class SimpleList {

    Node head;
    Node tail;

    int size;

    SimpleList(){
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty(){
        return size == 0;
    }

    public void insertFirst(String data){
        Node node = new Node(data);
        Node newNext = head;
    }

    public void removeLast() {
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        Node current = head.next;
        Node temp = head;
        while(current.next != null){
             temp = current;
             current = current.next;
        };

        temp.next = null;
        tail = temp;
        size --;
    }
}
