import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma medida em polegadas:");
        double polegadas = Double.parseDouble(sc.nextLine());

        System.out.printf("%.2f polegadas equivalem a %.1f centímetros", polegadas, (polegadas * 2.54));

        
        sc.close();    
     }
}