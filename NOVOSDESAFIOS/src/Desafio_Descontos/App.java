package Desafio_Descontos;

import java.util.Random;

public class App{
    public static void main(String[] args)throws Exception{


        Cliente andre = new Cliente("André", new Carrinho());
        Cliente brenda = new Cliente("Brenda", new Carrinho());
        Cliente carlos = new Cliente("Carlos", new Carrinho());
        Cliente daniela = new Cliente("Daniela", new Carrinho());

        comprarProdutos(andre, 20);
        comprarProdutos(brenda, 12);
        comprarProdutos(carlos, 8);
        comprarProdutos(daniela, 2);

        System.out.println(andre.getNome() + "=============");
        andre.getCarrinho().calculaTotalComDesconto();
        System.out.println(brenda.getNome() + "=============");
        brenda.getCarrinho().calculaTotalComDesconto();
        System.out.println(carlos.getNome() + "=============");
        carlos.getCarrinho().calculaTotalComDesconto();
        System.out.println(daniela.getNome() + "=============");
        daniela.getCarrinho().calculaTotalComDesconto();


        

        






    }

    public static void comprarProdutos(Cliente cliente, int qtdDeProdutos){
        Random gerador = new Random();
        for(int i = 0; i < qtdDeProdutos; i++){
            cliente.getCarrinho().adicionarProduto(new Produto(("Produto " + (i+1)), gerador.nextInt(100)+1));
        }
    }
}