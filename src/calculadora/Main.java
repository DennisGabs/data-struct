package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculator calc =  new Calculator();
        calc.soma(10, 20);
        calc.soma();

        Calculator.somaStatic(19, 40);

        System.out.println(new EquacaoQuadratica().getValue());
        System.out.println(new EquacaoQuadratica().getValue(2));
    }
}
