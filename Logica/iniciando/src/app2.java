public class app2 {
    /**
     * Programa inicial java para imprimir "Hello World" no terminal.
     */

    static int numero; //Fild, campo, atributo

    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 2;

        double d = ((double) a) / b; //Cuidado, pois com dinheiro é perigoso errar
        double e = 2.5;

        System.out.println("E: " + e);
        System.out.println(d);
        System.out.println(++d); // Incrementa primeiro, depois imprime
        System.out.println(d++); //Imprime primeiro, incrementa depois
        System.out.println(d);

    }
}
