package Desafio_Turismo;

import java.util.ArrayList;



public class Grafo<T>{
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<T>>();
        this.arestas = new ArrayList<Aresta<T>>();
    }

    public void adicionarVertice(T dado){
        Vertice<T> novoVertice = new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(T dadoOrigem, T dadoDestino){
        final int PESO = 1;
        Vertice<T> origem = this.getVertice(dadoOrigem);
        Vertice<T> destino = this.getVertice(dadoDestino);
        Aresta<T> aresta = new Aresta<>(PESO, origem, destino);
        origem.adicionarQuemEuAcesso(aresta);
        destino.adicionarQuemMeAcessa(aresta);
        this.arestas.add(aresta);

    }

    public Vertice<T> getVertice(T dado){
        Vertice<T> vertice = null;
        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void buscaEmLargura(Vertice<T> origem){
        ArrayList<Vertice<T>> marcados = new ArrayList<>();
        ArrayList<Vertice<T>> fila = new ArrayList<>();
        Vertice<T> atual = origem;
        marcados.add(atual);
        System.out.println("Oi " + atual.getDado().toString());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<T> visitado = fila.get(0);
            for(int i = 0; i < visitado.getEuAcesso().size(); i++){
                Vertice<T> proximo = visitado.getEuAcesso().get(i).getFim();
                if(!marcados.contains(proximo)){ // se o vértice ainda não foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado().toString());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }

    }

    public T buscarCidadePorNome(String nome){
        T cidade = null;
        for(int i = 0; i < this.vertices.size(); i++){
            if(((Cidade) (this.vertices.get(i).getDado())).getNome().equals(nome)){
                cidade = this.vertices.get(i).getDado();
                break;
            }
        }
        return cidade;
    }

    public boolean isReachable(String from, String to, int numberConnections){

        Vertice<T> verticeOrigem = this.getVertice(buscarCidadePorNome(from));
        Vertice<T> verticeDestino = this.getVertice(buscarCidadePorNome(to));

        if(verticeOrigem != null && verticeDestino != null){
            return buscaEspecifica(verticeOrigem, verticeDestino, numberConnections);
        }

        System.out.println("Cidade não encontrada");
        return false;
        
    }

    public boolean buscaEspecifica(Vertice<T> origem, Vertice<T> destino, int conexoesMaximas){
      
        int passosDisponiveis = conexoesMaximas;
        Vertice<T> atual = origem;
        boolean conseguiu = false;

        for(Aresta<T> aresta : atual.getEuAcesso()){  
            if(conexoesMaximas >= 0){                
                Vertice<T> proximo = aresta.getFim();

                if(proximo.equals(destino)){
                    return true;
                } else{
                    conseguiu = buscaEspecifica(proximo, destino, conexoesMaximas-1);
                    if(conseguiu == true){
                        return true;
                    }
                }
                
            }       
        }
        return conseguiu;
    }

    public int avanca(Vertice<T> atual, int conexoesFeitas){

        return 0;
    }

}
