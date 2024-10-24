import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++){
            System.out.print("Digite a " + (i + 1) + "a posicao: " );
            strings[i] = sc.next();
        }

        for (String s : strings){
            System.out.println(s);
        }
    }
}
