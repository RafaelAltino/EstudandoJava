package Exercicios2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %dº número: ", i +1);
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("\n=====================\n\n");
        
        for(int i = 0; i < 5; i++){
            if(numeros[i] % 2 == 0){
                System.out.printf("%d, ", numeros[i]);
            }          
        }
        for(int i = 0; i < 5; i++){
            if(numeros[i] % 2 == 1){
                System.out.printf("%d, ", numeros[i]);
            }          
        }
                   
        sc.close();    
     }
}
