public class Empregado extends Pessoa{

    private String funcao;

    public Empregado(String nome, int idade, String funcao){
        super.setNome(nome);
        super.setIdade(idade);
        this.setFuncao(funcao);
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return ("Empregado: {Nome: " + super.getNome() + "}");
    }



}
