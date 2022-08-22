import java.math.BigDecimal;

public class Limpeza implements Produto{
    private String nome;
    private BigDecimal preco;

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public BigDecimal getPreco() {
        return preco;
    }
}