package calculadora;

public class Calculator {
    static void somaStatic(double n1, double n2){
        double soma = n1 + n2;
        System.out.println("O resultado da soma é: " + soma);
    }

    void soma(){
        int n1 = 10, n2 = 20;
        System.out.println(n1 + n2);
    }

    void soma(double n1, double n2){
        double soma =  n1 + n2;
        System.out.println("O resultado da soma é: " + soma);
    }
}
