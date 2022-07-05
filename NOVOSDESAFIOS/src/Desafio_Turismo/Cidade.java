package Desafio_Turismo;

import java.util.ArrayList;

public class Cidade implements RegraCidade{
    private String nome;

    public Cidade(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome;
    }





}
