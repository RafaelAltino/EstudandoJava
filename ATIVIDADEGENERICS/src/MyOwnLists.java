import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists<T extends Pessoa>{
    

    public static <T> List<T> asListedSorted(List<T> lista, Comparator comparador) {
        Collections.sort(lista, comparador);
        return lista;
    }



}
