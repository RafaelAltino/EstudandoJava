package Desafio_Turismo;


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

        System.out.print("De POA para REC com 2 escalas: ");
        System.out.println(grafo.isReachable("POA", "REC", 2));

        System.out.print("De POA para REC com 1 escalas: ");
        System.out.println(grafo.isReachable("POA", "REC", 1));

        System.out.print("De SSA para SDU com 0 escalas: ");
        System.out.println(grafo.isReachable("SSA", "SDU", 0));

        System.out.print("De SDU para SSA com 0 escalas: ");
        System.out.println(grafo.isReachable("SDU", "SSA", 0));
        














    }
}
