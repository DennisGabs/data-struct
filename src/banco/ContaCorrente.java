package banco;

class ContaCorrente {
    float saldo;
    String nome;

    public ContaCorrente(String nome){
        this.nome = nome;
        saldo = 0;
    }

    public ContaCorrente(String nome, float saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    void depositaValor(float valor){
        if (valor > 0 ){
            this.saldo += valor;
        } else {
            System.out.println("Valor deve ser maior que 0.");
        }
    }

    void sacarValor(float valor){
        if (this.saldo >= valor){
           this.saldo -= valor;
        }
    }

    float getSaldo(){
        return saldo;
    }
}
