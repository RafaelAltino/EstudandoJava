package Exercicios2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {

        String[] carrinhoDeCompras = new String[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite a %dª fruta: ", i+1);
            carrinhoDeCompras[i] = sc.nextLine();
        }

        System.out.println("\n==================\n");
        System.out.printf("As frutas digitadas foram: ");

        for(int i = 0; i < 5; i++){
            if(i != 4){
                System.out.printf("%s, ", carrinhoDeCompras[i]);
            } else{
                System.out.printf("%s", carrinhoDeCompras[i]);
            }           
        }
              
        sc.close();    
     }
}
