import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Danilo", 30, "1234-1234");
        Cliente c2 = new Cliente("Bianca", 20, "1212-2121");
        Cliente c3 = new Cliente("Amanda", 40, "9876-5432");
        Cliente c4 = new Cliente("Carlos", 50, "5555-5555");
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        Comparador comparadorClientes = new Comparador<Cliente>();


        Empregado e1 = new Empregado("Urias", 50, "Assessor");
        Empregado e2 = new Empregado("Sandra", 30, "Diretora");
        Empregado e3 = new Empregado("Thales", 20, "Estagiário");
        Empregado e4 = new Empregado("Rosana", 40, "Gerente");

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(e1);
        empregados.add(e2);
        empregados.add(e3);
        empregados.add(e4);
        Comparador comparadorEmpregados = new Comparador<Empregado>();


        System.out.println("Lista original de Clientes: ");
        for(Cliente c : clientes){
            System.out.print(c.toString() + ", \n");
        }
        MyOwnLists.asListedSorted(clientes, comparadorClientes);
        System.out.println("Lista ordenada de Clientes: ");
        for(Cliente c : clientes){
            System.out.print(c.toString() + ", \n");
        }


        System.out.println("\nLista original de Empregados: ");
        for(Empregado e : empregados){
            System.out.print(e.toString() + ", \n");
        }
        MyOwnLists.asListedSorted(empregados, comparadorClientes);
        System.out.println("Lista ordenada de Empregados: ");
        for(Empregado e : empregados){
            System.out.print(e.toString() + ", \n");
        }
        

        


    }
}
