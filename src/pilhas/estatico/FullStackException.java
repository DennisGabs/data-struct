package pilhas.estatico;

public class FullStackException extends  RuntimeException{
    public FullStackException(){
        super("Pilha Cheia");
    }
}
