package Desafio_Idades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private String nascimento;

    public Pessoa(String nome, String nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int calcularIdade(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = null;
        if(LocalDate.parse(nascimento, formato).getYear() > hoje.getYear()){
            dataNascimento = LocalDate.parse(nascimento, formato).minusYears(100);
        } else{
            dataNascimento = LocalDate.parse(nascimento, formato);
        }
        
        int idade = Period.between(dataNascimento, hoje).getYears();
        System.out.println(dataNascimento);
        return idade;        
    }

}
