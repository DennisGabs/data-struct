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

    public void adicionarTodos(Livro[] livros){
        for (int i = 0; i < livros.length; i++) {
            adicionar(livros[i]);
        }
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
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio!");
        }

        for(int i = 0; i < size; i++){
            if(nomeLivro.equals(livros[i].getNome())){
                return livros[i];
            }
        }
        throw new RuntimeException("Livro não encontrado");
    }

    public String removerNoFinal(){
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio!");
        }

        String temp = livros[size - 1].getNome();
        livros[size - 1] = null;
        size--;
        return temp;
    }

    public void removerDoInicio(){
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio!");
        }

        livros[0] = null;
        for (int i = 1; i < size; i++){
            livros[i - 1] = livros[i];
        }
        livros[size - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++ ){
            str += livros[i] + ",";
        }
        str += ']';
        return str;
    }
}
