import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String lista1 = "5,8,7,6,9";
        String lista2 = "1,2,7,4,8";

        List completa = junta(lista1, lista2);
        for(Object obj : completa){
            System.out.print(" " + obj);
        }
        

    }
    

    public static List transforma(String listaString){
        String[] nova = listaString.split(",");
        List lista = new ArrayList();
        for(String s : nova){
            lista.add(s);
        }
        return lista;
    }

    public static List junta(String string1, String string2){
        List lista1 = transforma(string1);
        List lista2 = transforma(string2);
        List completa = new ArrayList();

        for(Object o : lista1){
            completa.add(o);
        }
        
        for(Object lst2 : lista2){
            int total = 0;
            for(Object lst1 : lista1){
                if(lst2.equals(lst1)){
                    total++;
                }
            }
            if(total == 0){
                completa.add(lst2);
            }
        }
        Collections.sort(completa);
        Collections.reverse(completa);
        
        return completa;
    }

}
