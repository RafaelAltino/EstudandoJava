package Desafio_Jardim;

import java.text.Collator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.ranges.Range;

public class App {
    public static void main(String[] args)throws Exception {
        
        Supplier<Stream<Integer>> jardim = () -> {
            var jardim1 = Stream.of(
                Stream.generate( () -> 1)
                .limit(100).collect(Collectors.toList()),                
                Stream.generate( () -> 2)
                .limit(50).collect(Collectors.toList()),
                Stream.generate( () -> 3)
                .limit(25).collect(Collectors.toList())
            ).flatMap( e -> e.stream());
            return jardim1;
        };

        // Stream<Integer> jardim = Stream.of(
        //     Stream.generate( () -> 1)
        //     .limit(100).collect(Collectors.toList()),               
        //     Stream.generate( () -> 2)
        //     .limit(50).collect(Collectors.toList()),
        //     Stream.generate( () -> 3)
        //     .limit(25).collect(Collectors.toList())
        // ).flatMap( e -> e.stream());
            

        System.out.println("Jardim inicial:");

        

        jardim.get()
            .map( (n) -> n + ", ")
            .forEach(System.out::print);

        System.out.println("\nJardim Bagunçado:");

        jardim.get()
            .unordered()
            .parallel()
            .map((n) -> n +", ")           
            .forEach(System.out::print);
        
        System.out.println("\nApós colheita:");
        jardim.get()
        .unordered()
        .parallel()
        .filter( (n) -> n != 3)
        .skip((long) (jardim.get().toList().size() * 0.25))
        .map((n) -> n +", ")
        .forEach(System.out::print);
        ;
    }
}
