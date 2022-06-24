import java.time.LocalDateTime;

public class condicoes {


    public static void main(String[] args) throws Exception {

        int horas = LocalDateTime.now().getHour();

        String mensagem;
        if (horas >= 0 && horas < 12){
            mensagem = "Bom dia!";
        } else if (horas >= 12 && horas < 18){
            mensagem = "Boa tarde!";
        } else if (horas >= 18 && horas < 24){
            mensagem = "Boa noite!";
        } else {
            mensagem = "Hora inválida!";
        }

        System.out.println(mensagem);


    }
}
