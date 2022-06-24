import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Java Collections Framework
 * 
 * É um conjunto bem definido de interfaces e classes
 * para representar e tratar grupos de dados como se fossem uma única unidade
 * que pode ser chamada de coleção
 * 
 * Tem 3 elementos:
 * > Interfaces: tipos abstratos que representam coleções
 * > Implementações: as implementações concretas das interfaces
 * > Algoritmos: são os métodos que vão realizar as operações
 *   sobre os objetos das coleções
 * 
 * Collection -> No topo da hierarquia - não tem implementação
 * Set -> interface que define uma coleção que não permite elementos
 * duplicados. SortedSet (extensão de Set) possibilita a ordenação
 * List -> define uma coleção ordenada, pode conter elementos duplicados
 * Queue -> uma coleção para manter uma lista de prioridades, onde a
 * ordem dos seus elementos é definida pela implementação do Comparable
 * ou Comparador
 * 
 * ArrayList -> é um array que pode crescer de tamanho, a busca nele é rápida,
 * ele é mais lento para inserir ou excluir elementos
 * LinkedList -> array interligado, ou seja, cada "nó" possui
 * a refereência do item anterior e do item posterior. A busca é mais
 * lenta, porém, a inclusão e a exclusão são mais rápidas
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {

        final int MAX = 20000;
        int x = 50000000;
        
        
        LinkedList<String> nomesLinked = new LinkedList<String>();
        ArrayList<String> nomesArray = new ArrayList<String>();


        for(int i = 0; i < x; i++){
            nomesLinked.add("LSou " + i);
        }


        long tInicio = System.currentTimeMillis();
        nomesLinked.add(x/2, "Fabiano");
        long tFinal = System.currentTimeMillis();
        System.out.println(tFinal - tInicio);

        //Ao inserir um elemnto no meio do Array, todos os demais elementos
        //vão ser reposicionados
        //Caso a entrada do novo elemento acabe superando o tamanho atual do Array
        //um novo Array dimensionado será criado



        for(int i = 0; i < x; i++){
            nomesArray.add("ASou " + i);
        }
        
        tInicio = System.currentTimeMillis();
        nomesLinked.add(x/2, "Fabiano");
        tFinal = System.currentTimeMillis();
        System.out.println(tFinal - tInicio);



    }
}
