package Desafio_Investimento.Pasta_Clientes;

import Desafio_Investimento.Pasta_Investimentos.Investimento;
import Desafio_Investimento.Pasta_Investimentos.RendaVariavel;

public class ClienteArrojado extends Cliente{
     
    public void contratarInvestimento(RendaVariavel investimento){
        super.getCarteiraDeInvestimentos().add(investimento);
    }
 

}
