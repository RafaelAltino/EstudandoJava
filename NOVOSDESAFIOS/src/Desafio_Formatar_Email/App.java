package Desafio_Formatar_Email;

public class App {
    public static void main(String[] args)throws Exception{
        Usuario joao = new Usuario("João da Silva", "joaozinho@gmail.com");
        Usuario maria = new Usuario("Maria Souza", "mariazinha@gmail.com");


        joao.enviarEmail("mariazinha@gmail.com",
            "Olá amiga, tudo bem? Eu faço 30 anos amanhã na ANABB, você é minha convidada!")
            .formatarRemoverAcentos(); //Formatando para remover os acentos


        maria.enviarEmail("joaozinho@gmail.com",
            "Muito obrigada, mas não poderei ir. Parabéns pelo dia!")
            .formatarCamelCase(); //Formatando para CamelCase


        joao.enviarEmail("mariazinha@gmail.com",
            "Tem certeza? Vai ter bolo.")
            .formatarMaiusculo(); //Formatando para tudo maiúsculo
        

        maria.enviarEmail("joaozinho@gmail.com",
            "Então eu vou. ADORO BOLO!!!")
            .formatarMinusculo(); //Formatando para tudo Minúsculo
        

        System.out.println("\nMaria lendo seus emails:");
        maria.lerEmails();

        System.out.println("\nJoão lendo seus emails:");
        joao.lerEmails();

        








    }
}
