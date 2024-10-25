package livraria;

public class Livro {
    String nome;
    String isbn;
    double valor;
    int quantidade;

    public Livro(){}

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
