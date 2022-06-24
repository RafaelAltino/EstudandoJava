public abstract class Conta implements RegrasContas{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
    //Criei consultarSaldo porque está no enunciado. Mas prefiro usar o getSaldo
    public double consultarSaldo(){
        return this.getSaldo();
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Nao pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


    public  boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= (valor + (valor * this.getTitular().getTaxaDeSaque()));
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        } else{
            return false;
        }
        
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
                destino.depositar(valor);
                return true;
        } else {
                return false;
        }
    }

    @Override
    public String toString() {
        return (
            "Conta{" + 
            "\nagência: " + this.getAgencia() + 
            "\nnúmero: " + this.getNumero() +
            "\ntitularNome: " + this.getTitular().getNome() + 
            "\ntitularRegistro: " + this.getTitular().getRegistro() + 
            "\n}"
        );
    }

}
