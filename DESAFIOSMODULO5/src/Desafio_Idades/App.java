package Desafio_Idades;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)throws Exception{
        List<Pessoa> pessoas = new ArrayList<>(){{
            add(new Pessoa("Joao", "20-10-69"));
            add(new Pessoa("Maria", "08-07-13"));
            add(new Pessoa("Pedro", "15-07-60"));
            add(new Pessoa("Ana", "06-02-97"));
        }};

        for(Pessoa pessoa : pessoas){
            System.out.printf("%s tem %d anos\n\n", pessoa.getNome(), pessoa.calcularIdade());
        }
    }
}
