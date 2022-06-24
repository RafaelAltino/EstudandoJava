public class Dados {
    private int numeroConta;
    private double saldo, debito, credito;


    public int getNumeroConta(){
        return (numeroConta);
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return (saldo);
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getCredito(){
        return (credito);
    }
    public void setCredito(double credito){
        this.credito = credito;
    }

    public double getDebito(){
        return (debito);
    }
    public void setDebito(double debito){
        this.debito = debito;
    }

    public double getLiquido(){
        double liquido;

        liquido = saldo + credito - debito;
        
        return liquido;
    }
    


}
