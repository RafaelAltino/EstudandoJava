public class App {
    public static void main(String[] args) throws Exception {
        String link = "https://sitenoticas.com.br/negocios/investimentos/2022/04/01/fim-de-semana-com-muita-chuva.html";
        String link2 = "http://jornaldacidade.org/sustentabilidade/reciclagem/2008/11/23/populacao-nao-recicla-seu-lixo.html";
        System.out.println(confereLink(link));
        System.out.println(confereLink(link2));

    }

    public static boolean confereLink(String link){
        String regex = "^[h][t][t][p][s]?[:][/][/][a-zA-Z.]*[/][a-zA-Z]*[/][a-zA-Z]*[/][0-9]{4}[/][0-9]{2}[/][0-9]{2}[/][a-zA-Z|-]*[.][h][t][m][l]";
        if(link.matches(regex)){
            return true;
        }
        return false;
    }
}
