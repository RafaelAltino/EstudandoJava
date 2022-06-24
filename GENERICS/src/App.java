/*GENERICS
 * Surgiu a partir do Java 5, com a proposta de
 * resolver problemas de cast de tipo
 * 
 * Polimorfismo Paramétrico:  se baseia em passar um parâmetro
 * na hora de criar a classe e sempre que esse parâmetro for
 * referenciado dentro do código, vai haver essa "substituição"
 * 
 * Esse tipo de abordagem preserva a checagem de tipos.
 * 
 * Classe Genérica: o que vai identificar essa classe é justamente
 * o que ela recebe como parâmetro no operador diamante <>, que
 * vai ser passado no momento em que foi criado objetos dessa classe
 * 
 * É preciso implementar tudo nessa classe baseado no tipo que você
 * está identificando. Não é permitido o uso de tipos primitivos
 * como indicação no operador diamante (int, boolean, ...)
 * 
 * Jamais usar o tipo Object como tipo genérico para a construção
 * de classes genéricas (alto nível de abstração)
 */
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declara o tipo no primeiro <>, não precisa no segundo <>
        LinkedList<Integer> minhaListaDeInteiros = new LinkedList<>();
        minhaListaDeInteiros.add(1);
        //O iterator faz a busca em toda a lista (array) para verificar
        // e posicionar o item na lista
        Integer x = (Integer) minhaListaDeInteiros.iterator().next();

        //minhaListaDeInteiros.add("2");

        Integer y = minhaListaDeInteiros.iterator().next();

        LinkedList<Generic> lts = new LinkedList<>();

        /* CONVENÇÕES
         * 
         * <E> : Element
         * <K> : Key
         * <N> : Number
         * <T> : Type
         * <V> : Value
         * S, U, V : segundo, terceiro, quarto elemento, ...
         * T1, T2, T3 : segundo, terceiro, quarto elemento, ...
         */
    }
}
