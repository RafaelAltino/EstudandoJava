package Desafio_Salario_Mensal;

import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        
        exibirSalarioMesAMes(3000, 2022);

    }

    public static void exibirSalarioMesAMes(double salario, int ano){

        YearMonth mes;   
        String[] nomeDosMeses = new DateFormatSymbols().getMonths();
        List<LocalDate> listaDosDiasUteisDoMes = new ArrayList<>();

        System.out.printf("\nSalário base: R$%.2f\n\n", salario);
        

        for (int i = 0 ; i < 12; i++) { 
            listaDosDiasUteisDoMes = new ArrayList<>();      
            System.out.printf("%s: ", nomeDosMeses[i]);

            mes = YearMonth.of(ano, i+1);

            for(int dia=1; dia <= mes.lengthOfMonth(); dia++){ 
                LocalDate data = mes.atDay(dia); 
              
                if(!data.getDayOfWeek().equals(DayOfWeek.SATURDAY) &&   
                  !data.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
              
                    listaDosDiasUteisDoMes.add(data);
                }

            }
            int diasUteis = listaDosDiasUteisDoMes.size();
            System.out.printf("R$%.2f\n", (salario + (salario * diasUteis * 0.005) ));
        }
    }
}