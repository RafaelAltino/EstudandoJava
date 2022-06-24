public class ContaInvestimento extends Conta{   

    public ContaInvestimento(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }
    
    public void investir(){
        super.depositar((super.getSaldo() * super.getTitular().getTaxaDeRendimentoEmContaInvestimento()));
    }

    @Override
    public String toString() {
        return (
            "Conta Investimento{" + 
            "\nagência: " + super.getAgencia() + 
            "\nnúmero: " + super.getNumero() +
            "\ntitularNome: " + super.getTitular().getNome() + 
            "\ntitularRegistro: " + super.getTitular().getRegistro() + 
            "\n}"
        );
    }
}
