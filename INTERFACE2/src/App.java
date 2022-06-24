/* Interface vs Herança vs Classe Abstrata
 * 1) INTERFACES
 * 
 * Palavra-chave: interface
 * Só pode conter assinatura dos métodos, sem corpo
 * Só pode conter variáveis constantes, = static ou final
 * A classe que implementar a interface = implementartodos os seus métodos
 * (ou ser uma classe abstrata, ou aplicar default methods)
 * Uma classe pode implementar diversas interfaces
 * Uma interface pode estender diversas outras interfaces
 * 
 * Vantagem: facilidade de implementar APS's usando interfaces
 * Desvantagem: mau uso (usar muitas interfaces, assinar muitos "contratos")
 * usar muitos métodos em uma única interface
 * 
 * INTERFACE DE MARCAÇÃO
 * São interfaces que servem apenas para "marcar" outras classes, para facilitar
 * o uso do método instance of
 * 
 * HERANÇA
 * "INCENTIVA" o uso de classes, permitindo estender as funcionalidades de 
 * uma classe existente. Podemos estender funções, métodos, etc.
 * 
 * Vantagem: minimizar a quantidade de código duplicado em aplicação
 * Reaproveitar o código com herança -> aumentando a produtividade
 * Substituição de métodos da classe pai, de modo que a implementação
 * real fica a cargo da classe filha
 * 
 * Desvantagem: acoplamento alto -> limitação
 * Salto em níveis de classes sobrecarregadas
 * Não possuir herança múltipla
 * 
 * CLASSES ABSTRATAS
 * Não pode ser instanciada -> não pode gerar objetos
 * Geralmente é uma classe base, com definições básicas para o restante
 * das outras classes
 * Para seus atributos e métodos, é obrigatório utilizar a 
 * herança desta classe abstrata
 * 
 * Quando usamos interface, estamos definindo um conjunto de assinaturas
 * de métodos que outras classes devem implementar. Já as classes abstratas
 * servem para prover uma "base" para que outras classes "herdem" desta e 
 * não se preocupem com "comportamentos-padrão"
 * 
 * Sempre que precisar-mos defirnir um conjunto de métodos que devem ser
 * implementados por um GRUPO DE CLASSES -> Depende do grau de relacionamento INTERFACES(?)
 * Se precisarmos determinar uma classe base para outras classes, sendo esta
 * base sem necessidade de se instanciar ->CLASSE ABSTRATA
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class App {

    // public void calcularSalarioGerente(Gerente gerente){            
    // }
    // public void calcularSalarioCoordenador(Coordenador coordenador){          
    // }
    // public void calcularSalarioFiscal(Fiscal fiscal){            
    // }

    public void calcularSalarioDeFuncionario(Funcionario f){
        if(f instanceof Gerente){
            //Calcula o salário do gerente
        } else if(f instanceof Coordenador){
            //Calcula o salário do coordenador
        } else if(f instanceof Fiscal){
            //Calcula o salário do fiscal
        }
    }

    public static void main(String[] args) throws Exception {
        
        // FuncionarioDAO funcDAO = new FuncionarioDAO();
        // String nome = "Anderson";
        

        // if(funcDAO instanceof MinhaInterface){
        //     funcDAO.salvar(nome);
        //     System.out.println("Deu bom");
        // } else{
        //     System.out.println("A classe funcionário dao não implementa a interface");

        // }

        

        
    }
}
