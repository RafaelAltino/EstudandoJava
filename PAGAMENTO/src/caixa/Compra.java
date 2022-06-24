package caixa;

import impressao.*;
import pagamento.Autorizavel;

public class Compra implements Imprimivel, Autorizavel{
    
    // Conter os dados de uma compra do cliente

    private double valorTotal;
    private String Produto;
    private String nomeCliente;

    @Override
    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    



    @Override
    public String getCabecalhoPagina() {

        return this.getNomeCliente();        
    }

    @Override
    public String getCorpo() {

        return this.getProduto() + " = " + this.getValorTotal();
    }



}
