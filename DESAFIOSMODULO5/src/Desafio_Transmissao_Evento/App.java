package Desafio_Transmissao_Evento;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class App {
    public static void main(String[] args) {
        LocalDateTime inicioSP = LocalDateTime.of(2022, 7, 20, 10, 0, 0);
        LocalDateTime finalSP = LocalDateTime.of(2022, 10, 30, 23, 59);
        LocalDateTime atual = inicioSP;

        List<Sessao> agendaSP = new ArrayList<>();

        int i = 0;
        while(atual.isBefore(finalSP)){
            agendaSP.add( new Sessao(i+1, atual, atual.plusHours(6)));

            atual = atual.plusHours(242);
            i++;
        }

        System.out.println("========AGENDA HORÁRIO DE SÃO PAULO========");

        for(i = 0; i < agendaSP.size(); i++){
            System.out.println(agendaSP.get(i).getNumero() + "a Sessão");
            System.out.printf("\tData: %d/%d/%d, %s\n",
            agendaSP.get(i).getInicio(Local.SAOPAULO).getDayOfMonth(),
            agendaSP.get(i).getInicio(Local.SAOPAULO).getMonthValue(),
            agendaSP.get(i).getInicio(Local.SAOPAULO).getYear(),
            diaDaSemana(agendaSP.get(i).getInicio(Local.SAOPAULO))
            );
            System.out.printf("\tHora: %dh - %dh",
                agendaSP.get(i).getInicio(Local.SAOPAULO).getHour(),
                agendaSP.get(i).getFim(Local.SAOPAULO).getHour()
            );
            System.out.println();
        }

        System.out.println("\n==========AGENDA HORÁRIO DE PARIS==========");
        for(i = 0; i < agendaSP.size(); i++){
            System.out.println(agendaSP.get(i).getNumero() + "a Sessão");
            System.out.printf("\tData: %d/%d/%d, %s\n",
            agendaSP.get(i).getInicio(Local.PARIS).getDayOfMonth(),
            agendaSP.get(i).getInicio(Local.PARIS).getMonthValue(),
            agendaSP.get(i).getInicio(Local.PARIS).getYear(),
            diaDaSemana(agendaSP.get(i).getInicio(Local.PARIS))
            );
            System.out.printf("\tHora: %dh - %dh",
                agendaSP.get(i).getInicio(Local.PARIS).getHour(),
                agendaSP.get(i).getFim(Local.PARIS).getHour()
            );
            System.out.println();
        }
        



    }

    public static String diaDaSemana(LocalDateTime data) {
        DayOfWeek dds = DayOfWeek.from(data);
        return dds.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")).toUpperCase();
    }
}
