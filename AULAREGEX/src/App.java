/*
 * 
 *  \\w  -> todos os caracteres, alfanumericos
 *  \\W  -> Todos os não caracteres
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        String texto = "Em \"ciência\" da computação, uma expressão regular ou \"Regex\" (ou os estrangeirismos regex ou regexp [1] , \nabreviação do inglês regular expression) provê uma forma concisa e flexível de \"identificar\" cadeias de caracteres de interesse, \ncomo caracteres particulares, palavras ou padrões de caracteres. \nExpressões regulares são escritas numa linguagem formal que pode ser interpretada por um processador de expressão regular, \num programa que serve um gerador de analisador sintático ou \nexamina o texto e identifica as partes que casam com a especificação dada. ";


        String[] palavras = texto.split("\\s+");

        System.out.println("===========");

        for(String palavra : palavras){
            if(palavra.matches("^\"[\\wêa-z0-9]+\"$")){
            //if(palavra.matches("^\"\\w+\"$")){
                System.out.print("Palavras com aspas  >>>>  ");
                System.out.println(palavra);

                System.out.println(palavra.replaceAll("\"\\w+\"", "teste"));
                System.out.println(palavra.replaceAll("(?i)(\")R([\\wê]+)x(\")", "+$2+"));
                
            }
            
        }

        




    }
}
