package livraria;

public class TesteLivro {
    public static void main(String[] args) {
        Livro[] livros = {
                new Livro("Java"),
                new Livro("Python"),
                new Livro("C#"),
                new Livro("C++"),
                new Livro("Ruby")
        };

        Livraria livraria = new Livraria(livros.length);


        livraria.adicionarTodos(livros);

        System.out.println(livraria);

        livraria.removerDoInicio();

        System.out.println(livraria);

        livraria.removerNoFinal();

        System.out.println(livraria);


    }
}
