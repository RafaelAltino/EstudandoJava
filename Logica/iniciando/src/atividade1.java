import java.util.Scanner;

public class atividade1 {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        //int primeiro = Integer.parseInt(sc.nextLine());
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        //int segundo = Integer.parseInt(sc.nextLine());
        int segundo = sc.nextInt();
        System.out.printf("\n%d + %d = %d\n", primeiro, segundo, (primeiro + segundo));
        System.out.printf("%d - %d = %d\n", primeiro, segundo, (primeiro - segundo));
        System.out.printf("%d * %d = %d\n", primeiro, segundo, (primeiro * segundo));
        System.out.printf("%d / %d = %.2f\n", primeiro, segundo, (((double) primeiro) / segundo));
        sc.close();
   
    }
}
