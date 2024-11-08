package banco;

public class AcessaContaCorrenteAlternative {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("João", 1000);
        System.out.println(conta.getSaldo());
        conta.depositaValor(300);
        System.out.println(conta.getSaldo());
    }
}
