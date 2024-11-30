package pilhas.dinamic;

public class TestNode {
    public static void main(String[] args) {
        NodeStack ns = new NodeStack();
        ns.push("Teste");
        ns.push("Dennis");
        System.out.println(ns);

        System.out.println(ns.top());

        System.out.println(ns.pop());
        System.out.println(ns);
    }
}
