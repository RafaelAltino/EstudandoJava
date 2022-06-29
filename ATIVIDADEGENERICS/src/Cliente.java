public class Cliente extends Pessoa{

    private String telefone;

    public Cliente(String nome, int idade, String telefone){
        super.setNome(nome);
        super.setIdade(idade);
        this.setTelefone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return ("Cliente: {Nome: " + super.getNome() + "}");
    }
}
