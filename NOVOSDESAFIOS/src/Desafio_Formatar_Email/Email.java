package Desafio_Formatar_Email;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private Usuario origem;
    private Usuario destino;
    private String mensagem;

    public Email(){}

    public Email(Usuario origem, Usuario destino, String mensagem){
        this.origem = origem;
        this.destino = destino;
        this.mensagem = mensagem;
    }

    public Usuario getOrigem() {
        return origem;
    }
    public void setOrigem(Usuario origem) {
        this.origem = origem;
    }
    public Usuario getDestino() {
        return destino;
    }
    public void setDestino(Usuario destino) {
        this.destino = destino;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Email formatarMaiusculo(){
        this.mensagem = this.mensagem.toUpperCase();
        return this;
    }

    public Email formatarMinusculo(){
        this.mensagem = this.mensagem.toLowerCase();
        return this;
    }
    
    public Email formatarCamelCase(){
        String mensagemCamelCase = "";
        String[] todasPalavras = this.mensagem.split(" ");

        for(int i = 0; i < todasPalavras.length; i++){

            String primeiraLetra = todasPalavras[i].substring(0, 1);
            String restant = todasPalavras[i].substring(1);
            String palavraCamelCase = primeiraLetra.toUpperCase() + restant.toLowerCase();

            mensagemCamelCase += palavraCamelCase;

            if(i != todasPalavras.length - 1){
                mensagemCamelCase += " ";
            }
        }
        this.mensagem = mensagemCamelCase;
        return this;
    }

    public Email formatarRemoverAcentos(){
        String mensagemSemAcentos = "";
        String[] caracteres = this.mensagem.split("");

        for(int i = 0; i < caracteres.length; i++){
            if(caracteres[i].equals("á") || caracteres[i].equals("à") || caracteres[i].equals("â") || caracteres[i].equals("ã")){
                caracteres[i] = "a";
            } else if(caracteres[i].equals("é") || caracteres[i].equals("è") || caracteres[i].equals("ê")){
                caracteres[i] = "e";
            } else if(caracteres[i].equals("í") || caracteres[i].equals("ï")){
                caracteres[i] = "i";
            } else if(caracteres[i].equals("ó") || caracteres[i].equals("õ") || caracteres[i].equals("ô") || caracteres[i].equals("ö")){
                caracteres[i] = "o";
            } else if(caracteres[i].equals("ú")){
                caracteres[i] = "u";
            } else if(caracteres[i].equals("ç")){
                caracteres[i] = "c";
            } else if(caracteres[i].equals("ñ")){
                caracteres[i] = "n";
            } else if(caracteres[i].equals("Á") || caracteres[i].equals("À") || caracteres[i].equals("Â") || caracteres[i].equals("Ã")){
                caracteres[i] = "A";
            } else if(caracteres[i].equals("É") || caracteres[i].equals("È") || caracteres[i].equals("Ê")){
                caracteres[i] = "E";
            } else if(caracteres[i].equals("Í") || caracteres[i].equals("Ï")){
                caracteres[i] = "I";
            } else if(caracteres[i].equals("Ó") || caracteres[i].equals("Õ") || caracteres[i].equals("Ô") || caracteres[i].equals("Ö")){
                caracteres[i] = "O";
            } else if(caracteres[i].equals("Ú")){
                caracteres[i] = "U";
            } else if(caracteres[i].equals("Ç")){
                caracteres[i] = "C";
            } else if(caracteres[i].equals("Ñ")){
                caracteres[i] = "N";
            }
        }

        for(int i = 0; i < caracteres.length; i++){
            mensagemSemAcentos += caracteres[i];
        }

        this.mensagem = mensagemSemAcentos;
        return this;
    }
    
    









    
}
