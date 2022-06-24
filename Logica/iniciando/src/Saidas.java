import java.util.Scanner;

public class Saidas {
    /**
     * Programa inicial java para imprimir "Hello World" no terminal.
     */

    static int numero; //Field, campo, atributo

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua idade (em anos): ");
        //int idade = Integer.parseInt(sc.nextLine());
        int idade = sc.nextInt();

        //String linha = sc.nextLine(); //Outra forma , usando uma outra variável
        //int idade = Integer.parseInt(linha);
        
        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos."); // Olá meu nome é ____ e tenho ___ anos.
        System.out.printf("Olá, meu nome é %s e eu tenho %d anos.", nome, idade);
        
        String mensagem = idade >= 18 ? "Vamos pro bar" : "Vamos pro MCDonalds";

        System.out.println(mensagem);
        sc.close();
    
    
    
    
    }
}
