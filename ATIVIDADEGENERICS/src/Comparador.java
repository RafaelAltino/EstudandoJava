import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparador<T extends Pessoa> implements Comparator<T> {


    @Override
    public int compare(T obj1, T obj2) {
        
        return obj1.getNome().compareTo(obj2.getNome());
    }


    // Comparator<Pessoa> comparadorIdade = new Comparator<>(){
    //     @Override
    //     public int compare(Pessoa p1, Pessoa p2){
    //         return p1.getIdade().compareTo(p2.getIdade());
    //     }
    // };
    
}