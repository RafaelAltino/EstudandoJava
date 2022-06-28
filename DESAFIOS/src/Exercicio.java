import java.util.ArrayList;
import java.util.List;

public class Exercicio {   

    public static boolean calcula(String palavra){
        for(int i = 0; i < palavra.length() - 4; i++){
            int primeiro, ultimo;
            if (Character.isDigit(palavra.charAt(i))) {
                primeiro = Character.getNumericValue(palavra.charAt(i));
                if(palavra.substring(i+1, i+4).equals("XXX")){
                    if(Character.isDigit(palavra.charAt(i+4))){
                        ultimo = Character.getNumericValue(palavra.charAt(i+4));;
                        if(primeiro + ultimo == 8){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
