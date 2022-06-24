public interface RegrasContas {
    public boolean sacar(double valor);
    public boolean depositar(double valor);
    public boolean transferir(double valor, Conta destino);

    
}
