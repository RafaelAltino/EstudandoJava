public class Pessoa {
    private String nome;
    private int idade;
    private Sexo genero;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Sexo genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }
    
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
    public Sexo getGenero() {
        return genero;
    }
    public void setGenero(Sexo genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {

        return "Pessoa[nome: " + this.getNome() + ", idade: " + this.getIdade() + ", " + this.getGenero() +"]";
    }

    
}
