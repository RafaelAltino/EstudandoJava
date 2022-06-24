public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero, PessoaFisica titular) {
        super(agencia, numero, titular);
    }

    @Override
    public String toString() {
        return (
            "Conta Poupança{" + 
            "\nagência: " + super.getAgencia() + 
            "\nnúmero: " + super.getNumero() +
            "\ntitularNome: " + super.getTitular().getNome() + 
            "\ntitularRegistro: " + super.getTitular().getRegistro() + 
            "\n}"
        );
    }
    
}
