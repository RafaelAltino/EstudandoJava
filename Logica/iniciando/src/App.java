public class App {
    /**
     * Programa inicial java para imprimir "Hello World" no terminal.
     */

    static int numero; //Fild, campo, atributo

    public static void main(String[] args) throws Exception {

        int resultado = 90;

        System.out.println(numero);
        System.out.println(resultado);
        //String nome = "Rafael";
        //System.out.println("Hello, World!");
        //double pi = Math.PI;
        //System.err.println();
        //System.out.println("Olá " + nome); // concatenar, concatenação

        //float moeda = 3.5f;
        //double pi = 3.1415d;
        long habitantesTerra = 7_800_000_000L;
        //habitantesTerra = 1;

        int numero = (int) 7_800_000_000L; //cast, casting (não cabe mas estou representando como inteiro)

        //double d = 3;

        System.out.println(habitantesTerra);

        habitantesTerra = (long) '1';

        System.out.println(habitantesTerra);

        System.out.println(numero);


    }
}
