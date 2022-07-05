package Desafio_Turismo;

import java.util.ArrayList;

public class Vertice<T> {
    private T dado;
    private ArrayList<Aresta<T>> meAcessam;
    private ArrayList<Aresta<T>> euAcesso;

    public Vertice(T valor){
        this.dado = valor;
        this.meAcessam = new ArrayList<Aresta<T>>();
        this.euAcesso = new ArrayList<Aresta<T>>();
    }

    public T getDado() {
        return this.dado;
    }
    public void setDado(T valor) {
        this.dado = valor;
    }
    public ArrayList<Aresta<T>> getMeAcessam() {
        return meAcessam;
    }
    public void setMeAcessam(ArrayList<Aresta<T>> meAcessam) {
        this.meAcessam = meAcessam;
    }
    public ArrayList<Aresta<T>> getEuAcesso() {
        return euAcesso;
    }
    public void setEuAcesso(ArrayList<Aresta<T>> euAcesso) {
        this.euAcesso = euAcesso;
    }

    public void adicionarQuemMeAcessa(Aresta<T> vertice){
        this.meAcessam.add(vertice);
    }

    public void adicionarQuemEuAcesso(Aresta<T> vertice){
        this.euAcesso.add(vertice);
    }



}
