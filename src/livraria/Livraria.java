package livraria;

public class Livraria {
    int capacidade = 100;
    int size;

    Livro livros[];

    Livraria(int tam){
        livros = new Livro[tam];
    }

    public int size(){
        return size;
    }

    public void adicionar(Livro livro) throws RuntimeException {
        if(size == livros.length){
            throw new RuntimeException("Não vai dá");
        }
        livros[size] = livro;
        size++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void todosOsLivros(){
        for (Livro s : livros){
            System.out.println(s);
        }
    }

    public Livro buscarLivro(String nomeLivro) throws RuntimeException{
        for(int i = 0; i < size; i++){
            if(nomeLivro == livros[i].nome){
                return livros[i];
            }
        }
        throw new RuntimeException("Livro não encontrado");
    }
}
