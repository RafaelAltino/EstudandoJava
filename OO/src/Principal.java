import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Dados cliente = new Dados();

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o numero da conta: ");
        cliente.setNumeroConta(sc.nextInt());
        System.out.print("Informe o saldo: ");
        cliente.setSaldo(sc.nextDouble());
        System.out.print("Informe o crédito: ");
        cliente.setCredito(sc.nextDouble());
        System.out.print("Informe o débito: ");
        cliente.setDebito(sc.nextDouble());

        System.out.println(cliente.getNumeroConta());
        System.out.println(cliente.getSaldo());
        System.out.println(cliente.getCredito());
        System.out.println(cliente.getDebito());
        System.out.println(cliente.getLiquido());




    }
}
