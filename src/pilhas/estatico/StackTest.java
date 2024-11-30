package pilhas.estatico;

public class StackTest {
    public static void main(String[] args) {
        VectorStack vs = new VectorStack(3);
        vs.push("Dennis");
        vs.push("Manel");
        vs.push("Cavalo");
        System.out.println(vs.top());
        System.out.println(vs);

        System.out.println(vs.pop());
        System.out.println(vs.pop());
        System.out.println(vs);

        System.out.println(vs.pop());
        System.out.println(vs);
    }
}
