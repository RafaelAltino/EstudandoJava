import java.util.Comparator;

abstract class Pessoa extends Object{
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }

    @Override
    public String toString() {
        return ("Pessoa: {Nome: " + this.nome + "}");
    }

}
