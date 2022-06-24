package Exercicios2;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        String[] nome = new String[5];
        double[] altura = new double[5];
        double[] peso = new double[5];
        double[] imc = new double[5];
        boolean pesado = false, leve = false, ideal = false;

        for(int i = 0; i < nome.length; i++){
            System.out.printf("\n%dª pessoa\n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Altura: ");
            altura[i] = Double.parseDouble(sc.nextLine());
            System.out.print("Peso: ");
            peso[i] = Double.parseDouble(sc.nextLine());

            imc[i] = peso[i] / (altura[i] * altura[i]);
            if(imc[i] < 18.5){
                leve = true;
            } else if(imc[i] > 25){
                pesado = true;
            } else{
                ideal = true;
            }
        }
        if(leve){
            System.out.println("\nAs seguintes pessoas estão com o peso abaixo do ideal: ");
            for(int i = 0; i < nome.length; i++){
                if(imc[i] < 18.5){
                    System.out.printf("NOME: %s - IMC: %.2f\n", nome[i], imc[i]);
                }
            }
        }
        if(pesado){
            System.out.println("\nAs seguintes pessoas estão com o peso acima do ideal: ");
            for(int i = 0; i < nome.length; i++){
                if(imc[i] > 25){
                    System.out.printf("NOME: %s - IMC: %.2f\n", nome[i], imc[i]);
                }
            }
        }
        if(ideal){
            System.out.println("\nAs seguintes pessoas estão com o peso ideal: ");
            for(int i = 0; i < nome.length; i++){
                if(imc[i] >= 18.5 && imc[i] <= 25){
                    System.out.printf("NOME: %s - IMC: %.2f\n", nome[i], imc[i]);
                }
            }
        }
        
        sc.close();
    }
}
