import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Conversao> lista = inicializa();

        calcular(lista, MoedaEnum.GBP, MoedaEnum.USD);

    }

    public static List<Conversao> inicializa(){
        ArrayList<Conversao> lista = new ArrayList<>();

        lista.add(new Conversao(MoedaEnum.AUD, 0.69444, MoedaEnum.USD));
        lista.add(new Conversao(MoedaEnum.USD, 5.15, MoedaEnum.BRL));
        lista.add(new Conversao(MoedaEnum.BRL, 0.18, MoedaEnum.EUR));
        lista.add(new Conversao(MoedaEnum.EUR, 0.86, MoedaEnum.GBP));

        return lista;        
    }

    public static double calcular(List<Conversao> lista, MoedaEnum de, MoedaEnum para){






        return 0;
    }
}
