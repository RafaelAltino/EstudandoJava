package caixa;

import impressao.Impressora;
import pagamento.Cartao;
import pagamento.Operadora;

public class Checkout {
    // Finalizar a compra apóes ela ser autorizada pelo cartão
    // Ela vai ter método de fechar a compra, que vai
    // receber uma compra e um cartão.


    private Operadora operadora;
    private Impressora impressora;
    Compra compra;
    Cartao cartao;

    public Checkout(Operadora operadora, Impressora impressora){
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public Operadora getOperadora() {
        return operadora;
    }
    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }
    public Impressora getImpressora() {
        return impressora;
    }
    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }

    //Para fechar compra eu preciso receber uma compra e um cartão,
    // além de verificar se ele está autorizado ou não.

    public void fecharCompra(Compra compra, Cartao cartao){
        this.compra = compra;
        this.cartao = cartao;
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if(autorizado){
            this.impressora.imprimir(compra);
        } else{
            System.out.println("Pagamento Não Autorizado!");
        }
    }
    // Se autorizado, eu posso imprimir um documento imprimível (alguém que
    // segue o contrato!) Como compra tem implementação da interface imprimível
    // eu também posso passar compra como documento imprimível







}
