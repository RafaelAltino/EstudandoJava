package Desafio_Investimento.Pasta_Clientes;

import java.util.ArrayList;
import java.util.List;

import Desafio_Investimento.Pasta_Investimentos.Investimento;

public class Cliente {
    private String nome;
    private List<Investimento> carteiraDeInvestimentos = new ArrayList<>();


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Investimento> getCarteiraDeInvestimentos() {
        return carteiraDeInvestimentos;
    }

}
