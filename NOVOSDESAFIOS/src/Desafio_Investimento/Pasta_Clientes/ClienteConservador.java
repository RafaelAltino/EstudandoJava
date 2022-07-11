package Desafio_Investimento.Pasta_Clientes;

import Desafio_Investimento.Pasta_Investimentos.RendaFixa;

public class ClienteConservador  extends Cliente{
    
    public void contratarInvestimento(RendaFixa investimento){
        super.getCarteiraDeInvestimentos().add(investimento);
    }
}
