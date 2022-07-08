package Desafio_Descontos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    public List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public double somarTotal(){
        double total = 0;
        for(int i = 0; i < this.produtos.size(); i++){
            total += this.produtos.get(i).getPreco();
        }
        return total;
    }

    private double aplicarDesconto(int quantidadeDeProdutos, double valorSemDesconto){
        double valorFinal = valorSemDesconto;
        double desconto = 0;

        if(quantidadeDeProdutos >= 15){
            desconto = 0.1;
        } else if(quantidadeDeProdutos >= 10 && quantidadeDeProdutos < 15){
            desconto = 0.08;
        } else if(quantidadeDeProdutos >= 5 && quantidadeDeProdutos < 10){
            desconto = 0.05;
        }

        valorFinal -= (valorSemDesconto * desconto);
        System.out.printf("Total de R$%.2f\n", valorSemDesconto);
        System.out.printf("Desconto de %.0f%s   --> R$%.2f\n", desconto*100,"%", (valorSemDesconto * desconto));
        System.out.printf("Valor final de R$%.2f\n", valorFinal);

        return valorFinal;
    }

    public double calculaTotalComDesconto(){
        double totalComDesconto = somarTotal();
        listarProdutos();
        totalComDesconto = aplicarDesconto(produtos.size(), somarTotal());    
        return totalComDesconto;        
    }
    

    public void listarProdutos(){
        int tamanho = this.produtos.size();
        System.out.printf("Ao todo são %d produtos\n", tamanho);
        for(int i = 0; i < tamanho; i++){
            System.out.print(produtos.get(i).getNome() + " ---> ");
            System.out.printf("R$%.2f\n", produtos.get(i).getPreco());            
        }

    }



}
