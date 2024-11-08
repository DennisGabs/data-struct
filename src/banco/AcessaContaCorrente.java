package banco;

public class AcessaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Dennis", 300.0f);
        System.out.println("BEFORE: ");
        System.out.println(c1.nome);
        System.out.printf("%.2f\n\n",c1.getSaldo());

        c1.nome = "Gabriel";
        c1.depositaValor(200.5f);
        System.out.println("AFTER: ");
        System.out.println(c1.nome);
        System.out.printf("%.2f\n\n", c1.saldo);
    }
}
