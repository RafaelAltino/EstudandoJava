public class ExcedeuLimiteMaximoEmprestimoException extends RuntimeException{
    public ProfessorEstorouLimiteLivrosException (int totalLivrosEmprestados){
        super(String.format("Não é possivel realizar novo empréstimo. 
        O professor já possui %d livros emprestados", totalLivrosEmprestados));
    }
}
