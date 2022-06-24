public class Arrays {
    public static void main(String[] args) throws Exception {
    
        int[] arrayInteiros = new int[10];  //Usar assim no Java
        

        // 1 - O tamanho do array é FIXO
        // 2 - Todos os elementos devem ser do mesmo tipo
        // 3 - int arrayInteiro[] = new int[10];  // Assim se usa no C
        // 4 - nomeDoArray.length não é método, é uma propriedade
        // 4.2 - Já nomeDaString.length() é método

        arrayInteiros[0] = 5;
        arrayInteiros[0] = 9;
        arrayInteiros[0] = 3;
        // Posso alterar os valores de um índice à vontade

        arrayInteiros[0] = 5;
        arrayInteiros[1] = 9;
        arrayInteiros[2] = 3;

        System.out.println(arrayInteiros[0]);
        System.out.println(arrayInteiros[1]);
        System.out.println(arrayInteiros[2]);
        System.out.println(arrayInteiros[3]);
        System.out.println();

        //Cada índice de um array de inteiros é inicializado com 0

        for(int i = 0; i < 10; i++){
            System.out.printf("%d, ", arrayInteiros[i]);
        }

        System.out.println();

        //foreach - "for enhanced"
        for(int i = 0; i < arrayInteiros.length; i++){
            int inteiro  = arrayInteiros[i];
            System.out.printf("%d, ", inteiro);
        }

        System.out.println();

        for(int inteiro : arrayInteiros){
            System.out.printf("%d, ", inteiro);
        }

        System.out.println("\n\n============================\n");

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(copyFrom);
        System.out.println(new String(copyTo));
        String text = "Olá Mundo";
        char[] charArray = text.toCharArray();
        System.out.println(charArray);

    }
}
