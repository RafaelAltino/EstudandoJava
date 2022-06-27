import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists<T extends Pessoa> implements Comparator<T>{
    

    public static <T> List<T> asListedSorted(List<T> lista, T comparador) {
        List<T> listaFiltrada = 
        Collections.sort(lista, comparador);
        return listaFiltrada;
    }

    @Override
    public int compare(T obj1, T obj2) {

        if(obj1.getNome().compareTo(obj2.getNome()) == -1){
            System.out.println();
        }
        return 0;
    }



 

}
