import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class ClassesEObjetos {
    public static void main(String[] args){

        //tipo por valor -> tipos primitivos //bite, short, int long,...
        //tipo de referência -> Object


        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);

        
        // São métodos comuns de TODOS os objetos
        // numeros.toString();
        // numeros.equals(null);
        // numeros.hashCode();
        // numeros.clone();

        Empregado jesse = new Empregado();
        jesse.nome = "Jesse";
        jesse.dataNascimento = LocalDate.of(1985, 9, 30);
        jesse.salario = new BigDecimal(10_000);

        Empregado anderson = new Empregado();
        anderson.nome = "Anderson";
        anderson.dataNascimento = LocalDate.of(1979, 11, 18);
        anderson.salario = new BigDecimal(10_000);

        System.out.println(jesse.toString());
        System.out.println(anderson);


    }
}
