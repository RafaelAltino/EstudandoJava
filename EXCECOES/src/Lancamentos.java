/*Try-Catch
 * Tratamento de Exceção : Divisão por 0
 * IOException : Erro de entrada e saída
 * FileNotFoundException : arquivo inexistente
 * IllegalArgumentException : argumentos ilegais na execução do método
 * 
 * Throuble : unifica as ações de erros e exceções
 * Error : não deve ser tratada - deve ser corrigida
 * Exception : podem ser tratadas
 * RuntimeException : recebem um tratamento padrão do ambiente de execução
 */
public class Lancamentos {
    public static void main(String[] args)throws Exception{
    
        private void emprestimoAcimaDoMaximo(){
            Professor professor = new Professor();
            Livros[] livros = new Livros[5];
            try{
                Emprestimo emprestimo = new Emprestimo(professor, livros)
                ;
            } catch(ExcedeuLimiteMaximoEmprestimoException e){
                System.out.println(e.getMessage());
            }

        }







    }
}
