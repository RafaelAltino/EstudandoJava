package Desafio_Unir_Dois_Arrays;

public class App {
    public static void main(String[] args)throws Exception{
        int[] array1 = {1,3,5,7};
        int[] array2 = {2,4,6,8,12,15};
        int tamanho = array1.length + array2.length;
        int[] arrayConsolidado = new int[tamanho];

        juntarArrays(array1, array2, arrayConsolidado);
        printarArray("Array1: ",array1);
        printarArray("Array2: ",array2);
        printarArray("ArrayConsolidado: ",arrayConsolidado);

        

    }

    public static void juntarArrays(int[] array1, int[] array2, int[] arrayConsolidado){

        for(int i = 0; i < array1.length; i++){
            arrayConsolidado[i] = array1[i];
        }
        for(int i = array1.length; i < (array1.length + array2.length); i++){
            arrayConsolidado[i] = array2[i-array1.length];
        }


        quickSort(arrayConsolidado, 0, arrayConsolidado.length-1);

    }

    public static void quickSort(int vet[], int esq, int dir){
        int pivo = esq, i,ch,j;         
        for(i=esq+1;i<=dir;i++){        
            j = i;                      
            if(vet[j] < vet[pivo]){     
                ch = vet[j];               
                while(j > pivo){           
                    vet[j] = vet[j-1];      
                    j--;                    
                }
                vet[j] = ch;               
                pivo++;                    
            }
        }
        if(pivo-1 >= esq){              
            quickSort(vet,esq,pivo-1);      
        }
        if(pivo+1 <= dir){              
            quickSort(vet,pivo+1,dir);      
        }
    }
    
    public static void printarArray(String msg, int[] array){
        System.out.print(msg);
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d, ",array[i]);
        }
        System.out.println();
    }

}
