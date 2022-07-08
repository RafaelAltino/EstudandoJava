import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args)throws Exception{

        ZoneId fuzoHorarioSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId fuzoHorarioParis = ZoneId.of("Europe/Paris");
        ZoneId fuzoHorarioTokyo = ZoneId.of("Asia/Tokyo");

        System.out.println("Offset São Paulo: " + fuzoHorarioSaoPaulo.getRules().getOffset(Instant.now()));
        System.out.println("Offset Paris: " + fuzoHorarioParis.getRules().getOffset(Instant.now()));
        System.out.println("Offset Tokyo: " + fuzoHorarioTokyo.getRules().getOffset(Instant.now()));
        System.out.println();

        System.out.println("São Paulo");
        System.out.println("\tInstant: "+ Instant.now().atZone(fuzoHorarioSaoPaulo).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("\tMoment: " + Instant.now().atZone(fuzoHorarioSaoPaulo).format(DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println("Paris");
        System.out.println("\tInstant: "+ Instant.now().atZone(fuzoHorarioParis).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("\tMoment: " + Instant.now().atZone(fuzoHorarioParis).format(DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println("Tokyo");
        System.out.println("\tInstant: "+ Instant.now().atZone(fuzoHorarioTokyo).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("\tMoment: " + Instant.now().atZone(fuzoHorarioTokyo).format(DateTimeFormatter.ofPattern("HH:mm")));

    }
}
