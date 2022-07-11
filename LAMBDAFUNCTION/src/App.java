import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MinhaLambda aa = (i) -> i + 1;
        System.out.println(aa.test(10));
        
        Function<Integer, String> ccc = (i) -> i + 1 + "";
        ccc.apply(10);

        LambdaConversora<String, Integer> bb = (i) -> i + "";


        
    }
}
