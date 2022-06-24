package Exercicios2;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] convidados = new String[5];
        String[] maior = {"", "", "", "", ""};
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o nome do %dº convidado: ", i+1);
            convidados[i] = sc.nextLine().strip();

            //Confere se o convidado possui o maior nome até então. Caso possua,
            //Vai coloca-lo na primeira posição e limpar o restante
            if(convidados[i].length() > maior[0].length()){
                maior[0] = convidados[i];
                for(int j = 1; j < maior.length; j++){
                    maior[j] = "";
                }

            //Caso encontre outro nome com a mesma quantidade de caracteres
            //Vai acescenta-lo à lista "maior"
            } else if(convidados[i].length() == maior[0].length()){
                int j = 0;
                do{
                    //Procura o próximo espaço vazio da lista
                    if(maior[j] != ""){
                        j++;
                        continue;
                    }
                    maior[j] = convidados[i];
                    break;
                } while(j < 5);
            }
        }

        //Verifica se a lista maior não possui outro convidado além da primeira posição
        if(maior[1] == ""){
            System.out.printf("O convidado com o maior nome é: %s", maior[0]);

        //Caso a lista possua mais de um nome, exibe todos 
        } else{
            System.out.print("Os convidados com os maiores nomes são: ");
            for(int i = 0; i < maior.length; i++){
                if(maior[i] != ""){
                    System.out.printf("%s, ", maior[i]);
                }              
            }
        }

        sc.close();
    }
}
