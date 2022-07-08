import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
 * Pecisão de Máquina:
 * Instant.now();
 * 
 * Precisão Humana:
 * LocalDate.now();
 * LocalTime.now();
 * LocalDateTime.now();
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {

        String[] datas = new String[] {"1987-03-22", "22/03/1987"};
        for(String data : datas){
            if(data.matches(".*\\d{4}")){
                System.out.println(LocalDate.parse(data));
            } else{
                System.out.println("Ai caramba!");
                System.out.println(LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        }

        var antigo = LocalDateTime.of(2018, 1, 12, 15, 30);
        var atual = LocalDateTime.now();

        if(antigo.isBefore(atual)){
            System.out.println("A data é antiga!");
        }

        Period period = Period.between(antigo.toLocalDate(), atual.toLocalDate());

        System.out.println("Dias de intervalo Period: " + period.toString() + " # "
            + period.getYears() + period.getDays()
        );
        System.out.println("Total de meses: " + period.getYears() + period.getMonths());

        Instant instant1 = Instant.now();
        try{
            //Thread.sleep(4000);
        } catch(Exception e){}

        Duration duration = Duration.between(instant1, Instant.now());

        System.out.println("Dias de intervalo Duration: " + duration.toString() + " # "
            + duration.toSeconds()
        );

        String data1 = "1998-03-21";
        LocalDate.parse(data1);

        String data2 = "21/03/1987 01:02:10";
        LocalDate.parse(data2, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        String dataEHora = "06/02/1997 08:10:05";

        System.out.println("Data: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

















    }

        


}
