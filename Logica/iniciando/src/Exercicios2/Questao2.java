package Exercicios2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
        System.out.printf("\n%s ao contrário fica: ", palavra);

        for(int i = palavra.length() - 1; i >= 0; i--){
            System.out.print(palavra.charAt(i));
        }
              
        sc.close();    
     }
}
