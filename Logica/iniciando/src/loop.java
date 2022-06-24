import java.util.Scanner;

public class loop {
    public static void main(String args[]) throws Exception{

        for(int i = 0; i < 3; i++){
            System.out.println("==============");
        }

        int qtdTentativas = 1;
        final int qtdMaximaTentativas = 3;
        final String contraSenha = "123456";

        Scanner input = new Scanner(System.in);
        System.out.println("Senha: ");
        String senha = input.nextLine();

        while(!senha.equals(contraSenha) && qtdTentativas <= qtdMaximaTentativas){
            qtdTentativas++;
            System.out.printf("Senha incorreta. Tente novamente. [%d/%d]%n", qtdTentativas, qtdMaximaTentativas);
            System.out.println("Senha: ");
            senha = input.nextLine();
    
        }
        input.close();
        System.out.println("Sucesso");










    }
}
