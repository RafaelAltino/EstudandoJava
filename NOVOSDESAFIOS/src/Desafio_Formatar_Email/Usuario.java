package Desafio_Formatar_Email;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String enderecoDeEmail;
    List<Email> caixaDeEntrada = new ArrayList<>();
    List<Email> enviados = new ArrayList<>();

    public Usuario(String nome, String enderecoDeEmail){
        this.nome = nome;
        this.enderecoDeEmail = enderecoDeEmail;
        Internet.cadastrarUsuario(this);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return enderecoDeEmail;
    }
    public void setEmail(String email) {
        this.enderecoDeEmail = email;
    }

    public Email enviarEmail(String enderecoDeEmail, String mensagem){
        Usuario destino = Internet.getUsuario(enderecoDeEmail);
        Email email = new Email(this, destino, mensagem);
        this.enviados.add(email);
        destino.caixaDeEntrada.add(email);
        return email;
    }

    public void lerEmails(){
        for(int i = 0; i < caixaDeEntrada.size(); i++){
            System.out.println("***********************");
            System.out.printf("Recebido de: %s\n", caixaDeEntrada.get(i).getOrigem().getNome());
            System.out.printf("Email: %s\n", caixaDeEntrada.get(i).getOrigem().getEmail());
            System.out.printf("Mensagem: %s\n", caixaDeEntrada.get(i).getMensagem());
        }
    }













}
