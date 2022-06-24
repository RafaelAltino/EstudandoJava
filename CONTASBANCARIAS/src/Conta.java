public class Conta implements RegrasConta{
    private Cliente titular;
    private int agencia;
    private int numeroConta;
    private double saldo;


    public Conta(int agencia, int numeroConta){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean saque(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta conta) {
        this.saque(valor);
        conta.deposito(valor);
    }











}
