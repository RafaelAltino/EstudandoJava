import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Empregado> a = new Empregado[]{new Empregado()};

        List<Empregado> empregadosList = MyOwnLists.asListedSorted(new Empregado[]{new Empregado()},new Comparator<Empregado>(){});
        

    }
}
