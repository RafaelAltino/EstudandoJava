import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

            // java 9 -> of methods
            List<String> x = List.of("a", "b", "c");
            System.out.println( x );
    
            // java 8? -> double brace pattern
            List<String> y = new ArrayList<>() {{
               add("a");
               add("b");
               add("c");
            }};
            System.out.println( y );
        }
    
    
}
