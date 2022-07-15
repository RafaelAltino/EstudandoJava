import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo2 {
    public static void main(String[] args)throws Exception{

        Predicate<String> condicao = (s) -> s.startsWith("F");
        condicao =  condicao.and( (s) -> s.endsWith("o") );

        Stream.of("Lisboa", "Setúbal", "Faro", "Coimbra", "Feioso", "Animalesco")
            .filter(condicao)
            .findFirst()
            .ifPresent(System.out::println);

        System.out.println("\nFiltros encadeados");

        Stream.of("Lisboa", "Setúbal", "Faro", "Coimbra", "Feitoso", "Animalesco")
            .filter( (s) -> s.startsWith("F") )
            .filter( (s) -> s.endsWith("o") )
            .forEach( (s) -> System.out.println(s) );

        System.out.println("\nFind any");

        Stream.of("Lisboa", "Setúbal", "Faro", "Coimbra", "Feitoso", "Animalesco")
            .filter( (s) -> s.startsWith("F") )
            .filter( (s) -> s.endsWith("o") )
            .findAny()
            .ifPresent(System.out::println);

        System.out.println("\nCollect List:");
        List<String> algumas = Stream.of("Lisboa", "Setúbal", "Faro", "Coimbra", "Feitoso", "Animalesco")
            .skip(1)
            .limit(3)
            .collect(Collectors.toList());
        algumas.forEach(System.out::println);

        System.out.println("\nCollect List outro:");
        String[] array1 = Stream.of("Lisboa", "Setúbal", "Faro", "Coimbra", "Feitoso", "Animalesco", "fagundinho", "Caldas")
            .map(s -> s.toUpperCase())
            .filter( s -> s.startsWith("F") )
            .map( s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
            .toArray(String[]::new);

        Arrays.stream(array1)
            .forEach(System.out::println);


        System.out.println("\nMatches:");
        List<String> cidades = List.of("Lisboa", "Setúbal", "Faro", "Coimbra", "Feitoso", "Animalesco");
        Stream<String> cidadesStream = cidades.stream();
            if(cidadesStream.anyMatch( s -> s.startsWith("L"))){
                System.out.println("Tem cidade iniciando com L");
            }
            if(cidadesStream.anyMatch( s -> s.startsWith("L"))){
                System.out.println("Tem cidade iniciando com L");
            }
            if(cidadesStream.anyMatch( s -> s.startsWith("L"))){
                System.out.println("Tem cidade iniciando com L");
            }
        
        System.out.println("\nFlatMap:");
        List<List<String>> cidadesList = List.of(
            List.of("Abra", "Bicuda", "Cadabra"),
            List.of("Doida", "Escola", "Friboi"),
            List.of("Gengibre", "Helicóptero", "Iguana") 
        );
        cidadesList.stream()
            .flatMap(Collection::stream)
            .filter( s -> s.contains("o"))
            .forEach(System.out::println);
            
    }
}
