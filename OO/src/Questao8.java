import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[5];
        String nome;
        double altura, peso;
        boolean pesado = false, leve = false, ideal = false;

        for(int i = 0; i < pessoa.length; i++){
            System.out.printf("\n%dª pessoa\n", i+1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Altura: ");
            altura = Double.parseDouble(sc.nextLine());
            System.out.print("Peso: ");
            peso = Double.parseDouble(sc.nextLine());
            pessoa[i] = new Pessoa(nome, 0, altura, peso);



            if(pessoa[i].getImc() < 18.5){
                leve = true;
            } else if(pessoa[i].getImc() > 25){
                pesado = true;
            } else{
                ideal = true;
            }
        }
        if(leve){
            System.out.println("\nAs seguintes pessoas estão com o peso abaixo do ideal: ");
            for(int i = 0; i < pessoa.length; i++){
                if(pessoa[i].getImc() < 18.5){
                    System.out.printf("NOME: %s - IMC: %.2f\n", pessoa[i].getNome(), pessoa[i].getImc());
                }
            }
        }
        if(pesado){
            System.out.println("\nAs seguintes pessoas estão com o peso acima do ideal: ");
            for(int i = 0; i < pessoa.length; i++){
                if(pessoa[i].getImc() > 25){
                    System.out.printf("NOME: %s - IMC: %.2f\n", pessoa[i].getNome(), pessoa[i].getImc());
                }
            }
        }
        if(ideal){
            System.out.println("\nAs seguintes pessoas estão com o peso ideal: ");
            for(int i = 0; i < pessoa.length; i++){
                if(pessoa[i].getImc() >= 18.5 && pessoa[i].getImc() <= 25){
                    System.out.printf("NOME: %s - IMC: %.2f\n", pessoa[i].getNome(), pessoa[i].getImc());
                }
            }
        }
        sc.close();
    }

}
