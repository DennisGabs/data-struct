package deque;

public class Node {
    Node previous;
    Node next;
    String element;

    Node(String element){
        this.element = element;
    }

    Node(){}

    @Override
    public String toString() {
        return "Node{" +
                "element='" + element + '\'' +
                '}';
    }
}
