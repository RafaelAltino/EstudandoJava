package Desafio_Investimento.Pasta_Clientes;

import Desafio_Investimento.Pasta_Investimentos.RendaFixa;
import Desafio_Investimento.Pasta_Investimentos.RendaVariavel;

public class ClienteModerado  extends Cliente{

    public void contratarInvestimento(RendaFixa investimento){
        super.getCarteiraDeInvestimentos().add(investimento);
    }
    
    public void contratarInvestimento(RendaVariavel investimento){
        super.getCarteiraDeInvestimentos().add(investimento);
    }

}
