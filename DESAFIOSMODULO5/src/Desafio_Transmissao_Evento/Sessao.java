package Desafio_Transmissao_Evento;

import java.time.LocalDateTime;

public class Sessao {
    private int numero;
    private LocalDateTime inicio;
    private LocalDateTime fim;



    public Sessao(int numero, LocalDateTime inicio, LocalDateTime fim) {
        this.numero = numero;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public LocalDateTime getInicio(Local local) {
        return inicio.plusHours(calculaFuzoHorario(local));
    }
    public void setInicio(LocalDateTime inicio, Local local) {
        this.inicio = inicio.plusHours(calculaFuzoHorario(local));
    }
    public LocalDateTime getFim(Local local) {
        return fim.plusHours(calculaFuzoHorario(local));
    }
    public void setFim(LocalDateTime fim, Local local) {
        this.fim = fim.plusHours(calculaFuzoHorario(local));
    }

    private int calculaFuzoHorario(Local local){
        switch(local){
            case SAOPAULO:
                return 0;

            case PARIS:
                return 5;

            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Sessão[ número: " + this.getNumero() +
        ", início: " + this.getInicio(Local.SAOPAULO) +
        ", fim: " + this.getFim(Local.SAOPAULO) +
        "]";
    }

    






}
