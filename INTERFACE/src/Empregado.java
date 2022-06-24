import java.math.BigDecimal;

public class Empregado implements Comparable{
    private String nome;   
    private int matricula;   
    private BigDecimal salario;


    public Empregado(){
        System.out.println("Um novo empregado foi contratado");
    }
    
    public Empregado(String nome, int matricula, BigDecimal salario){
        this();
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public BigDecimal getSalario(){
        return this.salario;
    }
    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }
    
    
    @Override
    public int compareTo(Object other) {
        Empregado empregado = (Empregado) other;
        if (this.matricula < empregado.matricula) {
            return -1;
        }
        if (this.matricula > empregado.matricula) {
            return 1;
        }
        return 0;
    }







}
