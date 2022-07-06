package Desafio_Turismo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception{

        Grafo<Cidade> grafo = new Grafo<>();

        Cidade poa = new Cidade("POA");
        Cidade bsb = new Cidade("BSB");
        Cidade gru = new Cidade("GRU");
        Cidade nat = new Cidade("NAT");
        Cidade ssa = new Cidade("SSA");
        Cidade sdu = new Cidade("SDU");
        Cidade vcp = new Cidade("VCP");
        Cidade rec = new Cidade("REC");



        grafo.adicionarVertice(poa);
        grafo.adicionarVertice(bsb);
        grafo.adicionarVertice(gru);
        grafo.adicionarVertice(nat);
        grafo.adicionarVertice(ssa);
        grafo.adicionarVertice(sdu);
        grafo.adicionarVertice(vcp);
        grafo.adicionarVertice(rec);

        grafo.adicionarAresta(poa, bsb);
        grafo.adicionarAresta(gru, poa);      
        grafo.adicionarAresta(gru, bsb);
        grafo.adicionarAresta(bsb, gru);
        grafo.adicionarAresta(bsb, ssa);
        grafo.adicionarAresta(bsb, nat);
        grafo.adicionarAresta(gru, nat);
        grafo.adicionarAresta(gru, rec);
        grafo.adicionarAresta(ssa, nat);
        grafo.adicionarAresta(ssa, rec);
        grafo.adicionarAresta(vcp, ssa);
        grafo.adicionarAresta(sdu, ssa);

        //grafo.buscaEmLargura(grafo.getVertice(gru));

        grafo.isReachable("GRU", "NAT", 1);
        














    }
}
