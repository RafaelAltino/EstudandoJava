import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        List<Map<String, String>> original = new ArrayList<>();
        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));

        String[] formatos = {
            "yyyy-MM-dd HH:mm:ss",
            "dd-MM-yyyy HH:mm:ss",
            "HH:mm:ss dd-MM-yyyy",
            "HH:mm:ss yyyy-MM-dd"
        };
        List<LocalDateTime> datasFormatadas = new ArrayList<>();

        String atual = "";
        LocalDateTime novo = null;
        for(int i=0; i < original.size(); i++){
            atual = original.get(i).get("nascimento");
            for(String formato : formatos){
                try{
                    novo = LocalDateTime.parse(atual, DateTimeFormatter.ofPattern(formato));
                } catch(Exception e){}
            }
            if(novo != null){
                datasFormatadas.add(novo);
            } else{
                System.out.println("Data em nenhum formato esperado");
            }
            atual = "";
            novo = null;
        }

        int posicaoVelho = 0, posicaoNovo = 0;
        for(int i = 0; i < datasFormatadas.size(); i++){
            System.out.println(datasFormatadas.get(i));
            if(datasFormatadas.get(i).isBefore(datasFormatadas.get(posicaoVelho))){
                posicaoVelho = i;
            } else if(datasFormatadas.get(i).isAfter(datasFormatadas.get(posicaoNovo))){
                posicaoNovo = i;
            }
        }

        LocalDate hoje = LocalDate.now();
        LocalDate nascimentoNovo = datasFormatadas.get(posicaoNovo).toLocalDate();
        LocalDate nascimentoVelho = datasFormatadas.get(posicaoVelho).toLocalDate();
        int idadeNovo = Period.between(nascimentoNovo, hoje).getYears();
        int idadeVelho = Period.between(nascimentoVelho, hoje).getYears();

        System.out.printf("O mais novo é  %s com %d anos\n",
            original.get(posicaoNovo).get("nome"), idadeNovo);

        System.out.printf("O mais velho é %s com %d anos",
            original.get(posicaoVelho).get("nome"), idadeVelho);
    }
}
