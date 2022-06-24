public class PessoaFisica extends Cliente{
    private String nome;
    private String cpf;
    private double taxaDeSaque = 0;
    private double getTaxaDeRendimentoEmContaInvestimento = 0;

    public PessoaFisica(){

    }
    public PessoaFisica(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double getTaxaDeSaque() {
        return this.taxaDeSaque;
    }

    @Override
    public double getTaxaDeRendimentoEmContaInvestimento() {
        return this.getTaxaDeRendimentoEmContaInvestimento;
    }

    @Override
    public String getRegistro() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return (
            "Pessoa Física{" + 
            "\nnome: " + this.nome + 
            "\ncpf: " + this.cpf + 
            "\ntaxaDeSaque: " + this.taxaDeSaque + 
            "\ntaxaDeRendimento: " + this.getTaxaDeRendimentoEmContaInvestimento + 
            "\n}"
        );
    }
}
