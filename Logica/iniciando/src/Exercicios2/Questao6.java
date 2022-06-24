package Exercicios2;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        System.out.print("Digite uma palavra: ");
        String palavraOriginal = sc.nextLine();
        char[] palavraNova = new char[palavraOriginal.length()];

        for(int i=0; i < palavraOriginal.length(); i++){
            if(i % 2 == 0){
                palavraNova[i] = Character.toUpperCase(palavraOriginal.charAt(i));
            } else{
                palavraNova[i] = Character.toLowerCase(palavraOriginal.charAt(i));
            }
        }

        for(int i = 0; i < palavraNova.length; i++){
            System.out.printf("%c", palavraNova[i]);
        }

        sc.close();
    }
}
