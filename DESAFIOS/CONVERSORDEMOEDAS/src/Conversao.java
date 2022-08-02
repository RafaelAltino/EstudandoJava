public class Conversao {
    private MoedaEnum anterior;
    private double valor;    
    private MoedaEnum proxima;

    public Conversao(MoedaEnum anterior, double valor, MoedaEnum proxima) {
        this.anterior = anterior;
        this.valor = valor;
        this.proxima = proxima;
    }

}
