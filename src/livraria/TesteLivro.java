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

        for (int i = 0; i < livraria.size; i++){
          livraria.adicionar(livros[i]);
        }
        System.out.println(livraria);


    }
}
