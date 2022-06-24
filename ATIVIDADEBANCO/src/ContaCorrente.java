public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override
    public String toString() {
        return (
            "Conta Corrente{" + 
            "\nagência: " + super.getAgencia() + 
            "\nnúmero: " + super.getNumero() +
            "\ntitularNome: " + super.getTitular().getNome() + 
            "\ntitularRegistro: " + super.getTitular().getRegistro() + 
            "\n}"
        );
    }
}
