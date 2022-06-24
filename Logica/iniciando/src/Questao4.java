import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a cotação do dólar de hoje? ");
        double cotacao = sc.nextDouble();
        //double cotacao = Double.parseDouble(sc.nextLine());
        System.out.println("Digite um valor em reais: ");
        double reais = sc.nextDouble();
        //double reais = Double.parseDouble(sc.nextLine());
        double dolar = reais / cotacao;

        System.out.printf("R$%.2f equivalem a $%.2f", reais, (dolar));
       
        sc.close();    
     }
}
