package Exercicios2;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        String[] nomes = new String[5];
        int[] idades = new int[5];
        double total = 0;
        int novo = 0, velho = 0;

        for(int i = 0; i < idades.length; i++){
            System.out.printf("%dª pessoa\n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(sc.nextLine());

            if(i == 0 || idades[i] < novo){
                novo = idades[i];
            }
            if(i == 0 || idades[i] > velho){
                velho = idades[i];
            }
            total += idades[i];         
        }

        double media = total / idades.length;

        System.out.printf("\nCom %d anos a(s) pessoa(s) mais nova(s) é(são): ", novo);
        for(int i = 0; i < idades.length; i++){
            if(idades[i] == novo){
                System.out.printf("%s, ", nomes[i]);
            }
        }

        System.out.printf("\nCom %d anos a(s) pessoa(s) mais velha(s) é(são): ", velho);
        for(int i = 0; i < idades.length; i++){
            if(idades[i] == velho){
                System.out.printf("%s, ", nomes[i]);
            }
        }

        System.out.printf("\nA média das idades é %.2f", media);




        sc.close();
    }
}
