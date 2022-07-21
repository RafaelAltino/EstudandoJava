package Desafio_Jardim;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.ranges.Range;

public class App {
    public static void main(String[] args) {
        
        Stream<Integer> jardim = Stream.generate( () -> 1)
            .limit(100);
        
            Stream jardim2 = Stream.of(
                Stream.generate( () -> 1)
                .limit(100).collect(Collectors.toList()),
                Stream.generate( () -> 2)
                .limit(50).collect(Collectors.toList()),
                Stream.generate( () -> 3)
                .limit(25).collect(Collectors.toList())
            );

            
        
        jardim2
        .forEach( System.out::println)
        ;


        
    }
}
