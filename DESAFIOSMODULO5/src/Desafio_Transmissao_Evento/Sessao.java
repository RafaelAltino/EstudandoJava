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
    public LocalDateTime getInicio() {
        return inicio;
    }
    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }
    public LocalDateTime getFim() {
        return fim;
    }
    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "Sessão[ número: " + this.getNumero() +
        ", início: " + this.getInicio() +
        ", fim: " + this.getFim() +         
        "]";
    }

    






}
