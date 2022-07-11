package Desafio_Investimento;
/*
 * Pelo que eu entendi do enunciado:
 * 
 * ClienteConservador -> apenas RendaFixa
 * ClienteModerado -> RendaFixa e RendaVariavel
 * ClienteArrojado -> apenas RendaVariavel
 * 
 */

import Desafio_Investimento.Pasta_Clientes.ClienteArrojado;
import Desafio_Investimento.Pasta_Clientes.ClienteConservador;
import Desafio_Investimento.Pasta_Clientes.ClienteModerado;
import Desafio_Investimento.Pasta_Investimentos.Acao;
import Desafio_Investimento.Pasta_Investimentos.Cdb;
import Desafio_Investimento.Pasta_Investimentos.FundoImobiliario;
import Desafio_Investimento.Pasta_Investimentos.Investimento;
import Desafio_Investimento.Pasta_Investimentos.RendaFixa;
import Desafio_Investimento.Pasta_Investimentos.Tesouro;

public class App {
    public static void main(String[] args)throws Exception{

        ClienteConservador conservador = new ClienteConservador();
        ClienteModerado moderado = new ClienteModerado();
        ClienteArrojado arrojado = new ClienteArrojado();
        

        Tesouro tesouro = new Tesouro();
        FundoImobiliario fundoImobiliario = new FundoImobiliario();

        conservador.contratarInvestimento(tesouro);
        //conservador.contratarInvestimento(fundoImobiliario);
 
        moderado.contratarInvestimento(tesouro);
        moderado.contratarInvestimento(fundoImobiliario);

        //arrojado.contratarInvestimento(tesouro);
        arrojado.contratarInvestimento(fundoImobiliario);

        System.out.println("\nCliente Conservador:");
        for(Investimento inv : conservador.getCarteiraDeInvestimentos()){
            System.out.println(inv.getNome());
        }
        System.out.println("\nCliente Moderado:");
        for(Investimento inv : moderado.getCarteiraDeInvestimentos()){
            System.out.println(inv.getNome());
        }
        System.out.println("\nCliente Arrojado:");
        for(Investimento inv : arrojado.getCarteiraDeInvestimentos()){
            System.out.println(inv.getNome());
        }
        System.out.println();
        




        
    }
}
