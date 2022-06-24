import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius:");
        int celsius = Integer.parseInt(sc.nextLine());
        
        //double fahrenheit = (celsius * 1.8) + 32;
        float fahrenheit = (celsius * 1.8F) + 32;

        System.out.printf("%d graus Celsius equivalem a %.2f graus Fahrenheit", celsius, fahrenheit);

        sc.close();    
     }
}
