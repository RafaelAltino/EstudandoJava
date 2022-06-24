import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(sc.nextLine());
        
        for(int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
        }
        sc.close();    
     }
}
