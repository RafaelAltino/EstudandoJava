import java.util.HashMap;

/* Java Colections Framework
 *
 * MAP: Conceito geral de um conjunto "par de chaves". Ela permite
 * mapear chaves para valores. Cada elemento possui dois objetos:
 * uma chave e um valor.
 * 
 * Interfaces de MAP: SortedMap: Permite uma classificação ascendente
 * dos objetos armazenados
 * 
 * Implementações: TreeMap, HashMap e LinkedMap
 * Em linhas gerais todos oferecem um mapa de chave->valor
 * e uma forma de iterar atravéz das chaves.
 * 
 * TreeMap:  são chaves ordenadas, portanto, se você precisar iterar pelas
 * chaves na ordem de classificação, você consegue!
 * É possível usar a Interface Comparable.
 * 
 * HashMap: contém valores com base na chave, os elementos são únicos, 
 * pode ter uma chave nula e vários valores nulos também, porém não
 * mantem nenhuma ordem
 * 
 * LinkedHashMap: oferece consulta e inserção e as chaves são ordenadas pelo
 * pedido de inserção.
 * 
 * Podemos utilizar apenas os dados/classes, ou seja, não podemos
 * criar Maps de tipos primitivos
 * 
 * Exemplo: Desejo armazenar os nomes dos empregados(valores) e seus IDs(chaves) respect:
 * em uma lista HashMap, verificando a forma como os dados estão sendo trabalhados
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> nomes = new HashMap<>();

        nomes.put(12345, "Anderson");
        nomes.put(56789, "Jesse");
        nomes.put(55555, "Eduardo");


        //Listagem dos elementos
        System.out.println("Todos os elementos");
        System.out.println(nomes);


        //Testando a recuperação do valor através da chave
        System.out.println("Pegando o valor da chave 56789");
        System.out.println(nomes.get(56789));


        //Verificar se existe algum valor com a chave citada em containsKey
        System.out.println("Tem algum valor pra chave 55555?");
        System.out.println(nomes.containsKey(55555));
        System.out.println("Tem algum valor pra chave 321?");
        System.out.println(nomes.containsKey(321));


        //Verificar se existe alguma chave cujo valor foi citado em 
        //containsValue
        System.out.println("Tem alguma chave com o valor Rafael?");
        System.out.println(nomes.containsValue("Rafael"));
        System.out.println("Tem alguma chave com o valor Eduardo?");
        System.out.println(nomes.containsValue("Eduardo"));


        //O que acontece se a gente tentar colocar um novo nome
        //com uma chave existente?

        nomes.put(12345, "Ana");

        System.out.println("Vai substituir o elemento anterios (só troca o valor)");
        System.out.println(nomes);


        //Existe um método similar: replace
        //No caso de utilizar-mos a linha acima de forma semelhante,
        //mas com o replace, então o valor pode ser alterado.

        nomes.replace(55555, "Eduardo", "Replaçou");
        nomes.replace(777,  "Setominus");

        System.out.println("Usei replace");
        System.out.println(nomes);

        //Método putIfAbsent -> serve para pesquisar ou inserir um valor,
        //dependendo do contexto informado. Se for feita uma busca na lista
        //pela chave, mesmo que seu par (dado) tenha sido informado erroneamente
        //a busca é feita

        nomes.putIfAbsent(56788, "Jorje");
        System.out.println(nomes);


        //Usando Remove
        nomes.remove(56789);
        System.out.println(nomes);








    }
}
