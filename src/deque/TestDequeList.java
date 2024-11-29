package deque;

public class TestDequeList {
    public static void main(String[] args) {
        DequeList dequeList = new DequeList();

        dequeList.addFirst("A");
        Node first = dequeList.firstElement();
        dequeList.addElement("B");

        dequeList.addElement("C");
        dequeList.removeFirst();
        Node current = first;

        while(current != null){
            System.out.println(current);
            current = current.next;
        }
    }
}
