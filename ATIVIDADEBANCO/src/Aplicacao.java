public class Aplicacao {
    public static void main(String[] args) throws Exception {

        //Criando uma pessoa física joão e pessoa jurídica loja
        PessoaFisica joao = new PessoaFisica("João da Silva", "111.222.333-44");
        PessoaJuridica loja = new PessoaJuridica("Lojinha Legal", "11.222.333/0001-44");

        //Instanciando um objeto banco, que possui um array-list
        //para guardar as contas que vão sendo criadas
        Banco banco = new Banco();

        System.out.println("\n\n====================SAQUE===================\n");

        //Criando uma conta para Pessoa Física e Pessoa Jurídica
        banco.abrirConta(1, 1, joao, TipoConta.CONTACORRENTE);
        banco.abrirConta(1, 2, loja, TipoConta.CONTACORRENTE);

        //Depositando 1000 em ambas as contas
        banco.getConta(1, 1).depositar(1000);
        banco.getConta(1, 2).depositar(1000);

        //Exibindo saldo de ambas as contas
        System.out.printf("\nSaldo PF: %.2f", banco.getConta(1, 1).getSaldo());
        System.out.printf("\nSaldo PJ: %.2f", banco.getConta(1, 2).getSaldo());

        //Sacando 200 em ambas as contas
        banco.getConta(1, 1).sacar(200);
        banco.getConta(1, 2).sacar(200);

        //Exibindo saldo após saque
        System.out.printf("\nSaldo PF após saque de 200 reais: %.2f", banco.getConta(1, 1).getSaldo());
        System.out.printf("\nSaldo PJ após saque de 200 reais: %.2f", banco.getConta(1, 2).getSaldo());


        System.out.println("\n\n================TRANSFERÊNCIA===============\n");

        //Criando uma conta para fazer os testes de transferência
        banco.abrirConta(1, 3, joao, TipoConta.CONTAPOUPANCA);

        //Depositando para ambas as contas voltarem a ter 1000 reais cada
        banco.getConta(1, 1).depositar(200);
        banco.getConta(1, 2).depositar(201);

        //Exibindo saldo de ambas as contas
        System.out.printf("\nSaldo PF: %.2f", banco.getConta(1, 1).getSaldo());
        System.out.printf("\nSaldo PJ: %.2f", banco.getConta(1, 2).getSaldo());

        //Depositando para ambas as contas voltarem a ter 1000 reais cada
        banco.getConta(1, 1).transferir(200, banco.getConta(1, 3));
        banco.getConta(1, 2).transferir(200, banco.getConta(1, 3));
        
        //Exibindo saldo de todas as contas
        System.out.printf("\nSaldo PF após transferência de 200 reais: %.2f", banco.getConta(1, 1).getSaldo());
        System.out.printf("\nSaldo PJ após transferência de 200 reais: %.2f", banco.getConta(1, 2).getSaldo());
        System.out.printf("\nSaldo Conta Nova: %.2f", banco.getConta(1, 3).getSaldo());


        System.out.println("\n\n==================POUPANÇA===================\n");
        
        //Criando contas Poupança e Investimento, 
        banco.abrirConta(2, 1, joao, TipoConta.CONTAPOUPANCA);
        banco.abrirConta(2, 2, joao, TipoConta.CONTAINVESTIMENTO);
        //Pessoa Juídica não vai criar a Conta Poupança
        banco.abrirConta(2, 3, loja, TipoConta.CONTAPOUPANCA);
        banco.abrirConta(2, 4, loja, TipoConta.CONTAINVESTIMENTO);

        //O código abaixo também não permite criar Conta Poupança para PJ
        //ContaPoupanca cp = new ContaPoupanca(3, 3, loja);

        System.out.println("\n================INVESTIMENTO=================");

        //Depositando 1000 reais nas Contas de Investimento
        banco.getConta(2, 2).depositar(1000);
        banco.getConta(2, 4).depositar(1000);

        //Exibindo saldo de ambas as contas
        System.out.printf("\nSaldo PF: %.2f", banco.getConta(2, 2).getSaldo());
        System.out.printf("\nSaldo PJ: %.2f", banco.getConta(2, 4).getSaldo());

        //Realizando o Investimento nas Contas Investimento de PF e PJ
        ((ContaInvestimento) banco.getConta(2, 2)).investir();
        ((ContaInvestimento) banco.getConta(2, 4)).investir();
        

        //Exibindo saldo de ambas as contas
        System.out.printf("\nSaldo PF após o investimento: %.2f", banco.getConta(2, 2).getSaldo());
        System.out.printf("\nSaldo PJ após o investimento: %.2f", banco.getConta(2, 4).getSaldo());
        
    }   
}
