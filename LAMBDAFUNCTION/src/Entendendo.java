import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Entendendo {
    public static void main(String[] args)throws Exception {
        List<Pessoa> pessoas = new ArrayList<>(){{
            add(new Pessoa("Diego", 29, Sexo.MASCULINO));
            add(new Pessoa("Felipe", 25, Sexo.MASCULINO));
            add(new Pessoa("Rebecca", 25, Sexo.FEMININO));
            add(new Pessoa("João Victor", 22, Sexo.MASCULINO));
            add(new Pessoa("Anna Laura", 20, Sexo.FEMININO));
            add(new Pessoa("Isabel", 19, Sexo.FEMININO));
            add(new Pessoa("Esther", 17, Sexo.FEMININO));
        }};

        printarPessoa(
            pessoas,
            p -> p.getIdade() > 23
        );

        System.out.println("****************");

        printarPessoa(
            pessoas,
            p -> p.getGenero() == Sexo.FEMININO
        );

    }



    public static void printarPessoa(List<Pessoa> pessoas, Predicate<Pessoa> tester){
        for(Pessoa p : pessoas){
            if(tester.test(p)){
                System.out.println(p);
            }
        }
    }

    public static void elogiar(List<Pessoa> pessoas, Supplier<String> elogio){
        for(Pessoa p : pessoas ){
            System.out.println(p.getNome() + elogio.get());
        }
    }
}
