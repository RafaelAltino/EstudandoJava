package Exercicios2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = 0, menor = 0, somatorio = 0;
        double media;

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %dº número: ", i +1);
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        for(int i = 0; i < 5; i++){
            if(i == 0){
                maior = numeros[0];
                menor = numeros[0];

            } else if(numeros[i] > maior){
                maior = numeros[i];
            } else if(numeros[i] < menor){
                menor = numeros[i];
            }
            somatorio += numeros[i];
            
        }
        media = somatorio / 5;

        System.out.print("\n=====================\n\n");
        
        System.out.printf("Maior: %d\nMenor: %d\nMédia: %f", maior, menor, media);
                   
        sc.close();    
     }
}
