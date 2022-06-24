import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<Conta>();

    public void abrirConta(int agencia, int numero, Cliente titular, TipoConta tipoConta){
        if(!verificarSeContaJaExiste(agencia, numero)){
            switch(tipoConta){
                case CONTACORRENTE:
                    contas.add(new ContaCorrente(agencia, numero, titular));
                    System.out.println("Conta Corrente criada com sucesso");
                break;
                case CONTAPOUPANCA:
                    if(titular instanceof PessoaFisica){
                        contas.add(new ContaPoupanca(agencia, numero, ((PessoaFisica)titular)));
                        System.out.println("Conta Poupança criada com sucesso");
                    }else{
                        System.out.println("Pessoa Jurídica não pode abrir Conta Poupança");
                    }                   
                break;
                case CONTAINVESTIMENTO:
                    contas.add(new ContaInvestimento(agencia, numero, titular));
                    System.out.println("Conta Investimento criada com sucesso");
                break;
                default:
                    System.out.println("Não foi possível abrir uma conta");             
            }
        }
    }

    private boolean verificarSeContaJaExiste(int agencia, int numero){
        for(Conta c : contas){
            if(c.getAgencia() == agencia && c.getNumero() == numero){
                System.out.println("Esta conta já existe, insira outro número ou agência");
                return true;
            }
        }
        return false;
    }

    public Conta getConta(int agencia, int numero){
        for(Conta c : contas){
            if(c.getAgencia() == agencia && c.getNumero() == numero){
                return c;
            }
        }
        System.out.println("Não foi possível encontrar uma conta com estas informações");
        return null;
    }

}
