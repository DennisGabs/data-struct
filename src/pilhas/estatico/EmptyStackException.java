package pilhas.estatico;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(){
        super("Pilha Vazia");
    }
}
