public class PessoaJuridica extends Cliente{
    private String nomeEmpresa;
    private String cnpj;
    private double taxaDeSaque = 0.005;
    private double getTaxaDeRendimentoEmContaInvestimento = 0.02;

    public PessoaJuridica(){

    }
    public PessoaJuridica(String nomeEmpresa, String cnpj){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }



    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    public String getNome() {
        return this.nomeEmpresa;
    }

    @Override
    public String getRegistro() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return (
            "Pessoa Jurídica{" + 
            "\nnomeEmpresa: " + this.nomeEmpresa + 
            "\ncnpj: " + this.cnpj + 
            "\ntaxaDeSaque: " + this.taxaDeSaque + 
            "\ntaxaDeRendimento: " + this.getTaxaDeRendimentoEmContaInvestimento + 
            "\n}"
        );
    }
    
}
