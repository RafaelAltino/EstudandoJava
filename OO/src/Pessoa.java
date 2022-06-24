public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    double imc;
    
    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = this.peso / (this.altura * this.altura);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
        setImc();
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
        setImc();
    }

    public double getImc(){
        return this.imc;
    }
    public void setImc(){
        this.imc = this.peso / (this.altura * this.altura);
    }

    @Override
    public String toString(){
        return ("Nome: " + this.nome + ",\nIdade: " + this.idade + "\nAltura: "
        + this.altura + "\nPeso: " + this.peso + "\nIMC: " + this.imc);
    }

}
