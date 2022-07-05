package Desafio_Ordem_Soma;

public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 3, n2 = 1;

        Ordenar(n1, n2);

        System.out.println();

        Ordenar(2, 6);

    }

    public static void Ordenar(int n1, int n2){
        int maior = Math.max(n1, n2), menor = Math.min(n1, n2);
        int tamanho = 0, soma = 0;

        if(maior != menor){
            tamanho = maior - menor;
        }

        int vetor[];
        vetor = new int[tamanho + 1];
        for(int i = 0; i <= tamanho; i++){
            vetor[i] = menor + i;
            soma = soma + (menor + i);
            System.out.print(menor + i + ", ");
        }

        System.out.printf(" - Soma: %d", soma);

    }
}
