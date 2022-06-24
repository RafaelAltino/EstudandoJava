import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[5];
        double total = 0;
        int novo = 0, velho = 0;
        String nome;
        int idade;

        for(int i = 0; i < pessoa.length; i++){
            System.out.printf("%dª pessoa\n", i+1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = Integer.parseInt(sc.nextLine());
            pessoa[i] = new Pessoa(nome, idade, 0, 0);

            if(i == 0 || pessoa[i].getIdade() < novo){
                novo = pessoa[i].getIdade();
            }
            if(i == 0 || pessoa[i].getIdade() > velho){
                velho = pessoa[i].getIdade();
            }
            total += pessoa[i].getIdade();         
        }

        double media = total / pessoa.length;

        System.out.printf("\nCom %d anos a(s) pessoa(s) mais nova(s) é(são): ", novo);
        for(int i = 0; i < pessoa.length; i++){
            if(pessoa[i].getIdade() == novo){
                System.out.printf("%s, ", pessoa[i].getNome());
            }
        }

        System.out.printf("\nCom %d anos a(s) pessoa(s) mais velha(s) é(são): ", velho);
        for(int i = 0; i < pessoa.length; i++){
            if(pessoa[i].getIdade() == velho){
                System.out.printf("%s, ", pessoa[i].getNome());
            }
        }

        System.out.printf("\nA média das idades é %.2f", media);

        sc.close();
    }
}