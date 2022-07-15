import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("SUM de 0 a 10");
        System.out.println(IntStream.range(0, 10)
            .skip(5)
            .sum()
            //.forEach(i -> System.out.println(i));
            //.forEach(System.out::println);

        );

        OptionalInt minimo = Arrays.stream(new int[] {12, 45, 98, 32, 45, 55}).min();
        if(minimo.isPresent()){
            System.out.println("Vamor minimo: " + minimo.getAsInt());
        }



    }
}
