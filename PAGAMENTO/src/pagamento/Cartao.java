package pagamento;

public class Cartao {
    // Aqui, essa classe trata das informações básicas do cartão do cliente,
    // que devem ser repassadas para as interfaces
    // A interface Operadora é quem vai dizer se a compra desse cartão
    // é válida ou não

    private String nomeTitular;
    private String numeroCartao;

    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


}
