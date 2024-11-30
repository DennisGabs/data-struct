package pilhas.estatico;

import pilhas.IStack;

public class VectorStack implements IStack {
    int capacidade;

    String S[];

    int size = 0;

    public VectorStack(int capacidade){
        this.capacidade = capacidade;
        S = new String[capacidade];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String top() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return S[size() - 1];
    }

    @Override
    public void push(String element) {
        if(size == capacidade){
            throw new FullStackException();
        }
        S[size] = element;
        size++;
    }

    @Override
    public String pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        String temp = top();
        S[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            sb.append(S[i]);
            if(S[i] != top()){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
