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
public class App {
    public static void main(String[] args) throws Exception {
        int num1, num2, media=0;
        try{
            num1 = 4;
            num2 = 0;
            media = num1 / num2;

        } catch (ArithmeticException e){
            System.out.println("Não há divisão por zero");
        } finally{
            System.out.println(media);
        }
    }
}
