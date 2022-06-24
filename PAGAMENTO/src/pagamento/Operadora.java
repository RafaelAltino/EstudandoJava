package pagamento;

public interface Operadora {
    // Não sei qual é a operadora de cartão. Só preciso saber
    // se ela vai autorizar a compra ou não

    public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
