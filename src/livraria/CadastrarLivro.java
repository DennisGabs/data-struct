package livraria;

public class CadastrarLivro {
    public static void main(String[] args) {
        Livraria livraria = new Livraria(4);
        Livro livro1 = new Livro();
        livro1.nome = "Aventuras do maluco";
        System.out.println(livraria.isEmpty());
        livraria.adicionar(livro1);

        System.out.println(livraria.isEmpty());

        Livro livro2 = new Livro();
        livro2.nome = "Cavalo";
        System.out.println(livraria.buscarLivro("Aventuras do maluco"));
        System.out.println(livraria.buscarLivro("cavalo"));

    }
}
