public class PessoaJuridica extends Conta implements RegrasConta{

    public PessoaJuridica(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }
    
    @Override
    public boolean saque(double valor) {
        if(valor <= super.getSaldo()){
            super.setSaldo(valor * 1.05);
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void transferencia(double valor, Conta conta) {
        this.saque(valor * 1.05);
        conta.deposito(valor);
    }
}
